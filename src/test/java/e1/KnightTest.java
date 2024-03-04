package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightTest {

    Knight knight;
    Pair<Integer, Integer> position;

    @BeforeEach
    public void beforeEach(){
        position = new Pair<>(2,2);
        knight = new KnightImpl(position);
    }

    @Test
    public void hitTest(){
        assertTrue(knight.hit(position.getX(), position.getY()));
        assertFalse(knight.hit(4, 4));
    }
}
