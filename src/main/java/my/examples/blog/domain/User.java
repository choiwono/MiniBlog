package my.examples.blog.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="user")
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20)
    private String name;
    @Column(name="nick_name",length = 20)
    private String nickName;
    @Column(length = 255)
    private String email;
    @Column(length = 255)
    private String passwd;
    @Column(name = "reg_date")
    private Date regDate;

    @ManyToMany
    @JoinTable(name="user_roles",
            joinColumns = {@JoinColumn(name="user_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name="role_id",referencedColumnName = "id")}
    )

    private Set<Role> roles;

    @OneToOne(mappedBy = "user")
    private Blog blog;

    public User(){
        regDate = new Date();
        roles = new HashSet<>();
    }
}
