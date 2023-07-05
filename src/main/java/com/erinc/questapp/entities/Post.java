package com.erinc.questapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="posttbl")
@Data
public class Post {
    @Id
    Long id;
    Long userId;
    String title;
    @Lob
    @Column(columnDefinition = "text")
    String text;
}
