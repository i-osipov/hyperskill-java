package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Moulinette", "1337"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Привет! Меня зовут " + assistantName + ".");
        System.out.println("Я родилась в " + birthYear + " году.");
        System.out.println("Напомни своё имя, дружок.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("Какое крутое у тебя имя, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Давай я угадаю сколько тебе лет.");
        System.out.println("Посчитай и скажи мне остаток от деления своего возраста на 3, 5 и на 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Ха! Я угадала! тебе " + age + " лет. Это лучший возраст для того, чтобы начать программировать!");
    }

    static void count() {
        System.out.println("Я умею считать до максимального значения инта. Проверим? Скажи мне до скольки посчитать.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("А теперь проверим твои знания английского языка и языка Java.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int ans = scanner.nextInt();
        while (ans != 2) {
            System.out.println("Неверно, попробуй ещё раз.");
            ans = scanner.nextInt();
        }
    }

    static void end() {
        System.out.println("Поздравляю, ты молодец. Отличного дня! =)"); // Do not change this text
    }
}
