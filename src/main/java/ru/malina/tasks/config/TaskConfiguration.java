package ru.malina.tasks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.malina.tasks.task2.EmployeeList;
import ru.malina.tasks.task3.Matrix;
import ru.malina.tasks.task4.Brackets;
import ru.malina.tasks.task5.Basket;
import ru.malina.tasks.task5.BasketImpl;

@Configuration
public class TaskConfiguration {

    @Bean
    public EmployeeList employeeList() {
        return new EmployeeList();
    }

    @Bean
    public Matrix matrix() {
        return new Matrix();
    }

    @Bean
    public Brackets brackets() {
        return new Brackets();
    }

    @Bean
    public Basket basket() {
        return new BasketImpl();
    }
}
