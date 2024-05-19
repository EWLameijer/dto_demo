package org.ericwubbo.dtodemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostRepository postRepository;

    @GetMapping
    public Stream<PostDto> getAll() {
        return postRepository.findAll().stream().map(PostDto::from);
    }
}
