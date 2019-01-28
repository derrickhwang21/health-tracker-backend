package com.hwang.healthtrackerbackend;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exercise {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int id;
    public String title;
    public int sets;
    public int reps;
    public String description;
    public String timestamp;
    public double longitude;
    public double latitude;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }



    public Exercise(String title, int sets, int reps, String description, String timestamp, double longitude, double latitude){
        this.title = title;
        this.sets = sets;
        this.reps = reps;
        this.description = description;
        this.timestamp = timestamp;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Exercise(){}

    public String toString(){
        return "Exercise name: " + title + " Sets: " + sets + " Reps: " + reps + " Description: " + description + " Time: " + timestamp + "Longitude: " + longitude + "Latitude: " + latitude;
    }
}
