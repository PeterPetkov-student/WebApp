package org.example.CheckComment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.controllers.CheckCommentController;
import org.example.models.Comment;
import org.example.models.User;

import java.util.List;

public class CheckCommentSteps {
    private CheckCommentModel model = new CheckCommentModel();

    @Given("a user with username {string} and {string} password")
    public void givenUserDetails(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        model.setUser(user);
    }

    @When("the user tries to delete the comment")
    public void whenUserTriesToDeleteComment() {
        model.deleteComment();
    }

    @When("the user tries to publish the comment")
    public void whenUserTriesToPublishComment() {
        model.publishComment();
    }

    @Then("the comment should be deleted successfully")
    public void thenCommentShouldBeDeleted() {
        // assertion for comment deletion
    }

    @Then("the comment should be published successfully")
    public void thenCommentShouldBePublished() {
        // assertion for comment publication
    }

    @Then("the user should have {int} comments")
    public void thenUserShouldHaveComments(int expectedCommentCount) {
        model.getUserComments();
        List<Comment> userComments = model.getUserCommentsList();
        // assertion for user comments count
    }
}