/* github_apache_lic */

package com.getblimp.api.beans;

import com.getblimp.api.utils.State;
import com.google.gson.Gson;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Task extends BlimpObject {
    private String assignedTo;
    private String createdBy;
    private Calendar dateChecked;
    private Calendar dateCreated;
    private Calendar dateDone;
    private Calendar dateModified;
    private Calendar dateSetDoing;
    private String goal;
    private Integer id;
    private Integer position;
    private String resourceUri;
    private State state;
    private String title;

    public Task() {
        super();
    }
    private Task(Builder b) {
        this.assignedTo = b.assignedTo;
        this.createdBy = b.createdBy;
        this.dateChecked = b.dateChecked;
        this.dateCreated = b.dateCreated;
        this.dateDone = b.dateDone;
        this.dateModified = b.dateModified;
        this.dateSetDoing = b.dateSetDoing;
        this.goal = b.goal;
        this.id = b.id;
        this.position = b.position;
        this.resourceUri = b.resourceUri;
        this.state = b.state;
        this.title = b.title;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Calendar getDateChecked() {
        return dateChecked;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public Calendar getDateDone() {
        return dateDone;
    }

    public Calendar getDateModified() {
        return dateModified;
    }

    public Calendar getDateSetDoing() {
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
        private String createdBy;
        private Calendar dateChecked;
        private Calendar dateCreated;
        private Calendar dateDone;
        private Calendar dateModified;
        private Calendar dateSetDoing;
        private String goal;
        private Integer id;
        private Integer position;
        private String resourceUri;
        private State state;
        private String title;

        public Builder assignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder dateChecked(Calendar dateChecked) {
            this.dateChecked = dateChecked;
            return this;
        }

        public Builder dateCreated(Calendar dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Builder dateDone(Calendar dateDone) {
            this.dateDone = dateDone;
            return this;
        }

        public Builder dateModified(Calendar dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        public Builder dateSetDoing(Calendar dateSetDoing) {
            this.dateSetDoing = dateSetDoing;
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

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
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
