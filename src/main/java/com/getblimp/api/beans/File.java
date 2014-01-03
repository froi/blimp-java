package com.getblimp.api.beans;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class File {
	private String created_by = null;
    private String date_created = null;
    private Calendar date_modified = null;
    private int id = 0;
    private String name = null;
    private String project = null;
    private String resource_uri = null;
    private String source = null;
    private ArrayList<Version> versions = null;

	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getDate_created() {
		return date_created;
	}
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	public Calendar getDate_modified() {
		return date_modified;
	}
	public void setDate_modified(Calendar date_modified) {
		this.date_modified = date_modified;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getResource_uri() {
		return resource_uri;
	}
	public void setResource_uri(String resource_uri) {
		this.resource_uri = resource_uri;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public ArrayList<Version> getVersions() {
		return versions;
	}
	public void setVersions(ArrayList<Version> versions) {
		this.versions = versions;
	}
}
