import org.junit.Test;
import static org.junit.Assert.*;

public class P168_ExcelNumToTitleTest {
  @Test
  public void testPositive() {
    P168_ExcelNumToTitle inst = new P168_ExcelNumToTitle();
    assertEquals("A", inst.convertToTitle(1));
    assertEquals("Z", inst.convertToTitle(26));
    assertEquals("AZ", inst.convertToTitle(52));
    assertEquals("BA", inst.convertToTitle(53));
    assertEquals("ZZZ", inst.convertToTitle(18278));
    assertEquals("FXSHRXW", inst.convertToTitle(Integer.MAX_VALUE));
  }
}
