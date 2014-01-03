package com.getblimp.api.beans;

import java.util.Calendar;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Comment {
    private String comment;
    private String contentType;
    private Calendar dateCreated;
    private Calendar dateModified;
    private List<File> files;
    private Integer id;
    private Integer objectPk;
    private String resourceUri;
    private String user;

    public Comment(Builder b) {
        this.comment = b.comment;
        this.contentType = b.contentType;
        this.dateCreated = b.dateCreated;
        this.dateModified = b.dateModified;
        this.files = b.files;
        this.id = b.id;
        this.objectPk = b.objectPk;
        this.resourceUri = b.resourceUri;
        this.user = b.user;
    }
    public String getComment() {
        return comment;
    }

    public String getContentType() {
        return contentType;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public Calendar getDateModified() {
        return dateModified;
    }

    public List<File> getFiles() {
        return files;
    }

    public Integer getId() {
        return id;
    }

    public Integer getObjectPk() {
        return objectPk;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public String getUser() {
        return user;
    }

    public static class Builder {
        private String comment;
        private String contentType;
        private Calendar dateCreated;
        private Calendar dateModified;
        private List<File> files;
        private Integer id;
        private Integer objectPk;
        private String resourceUri;
        private String user;

        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder dateCreated(Calendar dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }
        public Builder dateModified(Calendar dateModified) {
            this.dateModified = dateModified;
            return this;
        }
        public Builder files(List<File> files) {
            this.files = files;
            return this;
        }
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }
        public Builder objectPk(Integer objectPk) {
            this.objectPk = objectPk;
            return this;
        }
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }
        public Builder user(String user) {
            this.user = user;
            return this;
        }
        public Comment build() {
            return new Comment(this);
        }
    }
}
