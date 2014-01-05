/* github_apache_lic */

package com.getblimp.api.utils;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public enum BlimpResources {
	ENDPOINT("https://app.getblimp.com/api/v2/"),
	COMPANY("company/"),
	PROJECT("project/"),
	GOAL("goal/"),
	TASK("task/"),
	COMMENT("comment/"),
	FILE("file/"),
	USER("user/"),
	SCHEMA("schema/");
	
	private String resource = null;
	
	BlimpResources(String resource) { 
		this.resource = resource;
	}
	
	public String resource() { 
		return resource; 
	}
}
