package my.examples.blog.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="comment")
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=20)
    private String name;
    @Column(length=255)
    private String passwd;
    @Lob
    private String content;
    @Column(name="reg_date")
    private Date regDate;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;

    public Comment(){
        regDate = new Date();
    }
}
