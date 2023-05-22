package org.example.controllers;

import org.example.DB;
import org.example.models.Topic;
import org.example.models.User;

public class CheckTopicController {
    public static void deleteTopic(User user, Topic topic) {
        if (user.isAdmin) {
            DB.topics.remove(topic);
            System.out.println("Topic deleted successfully.");
        } else {
            System.out.println("You don't have the necessary permissions to delete topics.");
        }
    }
}