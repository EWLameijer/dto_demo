package org.ericwubbo.dtodemo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/authors")
public class AuthorController {
    private final AuthorRepository authorRepository;

    @GetMapping("{name}")
    ResponseEntity<AuthorDto> getByName(@PathVariable String name) {
        return authorRepository.findByName(name).map(AuthorDto::from).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
