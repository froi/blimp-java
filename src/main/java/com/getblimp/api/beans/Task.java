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

import com.getblimp.api.utils.State;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Task extends BlimpObject {
    @SerializedName("assigned_to")
    private String assignedTo;
    @SerializedName("created_by")
    private String createdBy;
    @SerializedName("date_checked")
    private String dateChecked;
    @SerializedName("date_created")
    private String dateCreated;
    @SerializedName("date_done")
    private String dateDone;
    @SerializedName("date_modified")
    private String dateModified;
    @SerializedName("date_set_doing")
    private String dateSetDoing;
    @SerializedName("goal")
    private String goal;
    @SerializedName("id")
    private Integer id;
    @SerializedName("position")
    private Integer position;
    @SerializedName("resource_uri")
    private String resourceUri;
    @SerializedName("state")
    private State state;
    @SerializedName("title")
    private String title;

    public Task() {
        super();
    }
    private Task(Builder b) {
        this.assignedTo = b.assignedTo;
        this.goal = b.goal;
        this.id = b.id;
        this.position = b.position;
        this.state = b.state;
        this.title = b.title;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getDateChecked() {
        return dateChecked;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateDone() {
        return dateDone;
    }

    public String getDateModified() {
        return dateModified;
    }

    public String getDateSetDoing() {
        return dateSetDoing;
    }

    public String getGoal() {
        return goal;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPosition() {
        return position;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public State getState() {
        return state;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static class Builder {
        private String assignedTo;
        private String goal;
        private Integer id;
        private Integer position;
        private State state;
        private String title;

        public Builder assignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }

        public Builder goal(String goal) {
            this.goal = goal;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        public Builder state(State state) {
            this.state = state;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Task build() {
            return new Task(this);
        }
    }
}
