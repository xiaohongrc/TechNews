package com.hongenit.technews;

import java.util.List;

/**
 * Created by hongenit on 2018/3/15.
 */

public class NewsData {


    /**
     * showapi_res_error :
     * showapi_res_code : 0
     * showapi_res_body : {"ret_code":0,"pagebean":{"allPages":4273,"contentlist":[{"id":"9814e555e712af8272b17245841b6f61","pubDate":"2018-03-15 21:04:04","havePic":true,"channelName":"科技最新","title":"唯一可与爱因斯坦相媲美的科学家，却一生与诺贝尔奖无缘","desc":"2018年3月14日，当代科学界的传奇人物斯蒂芬·威廉·霍金去世，享年76岁。早在语文课本故事《轮椅上的霍金》中，我们就认识了这位远在英国的物理学家。霍金的研究帮助他获得了科普利奖、沃尔夫物理奖以及爱因斯坦奖章，甚至还获得总统自由勋章，然而霍金的一生总与诺贝尔奖无缘，这是为什么呢？","imageurls":[{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/31c902d74bfe4e81b4a6ae7157b2f3f7.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/a2b1dcd397804f2a9612d025eaa58ed5.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/7a2f013b5cee46c4a2c8737fb8996876.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/8d015d676eef4be7aa5eca079fcfa1de.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/aca516c5f7a740dab66e05c8c048ff95.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/c186a619ea76418596ac81140babdb9f.jpeg"}],"source":"搜狐科技","channelId":"5572a10ab3cdc86cf39001f4","nid":"17347889306197910341","link":"http://www.sohu.com/a/225638750_335714"},{"id":"d4ac7574363ef7e5e07e32e2b47d584e","pubDate":"2018-03-15 21:00:46","havePic":true,"channelName":"科技最新","title":"【一线】人人车：将立即下架315问题车型 排除隐患后重新上架","desc":"腾讯《一线》作者相欣3月15日，人人车今晚发布声明称，据315晚会报道，大众途锐部分车辆可能存在发动机隐患，为了尽可能维护广大消费者权益，人人车将立即下架目前在售的可能涉及相关隐患的车辆。声明还称，人人车将对平台在售315问题车型进行重新排查和筛选，确定排除相关隐患后会重新上架。","imageurls":[{"height":0,"width":0,"url":"http://inews.gtimg.com/newsapp_bt/0/3042868447/641"}],"source":"科技新闻","channelId":"5572a10ab3cdc86cf39001f4","link":"http://tech.qq.com/a/20180315/033845.htm"},{"id":"09e2a009dcea56932efe87dc26e013d0","pubDate":"2018-03-15 20:57:27","havePic":true,"channelName":"科技最新","title":"央视315晚会第一枪：大众途锐发动机频现报废","desc":"3月15日消息，央视315晚会已经开始，第一枪打向了大众途锐，车主们表示，途锐汽车进气口位置的设计有问题，导致发动机频现报废。面对该问题，大众给出解决方案是拆下进气管道的不必要的排水阀以强化排水功能。我们不敢越野了，我们也不敢涉水了，等于我们买这个车的意义不存在了。","imageurls":[{"height":0,"width":0,"url":"http://upload.techweb.com.cn/s/640/2018/0315/1521117728452.jpg"}],"source":"TechWeb","channelId":"5572a10ab3cdc86cf39001f4","nid":"10323260135859380445","link":"http://www.techweb.com.cn/internet/2018-03-15/2646059.shtml"}],"currentPage":1,"allNum":12818,"maxResult":3}}
     */

