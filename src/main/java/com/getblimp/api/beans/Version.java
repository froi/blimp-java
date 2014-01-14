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

public class Version extends BlimpObject {
    @SerializedName("contect")
	private String content = null;
    @SerializedName("content_type")
	private String contentType = null;
    @SerializedName("date_created")
    private String dateCreated = null;
    @SerializedName("date_modified")
	private String dateModified = null;
    @SerializedName("height")
    private int height = 0;
    @SerializedName("id")
    private int id =  0;
    @SerializedName("name")
    private String name = null;
    @SerializedName("preview_url")
    private String previewUrl = null;
    @SerializedName("resource_url")
    private String resourceUri = null;
    @SerializedName("size")
    private int size = 0;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl = null;
    @SerializedName("width")
    private int width = 80;

    public Version() {
        super();
    }
	public String getContent() {
		return content;
	}
	public String getContentType() {
		return contentType;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public String getDateModified() {
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
}
