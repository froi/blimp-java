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
public class Company extends BlimpObject{
    @SerializedName("company_users")
    private List<CompanyUser> companyUsers;
    @SerializedName("date_created")
    private String dateCreated;
    @SerializedName("date_modified")
    private String dateModified;
    @SerializedName("id")
    private Integer id;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("name")
    private String name;
    @SerializedName("resource_url")
    private String resourceUrl;
    @SerializedName("slug")
    private String slug;
    @SerializedName("used_projects")
    private Integer usedProjects;
    @SerializedName("used_storage")
    private String usedStorage;

    public Company() {
        super();
    }

    public List<CompanyUser> getCompanyUsers() {
        return companyUsers;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateModified() {
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

    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (!companyUsers.equals(company.companyUsers)) return false;
        if (!dateCreated.equals(company.dateCreated)) return false;
        if (!dateModified.equals(company.dateModified)) return false;
        if (!id.equals(company.id)) return false;
        if (!imageUrl.equals(company.imageUrl)) return false;
        if (!name.equals(company.name)) return false;
        if (!resourceUrl.equals(company.resourceUrl)) return false;
        if (!slug.equals(company.slug)) return false;
        if (!usedProjects.equals(company.usedProjects)) return false;
        if (!usedStorage.equals(company.usedStorage)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyUsers.hashCode();
        result = 31 * result + dateCreated.hashCode();
        result = 31 * result + dateModified.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + imageUrl.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + resourceUrl.hashCode();
        result = 31 * result + slug.hashCode();
        result = 31 * result + usedProjects.hashCode();
        result = 31 * result + usedStorage.hashCode();
        return result;
    }
}
