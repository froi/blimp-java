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

public class Profile extends BlimpObject {
    @SerializedName("aim_username")
	private String aimUsername = null;
    @SerializedName("avatr")
	private String avatar = null;
    @SerializedName("date_created")
	private String dateCreated = null;
    @SerializedName("date_modified")
	private String dateModified = null;
    @SerializedName("email_notifications")
	private String emailNotifications = null;
    @SerializedName("facebook_id")
	private String facebookId = null;
    @SerializedName("gravater_url")
	private String gravatarUrl = null;
    @SerializedName("gtalk_username")
	private String gtalkUsername = null;
    @SerializedName("job_title")
	private String jobTitle = null;
    @SerializedName("last_ip")
	private String lastIp = null;
    @SerializedName("phone")
	private String phone = null;
    @SerializedName("skype_username")
	private String skypeUsername = null;
    @SerializedName("timezone")
	private String timezone = null;
    @SerializedName("twitter_username")
	private String twitterUsername = null;
    @SerializedName("windows_live_id")
	private String windowsLiveId = null;

    public Profile() {
        super();
    }
	public String getAimUsername() {
		return aimUsername;
	}
	public void setAimUsername(String aimUsername) {
		this.aimUsername = aimUsername;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getDateModified() {
		return dateModified;
	}
	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}
	public String getEmailNotifications() {
		return emailNotifications;
	}
	public void setEmailNotifications(String emailNotifications) {
		this.emailNotifications = emailNotifications;
	}
	public String getFacebookId() {
		return facebookId;
	}
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}
	public String getGravatarUrl() {
		return gravatarUrl;
	}
	public void setGravatarUrl(String gravatarUrl) {
		this.gravatarUrl = gravatarUrl;
	}
	public String getGtalkUsername() {
		return gtalkUsername;
	}
	public void setGtalkUsername(String gtalkUsername) {
		this.gtalkUsername = gtalkUsername;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSkypeUsername() {
		return skypeUsername;
	}
	public void setSkypeUsername(String skypeUsername) {
		this.skypeUsername = skypeUsername;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getTwitterUsername() {
		return twitterUsername;
	}
	public void setTwitterUsername(String twitterUsername) {
		this.twitterUsername = twitterUsername;
	}
	public String getWindowsLiveId() {
		return windowsLiveId;
	}
	public void setWindowsLiveId(String windowsLiveId) {
		this.windowsLiveId = windowsLiveId;
	}
    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
