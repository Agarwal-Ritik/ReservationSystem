package com.reservation.model;

import jakarta.persistence.*;

@Entity
@Table (name = "train")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final int trainNumber;

    @Column(name = "train_name", nullable = false, unique = true)
    private String trainName;

    @Column(name = "src", nullable = false)
    private String source;
    @Column(name = "dest", nullable = false)
    private String destination;
    @Column(name = "type", nullable = false)
    private String type;

    public Train(int trainNumber, String trainName, String source, String destination, String type) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
}
