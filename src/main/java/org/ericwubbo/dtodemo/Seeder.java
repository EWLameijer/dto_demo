package org.ericwubbo.dtodemo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Seeder implements CommandLineRunner {
    private final AuthorRepository authorRepository;

    private final PostRepository postRepository;

    @Override
    public void run(String... args) {
        if (authorRepository.count() == 0) {
            Author theWub = new Author("TheWub");
            Author nn = new Author("nn");
            Author unicorn = new Author("unicorn");
            authorRepository.saveAll(List.of(theWub, nn, unicorn));

            Post bestBook = new Post(theWub, "Best programming book ever: Code Complete 2 by Steve McConnell!");
            Post springCoursesFree = new Post(theWub, "Spring courses are free starting from April 2024! https://spring.academy/courses");
            Post error = new Post(nn, "My Spring app doesn't work. Why?");
            postRepository.saveAll(List.of(bestBook, springCoursesFree, error));
        }
    }
}
