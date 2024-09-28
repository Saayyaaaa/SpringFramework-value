package com.example.springappvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Аннотация @Value в Spring используется для внедрения значений в
//поля классов из различных источников, таких как файлы конфигурации
//        (например, application.properties или application.yml),
//переменные окружения или аргументы командной строки.

import java.util.List;

@Component
public class ConfigValues {
    @Value("${value.from.file}")
    private String valueFromFile;

    @Value("${priority}")
    private String priority;

    @Value("#{'${listOfValues}'.split(',')}")
    private List<String> listOfValues;

    public void printConfigValues() {
        System.out.println("Value from file: " + valueFromFile);
        System.out.println("Priority: " + priority);
        System.out.println("List of values: " + listOfValues);
    }
}
