package com.erinc.questapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "liketbl")
@Data
public class Like {
    @Id
    Long id;
    Long postId;
    Long userId;
}
