Feature: Creating a topic

  Scenario Outline: Successfully create a topic
    Given a logged-in user with administrative rights
    When the user creates a new topic with title "<title>"
    Then the topic is successfully created

    Examples:
      | title         |
      | New Topic 1   |
      | New Topic 2   |
      | Another Topic |

  Scenario Outline: Creating a topic without administrative rights
    Given a logged-in user without administrative rights
    When the user creates a new topic with title "<title>"
    Then the user receives an error message

    Examples:
      | title         |
      | New Topic     |
      | Another Topic |

  Scenario: Creating a topic with an empty title
    Given a logged-in user with administrative rights
    When the user creates a new topic with an empty title
    Then the user receives an error message