package ru.malina.tasks.task2;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class EmployeeList {

    private final List<Map<String, String>> employees;

    {
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

    public double getAvgEmployeesAge() {
        return employees.stream()
                .mapToDouble(employee -> Double.parseDouble(employee.get("Возраст")))
                .average()
                .getAsDouble();
    }

    public List<String> getEmployeesNamesWhereAgeLess30() {
        return employees.stream()
                .filter(employee -> Integer.parseInt(employee.get("Возраст")) < 30)
                .map(employee -> employee.get("Имя"))
                .toList();
    }

    public List<String> getEmployeesNamesWhereSalaryInRubles() {
        return employees.stream()
                .filter(employee -> employee.get("Зарплата").contains("Руб"))
                .map(employee -> employee.get("Имя"))
                .toList();
    }
}
