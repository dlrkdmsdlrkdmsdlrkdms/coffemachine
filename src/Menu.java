import java.util.Scanner;
public class Menu {
    int money;
    int water;
    int milk;
    int bean;
    int cup;
    public Menu(int money, int water, int milk, int bean, int cup) {
        this.money = money;
        this.water = water;
        this.milk = milk;
        this.bean = bean;
        this.cup = cup;
    }
    public void sellEspresso() {
        if (water >= 250 && bean >= 16 && cup >= 1) {
            money += 4000;
            water -= 250;
            bean -= 16;
            cup -= 1;
            System.out.println("에스프레소입니다. 맛있게 드세요!");
        } else {
            System.out.println("재료가 부족합니다. 다음에 이용해주세요");
        }
    }
    public void sellLatte() {
        if (water >= 350 && milk >= 75 && bean>= 20 && cup >=1) {
            money += 7000;
            water -= 350;
            milk -= 75;
            bean -= 20;
            cup -= 1;
            System.out.println("라떼입니다. 맛있게 드세요!");
        }else {
            System.out.println("재료가 부족합니다. 다음에 이용해주세요");
        }
    }
    public void sellCappuccino() {
        if (water >= 200 && milk >= 100 && bean>= 12 && cup >=1) {
            money += 6000;
            water -= 200;
            milk -= 100;
            bean -= 12;
            cup -= 1;
            System.out.println("카푸치노입니다. 맛있게 드세요!");
        } else {
            System.out.println("재료가 부족합니다. 다음에 이용해주세요");
        }
    }
    public void fill () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("채울 물의 양");
        int waterToAdd = scanner.nextInt();
        water += waterToAdd;
        System.out.println("채울 우유의 양");
        int milkToAdd = scanner.nextInt();
        milk += milkToAdd;
        System.out.println("채울 원두의 양");
        int beanToAdd = scanner.nextInt();
        bean += beanToAdd;
        System.out.println("채울 컵의 양");
        int cupToAdd = scanner.nextInt();
        cup += cupToAdd;
        System.out.println("채우기 완료!");
    }
    public void take() {
        System.out.println(money + "원을 가져갑니다.");
        money = 0;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getWater() {
        return water;
    }
    public void setWater(int water) {
        this.water = water;
    }
    public int getMilk() {
        return milk;
    }
    public void setMilk(int milk) {
        this.milk = milk;
    }
    public int getBean() {
        return bean;
    }
    public void setBean(int bean) {
        this.bean = bean;
    }
    public int getCup() {
        return cup;
    }
    public void setCup(int cup) {
        this.cup = cup;
    }
}

