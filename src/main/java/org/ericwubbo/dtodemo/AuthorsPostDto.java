package org.ericwubbo.dtodemo;

public record AuthorsPostDto(Long id, String text) {
    public static AuthorsPostDto from(Post post) {
        return new AuthorsPostDto(post.getId(), post.getText());
    }
}
