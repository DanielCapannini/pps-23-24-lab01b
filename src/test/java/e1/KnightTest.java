package e1;

import org.junit.jupiter.api.BeforeEach;

public class KnightTest {

    Knight knight;


    @BeforeEach
    public void beforeEach(){
        knight = new KnightImpl();
    }
}
