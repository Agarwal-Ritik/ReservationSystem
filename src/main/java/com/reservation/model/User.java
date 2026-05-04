package com.reservation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final int userId;

    @Column(name = "u_name", unique = true, nullable = false)
    private String userName;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "address", nullable = false, length = 32)
    private String address;
    @Column(name = "password_hash", nullable = false, length = 32)
    private String passwordHash;

    @Column(name = "email", unique = true, nullable = false)
    @Email(message = "Please provide a valid email address")
    private String email;

    @Column(name = "phone_number", unique = true, nullable = false, length = 10)
    private int phoneNumber;

    public User(int userId, String userName, String firstName, String lastName, String gender, int age, int phoneNumber, String email, String passwordHash, String address, Date dateOfBirth, Date createdOn) {
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passwordHash = passwordHash;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.createdOn = createdOn;
    }

    private Date dateOfBirth;
    private Date createdOn;

    public String getAddress() {
        return address;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}