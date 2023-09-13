package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    String balanced = "[LaunchCode]";
    String unbalanced = "[LaunchCode";

    String none = "LaunchCode";

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void stringWithBracketsReturnsTrue (){
        assertTrue(BalancedBrackets.hasBalancedBrackets(balanced));

    }
    @Test
    public void stringWithNoBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets(none));
    }
    @Test
    public void stringWithOneBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets(unbalanced));
    }
    @Test
    public void stringWithIncorrectlyFacingEndBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
    @Test
    public void stringWithIncorrectlyFacingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void stringWithUnMatchedClosingBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Co]de"));
    }
    @Test
    public void stringWithUnMatchedOpeningBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Co[de"));
    }

}