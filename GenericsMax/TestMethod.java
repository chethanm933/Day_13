package GenericsMax;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestMethod {

	@Test
    public void maxFloatTest() {
    	Float actualValue = FloatMax.FindMaxNumber(10f,54f,75f);
        Assert.assertEquals(1000,actualValue,0);
    }

	    @Test
	    public void maxIntTest() {
	    	Integer actualValue = IntMax.FindMaxNumber(10,54,75);
	        Assert.assertEquals(15,actualValue,0);
	    }

	@Test
	    public void maxStringTest() {
	    	String actualValue = StringMax.FindMaxString("INDIA", "Delhi", "banglore");
	        Assert.assertEquals("INDIA",actualValue,0);
	
		}
}
