package com.example;

public class Main {

    public static void main(String[] args) {

        User user = new User("Karthi G", 25);

        Calculator calculator = new Calculator();

        int result = calculator.add(11, 40);

        MessageService messageService = new MessageService();	

        System.out.println("User Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Addition Result: " + result);

        messageService.printMessage("Java project is working!");
    }
}	