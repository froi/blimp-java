package com.getblimp.api.beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class File {
    private String createdBy;
    private String dateCreated;
    private Calendar dateModified;
    private Integer id;
    private String name;
    private String project;
    private String resourceUri;
    private String source;
    private List<Version> versions;

    public File(Builder b) {
        this.createdBy = b.createdBy;
        this.dateCreated = b.dateCreated;
        this.dateModified = b.dateModified;
        this.id = b.id;
        this.name = b.name;
        this.project = b.project;
        this.resourceUri = b.resourceUri;
        this.source = b.source;
        this.versions = b.versions;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public Calendar getDateModified() {
        return dateModified;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProject() {
        return project;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public String getSource() {
        return source;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public static class Builder {
        private String createdBy;
        private String dateCreated;
        private Calendar dateModified;
        private Integer id;
        private String name;
        private String project;
        private String resourceUri;
        private String source;
        private List<Version> versions;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Builder dateCreated(String dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }
        public Builder dateModified(Calendar dateModified) {
            this.dateModified = dateModified;
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
        public Builder project(String project) {
            this.project = project;
            return this;
        }
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }
        public Builder source(String source) {
            this.source = source;
            return this;
        }
        public Builder versions(List<Version> versions) {
            this.versions = versions;
            return this;
        }
        public File build() {
            return new File(this);
        }
    }
}
