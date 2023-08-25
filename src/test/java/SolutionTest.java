import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void isInterleaveTest1() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean actual = new Solution().isInterleave(s1, s2, s3);

        Assert.assertTrue(actual);
    }

    @Test
    public void isInterleaveTest2() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        boolean actual = new Solution().isInterleave(s1, s2, s3);

        Assert.assertFalse(actual);
    }

    @Test
    public void isInterleaveTest3() {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        boolean actual = new Solution().isInterleave(s1, s2, s3);

        Assert.assertTrue(actual);
    }


}
