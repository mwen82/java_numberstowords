import org.junit.*;
import static org.junit.Assert.*;

public class NumbersWordsTest {

  @Test
  public void calculateNumber_forNumberOneThroughNine_1() {
    NumbersWords numbersWords = new NumbersWords();
    String expected = "one";
    assertEquals(expected, numbersWords.calculateNumber("1"));
  }
  @Test
  public void calculateNumber_forNumberTenThroughNineteen_11() {
    NumbersWords numbersWords = new NumbersWords();
    String expected = "eleven";
    assertEquals(expected, numbersWords.calculateNumber("11"));
  }
  @Test
  public void calculateNumber_forNumberTwentyThroughNinetyNine_21() {
    NumbersWords numbersWords = new NumbersWords();
    String expected = "twenty one";
    assertEquals(expected, numbersWords.calculateNumber("21"));
  }
  @Test
  public void calculateNumber_forNumberTwentyThroughNinetyNine_99() {
    NumbersWords numbersWords = new NumbersWords();
    String expected = "ninety nine";
    assertEquals(expected, numbersWords.calculateNumber("99"));
  }
  @Test
  public void calculateNumber_forNinetyNineThroughOneThousand_900() {
    NumbersWords numbersWords = new NumbersWords();
    String expected = "nine hundred ninety nine";
    assertEquals(expected, numbersWords.calculateNumber("999"));
  }
}
