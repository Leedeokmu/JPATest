package org.jpatest.demo.model;

import lombok.Data;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Integer author;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private DateTime regDate;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private List<Reply> replyList = new ArrayList<>();

    @OneToOne
    @JoinColumn(name="author", referencedColumnName = "id", insertable = false, updatable = false)
    private Author authorDetail;

}
