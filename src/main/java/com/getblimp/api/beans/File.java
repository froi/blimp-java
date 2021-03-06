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

public class File extends BlimpObject{
    @SerializedName("created_by")
    private String createdBy;
    @SerializedName("date_created")
    private String dateCreated;
    @SerializedName("date_modified")
    private String dateModified;
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("project")
    private String project;
    @SerializedName("resource_uri")
    private String resourceUri;
    @SerializedName("source")
    private String source;
    @SerializedName("versions")
    private List<Version> versions;

    public File() {
        super();
    }
    private File(Builder b) {
        this.createdBy = b.createdBy;
        this.id = b.id;
        this.name = b.name;
        this.project = b.project;
        this.source = b.source;
        this.versions = b.versions;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProject() {
        return project;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public String getSource() {
        return source;
    }

    public List<Version> getVersions() {
        return versions;
    }
    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static class Builder {
        private String createdBy;
        private Integer id;
        private String name;
        private String project;
        private String source;
        private List<Version> versions;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder project(String project) {
            this.project = project;
            return this;
        }
        public Builder source(String source) {
            this.source = source;
            return this;
        }
        public Builder versions(List<Version> versions) {
            this.versions = versions;
            return this;
        }
        public File build() {
            return new File(this);
        }
    }
}
