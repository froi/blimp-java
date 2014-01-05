/* github_apache_lic */

package com.getblimp.api.utils;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public enum BlimpHttpHeaders {
	AUTHORIZATION("Authorization"),
	APPID("X_BLIMP_APPID"),
	APPSECRET("X_BLIMP_SECRET");

	private String value;
	
	BlimpHttpHeaders(String value){
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
