import static org.junit.Assert.*;
import org.junit.*;


public class SquareTest {
    
    @Test
    public void testSquare() {
        assertEquals(4, Square.square(1));
    }
}
