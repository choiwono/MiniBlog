package my.examples.blog.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="post")
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=255)
    private String title;
    @Lob
    private String content;
    @Column(name="reg_date")
    private Date regDate;

    @OneToMany(mappedBy = "post")
    private List<ImageFile> imageFileList;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Post(){
        regDate = new Date();
        commentList = new ArrayList<>();
        imageFileList = new ArrayList<>();
    }
}
