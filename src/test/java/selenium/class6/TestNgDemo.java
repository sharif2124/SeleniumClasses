package selenium.class6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo extends BrowserLaunch{
    @Test
    public void testcase1(){
        Assert.assertEquals(10,10);
    }
    @Test
    public void testcase2(){
        Assert.assertEquals(10,10);
    }
    @Test
    public void testcase3(){
        Assert.assertEquals(10,10);
    }
}
