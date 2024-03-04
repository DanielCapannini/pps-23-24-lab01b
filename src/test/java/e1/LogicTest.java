package e1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class LogicTest {

  private Logics logics;
  private Pair<Integer, Integer> pawn;
  private Pair<Integer, Integer> knight;

  @BeforeEach
  public void beforEach(){
    pawn = new Pair<>(2, 4);
    knight = new Pair<>(5, 7);
    logics = new LogicsImpl(10, pawn, knight);
  }

  @Test
  public void test() {
    assert(true);
    // TODO: Add your test logic here
    // You can generate random inputs and assert the expected output
    // For example:
    // int result = Logic.someMethod(5, 10);
    // assertEquals(expectedResult, result);
  }
}
