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

public class Goal extends BlimpObject{
    @SerializedName("assigned_to")
    private String assignedTo;
    @SerializedName("created_by")
    private String createdBy;
    @SerializedName("date_created")
    private String dateCreated;
    @SerializedName("date_done")
    private String dateDone;
    @SerializedName("date_modified")
    private String dateModified;
    @SerializedName("date_rejected")
    private String dateRejected;
    @SerializedName("id")
    private Integer id;
    @SerializedName("position")
    private Integer position;
    @SerializedName("project")
    private String project;
    @SerializedName("resource_uri")
    private String resourceUri;
    @SerializedName("state")
    private State state;
    @SerializedName("title")
    private String title;
    @SerializedName("user_rejected")
    private String userRejected;

    public Goal() {
        super();
    }
    private Goal(Builder b) {
        this.assignedTo = b.assignedTo;
        this.dateDone = b.dateDone;
        this.dateRejected = b.dateRejected;
        this.id = b.id;
        this.position = b.position;
        this.project = b.project;
        this.state = b.state;
        this.title = b.title;
        this.userRejected = b.userRejected;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getCreatedBy() {
        return createdBy;
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

    public String getDateRejected() {
        return dateRejected;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPosition() {
        return position;
    }

    public String getProject() {
        return project;
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

    public String getUserRejected() {
        return userRejected;
    }
    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static class Builder {
        private String assignedTo;
        private String dateDone;
        private String dateRejected;
        private Integer id;
        private Integer position;
        private String project;
        private State state;
        private String title;
        private String userRejected;

        public Builder assignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public Builder dateDone(String dateDone) {
            this.dateDone = dateDone;
            return this;
        }
        public Builder dateRejected(String dateRejected) {
            this.dateRejected = dateRejected;
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
        public Builder project(String project) {
            this.project = project;
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
        public Builder userRejected(String userRejected) {
            this.userRejected = userRejected;
            return this;
        }

        public Goal build() {
            return new Goal(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goal goal = (Goal) o;

        if (assignedTo != null ? !assignedTo.equals(goal.assignedTo) : goal.assignedTo != null) return false;
        if (!createdBy.equals(goal.createdBy)) return false;
        if (!dateCreated.equals(goal.dateCreated)) return false;
        if (dateDone != null ? !dateDone.equals(goal.dateDone) : goal.dateDone != null) return false;
        if (!dateModified.equals(goal.dateModified)) return false;
        if (dateRejected != null ? !dateRejected.equals(goal.dateRejected) : goal.dateRejected != null) return false;
        if (!id.equals(goal.id)) return false;
        if (!position.equals(goal.position)) return false;
        if (!project.equals(goal.project)) return false;
        if (!resourceUri.equals(goal.resourceUri)) return false;
        if (state != goal.state) return false;
        if (!title.equals(goal.title)) return false;
        if (userRejected != null ? !userRejected.equals(goal.userRejected) : goal.userRejected != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = assignedTo != null ? assignedTo.hashCode() : 0;
        result = 31 * result + createdBy.hashCode();
        result = 31 * result + dateCreated.hashCode();
        result = 31 * result + (dateDone != null ? dateDone.hashCode() : 0);
        result = 31 * result + dateModified.hashCode();
        result = 31 * result + (dateRejected != null ? dateRejected.hashCode() : 0);
        result = 31 * result + id.hashCode();
        result = 31 * result + position.hashCode();
        result = 31 * result + project.hashCode();
        result = 31 * result + resourceUri.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + (userRejected != null ? userRejected.hashCode() : 0);
        return result;
    }
}
