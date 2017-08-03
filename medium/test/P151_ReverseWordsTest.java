import org.junit.Test;
import static org.junit.Assert.*;

public class P151_ReverseWordsTest {

  @Test
  public void testPositive() {
    P151_ReverseWords inst = new P151_ReverseWords();
    assertEquals("fox brown quick the", inst.reverseWords("the quick brown fox"));
  }
}
