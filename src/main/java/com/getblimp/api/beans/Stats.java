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

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 */
public class Stats extends BlimpObject {
    @SerializedName("goals_active")
    private Integer goalsActive;
    @SerializedName("goals_all")
    private Integer goalsAll;
    @SerializedName("goals_done")
    private Integer goalsDone;
    @SerializedName("goals_inactive")
    private Integer goalsInactive;
    @SerializedName("goals_review")
    private Integer goalsReview;
    @SerializedName("progress")
    private Float progress;

    public Stats() {
        super();
    }
    public Integer getGoalsActive() {
        return goalsActive;
    }

    public Integer getGoalsAll() {
        return goalsAll;
    }

    public Integer getGoalsDone() {
        return goalsDone;
    }

    public Integer getGoalsInactive() {
        return goalsInactive;
    }

    public Integer getGoalsReview() {
        return goalsReview;
    }

    public Float getProgress() {
        return progress;
    }
    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
