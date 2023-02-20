import org.example.RepeatedSubsequence;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RepeatedSubsequenceTest {

    @Test
    public void returnsTrue() {
        RepeatedSubsequence repeatedSubsequence = new RepeatedSubsequence();
        assertTrue(repeatedSubsequence.isRepeatedSubsequence("abcab"));
    }

    @Test
    public void returnsFalse() {
        RepeatedSubsequence repeatedSubsequence = new RepeatedSubsequence();
        assertFalse(repeatedSubsequence.isRepeatedSubsequence("aab"));
    }

}
