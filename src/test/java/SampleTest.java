import org.junit.Assert;
import org.junit.Test;

public class SampleTest {
    @Test
    public void testing()
    {
        Sample object= new Sample();
        Assert.assertEquals(object.functn(5,5),0);
        System.out.println("hello");
    }
}
