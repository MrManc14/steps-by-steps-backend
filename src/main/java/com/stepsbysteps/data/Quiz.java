package com.stepsbysteps.data;

import javax.persistence.*;

@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userID")
    private String userID;

    @Column(name = "score")
    private String score;

    @Column(name = "timeStamp")
    private String timeStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Quiz(Long id, String userID, String score, String timeStamp) {
        this.id = id;
        this.userID = userID;
        this.score = score;
        this.timeStamp = timeStamp;
    }

    public Quiz() {
    }
}