import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RepeatedSubsequenceTest {

    @Test
    public void returnsTrue() {
        RepeatedSubsequence repeatedSubsequence = new RepeatedSubsequence();
        assertTrue(repeatedSubsequence.isRepeatedSubsequence("abcab"));
    }

}
