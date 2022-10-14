import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
public class ListTests {
    class len5sc implements StringChecker{
        public boolean checkString(String s){
            return s.length()>5;
        }
    }
    @Test
    public void scEmpty(){
        assertEquals(new ArrayList<>(), ListExamples.filter(new ArrayList<String>(), new len5sc() ));
    }
    @Test
    public void oneSc(){
        ArrayList a = new ArrayList<String>();
        a.add("111111");
        a.add( "abcdef");
        assertEquals(a, ListExamples.filter(a, new len5sc() ));
    }
    @Test
    public void basicMerge(){
        ArrayList a = new ArrayList<String>(List.of("a","c","e"));
        ArrayList b = new ArrayList<String>(List.of("b", "z"));
        assertEquals(new ArrayList<String>(List.of("a","b","c","e", "z")), ListExamples.merge(a, b));
    }


}