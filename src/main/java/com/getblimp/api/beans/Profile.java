package com.getblimp.api.beans;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Profile {
	private String aim_username = null;
	private String avatar = null;
	private Calendar date_created = null;
	private Calendar date_modified = null;
	private String email_notifications = null;
	private String facebook_id= null;
	private String gravatar_url = null;
	private String gtalk_username = null;
	private String job_title = null;
	private String last_ip = null;
	private String phone = null;
	private String skype_username = null;
	private String timezone = null;
	private String twitter_username = null;
	private String windows_live_id = null;

	public String getAim_username() {
		return aim_username;
	}
	public void setAim_username(String aim_username) {
		this.aim_username = aim_username;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Calendar getDate_created() {
		return date_created;
	}
	public void setDate_created(Calendar date_created) {
		this.date_created = date_created;
	}
	public Calendar getDate_modified() {
		return date_modified;
	}
	public void setDate_modified(Calendar date_modified) {
		this.date_modified = date_modified;
	}
	public String getEmail_notifications() {
		return email_notifications;
	}
	public void setEmail_notifications(String email_notifications) {
		this.email_notifications = email_notifications;
	}
	public String getFacebook_id() {
		return facebook_id;
	}
	public void setFacebook_id(String facebook_id) {
		this.facebook_id = facebook_id;
	}
	public String getGravatar_url() {
		return gravatar_url;
	}
	public void setGravatar_url(String gravatar_url) {
		this.gravatar_url = gravatar_url;
	}
	public String getGtalk_username() {
		return gtalk_username;
	}
	public void setGtalk_username(String gtalk_username) {
		this.gtalk_username = gtalk_username;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getLast_ip() {
		return last_ip;
	}
	public void setLast_ip(String last_ip) {
		this.last_ip = last_ip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSkype_username() {
		return skype_username;
	}
	public void setSkype_username(String skype_username) {
		this.skype_username = skype_username;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getTwitter_username() {
		return twitter_username;
	}
	public void setTwitter_username(String twitter_username) {
		this.twitter_username = twitter_username;
	}
	public String getWindows_live_id() {
		return windows_live_id;
	}
	public void setWindows_live_id(String windows_live_id) {
		this.windows_live_id = windows_live_id;
	}
}
