package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nВыберите действие: ");
            System.out.println("1) Проверка на 18 лет через дату рождения");
            System.out.println("2) Калькулятор");
            System.out.println("3) end\n");
            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Приветствую!");
                    System.out.println("Введите дату вашего рождения в формате ГГГГ-ММ-ДД для проверки совершеннолетия: ");
                    String birthDateStr = scanner.next();
                    LocalDate birthDate = LocalDate.parse(birthDateStr);
                    LocalDate currentDate = LocalDate.now();
                    int age = Period.between(birthDate, currentDate).getYears();

                    if (age >= 18) {
                        System.out.println("Вы достигли совершеннолетия ;)");
                    } else {
                        System.out.println("Вы не достигли совершеннолетия :_(");
                    }
                    break;
                case 2:
                    System.out.println("Выберите операцию: S, L, R");
                    String K = scanner.next();

                    switch (K) {
                        case "S":
                            System.out.println("Введите радиус круга");
                            int r = scanner.nextInt();
                            System.out.println("Площадь равна: ");
                            System.out.println(3 * r * r);
                            break;
                        case "L":
                            System.out.println("Введите диаметр круга");
                            int d = scanner.nextInt();
                            System.out.println("Длина круга равна: ");
                            System.out.println(3 * d);
                            break;
                        case "R":
                            System.out.println("Введите диаметр круга");
                            double c;
                            double a = scanner.nextDouble();
                            System.out.println("Радиус равен: ");
                            System.out.println(c = 2 / a);
                            break;
                        default:
                            System.out.println("Такой операции нет, потворите попытку!");
                    }
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Такой операции нет, потворите попытку!");
            }
        }
    }
}