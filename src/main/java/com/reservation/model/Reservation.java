package com.reservation.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PNR;

    @Column(name = "quota", nullable = false)
    private String quota;

    @Column(name = "res_class", nullable = false)
    private String resClass;

    @Column (name = "journey_date", nullable = false)
    private Date journeyDate;

    @Column (name = "booking_date", nullable = false)
    private Date bookingDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "train_id", nullable = false)
    private Train train;
}
