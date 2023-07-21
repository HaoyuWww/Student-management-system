package com.example.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Entity
@Data
public class Student implements Serializable {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String gender;
    @Column
    private String dob;
}

