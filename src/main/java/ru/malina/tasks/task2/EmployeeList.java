package ru.malina.tasks.task2;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class EmployeeList {

    public double getAvgEmployeesAge(List<Map<String, String>> employees) {
        return employees.stream()
                .mapToDouble(employee -> Double.parseDouble(employee.get("Возраст")))
                .average()
                .getAsDouble();
    }

    public List<String> getEmployeesNamesWhereAgeLess30(List<Map<String, String>> employees) {
        return employees.stream()
                .filter(employee -> Integer.parseInt(employee.get("Возраст")) < 30)
                .map(employee -> employee.get("Имя"))
                .toList();
    }

    public List<String> getEmployeesNamesWhereSalaryInRubles(List<Map<String, String>> employees) {
        return employees.stream()
                .filter(employee -> employee.get("Зарплата").contains("Руб"))
                .map(employee -> employee.get("Имя"))
                .toList();
    }
}
