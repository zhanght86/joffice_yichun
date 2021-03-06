package com.hy.powerplatform.news.bean;

import java.util.List;

/**
 * Created by dell on 2018/5/7.
 */

public class News {

    /**
     * success : true
     * totalCounts : 1
     * result : [{"version":null,"orgId":null,"orgPath":null,"newsId":23,"subjectIcon":"","subject":"关于结束免费乘车的公告","author":"办公室","createtime":"2018-04-09 00:00:00","expTime":null,"replyCounts":0,"viewCounts":2,"issuer":"超级管理员","content":"\n\t取消供暖期免费乘车，自2018年3月15日起执行\n","updateTime":"2018-04-09 15:24:53","status":1,"isDeskImage":null,"isNotice":1,"sn":null,"orgIds":"","orgNames":"","section":{"version":null,"orgId":null,"orgPath":null,"sectionId":11,"sectionName":"公告","sectionDesc":"","createtime":"2016-07-15 14:27:38","sectionType":3,"username":"超级管理员","userId":1,"colNumber":1,"rowNumber":3,"status":1},"sectionId":11}]
     */

    private boolean success;
    private int totalCounts;
    private List<ResultBean> result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTotalCounts() {
        return totalCounts;
    }

    public void setTotalCounts(int totalCounts) {
        this.totalCounts = totalCounts;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * version : null
         * orgId : null
         * orgPath : null
         * newsId : 23
         * subjectIcon :
         * subject : 关于结束免费乘车的公告
         * author : 办公室
         * createtime : 2018-04-09 00:00:00
         * expTime : null
         * replyCounts : 0
         * viewCounts : 2
         * issuer : 超级管理员
         * content :
         取消供暖期免费乘车，自2018年3月15日起执行

         * updateTime : 2018-04-09 15:24:53
         * status : 1
         * isDeskImage : null
         * isNotice : 1
         * sn : null
         * orgIds :
         * orgNames :
         * section : {"version":null,"orgId":null,"orgPath":null,"sectionId":11,"sectionName":"公告","sectionDesc":"","createtime":"2016-07-15 14:27:38","sectionType":3,"username":"超级管理员","userId":1,"colNumber":1,"rowNumber":3,"status":1}
         * sectionId : 11
         */

        private Object version;
        private Object orgId;
        private Object orgPath;
        private int newsId;
        private String subjectIcon;
        private String subject;
        private String author;
        private String createtime;
        private Object expTime;
        private int replyCounts;
        private int viewCounts;
        private String issuer;
        private String content;
        private String updateTime;
        private int status;
        private Object isDeskImage;
        private int isNotice;
        private Object sn;
        private String orgIds;
        private String orgNames;
        private SectionBean section;
        private int sectionId;

        public Object getVersion() {
            return version;
        }

        public void setVersion(Object version) {
            this.version = version;
        }

        public Object getOrgId() {
            return orgId;
        }

        public void setOrgId(Object orgId) {
            this.orgId = orgId;
        }

        public Object getOrgPath() {
            return orgPath;
        }

        public void setOrgPath(Object orgPath) {
            this.orgPath = orgPath;
        }

        public int getNewsId() {
            return newsId;
        }

        public void setNewsId(int newsId) {
            this.newsId = newsId;
        }

        public String getSubjectIcon() {
            return subjectIcon;
        }

        public void setSubjectIcon(String subjectIcon) {
            this.subjectIcon = subjectIcon;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public Object getExpTime() {
            return expTime;
        }

        public void setExpTime(Object expTime) {
            this.expTime = expTime;
        }

        public int getReplyCounts() {
            return replyCounts;
        }

        public void setReplyCounts(int replyCounts) {
            this.replyCounts = replyCounts;
        }

        public int getViewCounts() {
            return viewCounts;
        }

        public void setViewCounts(int viewCounts) {
            this.viewCounts = viewCounts;
        }

        public String getIssuer() {
            return issuer;
        }

        public void setIssuer(String issuer) {
            this.issuer = issuer;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public Object getIsDeskImage() {
            return isDeskImage;
        }

        public void setIsDeskImage(Object isDeskImage) {
            this.isDeskImage = isDeskImage;
        }

        public int getIsNotice() {
            return isNotice;
        }

        public void setIsNotice(int isNotice) {
            this.isNotice = isNotice;
        }

        public Object getSn() {
            return sn;
        }

        public void setSn(Object sn) {
            this.sn = sn;
        }

        public String getOrgIds() {
            return orgIds;
        }

        public void setOrgIds(String orgIds) {
            this.orgIds = orgIds;
        }

        public String getOrgNames() {
            return orgNames;
        }

        public void setOrgNames(String orgNames) {
            this.orgNames = orgNames;
        }

        public SectionBean getSection() {
            return section;
        }

        public void setSection(SectionBean section) {
            this.section = section;
        }

        public int getSectionId() {
            return sectionId;
        }

        public void setSectionId(int sectionId) {
            this.sectionId = sectionId;
        }

        public static class SectionBean {
            /**
             * version : null
             * orgId : null
             * orgPath : null
             * sectionId : 11
             * sectionName : 公告
             * sectionDesc :
             * createtime : 2016-07-15 14:27:38
             * sectionType : 3
             * username : 超级管理员
             * userId : 1
             * colNumber : 1
             * rowNumber : 3
             * status : 1
             */

            private Object version;
            private Object orgId;
            private Object orgPath;
            private int sectionId;
            private String sectionName;
            private String sectionDesc;
            private String createtime;
            private int sectionType;
            private String username;
            private int userId;
            private int colNumber;
            private int rowNumber;
            private int status;

            public Object getVersion() {
                return version;
            }

            public void setVersion(Object version) {
                this.version = version;
            }

            public Object getOrgId() {
                return orgId;
            }

            public void setOrgId(Object orgId) {
                this.orgId = orgId;
            }

            public Object getOrgPath() {
                return orgPath;
            }

            public void setOrgPath(Object orgPath) {
                this.orgPath = orgPath;
            }

            public int getSectionId() {
                return sectionId;
            }

            public void setSectionId(int sectionId) {
                this.sectionId = sectionId;
            }

            public String getSectionName() {
                return sectionName;
            }

            public void setSectionName(String sectionName) {
                this.sectionName = sectionName;
            }

            public String getSectionDesc() {
                return sectionDesc;
            }

            public void setSectionDesc(String sectionDesc) {
                this.sectionDesc = sectionDesc;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public int getSectionType() {
                return sectionType;
            }

            public void setSectionType(int sectionType) {
                this.sectionType = sectionType;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getColNumber() {
                return colNumber;
            }

            public void setColNumber(int colNumber) {
                this.colNumber = colNumber;
            }

            public int getRowNumber() {
                return rowNumber;
            }

            public void setRowNumber(int rowNumber) {
                this.rowNumber = rowNumber;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }
        }
    }
}
