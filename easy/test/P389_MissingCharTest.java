import org.junit.Test;
import static org.junit.Assert.*;

public class P389_MissingCharTest {

  @Test
  public void testPositiveMethod() {
    P389_MissingChar inst = new P389_MissingChar();
    assertEquals('e', inst.findTheDifference("abcd", "abecd"));
    assertEquals('a', inst.findTheDifference("a", "aa"));
  }
}
