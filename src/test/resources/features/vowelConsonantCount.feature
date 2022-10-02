Feature: Counting the vowel and consonant

  Scenario Outline: Verify that count logic process single String argument
    Given user calls the counter with String as "<word>"
    Then count logic should return number of vowels as "<vowelCount>" consonant as "<consCount>"

    Examples:
    |word         |vowelCount|consCount|
    | hello       | 2        | 3        |
    | TEST        | 1        | 3        |
    | helloTest   | 3        | 6        |
    | he@£llo     | 2        | 3        |
    | hel2345lo   | 2        | 3        |
    | @$$£!%!%    | 0        | 0        |
    | 444444444   | 0        | 0        |
    |             |0         |0         |

  Scenario Outline: Verify that count logic process 4 String arguments
    Given user calls the counter with String as "<word>"
    Then count logic should return number of vowels as "<vowelCount>" consonant as "<consCount>"
    Examples:
    |word                          |vowelCount|consCount|
    |pumpkin,natural,cloud         |2,3,2,    |5,4,3     |
    |pump44,n@tural,CLoud          |1,2,2     |3,4,3     |
    |toast,test,pesto,fruit        |2,1,2,2   |3,3,3,3   |

  Scenario Outline: Verify that count logic provides error message when input is more than 4 String arguments
    Given user calls the counter with String as "<word>"
    Then count logic should return "<message>" message
    Examples:
    |word| message|
    |toast,test,pesto,fruit,hello|Extra argument passed.|




