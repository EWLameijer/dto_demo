package org.ericwubbo.dtodemo;

public record PostDto(long id, String author, String text) {

    public static PostDto from(Post post) {
        return new PostDto(post.getId(), post.getAuthor().getName(), post.getText());
    }
}
