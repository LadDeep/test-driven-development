import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class MatrixDiagonalSumTest {

    @Test
    public void testWhenMatrixIsNotSquare() {
        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        double [][]matrix = {{1,2,3}, {4,5,6}};
        assertFalse(matrixDiagonalSum.isSquareMatrix(matrix));
    }
}
