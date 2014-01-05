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

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 */
public class Stats extends BlimpObject {
    private Integer goalsActive;
    private Integer goalsAll;
    private Integer goalsDone;
    private Integer goalsInactive;
    private Integer goalsReview;
    private Float progress;

    public Stats() {
        super();
    }
    private Stats(Builder b) {
        this.goalsActive = b.goalsActive;
        this.goalsAll = b.goalsAll;
        this.goalsDone = b.goalsDone;
        this.goalsInactive = b.goalsInactive;
        this.goalsReview = b.goalsReview;
        this.progress = b.progress;
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
    public static class Builder {
        private Integer goalsActive;
        private Integer goalsAll;
        private Integer goalsDone;
        private Integer goalsInactive;
        private Integer goalsReview;
        private Float progress;

        public Builder goalsActive(Integer goalsActive) {
            this.goalsActive = goalsActive;
            return this;
        }
        public Builder goalsAll(Integer goalsAll) {
            this.goalsAll = goalsAll;
            return this;
        }
        public Builder goalsDone(Integer goalsDone) {
            this.goalsDone = goalsDone;
            return this;
        }
        public Builder goalsInactive(Integer goalsInactive) {
            this.goalsInactive = goalsInactive;
            return this;
        }
        public Builder goalsReview(Integer goalsReview) {
            this.goalsReview = goalsReview;
            return this;
        }
        public Builder progress(Float progress) {
            this.progress = progress;
            return this;
        }

        public Stats build() {
            return new Stats(this);
        }
    }
}
