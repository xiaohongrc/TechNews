package com.hongenit.technews;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.show.api.ShowApiRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongenit on 2018/3/15.
 * wechat
 */

public class Pyq {
    public List<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> getData() {
        ArrayList<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> contentlist = new ArrayList<>();
        String techChannelId = "5572a10ab3cdc86cf39001f4";
        contentlist.addAll(getContentlistBeans(techChannelId));
        String itChannelId = "5572a108b3cdc86cf39001d1";
        contentlist.addAll(getContentlistBeans(itChannelId));
        String fangChanChannelId = "5572a108b3cdc86cf39001d2";
        contentlist.addAll(getContentlistBeans(fangChanChannelId));

        return contentlist;
    }

    private List<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> getContentlistBeans(String channelId) {
        String res = new ShowApiRequest("http://route.showapi.com/109-35", "57420", "d4974c51934f4a63a50a2c11a31e2ebe")
                .addTextPara("channelId", channelId)
                .addTextPara("channelName", "")
                .addTextPara("title", "")
                .addTextPara("page", "1")
                .addTextPara("needContent", "0")
                .addTextPara("needHtml", "0")
                .addTextPara("needAllList", "0")
                .addTextPara("maxResult", "30")
                .addTextPara("id", "")
                .post();

        Gson gson = new Gson();
        NewsData newsData = gson.fromJson(res, TypeToken.get(NewsData.class).getType());
        NewsData.ShowapiResBodyBean.PagebeanBean pagebean = newsData.getShowapi_res_body().getPagebean();
        return pagebean.getContentlist();
    }

    public String getChooseContent(List<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> contentlist) {
        StringBuilder allNewsString = new StringBuilder();
        for (NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean bean : contentlist) {

//            ## 华为P20/P20 Plus消息传闻汇总
//                    **腾讯数码**  *15:50:50*
//                    -  腾讯数码讯尽管华为P10和P10 Plu S9或LG V30那么引人注目。另一方面，普通的P20将配备常规的双摄像头，同时P20与P20 Plus都将配备2400万像素的前置自拍摄像头，支持激光自动对焦
//                     [详情](http://baidu)
//                    ***


            List<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean.ImageurlsBean> imageurls = bean.getImageurls();
            if (imageurls == null || imageurls.size() < 10) {
                if (bean.isChoosed()) {
                    String NewsString = "## " + bean.getTitle() + "\n"
                            + "**" + bean.getSource().trim() + "** " + " *" + bean.getPubTime() + "* \n"
                            + "- " + bean.getDesc() + "\n"
                            + "**原文:** [" +bean.getLink()+ "](" +bean.getLink()+")\n"
                            + "***\n";
                    allNewsString.append(NewsString);
                }
            }
        }
        System.out.println(allNewsString);
        return allNewsString.toString();
    }


}