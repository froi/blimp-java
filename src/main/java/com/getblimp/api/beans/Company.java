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
public class Company {
    private List<User> companyUsers;
    private Calendar dateCreated;
    private Calendar dateModified;
    private Integer id;
    private String imageUrl;
    private String name;
    private String resourceUrl;
    private String slug;
    private Integer usedProjects;
    private String usedStorage;

    public Company(Builder b) {
        this.companyUsers = b.companyUsers;
        this.dateCreated = b.dateCreated;
        this.dateModified = b.dateModified;
        this.id = b.id;
        this.imageUrl = b.imageUrl;
        this.name = b.name;
        this.resourceUrl = b.resourceUrl;
        this.slug = b.slug;
        this.usedProjects = b.usedProjects;
        this.usedStorage = b.usedStorage;
    }
    public List<User> getCompanyUsers() {
        return companyUsers;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public Calendar getDateModified() {
        return dateModified;
    }

    public Integer getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public String getSlug() {
        return slug;
    }

    public Integer getUsedProjects() {
        return usedProjects;
    }

    public String getUsedStorage() {
        return usedStorage;
    }

    public static class Builder {
        private List<User> companyUsers;
        private Calendar dateCreated;
        private Calendar dateModified;
        private Integer id;
        private String imageUrl;
        private String name;
        private String resourceUrl;
        private String slug;
        private Integer usedProjects;
        private String usedStorage;

        public Builder companyUsers(List<User> companyUsers) {
            this.companyUsers = companyUsers;
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
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder resourceUrl(String resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }
        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }
        public Builder usedProjects(Integer usedProjects) {
            this.usedProjects = usedProjects;
            return this;
        }
        public Builder usedStorage(String usedStorage) {
            this.usedStorage = usedStorage;
            return this;
        }
        public Company build() {
            return new Company(this);
        }
    }
}
