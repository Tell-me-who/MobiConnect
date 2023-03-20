package com.MobiConnect.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project_tbl")

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid" , updatable = false)
    private long pid;

    @Column(name="project_name" ,
            nullable = false ,
            columnDefinition = "TEXT")
    private String project_name;

    @Column(name = "owner_client")
    private String owner_client;

    @Column(name = "owner_consultant")
    private String owner_consultant;

    @Column(name = "start_date")
    private LocalDate start_date;

    @Column(name = "end_date")
    private LocalDate end_date;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "client_id_fk")
    private Client client;


    @ManyToMany(mappedBy = "projects",fetch = FetchType.LAZY)
    private Set<Employee> employees;

// Enum for status
//    public static enum Status {
//        Requirement_Analysis,Designing,Devlopment,Testing,Under_Review,Complete;
//    }
}
