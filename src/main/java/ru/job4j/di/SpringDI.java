package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class);
        context.register(StartUI.class);
        context.register(ConsoleInput.class);
        context.refresh();

        ConsoleInput input = context.getBean(ConsoleInput.class);
        StartUI ui = context.getBean(StartUI.class);
        ui.init(input);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}