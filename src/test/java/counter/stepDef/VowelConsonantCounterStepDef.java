package counter.stepDef;

import com.exercise.VowelAndConsonantCounter;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class VowelConsonantCounterStepDef {
    private static String[] argument;

    @Given("user calls the counter with String as {string}")
    public void user_calls_the_counter_with_string_as(String argInput) {

         //Passing the input argument
         VowelAndConsonantCounter.main(argInput.split(","));

         //Declaring the input argument as a class variable
         argument =argInput.split(",");
    }

    @Then("count logic should return number of vowels as {string} consonant as {string}")
    public void count_logic_should_return_number_of_vowels_as_consonant_as(String vowelInput, String consInput) {

        for (int i = 0; i < argument.length; i++) {

            //declaring actual count result from VowelAndConsonantCounter class
            int actualVowel = VowelAndConsonantCounter.vowelCount.get(argument[i]);
            int actualCons = VowelAndConsonantCounter.consonentCount.get(argument[i]);

            //declaring expected count from input
            int expectedVowel = Integer.parseInt(vowelInput.split(",")[i]);
            int expectedConsonant = Integer.parseInt(consInput.split(",")[i]);

            //Verifying the results
            Assert.assertEquals(expectedVowel,actualVowel);
            Assert.assertEquals(expectedConsonant,actualCons);
        }
    }

    @Then("count logic should return {string} message")
    public void countLogicShouldReturnMessage(String resultMessage) {


    }
}
