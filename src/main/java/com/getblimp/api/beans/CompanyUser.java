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

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-5
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */
public class CompanyUser extends BlimpObject {
    @SerializedName("accepted_invitation")
    private Boolean acceptedInvitation;
    @SerializedName("date_created")
    private String dateCreated;
    @SerializedName("date_modified")
    private String dateModified;
    @SerializedName("id")
    private Integer id;
    @SerializedName("is_active")
    private Boolean isActive;
    @SerializedName("role")
    private String role;
    @SerializedName("user")
    private String user;

    public CompanyUser() {
        super();
    }
    private CompanyUser(Builder b) {
        this.acceptedInvitation = b.acceptedInvitation;
        this.dateCreated = b.dateCreated;
        this.dateModified = b.dateModified;
        this.id = b.id;
        this.isActive = b.isActive;
        this.role = b.role;
        this.user = b.user;
    }

    public Boolean getAcceptedInvitation() {
        return acceptedInvitation;
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

    public Boolean getActive() {
        return isActive;
    }

    public String getRole() {
        return role;
    }

    public String getUser() {
        return user;
    }
    @Override
    public String toJson() {
        Gson gson = new Gson();

        return gson.toJson(this);  //To change body of implemented methods use File | Settings | File Templates.
    }
    public static class Builder {
        private Boolean acceptedInvitation;
        private String dateCreated;
        private String dateModified;
        private Integer id;
        private Boolean isActive;
        private String role;
        private String user;

        public Builder acceptedInvitation(Boolean acceptedInvitation) {
            this.acceptedInvitation = acceptedInvitation;
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
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }
        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public Builder role(String role) {
            this.role = role;
            return this;
        }
        public Builder user(String user) {
            this.user = user;
            return this;
        }
        public CompanyUser build() {
            return new CompanyUser(this);
        }
    }
}
