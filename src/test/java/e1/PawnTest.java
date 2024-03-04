package e1;

import org.junit.jupiter.api.BeforeEach;

public class PawnTest {

    Pawn pawn;

    @BeforeEach
    public void beforEach(){
        pawn = new PawnImpl();
    }
}
