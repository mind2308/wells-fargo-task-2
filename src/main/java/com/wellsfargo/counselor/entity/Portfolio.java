package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Client client;

    @Column(nullable = false)
    private String createdDate;

    protected Portfolio() {}

    public Portfolio(Client client, String createdDate) {
        this.client = client;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
