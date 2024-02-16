package Hello;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello world");

        pretendAppleBananaMarketUseDoWhileAndElseWith();

        Application manOrWoman = new Application();
        manOrWoman.sayManOrWomanIfEndsWith();
    }

    @Test
    public void sayHiToName() {
        String name = "John";
        System.out.println("Hi" + " " + name);

        assertEquals("John", name);
    }


    @Test
    public void sayHowMuchJohnHas() {
        String name = "Joseph";
        int balance = 1000;
        int price = 50;
        balance += 250;

        System.out.println("You now have " + balance + ", " + name + ".");
        balance -= price;
        System.out.println("You now have " + balance + ", " + name + ".");
        balance -= price * 2;
        System.out.println("You now have " + balance + ", " + name + ".");

        assertEquals(1100,balance);
    }

    public void sayManOrWomanIfEndsWith() {
        String person = "Julia";
        String person2 = "Julian";

        if (person.endsWith("a")) {
            System.out.println(person + " is a woman.");
        } else {
            System.out.println(person + " is a man.");
        }

        if (person2.endsWith("a")) {
            System.out.println(person2 + " is a woman.");
        } else {
            System.out.println(person2 + " is a man.");
        }
    }

    @Test
    public void ForLoop() {
        String s = "";

        for (int i = 0; i < 8; i++) {
            s += i + " ";
            System.out.println(s);
        }
        assertEquals("0 1 2 3 4 5 6 7 ",s);
    }

    @Test
    public void WhileLoop() {
        int v1 = 1;
        int v2 = 8;
        while (v1 < 13) {
            v1++;
            v2--;

            System.out.println("(v1= "+ v1 + ", V2= " + v2 + ")");
            if (v1 == 7) {
                System.out.println("No more printing. I'm on a break.");
                break;
            }
        }
        assertEquals(2,v2);
        assertEquals(7, v1);
    }

    @Test
    public void switchSeasonsBaseOnMonth() {
        int month = 7;
        String season = switch (month) {
            case 12, 1, 2:
                yield "It's winter.";
            case 3, 4, 5:
                yield "It's spring.";
            case 6, 7, 8:
                yield "It's summer.";
            case 9, 10, 11:
                yield "It's autumn.";
            default:
                yield "There's only 12 months.";
        };
        System.out.println("\n" + season);
        assertEquals("It's summer.", season);
    }

    @Test
    public void sayHelloToParticipants() {
        String[] participants = {"Ania", "Ala", "Łucja", "Jozef", "Robet", "Mateusz", "Asia"};
        String result = "";
        for (
                String participant : participants) {
            result += participant + " ";
            System.out.println("Hello " + result);
        }
        assertEquals("Ala", participants[1]);
        assertEquals("Jozef", participants[3]);
    }

    @Test
    public void drawPatternWithForLoop() {
        int i;
        for (
                i = 0;
                i < 12; i++) {
            if (i % 3 == 0) {
                System.out.println("***");
                continue;
            }
            System.out.println("...");
        }
        assertEquals(12, i);
    }

    @Test
    public void sayHowManyCoinsUseDoWhile() {
        int coins = 0;
        do {
            coins++;
            if (coins == 1) {
                System.out.println("Now I have " + coins + " coin.");
            } else {
                System.out.println("Now I have " + coins + " coins.");
            }
        } while (coins < 3);
        assertEquals(3,coins);
    }

    public static void pretendAppleBananaMarketUseDoWhileAndElseWith() {
        System.out.println("\nAPPLE BANANA MARKET");

        int apples = 0;
        int bananas = 4;
        System.out.println("You start with " + apples + " apples and " + bananas + " bananas.\n");

        do {
            apples++;
            bananas--;
            System.out.println("\nYou exchange 1 banana for one 1 apple.");
            if (apples == 1) {
                System.out.println("You have " + apples + " apple and " + bananas + " bananas.");
            } else if (bananas == 1) {
                System.out.println("You have " + apples + " apples and " + bananas + " banana.");
            } else if (bananas == 0) {
                System.out.println("You have " + apples + " apples and you don't have any bananas.");
            } else {
                System.out.println("You have " + apples + " apples and " + bananas + " bananas.");
            }
        } while (apples < 4);

        System.out.println("\nYou got want you wanted. Leave the market.\n");
    }


}
