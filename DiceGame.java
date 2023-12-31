import java.util.*;

class DiceGame {
    int value;

    DiceGame(int range) {
        Random r = new Random();
        int n = 1 + r.nextInt(range - 1);
        value = n;
    }

    int getInt() {
        return value;
    }

    public static void main(String[] args) {
        DiceGame d1 = new DiceGame(6);
        DiceGame d2 = new DiceGame(6);

        Greetings g = new Greetings();
        System.out.println("Rolling dice...");
        System.out.println("Dice 1: " + d1.getInt());
        System.out.println("Dice 2: " + d2.getInt());
        int totalValue = d1.getInt() + d2.getInt();
        System.out.println("Total value: " + totalValue);
        if (totalValue > 7) {
            System.out.println(g.getName() + " won!");
        } else {
            System.out.println(g.getName() + " lost!");
        }
    }
}

class Greetings {
    String name;

    Greetings() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    String getName() {
        return name;
    }
}
