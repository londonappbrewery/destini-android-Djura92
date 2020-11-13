package com.londonappbrewery.destini;

public class StoryAnsEnd {
    int storyId;
    int answerTop;
    int answerBottom;

    public StoryAnsEnd(int storyId, int answerTop, int answerBottom) {
        this.storyId = storyId;
        this.answerTop = answerTop;
        this.answerBottom = answerBottom;
    }
    public StoryAnsEnd(int storyId){
        this.storyId = storyId;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    public int getAnswerTop() {
        return answerTop;
    }

    public void setAnswerTop(int answerTop) {
        this.answerTop = answerTop;
    }

    public int getAnswerBottom() {
        return answerBottom;
    }

    public void setAnswerBottom(int answerBottom) {
        this.answerBottom = answerBottom;
    }

}
