Feature: meme feature

  Scenario: A user gets the memes
    Given the following memes
    | meme          | dankness |
    | olong johnson | 1        |
    | classic angus | 3        |
    When the user request all the memes
