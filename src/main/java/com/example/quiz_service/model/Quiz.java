package com.example.quiz_service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ElementCollection
    // when we have only numbers, we can not go for many to many, what to do is, in database we use something called Elementcollection
    private List<Integer> questionIds;
}
