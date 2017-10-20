package java2days.examples.jpa;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import java2days.examples.jpa.model.Article;
import java2days.examples.jpa.model.Author;

import static java.util.Arrays.asList;

public class StackOverflowErrorExample {

    public static void main(String[] args) {
        // Uncomment this after adding Lombok annotations to entity beans


//        Author author = Author.builder().id(1).name("Doychin Bondzhev").build();
//        System.out.println("author.articles value is " + author.getArticles());
//
//        Article my_first_article = Article.builder()
//                                          .articleId(1)
//                                          .title("My first article")
//                                          .author(author)
//                                          .published(LocalDateTime.of(2014, Month.APRIL, 1, 10, 20))
//                                          .build();
//        Article my_second_article = Article.builder()
//                                           .articleId(2)
//                                           .title("My second article")
//                                           .author(author)
//                                           .published(LocalDateTime.of(2015, 10, 15, 21, 20))
//                                           .build();
//
//        author.setArticles(asList(my_first_article, my_second_article));
//
//        System.out.println(author);

    }
}
