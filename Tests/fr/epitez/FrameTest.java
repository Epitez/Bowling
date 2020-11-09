package fr.epitez;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FrameTest {
    @Test
    void lancer() {
        Frame frameTested = new Frame();
        frameTested.Lancer(12);
        assert frameTested.getLancer(0).getQuilles() == 12;
    }
}