package com.getblimp.api.beans;

import com.getblimp.api.utils.BlimpResources;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-5
 * Time: 13:16
 * To change this template use File | Settings | File Templates.
 */
public abstract class BlimpObject {
    public abstract String toJson();
    public static BlimpObject getInstance(BlimpResources resource) throws Exception {
        switch (resource) {
            case COMMENT:
                return new Comment();
            case COMPANY:
                return new Company();
            case FILE:
                return new File();
            case GOAL:
                return new Goal();
            case PROJECT:
                return new Project();
            case TASK:
                return new Task();
            case USER:
                return new User();
            default:
                throw new Exception("Wrong resource");
        }
    }
}
