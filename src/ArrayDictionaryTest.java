
/**
 * Spoorthi Gowda
 * 
 * Homeowork 7 part 1
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
    }

    @Test
    public void remove() {
        // homework
    	//empty dictionary test
    	int testSize = 0;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertEquals(false, dict.remove(1));
        
      //key exists in a dictionary that has no collision test
    	testSize = 5;
        dict = new ArrayDictionary(testSize);
        dict.add(2, 82);
        dict.add(4, 84);
        System.out.println(dict);
        assertEquals(true, dict.remove(2));
        System.out.println(dict);
        
      //key does not exists in a dictionary that has no collision test
    	testSize = 5;
        dict = new ArrayDictionary(testSize);
        dict.add(2, 82);
        dict.add(4, 84);
        System.out.println(dict);
        assertEquals(false, dict.remove(3));
        System.out.println(dict);
        
      //key exists in a dictionary that has collision, key is in the collision test
        testSize = 5;
        dict = new ArrayDictionary(testSize);
        dict.add(2, 82);
        dict.add(4, 84);
        dict.add(7, 87);
        System.out.println(dict);
        assertEquals(true, dict.remove(2));
        System.out.println(dict);
        
      //key exists in a dictionary that has collision, key is not in the collision test
        testSize = 5;
        dict = new ArrayDictionary(testSize);
        dict.add(2, 82);
        dict.add(4, 84);
        dict.add(7, 87);
        System.out.println(dict);
        assertEquals(true, dict.remove(4));
        System.out.println(dict);
        
      //key does not exists in a dictionary that has collision test
        testSize = 5;
        dict = new ArrayDictionary(testSize);
        dict.add(2, 82);
        dict.add(4, 84);
        dict.add(7, 87);
        System.out.println(dict);
        assertEquals(false, dict.remove(3));
        System.out.println(dict);
        //assertTrue(false);  // place holder
    }

    @Test
    public void contains() {
        // homework
    	//empty dictionary test
    	int testSize = 0;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertEquals(false, dict.contains(-1));
        assertEquals(false, dict.contains(0));
        assertEquals(false, dict.contains(1));
        
        //capacity 1 test
        testSize = 1;
        dict = new ArrayDictionary(testSize);
        dict.add(0, 103);        
        assertEquals(false, dict.contains(2));
        assertEquals(true, dict.contains(0));
        
      //capacity 2 test
        testSize = 2;
        dict = new ArrayDictionary(testSize);
        dict.add(0, 103);
        dict.add(1, 105);
        assertEquals(true, dict.contains(0));
        assertEquals(true, dict.contains(1));
        assertEquals(false, dict.contains(2));
        assertEquals(false, dict.contains(3));
        
      //capacity 3 test
        testSize = 3;
        dict = new ArrayDictionary(testSize);
        dict.add(0, 103);
        dict.add(1, 105);
        dict.add(2, 206);
        assertEquals(false, dict.contains(3));
        assertEquals(true, dict.contains(1));
        
      //capacity 4 test
        testSize = 4;
        dict = new ArrayDictionary(testSize);
        dict.add(0, 103);
        dict.add(1, 105);
        dict.add(2, 206);
        dict.add(4, 407);
        assertEquals(true, dict.contains(1));
        assertEquals(true, dict.contains(4));
        assertEquals(false, dict.contains(7));
        assertEquals(false, dict.contains(8));
        //assertTrue(false);  // place holder
    }
}