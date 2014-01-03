package com.getblimp.api.beans;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */

public class User {
	private String email = null;
	private String firstName = null;
	private String lastName = null;
	private Profile profile = null;
	private String resourceUri = null;
    private String username = null;

    public User(Builder b) {
        this.email = b.email;
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.profile = b.profile;
        this.resourceUri = b.resourceUri;
        this.username = b.username;
    }
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Profile getProfile() {
		return profile;
	}
	public String getResourceUri() {
		return resourceUri;
	}
	public String getUsername() {
		return username;
	}

    public static class Builder {
        private String email = null;
        private String firstName = null;
        private String lastName = null;
        private Profile profile = null;
        private String resourceUri = null;
        private String username = null;

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder profile(Profile profile) {
            this.profile = profile;
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
