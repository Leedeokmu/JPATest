package org.jpatest.demo.model;

import lombok.Data;
import org.joda.time.DateTime;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reply")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Integer author;
    @Column
    private String content;
    @Column
    private DateTime regDate;

}
