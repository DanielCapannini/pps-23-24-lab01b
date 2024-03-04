package e1;

import org.junit.jupiter.api.BeforeEach;

public class PawnTest {

    Pawn pawn;
    Pair<Integer, Integer> position;

    @BeforeEach
    public void beforEach(){
        position = new Pair<>(2,2);
        pawn = new PawnImpl(position);
    }
}
