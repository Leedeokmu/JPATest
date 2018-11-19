package org.jpatest.demo.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
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
//    @Column(name="reg_date", updatable = false, insertable = false, columnDefinition = "reg_date DEFAULT CURRENT_TIMESTAMP")
    @Column(name="reg_date")
    @CreationTimestamp
    private LocalDateTime regDate;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private List<Reply> replyList = new ArrayList<>();

    @OneToOne
    @JoinColumn(name="author", referencedColumnName = "id", insertable = false, updatable = false)
    private Author authorDetail;

}
