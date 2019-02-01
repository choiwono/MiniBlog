package my.examples.blog.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="image_file")
@Getter
@Setter
public class ImageFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="file_name",length=255)
    private String fileName;
    @Column(name="image_path",length=255)
    private String imagePath;
    @Column(name="mime_type",length=255)
    private String mimeType;
    @Column(name="reg_date")
    private Date regDate;
    private long length;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;

    public ImageFile(){
        regDate = new Date();
    }
}
