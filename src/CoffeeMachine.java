import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu(50000,400,540,120,9);
    void run() {
        boolean isRun = true;
        while(isRun) {
            System.out.println("-------------------------------------");
            System.out.println(" 어서오세요*^^* ~ 메뉴를 선택해 주세요!");
            System.out.println("-------------------------------------");
            System.out.println("1. 구매하기 | 2. 채우기 | 3. 가져가기 | 4. 나가기");
            System.out.println("번호 입력하기 >>>");
            int selectedNumber = Integer.parseInt(scanner.nextLine());
            if (selectedNumber == 1) {
                buycoffee();
            } else if (selectedNumber == 2) {
                fill();
            } else if (selectedNumber == 3) {
                take();
            } else if (selectedNumber == 4) {
                isRun = false;
                System.out.println("안녕히 가세요 *^^*");
            }
        }
    }
    private void buycoffee() {
        System.out.println("-----------");
        System.out.println("커피 구매하기");
        System.out.println("------------");
        System.out.println("주문하실 메뉴를 선택하세요");
        System.out.println("*******Menu******");
        System.out.println("1. 에스프레소 : 4000원");
        System.out.println("2. 라떼 : 7000원");
        System.out.println("3. 카푸치노 : 6000원");
        int menuNo = Integer.parseInt(scanner.nextLine());
        System.out.println();
        switch(menuNo) {
            case 1 :
                menu.sellEspresso();
                System.out.println("현재 재고 상태:");
                System.out.println("돈: " + menu.getMoney() + "원");
                System.out.println("물: " + menu.getWater() + "ml");
                System.out.println("우유: " + menu.getMilk() + "ml");
                System.out.println("원두: " + menu.getBean() + "g");
                System.out.println("컵: " + menu.getCup() + "개");
                break;
            case 2 :
                menu.sellLatte();
                System.out.println("현재 재고 상태:");
                System.out.println("돈: " + menu.getMoney() + "원");
                System.out.println("물: " + menu.getWater() + "ml");
                System.out.println("우유: " + menu.getMilk() + "ml");
                System.out.println("원두: " + menu.getBean() + "g");
                System.out.println("컵: " + menu.getCup() + "개");
                break;
            case 3 :
                menu.sellCappuccino();
                System.out.println("현재 재고 상태:");
                System.out.println("돈: " + menu.getMoney() + "원");
                System.out.println("물: " + menu.getWater() + "ml");
                System.out.println("우유: " + menu.getMilk() + "ml");
                System.out.println("원두: " + menu.getBean() + "g");
                System.out.println("컵: " + menu.getCup() + "개");
                break;
            default :
                System.out.println("없는 메뉴입니다.");
        }
    }
    private void fill() {
        System.out.println("-----------");
        System.out.println("재료 채우기");
        System.out.println("------------");
        System.out.println("채울 수량을 입력해주세요.");
        menu.fill();
        System.out.println("남은 재료와 돈 상태");
        System.out.println("돈: " + menu.getMoney() + "원");
        System.out.println("물: " + menu.getWater() + "ml");
        System.out.println("우유: " + menu.getMilk() + "ml");
        System.out.println("원두: " + menu.getBean() + "g");
        System.out.println("컵: " + menu.getCup() + "개");
    }
    private void take() {
        menu.take();
        System.out.println("현재 재고는" + menu.getMoney() + "원 입니다.");
    }
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.run();
    }
}