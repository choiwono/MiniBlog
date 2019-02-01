package my.examples.blog.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="roles")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=20)
    private String name;
    private int level;
    @Column(name="reg_date")
    private Date regDate;

    public Role() {
        regDate = new Date();
    }
}
