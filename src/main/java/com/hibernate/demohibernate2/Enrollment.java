package com.hibernate.demohibernate2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*tabella enrollments per salvare collegamenti tra le tabelle students e classes:
primary key
2 foreign keys*/
@Entity
@Table(name="enrollements")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "classes_id", nullable = false)
    private Classes classes;
}

