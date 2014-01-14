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
}
