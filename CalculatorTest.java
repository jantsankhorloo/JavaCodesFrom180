import static org.junit.Assert.*;
import org.junit.*;

    
public class CalculatorTest {
    private Calculator calc;
        
    @Before
    public void setUp() throws Exception {
        System.out.println("Within setup()");
        calc = new Calculator();
    }
          
    @After
    public void tearDown() throws Exception {
        System.out.println("Within tearDown()");
    }
    
    @Test(timeout = 100)
    public void testAdd() {
        System.out.println("Within testAdd()");
        int num1 = 5;
        int num2 = 3;
        int expResult = num1 + num2;
        String errorMsg = "check add()";
        int actResult = calc.add(num1 , num2);
        assertEquals(errorMsg, expResult, actResult);
    }
    
    @Test(timeout = 100)
    public void testDivByZero() {
        System.out.println("Within testDivByZero");
        int num1 = 5;
        int num2 = 0;
        int expResult = num1;
        String errorMsg = "check div()";
        int actResult = calc.div(num1 , num2);
        assertEquals(errorMsg, expResult, actResult);
    }
}