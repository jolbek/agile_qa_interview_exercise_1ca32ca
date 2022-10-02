# Interview Exercise for Agile QA role

Please note while taking this test, do not mention 90 Percent of Everything or 90poe anywhere on the code or repository name.

Clone this repo in your private git space. Once done, please add github username: shilpa-sethi as a collaborator/ reviewer.
While submitting please ensure to add a README explaining how to run the test and all related info.

## Testing Task
Product Owner wants a feature as described below. The developer has added the code and share with you as a QA for review/ testing.

### Feature

As a user I want to be able to add a list of strings. 
I want to see the number of vowels in each of the strings that I have entered.

### Acceptance Criteria

1. I should see the number of vowels and consonant for each string in the order they are keyed in.
2. I should be able to add up to 4 strings at once.

### QA Task

1. Review the user story and prepare a list of questions/ assumptions.
   1. As I clerified with the PO, it accepts the first 4 arguments and ignores the rest. Alternatively it would accept arguments batches of fours and ignores nothing.
   2. The text can contains lowercase, uppercase and special characters.
2. Review the code and provide feedback/ improvements.
   1. it should generate a validation message if the client specifies no argument.
   2. it should generate a validation message for ignored arguments.
   3. it doesn't handle capitals. it could be sorted by lowering the arguments.
3. Extend the program to return the number of consonants for each string array passed.
   1. done
4. Use BDD/ Cucumber to add test cases to test the program for both vowels and consonants.
   1. Scenario aoutline: verify sinle argument
      1. all capitals
      2. all lowercases
      3. camelcase
      4. incude special charsw
      5. include numbers
      6. all special chars and numbers
   2. Scenarip: Provide no arg and verify validation message
   3. Scenario Provide 4 arguments
   4. Scenario Provide 5 arguments and verify the last one is ognored
5. Report any bugs you find. Include as much information as necessary and add the feedback as a file to the repo along with the Cucumber Test Report.
   bug:  Capital,
   improvement: no argument icin data validation
   improvement: data validation messge for ignored arguments
Bonus points if you can add failing test cases for the bugs you find. 

## Evaluation Points

1. Use of Git.
2. Use of BDD/TDD/Cucumber.
3. Code Review skills.
4. Coding skills.
5. Test Case Coverage.

## Time limits

There are no hard time limits. We suggest not to spend more than ~2 hours.
