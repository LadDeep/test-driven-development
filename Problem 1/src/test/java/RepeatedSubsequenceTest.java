import org.example.RepeatedSubsequence;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RepeatedSubsequenceTest {

    RepeatedSubsequence repeatedSubsequence = new RepeatedSubsequence();

    @Test
    public void returnsTrue() {
        assertTrue(repeatedSubsequence.isRepeatedSubsequence("abcab"));
    }

    @Test
    public void returnsFalse() {
        assertFalse(repeatedSubsequence.isRepeatedSubsequence("aab"));
    }

    @Test
    public void returnFalseIfEmpty() {
        assertFalse(repeatedSubsequence.isRepeatedSubsequence(""));
    }

}
