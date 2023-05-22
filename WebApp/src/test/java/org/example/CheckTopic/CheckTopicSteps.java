package org.example.CheckTopic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.controllers.CheckTopicController;
import org.example.models.Topic;
import org.example.models.User;

import java.util.ArrayList;
import java.util.List;

public class CheckTopicSteps {
    private CheckTopicModel model = new CheckTopicModel();

    @Given("a user with username {string} and {string} password")
    public void givenUserDetails(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        model.setUser(user);
    }

    @Given("a topic with title {string}")
    public void givenTopicTitle(String title) {
        Topic topic = new Topic();
        topic.setTitle(title);
        model.setTopic(topic);
    }

    @When("the user tries to delete the topic")
    public void whenUserTriesToDeleteTopic() {
        model.deleteTopic();
    }

    @Then("the topic should be deleted successfully")
    public void thenTopicShouldBeDeleted() {
        // assertion for topic deletion
    }
}
