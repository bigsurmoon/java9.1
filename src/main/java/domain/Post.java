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
    private int canPin;
    private int isPinned;
    private int friendsOnly;
    private int signerId;
    private int markedAsAds;
    private int postponedId;
    private boolean addFavourite;
    private String text;
    private String postType;
    private PostSource postSource;
    private Content content;
    private LikesInfo like;
    private CommentsInfo commentsInfo;
    private Share share;
    private ViewsInfo viewsInfo;
    private Copyright copyright;
    private Geo geo;
    private Donut donut;

    //    + getters/setters
}