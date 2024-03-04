package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PawnTest {

    Pawn pawn;
    Pair<Integer, Integer> position;

    @BeforeEach
    public void beforEach(){
        position = new Pair<>(2,2);
        pawn = new PawnImpl(position);
    }

    @Test
    public void hitPositionTest(){
        assertTrue(pawn.hit(position.getX(), position.getY()));
        assertFalse(pawn.hit(5, 5));
    }
}
