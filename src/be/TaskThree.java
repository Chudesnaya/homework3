package be;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String name = sc.nextLine();
        System.out.println("Введите свой возраст: ");
        int age = sc.nextInt();
        String str = String.format("Привет - %s! Тебе ведь %d лет?", name, age);
        System.out.println(str);
    }
}
