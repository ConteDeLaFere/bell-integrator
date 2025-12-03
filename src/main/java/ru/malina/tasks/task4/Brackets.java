package ru.malina.tasks.task4;

import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
public class Brackets {

    public boolean validate(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    System.out.println("Несоответствие скобок");
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}

