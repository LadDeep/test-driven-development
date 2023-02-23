import org.example.MatrixDiagonalSum;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MatrixDiagonalSumTest {
    @Test
    public void testWhenMatrixIsEmpty(){
        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        double [][]matrix={{}};
        assertTrue(matrixDiagonalSum.isEmpty(matrix));
    }
}
