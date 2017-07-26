import org.junit.Test;
import static org.junit.Assert.*;

public class P001_TwoSumTest {

  @Test
  public void testTwoSum() {
    int[] input = {2, 7, 11, 15};
    int target = 13;
    int[] expected = {0, 2};
    assertArrayEquals(expected, new P001_TwoSum().twoSum(input, target));
  }

  @Test (expected = IllegalArgumentException.class)
  public void testNoTwoSum() {
    int[] input = {2, 7, 11, 15};
    int target = 15;
    new P001_TwoSum().twoSum(input, target);
  }
}
