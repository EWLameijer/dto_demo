package org.ericwubbo.dtodemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Author author;

    private String text;

    public Post(Author author, String text) {
        this.author = author;
        this.text = text;
    }
}
