package org.jpatest.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "person")
public class Person {

    @Id
    private String email;
    @Column
    private String name;
    @Column
    private String phone;

}
