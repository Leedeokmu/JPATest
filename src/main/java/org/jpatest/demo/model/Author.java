package org.jpatest.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @OneToOne
    @JoinColumn(name = "email", referencedColumnName = "email")
    private Person person;

}
