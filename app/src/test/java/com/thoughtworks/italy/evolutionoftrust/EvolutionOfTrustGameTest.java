package com.thoughtworks.italy.evolutionoftrust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvolutionOfTrustGameTest {
    @Test
    void canRunThisTest() {
        assertEquals("Let's build some trust!!!", new EvolutionOfTrustGame().greetings());
    }
}