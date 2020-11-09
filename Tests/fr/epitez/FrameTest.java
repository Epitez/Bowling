package fr.epitez;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FrameTest {
    @Test
    void un_lancer() {
        Frame frameTested = new Frame();
        frameTested.Lancer(8);
        assert frameTested.getLancer(0).getQuilles() == 8;
    }

    @Test
    void deux_lancers() {
        Frame frameTested = new Frame();
        frameTested.Lancer(3);
        frameTested.Lancer(5);
        assert frameTested.getLancer(1).getQuilles() == 5;
    }

    @Test
    void trois_lancers() {
        Frame frameTested = new Frame();
        frameTested.Lancer(3);
        frameTested.Lancer(5);
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> { frameTested.Lancer( 1 ); } );
    }

}