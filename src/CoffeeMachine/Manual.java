package CoffeeMachine;

import java.util.Scanner;

public class Manual {
    public static void main(String[] args) {
        Coffee[] menu = {
                new Coffee("에스프레소", 1000),
                new Coffee("아메리카노", 1500),
                new Coffee("카페라떼", 2000),
                new Coffee("카푸치노", 2500)
        };

        CoffeeMachine coffeeMachine = new CoffeeMachine(menu, 1000, 500, 300, 100);

        Scanner scanner = new Scanner(System.in);
        coffeeMachine.displayMenu();

        System.out.println("금액을 투입하세요:");
        int insertedAmount = scanner.nextInt();

        System.out.println("커피를 선택하세요 (1-" + menu.length + "):");
        int coffeeChoice = scanner.nextInt();

        coffeeMachine.serveCoffee(coffeeChoice, insertedAmount);

        scanner.close();
    }
    }

