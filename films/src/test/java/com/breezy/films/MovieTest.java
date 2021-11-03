package com.breezy.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest extends Movie {

    Movie starWars4 = new Movie();
    @Test
    void ShouldShowSimpleAssertion() {
        Assertions.assertEquals(2005,starWars4.getReleaseYr());
    }
}
