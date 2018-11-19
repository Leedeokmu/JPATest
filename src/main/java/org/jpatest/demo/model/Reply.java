package org.jpatest.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private Integer postId;
    @Column(name="reg_date")
    private LocalDateTime regDate;

    @OneToOne
    @JoinColumn(name="author", referencedColumnName = "id", insertable = false, updatable = false)
    private Author authorDetail;

//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "id", referencedColumnName = "postId")
//    private Post post = new Post();

}
