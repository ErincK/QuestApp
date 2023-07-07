package com.erinc.questapp.entities;


import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name="usertbl")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String userName;
    String password;
}
