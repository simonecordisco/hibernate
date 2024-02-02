package com.hibernate.demohibernate2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*la tabella classes dove ogni classe ha:
primary key
title (not null)
description (not null)*/
@Entity
@Table(name="classes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @OneToMany(mappedBy = "classes")
    private List<Enrollment> enrollments;
}
