package com.hongenit.technews

import android.app.Activity
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.TextView
import com.hongenit.technews.R.id.lv_list
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity(), View.OnClickListener {
    var showContent = false;
    override fun onClick(v: View?) {
        showContent = !showContent
        tv_content.visibility = if (showContent) {
            View.VISIBLE
        } else {
            View.GONE
        }
        tv_content.setText(pyq.getChooseContent(data))

    }

    lateinit var pyq: Pyq
    val data: ArrayList<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> = arrayListOf();
    val resultData: ArrayList<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> = arrayListOf();
    val mHandler = Handler();
    private lateinit var mNewsAdapter: NewsAdapter
    var choosedNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pyq = Pyq()
        bt_ok.setOnClickListener(this)


        mNewsAdapter = NewsAdapter(this, data)
        lv_list.adapter = mNewsAdapter
        lv_list.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                data[position].isChoosed = !data[position].isChoosed
                if (data[position].isChoosed) {
                    choosedNumber++
                } else {
                    choosedNumber--
                }
                mNewsAdapter.notifyDataSetChanged()
                bt_ok.setText("ok(" + choosedNumber + ")")
            }
        }

        Thread(
                object : Runnable {
                    override fun run() {
                        data.addAll(pyq.getData())
                        mHandler.post(Runnable { mNewsAdapter.notifyDataSetChanged() })
                    }
                }).start()

    }


}
