import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
public class LinkedListTest  {
    /*
    @Test
    public void testAppend(){
        LinkedList a = new LinkedList();
        a.append(1);
        a.append(1);
        a.append(1);
        a.append(1);
        a.append(1);
        assertEquals("1 1 1 1 1 ", a.toString());
    }
    */

    @Test
    public void testAppend(){
        LinkedList a = new LinkedList();
        assertEquals(null, a.first());
    }
}