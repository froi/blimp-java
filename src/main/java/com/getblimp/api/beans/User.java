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
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class User extends BlimpObject {
    @SerializedName("email")
    private String email = null;
    @SerializedName("first_name")
	private String firstName = null;
    @SerializedName("last_name")
	private String lastName = null;
    @SerializedName("profile")
	private Profile profile = null;
    @SerializedName("resource_uri")
	private String resourceUri = null;
    @SerializedName("username")
    private String username = null;

    public User() {
        super();
    }
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Profile getProfile() {
		return profile;
	}
	public String getResourceUri() {
		return resourceUri;
	}
	public String getUsername() {
		return username;
	}
    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
