package com.example.myquiz;

public class Question {
    private int questionId,opt1Id,opt2Id,opt3Id,opt4Id,correctAnsId;

    public Question(int questionId, int opt1Id, int opt2Id, int opt3Id, int opt4Id, int correctAnsId){
        this.questionId=questionId;
        this.opt1Id=opt1Id;
        this.opt2Id=opt2Id;
        this.opt3Id=opt3Id;
        this.opt4Id=opt4Id;
        this.correctAnsId=correctAnsId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getOpt1Id() {
        return opt1Id;
    }

    public void setOpt1Id(int opt1Id) {
        this.opt1Id = opt1Id;
    }

    public int getOpt2Id() {
        return opt2Id;
    }

    public void setOpt2Id(int opt2Id) {
        this.opt2Id = opt2Id;
    }

    public int getOpt3Id() {
        return opt3Id;
    }

    public void setOpt3Id(int opt3Id) {
        this.opt3Id = opt3Id;
    }

    public int getOpt4Id() {
        return opt4Id;
    }

    public void setOpt4Id(int opt4Id) {
        this.opt4Id = opt4Id;
    }

    public int getCorrectAnsId() {
        return correctAnsId;
    }
}
