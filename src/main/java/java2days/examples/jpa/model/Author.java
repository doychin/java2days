package java2days.examples.jpa.model;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import lombok.*;
import lombok.experimental.Wither;

@Data
@Table(name = "AUTHOR")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    private int id;

    @Column
    private String name;

    @OneToMany(mappedBy = "author")
    @Singular List<Article> articles = new ArrayList<>();
}