    private String showapi_res_error;
    private int showapi_res_code;
    private ShowapiResBodyBean showapi_res_body;

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * ret_code : 0
         * pagebean : {"allPages":4273,"contentlist":[{"id":"9814e555e712af8272b17245841b6f61","pubDate":"2018-03-15 21:04:04","havePic":true,"channelName":"科技最新","title":"唯一可与爱因斯坦相媲美的科学家，却一生与诺贝尔奖无缘","desc":"2018年3月14日，当代科学界的传奇人物斯蒂芬·威廉·霍金去世，享年76岁。早在语文课本故事《轮椅上的霍金》中，我们就认识了这位远在英国的物理学家。霍金的研究帮助他获得了科普利奖、沃尔夫物理奖以及爱因斯坦奖章，甚至还获得总统自由勋章，然而霍金的一生总与诺贝尔奖无缘，这是为什么呢？","imageurls":[{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/31c902d74bfe4e81b4a6ae7157b2f3f7.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/a2b1dcd397804f2a9612d025eaa58ed5.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/7a2f013b5cee46c4a2c8737fb8996876.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/8d015d676eef4be7aa5eca079fcfa1de.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/aca516c5f7a740dab66e05c8c048ff95.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/c186a619ea76418596ac81140babdb9f.jpeg"}],"source":"搜狐科技","channelId":"5572a10ab3cdc86cf39001f4","nid":"17347889306197910341","link":"http://www.sohu.com/a/225638750_335714"},{"id":"d4ac7574363ef7e5e07e32e2b47d584e","pubDate":"2018-03-15 21:00:46","havePic":true,"channelName":"科技最新","title":"【一线】人人车：将立即下架315问题车型 排除隐患后重新上架","desc":"腾讯《一线》作者相欣3月15日，人人车今晚发布声明称，据315晚会报道，大众途锐部分车辆可能存在发动机隐患，为了尽可能维护广大消费者权益，人人车将立即下架目前在售的可能涉及相关隐患的车辆。声明还称，人人车将对平台在售315问题车型进行重新排查和筛选，确定排除相关隐患后会重新上架。","imageurls":[{"height":0,"width":0,"url":"http://inews.gtimg.com/newsapp_bt/0/3042868447/641"}],"source":"科技新闻","channelId":"5572a10ab3cdc86cf39001f4","link":"http://tech.qq.com/a/20180315/033845.htm"},{"id":"09e2a009dcea56932efe87dc26e013d0","pubDate":"2018-03-15 20:57:27","havePic":true,"channelName":"科技最新","title":"央视315晚会第一枪：大众途锐发动机频现报废","desc":"3月15日消息，央视315晚会已经开始，第一枪打向了大众途锐，车主们表示，途锐汽车进气口位置的设计有问题，导致发动机频现报废。面对该问题，大众给出解决方案是拆下进气管道的不必要的排水阀以强化排水功能。我们不敢越野了，我们也不敢涉水了，等于我们买这个车的意义不存在了。","imageurls":[{"height":0,"width":0,"url":"http://upload.techweb.com.cn/s/640/2018/0315/1521117728452.jpg"}],"source":"TechWeb","channelId":"5572a10ab3cdc86cf39001f4","nid":"10323260135859380445","link":"http://www.techweb.com.cn/internet/2018-03-15/2646059.shtml"}],"currentPage":1,"allNum":12818,"maxResult":3}
         */

        private int ret_code;
        private PagebeanBean pagebean;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public PagebeanBean getPagebean() {
            return pagebean;
        }

        public void setPagebean(PagebeanBean pagebean) {
            this.pagebean = pagebean;
        }

        public static class PagebeanBean {
            /**
             * allPages : 4273
             * contentlist : [{"id":"9814e555e712af8272b17245841b6f61","pubDate":"2018-03-15 21:04:04","havePic":true,"channelName":"科技最新","title":"唯一可与爱因斯坦相媲美的科学家，却一生与诺贝尔奖无缘","desc":"2018年3月14日，当代科学界的传奇人物斯蒂芬·威廉·霍金去世，享年76岁。早在语文课本故事《轮椅上的霍金》中，我们就认识了这位远在英国的物理学家。霍金的研究帮助他获得了科普利奖、沃尔夫物理奖以及爱因斯坦奖章，甚至还获得总统自由勋章，然而霍金的一生总与诺贝尔奖无缘，这是为什么呢？","imageurls":[{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/31c902d74bfe4e81b4a6ae7157b2f3f7.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/a2b1dcd397804f2a9612d025eaa58ed5.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/7a2f013b5cee46c4a2c8737fb8996876.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/8d015d676eef4be7aa5eca079fcfa1de.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/aca516c5f7a740dab66e05c8c048ff95.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/c186a619ea76418596ac81140babdb9f.jpeg"}],"source":"搜狐科技","channelId":"5572a10ab3cdc86cf39001f4","nid":"17347889306197910341","link":"http://www.sohu.com/a/225638750_335714"},{"id":"d4ac7574363ef7e5e07e32e2b47d584e","pubDate":"2018-03-15 21:00:46","havePic":true,"channelName":"科技最新","title":"【一线】人人车：将立即下架315问题车型 排除隐患后重新上架","desc":"腾讯《一线》作者相欣3月15日，人人车今晚发布声明称，据315晚会报道，大众途锐部分车辆可能存在发动机隐患，为了尽可能维护广大消费者权益，人人车将立即下架目前在售的可能涉及相关隐患的车辆。声明还称，人人车将对平台在售315问题车型进行重新排查和筛选，确定排除相关隐患后会重新上架。","imageurls":[{"height":0,"width":0,"url":"http://inews.gtimg.com/newsapp_bt/0/3042868447/641"}],"source":"科技新闻","channelId":"5572a10ab3cdc86cf39001f4","link":"http://tech.qq.com/a/20180315/033845.htm"},{"id":"09e2a009dcea56932efe87dc26e013d0","pubDate":"2018-03-15 20:57:27","havePic":true,"channelName":"科技最新","title":"央视315晚会第一枪：大众途锐发动机频现报废","desc":"3月15日消息，央视315晚会已经开始，第一枪打向了大众途锐，车主们表示，途锐汽车进气口位置的设计有问题，导致发动机频现报废。面对该问题，大众给出解决方案是拆下进气管道的不必要的排水阀以强化排水功能。我们不敢越野了，我们也不敢涉水了，等于我们买这个车的意义不存在了。","imageurls":[{"height":0,"width":0,"url":"http://upload.techweb.com.cn/s/640/2018/0315/1521117728452.jpg"}],"source":"TechWeb","channelId":"5572a10ab3cdc86cf39001f4","nid":"10323260135859380445","link":"http://www.techweb.com.cn/internet/2018-03-15/2646059.shtml"}]
             * currentPage : 1
             * allNum : 12818
             * maxResult : 3
             */

            private int allPages;
            private int currentPage;
            private int allNum;
            private int maxResult;
            private List<ContentlistBean> contentlist;

            public int getAllPages() {
                return allPages;
            }

            public void setAllPages(int allPages) {
                this.allPages = allPages;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public int getAllNum() {
                return allNum;
            }

            public void setAllNum(int allNum) {
                this.allNum = allNum;
            }

            public int getMaxResult() {
                return maxResult;
            }

            public void setMaxResult(int maxResult) {
                this.maxResult = maxResult;
            }

            public List<ContentlistBean> getContentlist() {
                return contentlist;
            }

            public void setContentlist(List<ContentlistBean> contentlist) {
                this.contentlist = contentlist;
            }

            public static class ContentlistBean {
                /**
                 * id : 9814e555e712af8272b17245841b6f61
                 * pubDate : 2018-03-15 21:04:04
                 * havePic : true
                 * channelName : 科技最新
                 * title : 唯一可与爱因斯坦相媲美的科学家，却一生与诺贝尔奖无缘
                 * desc : 2018年3月14日，当代科学界的传奇人物斯蒂芬·威廉·霍金去世，享年76岁。早在语文课本故事《轮椅上的霍金》中，我们就认识了这位远在英国的物理学家。霍金的研究帮助他获得了科普利奖、沃尔夫物理奖以及爱因斯坦奖章，甚至还获得总统自由勋章，然而霍金的一生总与诺贝尔奖无缘，这是为什么呢？
                 * imageurls : [{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/31c902d74bfe4e81b4a6ae7157b2f3f7.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/a2b1dcd397804f2a9612d025eaa58ed5.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/7a2f013b5cee46c4a2c8737fb8996876.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/8d015d676eef4be7aa5eca079fcfa1de.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/aca516c5f7a740dab66e05c8c048ff95.jpeg"},{"height":0,"width":0,"url":"http://5b0988e595225.cdn.sohucs.com/images/20180315/c186a619ea76418596ac81140babdb9f.jpeg"}]
                 * source : 搜狐科技
                 * channelId : 5572a10ab3cdc86cf39001f4
                 * nid : 17347889306197910341
                 * link : http://www.sohu.com/a/225638750_335714
                 */


                private boolean isChoosed;
                private String id;
                private String pubDate;
                private boolean havePic;
                private String channelName;
                private String title;
                private String desc;
                private String source;
                private String channelId;
                private String nid;
                private String link;
                private String pubTime;

                public String getPubTime() {
                    String[] strings = pubDate.split(" ");
                    if (strings.length == 2){

                        pubTime =strings[1];
                    }else {
                        pubTime = pubDate;
                    }
                    return pubTime;
                }

                public boolean isChoosed() {
                    return isChoosed;
                }

                public void setChoosed(boolean choosed) {
                    isChoosed = choosed;
                }

                private List<ImageurlsBean> imageurls;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getPubDate() {
                    return pubDate;
                }

                public void setPubDate(String pubDate) {
                    this.pubDate = pubDate;
                }

                public boolean isHavePic() {
                    return havePic;
                }

                public void setHavePic(boolean havePic) {
                    this.havePic = havePic;
                }

                public String getChannelName() {
                    return channelName;
                }

                public void setChannelName(String channelName) {
                    this.channelName = channelName;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public String getChannelId() {
                    return channelId;
                }

                public void setChannelId(String channelId) {
                    this.channelId = channelId;
                }

                public String getNid() {
                    return nid;
                }

                public void setNid(String nid) {
                    this.nid = nid;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public List<ImageurlsBean> getImageurls() {
                    return imageurls;
                }

                public void setImageurls(List<ImageurlsBean> imageurls) {
                    this.imageurls = imageurls;
                }

                public static class ImageurlsBean {
                    /**
                     * height : 0
                     * width : 0
                     * url : http://5b0988e595225.cdn.sohucs.com/images/20180315/31c902d74bfe4e81b4a6ae7157b2f3f7.jpeg
                     */

                    private int height;
                    private int width;
                    private String url;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }
            }
        }
    }
}
