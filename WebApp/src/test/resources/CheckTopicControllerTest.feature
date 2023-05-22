Feature: Deleting a comment

  Scenario: Successfully delete a comment
    Given a logged-in user with administrative rights
    And a topic with comments
    When the user deletes a comment
    Then the comment is successfully deleted

  Scenario: Deleting a comment without administrative rights
    Given a logged-in user without administrative rights
    And a topic with comments
    When the user tries to delete a comment
    Then the user receives an error message

  Scenario: Deleting a comment from another user
    Given a logged-in user with administrative rights
    And a topic with comments from different users
    When the user tries to delete a comment from another user
    Then the user receives an error message