import org.example.MatrixDiagonalSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixDiagonalSumTest {
    @Test
    public void testWhenMatrixIsEmpty(){
        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        double [][]matrix={{}};
        assertTrue(matrixDiagonalSum.isEmpty(matrix));
    }
    @Test
    public void testWhenMatrixIsSquare(){
        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        double [][]matrix={{1,2,4}, {3,4,6}, {3,4,6}};
        assertTrue(matrixDiagonalSum.isSquare(matrix));
    }
    @Test
    public void testWhenMatrixIsOddSquare(){
        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        double [][]matrix={{1,2}, {3,4}};
        assertFalse(matrixDiagonalSum.isSquare(matrix));
    }
    @Test
    public void testWhenMatrixSumIsTrue(){
        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        double [][]matrix={{1,2,4}, {3,4,6}, {3,4,6}};
        assertEquals(17, matrixDiagonalSum.getSum(matrix));
    }
}
