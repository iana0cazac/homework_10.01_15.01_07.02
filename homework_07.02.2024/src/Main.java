import java.util.Random;
import java.util.Scanner;

public class Main {
    public static <random> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        String userAntwort = "exit";

        System.out.println("Решите пожалуйста следующие арифметические задачи: ");

        for (int counter =0; counter < 10; counter = counter + 1) {

            int randNumber = random.nextInt(1, 10);
            System.out.println("число 1: " + randNumber);
            int randNumber2 = random.nextInt(1, 10);
            System.out.println("число 2: " + randNumber2);

            System.out.println("Будет выполнена операция сложения: "
                    + randNumber + " + " + randNumber2);
            System.out.println("ВВедите свой ответ: ");
            int userAnswer1 = scanner.nextInt();
            System.out.println("Ваш ответ:" + userAnswer1);

            int result1 = randNumber + randNumber2;
            System.out.println("Правильный результат: " + result1);
            if (userAnswer1 == result1) {
                System.out.println("Поздравляем! Правильный ответ! Вы получаете 5 баллов.");
               } else {
                System.out.println("Ваш ответ не правильный:( Мы отнимаем у вас 5 баллов.");
            }

              if (counter < 10) {
                System.out.println("Будет выполнена операция умножения: "
                        + randNumber + " * " + randNumber2);
                System.out.println("ВВедите свой ответ:");
                int userAnswer2 = scanner.nextInt();
                System.out.println("Ваш ответ:" + userAnswer2);

                int result2 = randNumber * randNumber2;
                System.out.println("Правильный результат: " + result2);
                if (userAnswer2 == result2) {
                    System.out.println("Поздравляем! Правильный ответ! Вы получаете 5 баллов.");
                } else {
                    System.out.println("Ваш ответ не правильный:( Мы отнимаем у вас 5 баллов.");
                }

                if (counter < 10) {
                    System.out.println("Будет выполнена операция деления: "
                            + randNumber + " / " + randNumber2);
                    System.out.println("ВВедите свой ответ:");
                    int userAnswer3 = scanner.nextInt();
                    System.out.println("Ваш ответ:" + userAnswer2);

                    int result3 = randNumber / randNumber2;
                    System.out.println("Правильный результат: " + result3);
                    if (userAnswer3 == result3) {
                        System.out.println("Поздравляем! Правильный ответ! Вы получаете 5 баллов.");
                    } else {
                        System.out.println("Ваш ответ не правильный:( Мы отнимаем у вас 5 баллов.");
                    }
                    String command = scanner.next();
                    if (command.equals("exit")){
                        return;}

                }}}}}