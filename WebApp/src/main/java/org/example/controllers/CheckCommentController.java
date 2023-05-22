package org.example.controllers;

import org.example.DB;
import org.example.models.Comment;
import org.example.models.User;

import java.util.ArrayList;
import java.util.List;

public class CheckCommentController {
    public static void deleteComment(User user, Comment comment) {
        if (user.isAdmin) {
            DB.comments.remove(comment);
            System.out.println("Comment deleted successfully.");
        } else {
            System.out.println("You don't have the necessary permissions to delete comments.");
        }
    }

    public static List<Comment> getUserComments(User user) {
        List<Comment> userComments = new ArrayList<>();

        for (Comment comment : DB.comments) {
            if (comment.author.equals(user)) {
                userComments.add(comment);
            }
        }

        return userComments;
    }

    public static void publishComment(User user, Comment comment) {
        if (comment.content.isEmpty()) {
            System.out.println("Cannot publish a comment without content.");
            return;
        }

        comment.author = user;
        DB.comments.add(comment);
        System.out.println("Comment published successfully.");
    }
}