package com.getblimp.api.beans;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Version {
	private String content = null;
	private String content_type = null;
    private Calendar date_created = null;
	private Calendar date_modified = null;
    private int height = 0;
    private int id =  0;
    private String name = null;
    private String preview_url = null;
    private String resource_uri = null;
    private int size = 0;
    private String thumbnail_url = null;
    private int width = 80;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
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
	public String getPreview_url() {
		return preview_url;
	}
	public void setPreview_url(String preview_url) {
		this.preview_url = preview_url;
	}
	public String getResource_uri() {
		return resource_uri;
	}
	public void setResource_uri(String resource_uri) {
		this.resource_uri = resource_uri;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getThumbnail_url() {
		return thumbnail_url;
	}
	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
