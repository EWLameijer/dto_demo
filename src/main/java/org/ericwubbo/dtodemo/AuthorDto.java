package org.ericwubbo.dtodemo;

import java.util.List;

public record AuthorDto(String name, List<AuthorsPostDto> posts) {
    public static AuthorDto from(Author author) {
        return new AuthorDto(author.getName(), author.getPosts().stream().map(AuthorsPostDto::from).toList());
    }
}
