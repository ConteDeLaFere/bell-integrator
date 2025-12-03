package ru.malina.tasks.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MatrixTest {

    @Autowired
    private Matrix matrix;

    private int[][] matrixArray;

    @BeforeEach
    void setUp() {

        matrixArray = new int[][]{
                {1, 8, 2, 2, 13},
                {6, 7, 33, 1, 12},
                {3, 2, 24, 5, -2},
                {75, 68, 9, 5, 0},
                {2, 88, 55, -5, 56}
        };
    }

    @Test
    void getMinElementInDiagonalTest() {
        int expected = 1;
        assertEquals(expected, matrix.getMinElementInDiagonal(matrixArray));
    }
}