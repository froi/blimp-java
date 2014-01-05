/* github_apache_lic */

package com.getblimp.api.beans;

import com.google.gson.Gson;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Version extends BlimpObject {
	private String content = null;
	private String contentType = null;
    private Calendar dateCreated = null;
	private Calendar dateModified = null;
    private int height = 0;
    private int id =  0;
    private String name = null;
    private String previewUrl = null;
    private String resourceUri = null;
    private int size = 0;
    private String thumbnailUrl = null;
    private int width = 80;

    public Version() {
        super();
    }
    private Version(Builder b) {
        this.content = b.content;
        this.contentType = b.contentType;
        this.dateCreated = b.dateCreated;
        this.dateModified = b.dateModified;
        this.height = b.height;
        this.id = b.id;
        this.name = b.name;
        this.previewUrl = b.previewUrl;
        this.resourceUri = b.resourceUri;
        this.size = b.size;
        this.thumbnailUrl = b.thumbnailUrl;
        this.width = b.width;
    }
	public String getContent() {
		return content;
	}
	public String getContentType() {
		return contentType;
	}
	public Calendar getDateCreated() {
		return dateCreated;
	}
	public Calendar getDateModified() {
		return dateModified;
	}
	public int getHeight() {
		return height;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPreviewUrl() {
		return previewUrl;
	}
	public String getResourceUri() {
		return resourceUri;
	}
	public int getSize() {
		return size;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public int getWidth() {
		return width;
	}
    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static class Builder {

        private String content = null;
        private String contentType = null;
        private Calendar dateCreated = null;
        private Calendar dateModified = null;
        private int height = 0;
        private int id =  0;
        private String name = null;
        private String previewUrl = null;
        private String resourceUri = null;
        private int size = 0;
        private String thumbnailUrl = null;
        private int width = 80;

        public Builder content(String content) {
            this.content = content;
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = contentType;
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
        public Builder height(int height) {
            this.height = height;
            return this;
        }
        public Builder id(int id ) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }
        public Builder size(int size) {
            this.size = size;
            return this;
        }
        public Builder thumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }
        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Version build() {
            return new Version(this);
        }
    }
}
