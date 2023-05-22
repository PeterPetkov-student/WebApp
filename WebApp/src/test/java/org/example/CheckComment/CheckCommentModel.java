package org.example.CheckComment;

import org.example.controllers.CheckCommentController;
import org.example.models.Comment;
import org.example.models.User;

import java.util.ArrayList;
import java.util.List;

public class CheckCommentModel {
    private User user;
    private Comment comment;
    private List<Comment> userComments;

    public CheckCommentModel() {
        userComments = new ArrayList<>();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void deleteComment() {
        if (user.isAdmin) {
            CheckCommentController.deleteComment(user, comment);
        } else {
            System.out.println("You don't have the necessary permissions to delete comments.");
        }
    }

    public void getUserComments() {
        userComments = CheckCommentController.getUserComments(user);
    }

    public void publishComment() {
        if (comment.getContent().isEmpty()) {
            System.out.println("Cannot publish a comment without content.");
            return;
        }

        CheckCommentController.publishComment(user, comment);
    }

    public List<Comment> getUserCommentsList() {
        return userComments;
    }
}