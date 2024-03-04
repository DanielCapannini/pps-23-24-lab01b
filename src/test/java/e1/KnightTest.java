package e1;

import org.junit.jupiter.api.BeforeEach;

public class KnightTest {

    Knight knight;
    Pair<Integer, Integer> position;

    @BeforeEach
    public void beforeEach(){
        position = new Pair<>(2,2);
        knight = new KnightImpl(position);
    }
}
