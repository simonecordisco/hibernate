package com.hibernate.demohibernate2;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/*la tabella students dove ogni studente avrà:
        primary key
        colonna lastName (not null)
        colonna firstName (not null)
        colonna email con valori univoci e not null*/

@Entity @Table(name ="student") @Data @NoArgsConstructor @AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String firsName;
    @Column(unique = true, name ="email")
    private String email;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}
