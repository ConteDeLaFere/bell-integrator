package ru.malina.tasks.task3;

import org.springframework.stereotype.Component;

@Component
public class Matrix {

    public int getMinElementInDiagonal(int[][] matrix) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            int element = matrix[matrix.length - 1 - i][i];
            min = Math.min(min, element);
        }

        return min;
    }
}
