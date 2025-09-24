package com.chm137.playwrith;
import java.util.Scanner;


public class Balls {
    Scanner sc = new Scanner(System.in);
    int red, green, blue;
    
    public void chance() {
        // Запрашиваем количество шаров
        System.out.println("=== Калькулятор вероятности ===");
        System.out.println("Введите число красных шариков:");
        red = sc.nextInt();
        System.out.println("Введите число зеленых шариков:");
        green = sc.nextInt();
        System.out.println("Введите число синих шариков:");
        blue = sc.nextInt();
        
        // Проверка на отрицательные числа
        if (red < 0 || green < 0 || blue < 0) {
            System.out.println("Количество шаров не может быть отрицательным!");
            return;
        }
        
        // Проверка на нулевое общее количество
        int total = red + green + blue;
        if (total == 0) {
            System.out.println("В коробке нет шаров!");
            return;
        }
        
        System.out.println("Общее количество шаров: " + total);
        
        // Цикл для многократных расчетов
        while (true) {
            System.out.println("\nВыберите вариант расчета:");
            System.out.println("1 - Вероятность для одного цвета");
            System.out.println("2 - Вероятность для двух цветов (ИЛИ)");
            System.out.println("3 - Выход");
            System.out.print("Ваш выбор: ");
            
            String choice = sc.next().toLowerCase();
            
            if (choice.equals("3")) {
                System.out.println("Программа завершена.");
                break;
            }
            
            switch (choice) {
                case "1":
                    calculateSingleColorProbability(total);
                    break;
                case "2":
                    calculateTwoColorsProbability(total);
                    break;
                default:
                    System.out.println("Неверный выбор! Используйте 1, 2 или 3.");
            }
        }
    }
    
    // Метод для расчета вероятности одного цвета
    private void calculateSingleColorProbability(int total) {
        System.out.print("Введите цвет (red/green/blue): ");
        String color = sc.next().toLowerCase();
        
        double probability = 0.0;
        String colorName = "";
        int count = 0;
        
        switch (color) {
            case "red":
                count = red;
                colorName = "красный";
                break;
            case "green":
                count = green;
                colorName = "зеленый";
                break;
            case "blue":
                count = blue;
                colorName = "синий";
                break;
            default:
                System.out.println("Неверный цвет! Используйте red, green или blue.");
                return;
        }
        
        probability = (double) count / total * 100;
        System.out.printf("Вероятность вытащить %s шар: %.2f%% (%d из %d)\n", 
                        colorName, probability, count, total);
    }
    
    // Метод для расчета вероятности двух цветов (ИЛИ)
    private void calculateTwoColorsProbability(int total) {
        System.out.println("Выберите первый цвет (red/green/blue): ");
        String color1 = sc.next().toLowerCase();
        System.out.println("Выберите второй цвет (red/green/blue): ");
        String color2 = sc.next().toLowerCase();
        
        // Получаем количество шаров для каждого цвета
        int count1 = getCountByColor(color1);
        int count2 = getCountByColor(color2);
        
        if (count1 == -1 || count2 == -1) {
            System.out.println("Ошибка: неверно указаны цвета!");
            return;
        }
        
        // Вероятность P(A или B) = P(A) + P(B)
        int combinedCount = count1 + count2;
        double probability = (double) combinedCount / total * 100;
        
        String colorName1 = getColorName(color1);
        String colorName2 = getColorName(color2);
        
        System.out.printf("Вероятность вытащить %s ИЛИ %s шар: %.2f%% (%d из %d)\n", 
                        colorName1, colorName2, probability, combinedCount, total);
    }
    
    // Вспомогательный метод для получения количества по цвету
    private int getCountByColor(String color) {
        switch (color) {
            case "red": return red;
            case "green": return green;
            case "blue": return blue;
            default: return -1;
        }
    }
    
    // Вспомогательный метод для получения русского названия цвета
    private String getColorName(String color) {
        switch (color) {
            case "red": return "красный";
            case "green": return "зеленый";
            case "blue": return "синий";
            default: return "неизвестный";
        }
    }
    
    public static void main(String[] args) {
        Balls balls = new Balls();
        balls.chance();
    }
}