// No package line here
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class reversestringtest {
    @Test
    public void testReverse() {
        // We don't need to import 'reversestring' because it's in the same project
        reversestring rs = new reversestring();
        assertEquals("dcba", rs.reverse("abcd"));
    }
}
