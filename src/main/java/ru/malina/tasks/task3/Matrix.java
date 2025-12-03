package ru.malina.tasks.task3;

import org.springframework.stereotype.Component;

@Component
public class Matrix {

    private int[][] matrix;

    public void randomMatrix(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
    }

    public int getMinElementInDiagonal() {
        randomMatrix(5);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            int element = matrix[matrix.length - 1 - i][i];
            min = Math.min(min, element);
        }

        return min;
    }
}
