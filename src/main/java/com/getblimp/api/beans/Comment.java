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

import java.util.Calendar;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Comment extends BlimpObject{
    private String comment;
    private String contentType;
    private Calendar dateCreated;
    private Calendar dateModified;
    private List<File> files;
    private Integer id;
    private Integer objectPk;
    private String resourceUri;
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

    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
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
