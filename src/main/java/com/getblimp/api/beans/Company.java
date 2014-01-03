package com.getblimp.api.beans;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */
public class Company {
    private ArrayList<?> company_users = null;
    private Calendar date_created = null;
    private Calendar date_modified = null;
    private int id = 0;
    private String image_url = null;
    private String name = null;
    private String resource_url = null;
    private String slug = null;
    private int used_projects = 0;
    private String used_storage = null;
    public ArrayList<?> getCompany_users() {
        return company_users;
    }
    public void setCompany_users(ArrayList<?> company_users) {
        this.company_users = company_users;
    }
    public Calendar getDate_created() {
        return date_created;
    }
    public void setDate_created(Calendar date_created) {
        this.date_created = date_created;
    }
    public Calendar getDate_modified() {
        return date_modified;
    }
    public void setDate_modified(Calendar date_modified) {
        this.date_modified = date_modified;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getImage_url() {
        return image_url;
    }
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getResource_url() {
        return resource_url;
    }
    public void setResource_url(String resource_url) {
        this.resource_url = resource_url;
    }
    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }
    public int getUsed_projects() {
        return used_projects;
    }
    public void setUsed_projects(int used_projects) {
        this.used_projects = used_projects;
    }
    public String getUsed_storage() {
        return used_storage;
    }
    public void setUsed_storage(String used_storage) {
        this.used_storage = used_storage;
    }
}
