package org.example;

public class MatrixDiagonalSum {

    public boolean isEmpty(double[][] matrix) {
        if(matrix[0].length == 0) {
            return true;
        }
        return false;
    }

    public boolean isSquare(double[][] matrix) {
        if(matrix.length %2 == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if((matrix[i].length != matrix.length) || (matrix[i].length % 2 == 0)) {
                return false;
            }
        }
        return true;
    }

    public double getSum(double[][] matrix) {
        double sum = 0;
        int matrixLength = matrix.length;
        if(!isEmpty(matrix) && isSquare(matrix)) {
            for (int i = 0; i < matrixLength; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(i == j | j == matrixLength-i-1) {
                        sum += matrix[i][j];
                    }
                }
            }
        }
        return sum;
    }
}
