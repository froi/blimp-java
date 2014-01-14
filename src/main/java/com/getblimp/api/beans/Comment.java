/**********************************************************************************************************************
 * Copyright 2014 Froilan Irizarry                                                                                    *
 * http://froilanirizarry.me                                                                                          *
 * https://github.com/froi                                                                                            *
 *                                                                                                                    *
 * Code can be downloaded, forked, or revied at:                                                                      *
 * 	https://github.com/froi/blimp-java                                                                                *
 *                                                                                                                    *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not                                        *
 * use this file except in compliance with the License. You may obtain a copy of                                      *
 * the License at:                                                                                                    *
 * 	http://www.apache.org/licenses/LICENSE-2.0                                                                        *
 * Unless required by applicable law or agreed to in writing, software                                                *
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT                                          *
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the                                           *
 * License for the specific language governing permissions and limitations under                                      *
 * the License.                                                                                                       *
 **********************************************************************************************************************/

package com.getblimp.api.beans;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Comment extends BlimpObject{
    @SerializedName("comment")
    private String comment;
    @SerializedName("content_type")
    private String contentType;
    @SerializedName("date_created")
    private String dateCreated;
    @SerializedName("date_modified")
    private String dateModified;
    @SerializedName("files")
    private List<File> files;
    @SerializedName("id")
    private Integer id;
    @SerializedName("object_pk")
    private Integer objectPk;
    @SerializedName("resource_uri")
    private String resourceUri;
    @SerializedName("user")
    private String user;

    public Comment() {
        super();
    }
    private Comment(Builder b) {
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

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateModified() {
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

    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static class Builder {
        private String comment;
        private String contentType;
        private String dateCreated;
        private String dateModified;
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
        public Builder dateCreated(String dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }
        public Builder dateModified(String dateModified) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment1 = (Comment) o;

        if (!comment.equals(comment1.comment)) return false;
        if (contentType != null ? !contentType.equals(comment1.contentType) : comment1.contentType != null)
            return false;
        if (dateCreated != null ? !dateCreated.equals(comment1.dateCreated) : comment1.dateCreated != null)
            return false;
        if (!dateModified.equals(comment1.dateModified)) return false;
        if (!files.equals(comment1.files)) return false;
        if (!id.equals(comment1.id)) return false;
        if (!objectPk.equals(comment1.objectPk)) return false;
        if (!resourceUri.equals(comment1.resourceUri)) return false;
        if (!user.equals(comment1.user)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = comment.hashCode();
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + dateModified.hashCode();
        result = 31 * result + files.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + objectPk.hashCode();
        result = 31 * result + resourceUri.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }
}
