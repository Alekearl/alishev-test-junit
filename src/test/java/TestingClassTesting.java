import org.junit.Assert;
import org.junit.Test;

public class TestingClassTesting {
    @Test
    public void testMethod() {
        ClassTest classTest = new ClassTest();
        int actual = classTest.highestInt(new int[][]{
                {-10, -50, -100},
                {10, 50, 100},
                {5, 25, 125, 1025}
        });
        Assert.assertEquals(1025, actual);
    }
}
