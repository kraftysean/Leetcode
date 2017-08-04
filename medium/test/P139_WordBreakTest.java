import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class P139_WordBreakTest {

  @Test
  public void testPositive() {
    P139_WordBreak wb = new P139_WordBreak();
    assertTrue(wb.wordBreak("leetcode", Arrays.asList("leet", "code")));
    assertTrue(wb.wordBreak("cars", Arrays.asList("car", "ca", "rs")));
  }

  @Test
  public void testNegative() {
    P139_WordBreak wb = new P139_WordBreak();
    assertFalse(wb.wordBreak("leet code", Arrays.asList("leet", "code")));
    assertFalse(wb.wordBreak("carjacking", Arrays.asList("car", "cars", "jack", "king")));
  }
}
