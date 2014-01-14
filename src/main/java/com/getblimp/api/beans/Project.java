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

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Project extends BlimpObject {
    @SerializedName("company")
    private String company;
    @SerializedName("date_created")
    private String dateCreated;
    @SerializedName("date_due")
    private String dateDue;
    @SerializedName("date_finished")
    private String dateFinished;
    @SerializedName("date_modified")
    private String dateModified;
    @SerializedName("date_started")
    private String dateStarted;
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("resource_uri")
    private String resourceUri;
    @SerializedName("slug")
    private String slug;
    @SerializedName("state")
    private State state;
    @SerializedName("stats")
    private Stats stats;
    @SerializedName("team")
    private List<String> team;

    public Project() {
        super();
    }
    private Project(Builder b) {
        this.company = b.company;
        this.dateDue = b.dateDue;
        this.dateFinished = b.dateFinished;
        this.dateStarted = b.dateStarted;
        this.id = b.id;
        this.name = b.name;
        this.state = b.state;
        this.team = b.team;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateDue(String dateDue) {
        this.dateDue = dateDue;
    }

    public void setDateFinished(String dateFinished) {
        this.dateFinished = dateFinished;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public void setDateStarted(String dateStarted) {
        this.dateStarted = dateStarted;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setTeam(List<String> team) {
        this.team = team;
    }

    public String getCompany() {
        return company;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateDue() {
        return dateDue;
    }

    public String getDateFinished() {
        return dateFinished;
    }

    public String getDateModified() {
        return dateModified;
    }

    public String getDateStarted() {
        return dateStarted;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public String getSlug() {
        return slug;
    }

    public State getState() {
        return state;
    }

    public Stats getStats() {
        return stats;
    }

    public List<String> getTeam() {
        return team;
    }
    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static class Builder {
        private String company;
        private String dateDue;
        private String dateFinished;
        private String dateStarted;
        private Integer id;
        private String name;
        private State state;
        private List<String> team;

        public Builder company(String company) {
            this.company = company;
            return this;
        }
        public Builder dateDue(String dateDue) {
            this.dateDue = dateDue;
            return this;
        }
        public Builder dateFinished(String dateFinished) {
            this.dateFinished = dateFinished;
            return this;
        }
        public Builder dateStarted(String dateStarted) {
            this.dateStarted = dateStarted;
            return this;
        }
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder state(State state) {
            this.state = state;
            return this;
        }
        public Builder team(List<String> team) {
            this.team = team;
            return this;
        }

        public Project build() {
            return new Project(this);
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Project project = (Project) o;
//
//        if (!company.equals(project.company)) return false;
//        if (!dateCreated.equals(project.dateCreated)) return false;
//        if (dateDue != null ? !dateDue.equals(project.dateDue) : project.dateDue != null) return false;
//        if (dateFinished != null ? !dateFinished.equals(project.dateFinished) : project.dateFinished != null)
//            return false;
//        if (!dateModified.equals(project.dateModified)) return false;
//        if (dateStarted != null ? !dateStarted.equals(project.dateStarted) : project.dateStarted != null) return false;
//        if (!id.equals(project.id)) return false;
//        if (!name.equals(project.name)) return false;
//        if (!resourceUri.equals(project.resourceUri)) return false;
//        if (!slug.equals(project.slug)) return false;
//        if (state != project.state) return false;
//        if (stats != null ? !stats.equals(project.stats) : project.stats != null) return false;
//        if (!team.equals(project.team)) return false;
//
//        return true;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (!company.equals(project.company)) return false;
        if (!dateCreated.equals(project.dateCreated)) return false;
        if (dateDue != null ? !dateDue.equals(project.dateDue) : project.dateDue != null) return false;
        if (dateFinished != null ? !dateFinished.equals(project.dateFinished) : project.dateFinished != null)
            return false;
        if (!dateModified.equals(project.dateModified)) return false;
        if (dateStarted != null ? !dateStarted.equals(project.dateStarted) : project.dateStarted != null) return false;
        if (!id.equals(project.id)) return false;
        if (!name.equals(project.name)) return false;
        if (!resourceUri.equals(project.resourceUri)) return false;
        if (!slug.equals(project.slug)) return false;
        if (state != project.state) return false;
        if (stats != null ? !stats.equals(project.stats) : project.stats != null) return false;
        if (!team.equals(project.team)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = company.hashCode();
        result = 31 * result + dateCreated.hashCode();
        result = 31 * result + (dateDue != null ? dateDue.hashCode() : 0);
        result = 31 * result + (dateFinished != null ? dateFinished.hashCode() : 0);
        result = 31 * result + dateModified.hashCode();
        result = 31 * result + (dateStarted != null ? dateStarted.hashCode() : 0);
        result = 31 * result + id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + resourceUri.hashCode();
        result = 31 * result + slug.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + (stats != null ? stats.hashCode() : 0);
        result = 31 * result + team.hashCode();
        return result;
    }
}
