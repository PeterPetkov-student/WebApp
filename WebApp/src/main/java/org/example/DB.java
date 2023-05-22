package org.example;

import org.example.models.Comment;
import org.example.models.Forum;
import org.example.models.Topic;
import org.example.models.User;

import java.util.ArrayList;
import java.util.List;

public class DB {
    public static List<User> users;
    public static List<Topic> topics;
    public static List<Comment> comments;
    public static List<Forum> forums;

    static {
        users = new ArrayList<>();
        User user = new User();
        user.username="john123";
        user.password="password123";
        user.isAdmin=false;
        users.add(user);

        topics = new ArrayList<>();
        Topic topic = new Topic();
        topic.title="First Topic";
        topics.add(topic);

        comments = new ArrayList<>();
        Comment comment = new Comment();
        comment.content="First Comment";
        comments.add(comment);

        forums = new ArrayList<>();
        Forum forum = new Forum();
        forum.users=users;
        forum.topics=topics;
        forums.add(forum);
    }
}