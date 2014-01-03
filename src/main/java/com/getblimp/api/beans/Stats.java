package com.getblimp.api.beans;

/**
 * Created with IntelliJ IDEA.
 * User: froilan
 * Date: 14-1-2
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 */
public class Stats {
    private Integer goalsActive;
    private Integer goalsAll;
    private Integer goalsDone;
    private Integer goalsInactive;
    private Integer goalsReview;
    private Integer progress;

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

    public Integer getProgress() {
        return progress;
    }

    public static class Builder {
        private Integer goalsActive;
        private Integer goalsAll;
        private Integer goalsDone;
        private Integer goalsInactive;
        private Integer goalsReview;
        private Integer progress;

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
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        public Stats build() {
            return new Stats(this);
        }
    }
}
