package java2days.examples.jpa.model;

import javax.persistence.*;

import java.time.LocalDateTime;

import lombok.*;

@Entity
@Table(name = "ARTICLE")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
// @ToString(exclude = "author")
public class Article {
    @Id
    private int articleId;

    @Column
    private String title;

    @Column
    private LocalDateTime published;

    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID", referencedColumnName = "id")
    private Author author;
}
