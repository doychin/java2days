package java2days.examples.jpa.model;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import lombok.*;
import lombok.experimental.Wither;

@Table(name = "AUTHOR")
@Entity
public class Author {

    @Id
    private int id;

    @Column
    private String name;

    @OneToMany(mappedBy = "author")
    List<Article> articles = new ArrayList<>();
}
