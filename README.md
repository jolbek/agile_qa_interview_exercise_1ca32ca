### How to run the Test cases 
 1. In order run the test cases please go to 
    - **src/test/java/counter/runners/CukesRunner.java** 
    - **src/test/resources/features/vowelConsonantCount.feature** 
 
### User story review/assumption
1. Need more clarification on the input
   - Can user pass input String as Lowercase Uppercase? 
   - Can user pass input String with special characters?
   - Can user pass input String in camelCase
   - Can input String be in other language/alphabet
2. Need more clarification on input limit 
   - Should logic only process 4 string? What we are expecting when we pass more than 4 Strings?
   - Should Logic process the input as batch of and ignore the 5th 6th entry?
3. Need more clarification on the result/output of the counter logic
   - Will there should be input limit message to inform the user about the limit? 
   - Will there should be output message that inform the user about limit when user enter more than 4 string? 
   
### Code review
1. Code should generate validation message for following 
   -  when user passes empty String /no argument
   -  when the 4 string limit reached logic can provide ignored Strings 
2. Code need to handle capital letters and camelCase entries whether convert the input in all upper or lowercase

### Code improvement 
1. code can now handle the special characters

### Bug/Defect 
1. logic is ignoring the Capital letter in all capital like TEST or in the camelCase like hellTest
2. logic is not accepting the 4 String as it mentioned.

### Reporting 
1. Report can be found in target/cucumber-report
2. Overall 16 test cases has executed
   - **_Passed test cases_ : 10**
   - **_Failed test cases_ : 6**
      1. single argument with all capital "TEST"
      2. single argument with camelCase "helloTest"
      3. empty/no value argument ""
      4. multiple argument with capital "CLoud"
      5. passing the 4 argument "toast,test,pesto,fruit" 
      6. passing the 4 argument capital "TEST"

      


   