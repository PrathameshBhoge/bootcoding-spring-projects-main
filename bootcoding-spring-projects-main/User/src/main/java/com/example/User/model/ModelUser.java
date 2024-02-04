package com.example.User.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ModelUser {
    @Id
    @GeneratedValue
    private int userid;
    private String name;
    private String username;
    private String email;
    private long phone;
    private int age;
    private String password;
    private String confirm_password;
}
