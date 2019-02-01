package my.examples.blog.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="blog")
@Getter
@Setter
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=20)
    private String name;
    @Column(length=20)
    private String url;
    @Column(name="reg_date")
    private Date regDate;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "blog")
    private List<Category> categoryList;

    public Blog(){
        regDate = new Date();
        categoryList = new ArrayList<>();
    }
}
