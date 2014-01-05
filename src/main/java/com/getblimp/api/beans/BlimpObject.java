/**********************************************************************************************************************
 * Copyright 2014 Froilan Irizarry                                                                                    *
 * http://froilanirizarry.me                                                                                          *
 * https://github.com/froi                                                                                            *
 *                                                                                                                    *
 * Code can be downloaded, forked, or revied at:                                                                      *
 *      https://github.com/froi/blimp-java                                                                                *
 *                                                                                                                    *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not                                        *
 * use this file except in compliance with the License. You may obtain a copy of                                      *
 * the License at:                                                                                                    *
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                                                        *
 * Unless required by applicable law or agreed to in writing, software                                                *
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT                                          *
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the                                           *
 * License for the specific language governing permissions and limitations under                                      *
 * the License.                                                                                                       *
 **********************************************************************************************************************/

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
