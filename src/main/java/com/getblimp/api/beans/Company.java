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
public class Company extends BlimpObject{
    private List<User> companyUsers;
    private Calendar dateCreated;
    private Calendar dateModified;
    private Integer id;
    private String imageUrl;
    private String name;
    private String resourceUrl;
    private String slug;
    private Integer usedProjects;
    private String usedStorage;

    public Company() {
        super();
    }
    private Company(Builder b) {
        this.companyUsers = b.companyUsers;
        this.dateCreated = b.dateCreated;
        this.dateModified = b.dateModified;
        this.id = b.id;
        this.imageUrl = b.imageUrl;
        this.name = b.name;
        this.resourceUrl = b.resourceUrl;
        this.slug = b.slug;
        this.usedProjects = b.usedProjects;
        this.usedStorage = b.usedStorage;
    }
    public List<User> getCompanyUsers() {
        return companyUsers;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public Calendar getDateModified() {
        return dateModified;
    }

    public Integer getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public String getSlug() {
        return slug;
    }

    public Integer getUsedProjects() {
        return usedProjects;
    }

    public String getUsedStorage() {
        return usedStorage;
    }

    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static class Builder {
        private List<User> companyUsers;
        private Calendar dateCreated;
        private Calendar dateModified;
        private Integer id;
        private String imageUrl;
        private String name;
        private String resourceUrl;
        private String slug;
        private Integer usedProjects;
        private String usedStorage;

        public Builder companyUsers(List<User> companyUsers) {
            this.companyUsers = companyUsers;
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
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder resourceUrl(String resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }
        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }
        public Builder usedProjects(Integer usedProjects) {
            this.usedProjects = usedProjects;
            return this;
        }
        public Builder usedStorage(String usedStorage) {
            this.usedStorage = usedStorage;
            return this;
        }
        public Company build() {
            return new Company(this);
        }
    }
}
