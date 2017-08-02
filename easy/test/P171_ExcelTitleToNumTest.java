import org.junit.Test;
import static org.junit.Assert.*;

public class P171_ExcelTitleToNumTest {

  @Test
  public void testPositive() {
    P171_ExcelTitleToNum inst = new P171_ExcelTitleToNum();
    assertEquals(1, inst.titleToNumber("A"));
    assertEquals(26, inst.titleToNumber("Z"));
    assertEquals(52, inst.titleToNumber("AZ"));
    assertEquals(53, inst.titleToNumber("BA"));
    assertEquals(18278, inst.titleToNumber("ZZZ"));
  }
}
