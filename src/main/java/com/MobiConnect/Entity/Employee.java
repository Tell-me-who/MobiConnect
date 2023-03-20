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
@Table(name = "Employee_Tbl", uniqueConstraints = {
        @UniqueConstraint(name ="student_email_unique", columnNames = "email")
}
)
public class Employee {
    @Id
//    @SequenceGenerator(
//            name="student_sequence",
//            sequenceName = "student_sequence",
//            allocationSize = 1
//    )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid", updatable = false)
    private long eid;

    @Column(name="ename" , nullable = false , columnDefinition = "TEXT")
    private String name;

    @Column(name = "email" , nullable = false, columnDefinition = "TEXT")
    private String email;

    @Column(name = "contact" ,nullable = false, columnDefinition = "TEXT")
    private String contact;

    @Column(name = "gender" ,nullable = false)
    private String gender;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "designation" ,nullable = false)
    private String designation;

    @Column(name = "address" ,nullable = false)
    private String address;

    @Column(name = "Work_Location")
    private String Work_Location;

    @Column(name = "date_of_join")
    private LocalDate join_date;

    @Column(name = "date_of_exit")
    private LocalDate exit_date;

    @Column(name = "manager")
    private String manager;

    @Column(name = "total_leaves")
    private Integer total_leaves;

    @Column(name = "leave_balance")
    private Integer leave_balance;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "EmployeeProject_Table",
            joinColumns = {
                    @JoinColumn(name = "employee_id",referencedColumnName = "eid")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "project_id",referencedColumnName = "pid")
            })
    private Set<Project> projects;




}
