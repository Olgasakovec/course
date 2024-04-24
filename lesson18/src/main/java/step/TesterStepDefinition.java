package step;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class TesterStepDefinition {
    @Then("Verify that length of {string} should be greater than the length of {string}")
    public void compareStringLengths(String str1, String str2) {
        Assertions.assertTrue(str1.length() > str2.length(), "Length of " + str1 + " should be greater than length of " + str2);
    }
}
