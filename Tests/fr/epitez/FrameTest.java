package fr.epitez;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FrameTest {
    private Frame frameTested;

    @BeforeEach
    void setUp() {
        this.frameTested = new Frame();
    }

    @Test
    void un_lancer() {
        this.frameTested.Lancer(8);
        assert this.frameTested.getLancer(0).getQuilles() == 8;
    }

    @Test
    void deux_lancers() {
        this.frameTested.Lancer(3);
        this.frameTested.Lancer(5);
        assert this.frameTested.getLancer(1).getQuilles() == 5;
    }

    @Test
    void trois_lancers() {
        this.frameTested.Lancer(3);
        this.frameTested.Lancer(5);
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> { this.frameTested.Lancer( 1 ); } );
    }
}