package ru.malina.tasks.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BracketsTest {

    @Autowired
    private Brackets brackets;

    @Test
    void validateCorrectBracketsTest1() {
        String test = "(){}[]";
        assertTrue(brackets.validate(test));
    }

    @Test
    void validateCorrectBracketsTest2() {
        String test = "({[]})";
        assertTrue(brackets.validate(test));
    }

    @Test
    void validateIncorrectBracketsTest() {
        String test = "({[]}";
        assertFalse(brackets.validate(test));
    }

    @Test
    void validateIncorrectBracketsTest2() {
        String test = "({[]})}";
        assertFalse(brackets.validate(test));
    }

    @Test
    void validateIncorrectBracketsTest3() {
        String test = ")({[]})";
        assertFalse(brackets.validate(test));
    }
}