package org.example.CheckTopic;

import org.example.controllers.CheckTopicController;
import org.example.models.Topic;
import org.example.models.User;

public class CheckTopicModel {
    private User user;
    private Topic topic;

    public void setUser(User user) {
        this.user = user;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void deleteTopic() {
        if (user.isAdmin) {
            CheckTopicController.deleteTopic(user, topic);
        } else {
            System.out.println("You don't have the necessary permissions to delete topics.");
        }
    }
}