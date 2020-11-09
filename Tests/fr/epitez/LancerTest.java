package fr.epitez;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LancerTest {

    @Test
    void Test_Constructeur() {
        Lancer UnLancer = new Lancer(123);
        assert(UnLancer.getQuilles() == 123);
    }
}