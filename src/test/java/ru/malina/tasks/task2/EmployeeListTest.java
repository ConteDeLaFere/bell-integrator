package ru.malina.tasks.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeListTest {

    @Autowired
    private EmployeeList employeeList;

    private List<Map<String, String>> employees;

    @BeforeEach
    void setUp() {
        Map<String, String> employee1 = Map.of("Имя", "Максим",
                    "Возраст", "32",
                    "Должность", "Middle Java dev",
                    "Зарплата", "$1200");

        Map<String, String> employee2 = Map.of("Имя", "Иван",
                    "Возраст", "25",
                    "Должность", "Junior Java dev",
                    "Зарплата", "50000 Руб");

        Map<String, String> employee3 = Map.of("Имя", "Мария",
                    "Возраст", "35",
                    "Должность", "Senior Java automation QA",
                    "Зарплата", "160000 Руб");

        Map<String, String> employee4 = Map.of("Имя", "Петр",
                    "Возраст", "28",
                    "Должность", "Dev-ops",
                    "Зарплата", "$1700");

        Map<String, String> employee5 = Map.of("Имя", "Анна",
                    "Возраст", "31",
                    "Должность", "Middle functional tester",
                    "Зарплата", "$1100");

        Map<String, String> employee6 = Map.of("Имя", "Кирилл",
                    "Возраст", "36",
                    "Должность", "Senior Java dev",
                    "Зарплата", "$2500");

        Map<String, String> employee7 = Map.of("Имя", "Дмитрий",
                    "Возраст", "22",
                    "Должность", "Junior Java automation QA",
                    "Зарплата", "45000 Руб");

        employees = List.of(employee1, employee2, employee3, employee4, employee5, employee6, employee7);
    }

    @Test
    void getAvgEmployeesAgeTest() {
        double expected = (32 + 25 + 35 + 28 + 31 + 36 + 22) / 7.0;
        assertEquals(expected, employeeList.getAvgEmployeesAge(employees));
    }

    @Test
    void getEmployeesNamesWhereAgeLess30Test() {
        List<String> expected = List.of("Иван", "Петр", "Дмитрий");
        assertEquals(expected, employeeList.getEmployeesNamesWhereAgeLess30(employees));
    }

    @Test
    void getEmployeesNamesWhereSalaryInRublesTest() {
        List<String> expected = List.of("Иван", "Мария", "Дмитрий");
        assertEquals(expected, employeeList.getEmployeesNamesWhereSalaryInRubles(employees));
    }
}