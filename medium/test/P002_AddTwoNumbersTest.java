import org.junit.Test;
import static org.junit.Assert.*;

public class P002_AddTwoNumbersTest {

  @Test
  public void testMethod() {
    ListNode l1 = new ListNode(2); l1.next = new ListNode(3); l1.next.next = new ListNode(4);
    ListNode l2 = new ListNode(3); l2.next = new ListNode(8); l2.next.next = new ListNode(1);

    ListNode expected = new ListNode(5); expected.next = new ListNode(1); expected.next.next = new ListNode(6);
    ListNode result = new P002_AddTwoNumbers().addTwoNumbers(l1, l2);

    while(result != null) {
      assertEquals(expected.val, result.val);
      result = result.next;
      expected = expected.next;
    }
  }
}
