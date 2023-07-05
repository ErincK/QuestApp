package com.erinc.questapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="usertbl")
@Data
public class User {

    @Id
    Long id;
    String userName;
    String password;
}
