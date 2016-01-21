package by.ntishkevich.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ntishkevich
 * @version 21.01.2016
 */
@Entity
@Table(name = "message_proxy")
public class Message implements Serializable{

    @Id
    @SequenceGenerator(name = "message_id_seq", sequenceName = "message_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "message_id_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "content")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
