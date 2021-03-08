
  Feature: Hotel Search Feature
    The feature illustrates that anyone who is a registered or a non registered booker
    must be able to perform search for the hotels

    Rule : Liam a leisure traveller should be able to search for hotel with destination

    Scenario Outline: search for hotel with destination

      Given Liam a registered leisure booker
      When he searches for hotel by destination "<Destination>"
      Then the listed hotels should have keyword from destination "<Destination>"
      Examples:
        | Destination   |
        | Reading       |
        | Isle of Wight |


      Rule : Nathan a non registered booker is searching for hotel using postcode search

      Scenario Outline: search for hotel with full postcode
        Given Nathan has opened the megabooker app
        When  he searches for hotel by entering postcode "<Postcode>"
        Then some of the listed hotels displayed should have keyword relevant to postcode "<Relevant Postcode>"
        Examples:
          | Postcode | Relevant Postcode |
          | Sl2 3ff  | Slough            |
          | Rg1 1AB  | Reading           |


        Rule : Bob a registered business booker is searching for hotel using partial postcode

        Scenario Outline: search for hotel with partial postcode
          Given Bob a registered business booker
          When he searches for hotel using partial postcode "<Partial Postcode>"
          Then some of the listed hotels displayed should have keyword relevant to postcode "<Relevant Postcode>"
          Examples:
            | Partial Postcode | Relevant Postcode  |
            | W12              | London Hammersmith |
            | M27              | Manchester         |



          Rule : Fiona a frequent registered business booker searches for hotel using the name of hotel

          Scenario Outline: Fiona searches for hotel using hotel name
            Given Fiona is a registered business booker
            When  she searches for hotel using "<Hotel Name>"
            Then the listed hotel displayed should have "<Hotel Name>"
            Examples:
              | Hotel Name       |
              | London Brentford |
              | Ravenscourt      |


