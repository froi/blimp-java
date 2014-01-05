/* github_apache_lic */

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
