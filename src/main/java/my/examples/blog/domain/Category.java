package my.examples.blog.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="category")
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=20)
    private String name;
    private int ordering;
    @Column(name="reg_date")
    private Date regDate;

    @ManyToOne
    @JoinColumn(name="blog_id")
    private Blog blog;

    @OneToMany(mappedBy = "category")
    private List<Post> postList;

    public Category(){
        regDate = new Date();
        postList = new ArrayList<>();
    }
}
