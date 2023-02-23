package org.example;

public class MatrixDiagonalSum {

    public boolean isEmpty(double[][] matrix) {
        if(matrix[0].length == 0) {
            return true;
        }
        return false;
    }

    public boolean isSquare(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i].length != matrix.length) {
                return false;
            }
        }
        return true;
    }
}
