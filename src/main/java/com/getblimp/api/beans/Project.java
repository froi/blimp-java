package com.getblimp.api.beans;

import com.getblimp.api.utils.State;

import java.util.Calendar;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class Project {
    private String company;
    private Calendar dateCreated;
    private Calendar dateDue;
    private Calendar dateFinished;
    private Calendar dateModified;
    private Calendar dateStarted;
    private Integer id;
    private String name;
    private String resourceUri;
    private String slug;
    private State state;
    private Stats stats;
    private List<String> team;

    public Project(Builder b) {
        this.company = b.company;
        this.dateCreated = b.dateCreated;
        this.dateDue = b.dateDue;
        this.dateFinished = b.dateFinished;
        this.dateModified = b.dateModified;
        this.dateStarted = b.dateStarted;
        this.id = b.id;
        this.name = b.name;
        this.resourceUri = b.resourceUri;
        this.slug = b.slug;
        this.state = b.state;
        this.stats = b.stats;
        this.team = b.team;
    }

    public String getCompany() {
        return company;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public Calendar getDateDue() {
        return dateDue;
    }

    public Calendar getDateFinished() {
        return dateFinished;
    }

    public Calendar getDateModified() {
        return dateModified;
    }

    public Calendar getDateStarted() {
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

    public static class Builder {
        private String company;
        private Calendar dateCreated;
        private Calendar dateDue;
        private Calendar dateFinished;
        private Calendar dateModified;
        private Calendar dateStarted;
        private Integer id;
        private String name;
        private String resourceUri;
        private String slug;
        private State state;
        private Stats stats;
        private List<String> team;

        public Builder company(String company) {
            this.company = company;
            return this;
        }
        public Builder dateCreated(Calendar dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }
        public Builder dateDue(Calendar dateDue) {
            this.dateDue = dateDue;
            return this;
        }
        public Builder dateFinished(Calendar dateFinished) {
            this.dateFinished = dateFinished;
            return this;
        }
        public Builder dateModified(Calendar dateModified) {
            this.dateModified = dateModified;
            return this;
        }
        public Builder dateStarted(Calendar dateStarted) {
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
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }
        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }
        public Builder state(State state) {
            this.state = state;
            return this;
        }
        public Builder stats(Stats stats) {
            this.stats = stats;
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
}
