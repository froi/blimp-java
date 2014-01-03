package com.getblimp.api.beans;

import com.getblimp.api.utils.State;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Goal {
    private String assignedTo;
    private String createdBy;
    private Calendar dateCreated;
    private Calendar dateDone;
    private Calendar dateModified;
    private Calendar dateRejected;
    private Integer id;
    private Integer position;
    private String project;
    private String resourceUri;
    private State state;
    private String title;
    private String userRejected;

    public Goal(Builder b) {
        this.assignedTo = b.assignedTo;
        this.createdBy = b.createdBy;
        this.dateCreated = b.dateCreated;
        this.dateDone = b.dateDone;
        this.dateModified = b.dateModified;
        this.dateRejected = b.dateRejected;
        this.id = b.id;
        this.position = b.position;
        this.project = b.project;
        this.resourceUri = b.resourceUri;
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

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public Calendar getDateDone() {
        return dateDone;
    }

    public Calendar getDateModified() {
        return dateModified;
    }

    public Calendar getDateRejected() {
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

    public static class Builder {
        private String assignedTo;
        private String createdBy;
        private Calendar dateCreated;
        private Calendar dateDone;
        private Calendar dateModified;
        private Calendar dateRejected;
        private Integer id;
        private Integer position;
        private String project;
        private String resourceUri;
        private State state;
        private String title;
        private String userRejected;

        public Builder assignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
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
        public Builder dateRejected(Calendar dateRejected) {
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
        public Builder userRejected(String userRejected) {
            this.userRejected = userRejected;
            return this;
        }

        public Goal build() {
            return new Goal(this);
        }
    }
}
