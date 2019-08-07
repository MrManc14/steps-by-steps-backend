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

    @Column(name = "totalPoints")
    private int totalPoints;

    @Column(name = "transportPoints")
    private int transportPoints;

    @Column(name = "dietPoints")
    private int dietPoints;

    @Column(name = "shoppingPoints")
    private int shoppingPoints;

    @Column(name = "wastePoints")
    private int wastePoints;

    @Column(name = "powerPoints")
    private int powerPoints;

    @Column(name = "timestamp")
    private Long timestamp;

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

    public int getScore() {
        return totalPoints;
    }

    public void setScore(int score) {
        this.totalPoints = score;
    }

    public int getTransportPoints() {
        return transportPoints;
    }

    public void setTransportPoints(int transportPoints) {
        this.transportPoints = transportPoints;
    }

    public int getDietPoints() {
        return dietPoints;
    }

    public void setDietPoints(int dietPoints) {
        this.dietPoints = dietPoints;
    }

    public int getShoppingPoints() {
        return shoppingPoints;
    }

    public void setShoppingPoints(int shoppingPoints) {
        this.shoppingPoints = shoppingPoints;
    }

    public int getWastePoints() {
        return wastePoints;
    }

    public void setWastePoints(int wastePoints) {
        this.wastePoints = wastePoints;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Quiz(Long id, String userID, int score) {
        this.id = id;
        this.userID = userID;
        this.totalPoints = score;
    }

    protected Quiz() {
    }
}