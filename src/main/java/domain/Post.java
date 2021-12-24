package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int authorId;
    private int replyOwnerId;
    private int replyPostId;
    private int date;
    private int canDelete;
    private int canEdit;
    private boolean addFavourite;
    private String text;
    private Content content;
    private LikesInfo like;
    private CommentsInfo commentsInfo;
    private Share share;
    private ViewsInfo viewsInfo;

    //    + getters/setters
}