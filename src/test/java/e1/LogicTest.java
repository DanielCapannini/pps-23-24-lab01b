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
  public void hasKnightTest() {
    assertTrue(logics.hasKnight(knight.getX(), knight.getY()));
    assertFalse(logics.hasKnight(pawn.getX(), pawn.getY()));
  }

  @Test
  public void hasPawnTest(){
    assertFalse(logics.hasPawn(knight.getX(), knight.getY()));
    assertTrue(logics.hasPawn(pawn.getX(), pawn.getY()));
  }

  @Test
  public void hitFalseTest(){
    assertFalse(logics.hit(pawn.getX(), pawn.getY()));
    assertFalse(logics.hit(3, 6));
  }
}
