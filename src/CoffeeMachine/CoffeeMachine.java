package CoffeeMachine;

class CoffeeMachine {
    private Coffee[] menu;
    private int waterStock;
    private int coffeeStock;
    private int milkStock;
    private int sugarStock;

    public CoffeeMachine(Coffee[] menu, int waterStock, int coffeeStock, int milkStock, int sugarStock) {
        this.menu = menu;
        this.waterStock = waterStock;
        this.coffeeStock = coffeeStock;
        this.milkStock = milkStock;
        this.sugarStock = sugarStock;
    }

    public void displayMenu() {
        System.out.println("커피 메뉴:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getName() + " - " + menu[i].getPrice() + "원");
        }
    }

    public void serveCoffee(int coffeeChoice, int insertedAmount) {
        if (coffeeChoice >= 1 && coffeeChoice <= menu.length) {
            int selectedCoffeeIndex = coffeeChoice - 1;
            Coffee selectedCoffee = menu[selectedCoffeeIndex];

            if (insertedAmount >= selectedCoffee.getPrice()) {
                System.out.println(selectedCoffee.getName() + "가 나왔습니다. 맛있게 드세요!");

                // Deduct coffee ingredients from stock
                waterStock -= 100;
                coffeeStock -= 50;
                milkStock -= 50;
                sugarStock -= 10;

                int change = insertedAmount - selectedCoffee.getPrice();
                if (change > 0) {
                    System.out.println("거스름돈 " + change + "원을 반환합니다.");
                }
            } else {
                System.out.println("금액이 부족합니다.");
            }
        } else {
            System.out.println("잘못된 메뉴 선택입니다.");
        }
    }
}
