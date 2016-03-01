import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class StringManipulatorTest extends TestCase {
    
    /**
     * Test the basic functionality of makeUserName.
     * Don't check for correct case
     */
    public void testMakeUserNameBasic() {
        StringManipulator m = new StringManipulator();
        String ret = m.makeUserName("john doe");
        assertEquals("jdoe", ret);
    }
    
    public void testMakeUserNameLower() {
    
        StringManipulator m = new StringManipulator();
        String ret = m.makeUserName("JOHN DOE");
        assertEquals("jdoe", ret);
        
    }
    
    public void testMakeEmail() {
    
        StringManipulator m2 = new StringManipulator();
        String ret2 = m2.makeEmail("jdoe", "PURdue.eDU");
        assertEquals("jdoe@purdue.edu", ret2);
        
    }
    
}
