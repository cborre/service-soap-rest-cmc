package com.cmc.servicesoaprest.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String codeUser;

    @Column
    private int intent;

    @Column
    private String dateAuth;

    @Column
    private String hourAuth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(String codeUser) {
        this.codeUser = codeUser;
    }

    public int getIntent() {
        return intent;
    }

    public void setIntent(int intent) {
        this.intent = intent;
    }

    public String getDateAuth() {
        return dateAuth;
    }

    public void setDateAuth(String dateAuth) {
        this.dateAuth = dateAuth;
    }

    public String getHourAuth() {
        return hourAuth;
    }

    public void setHourAuth(String hourAuth) {
        this.hourAuth = hourAuth;
    }
}