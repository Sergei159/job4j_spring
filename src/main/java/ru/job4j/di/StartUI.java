package ru.job4j.di;

import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }

    public void init(ConsoleInput input) {
        String result = input.askStr("Enter name: ");
        System.out.println("Name is: " + result);
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}