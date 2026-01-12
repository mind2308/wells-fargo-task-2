package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientId;

    @ManyToOne
    private Advisor advisor;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    protected Client() {}

    public Client(Advisor advisor, String firstName, String lastName, String email, String phone) {
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Long getClientId() {
        return clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

