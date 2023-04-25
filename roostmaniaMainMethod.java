import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Main {

    public static void roostmaniaMainMethod(String[] args) throws Exception {

        //printStory(); //Prints out story.
        difficultySelect(); //Selects difficulty for our chicken warrior.
    }

    public static void printStory() throws Exception {
        Scanner in = new Scanner(System.in);
        String chickula = "   Chickula: ";
        String mrChicken = "Mr. Chicken: ";

        printWithDelays("\nRoostmania: Clucking of The Night\n", TimeUnit.MILLISECONDS, 75);
        printWithDelays("Copyright 1997...I mean 2023...wait a sec...it's open source!\n", TimeUnit.MILLISECONDS, 75);
        printWithDelays("This is a fan game and is not affiliated with Konami.\n", TimeUnit.MILLISECONDS, 75);
        System.out.println(); //Space
        printWithDelays("Press RETURN or ENTER to begin your adventure!\n", TimeUnit.MILLISECONDS, 75);
        String temp = in.nextLine();
        printWithDelays("In the year 1784, there once lived a vampire chicken hunter known as Mr. Chicken!\n", TimeUnit.MILLISECONDS, 60);
        printWithDelays("The terror known as Chickula torments members of the coop...\n", TimeUnit.MILLISECONDS, 60);
        System.out.println(); //Space
        System.out.printf("%-13s" + "", mrChicken);
        printWithDelays("*walks toward Chickula* Die Rooster! You don't belong in this coop!\n", TimeUnit.MILLISECONDS, 60);
        System.out.printf("%-13s", chickula);
        printWithDelays("It was not by my beak that I am once again given feathers. I was called here by CHICKENS who wished to pay me feed.\n", TimeUnit.MILLISECONDS, 50);
        System.out.printf("%-13s" + "", mrChicken);
        printWithDelays("FEED!?! You steal chicken's eggs and make them your food!\n", TimeUnit.MILLISECONDS, 60);
        System.out.printf("%-13s" + "", chickula);
        printWithDelays("Perhaps the same could be said of all coop owners...\n", TimeUnit.MILLISECONDS, 60);
        System.out.printf("%-13s" + "", mrChicken);
        printWithDelays("Your clucks are as empty as your brain! Chickens ill need a leader such as you!\n", TimeUnit.MILLISECONDS, 60);
        System.out.printf("%-13s" + "", chickula);
        printWithDelays("What is a chicken? A miserable little pile of feathers. But enough squacking...Have at you!", TimeUnit.MILLISECONDS, 60);

        System.out.println();

    }

    public static void printWithDelays(String data, TimeUnit unit, long delay) //This method allows for delayed text printing through a time specificed with units.
            throws InterruptedException {
        for (char ch:data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
    }

    public static void difficultySelect() throws Exception
    {
        Scanner in = new Scanner(System.in);
        boolean loopRun = true;
        while(loopRun){
        printWithDelays("", TimeUnit.MILLISECONDS, 100);
        printWithDelays("\nMr. Chicken, pick your level...\n", TimeUnit.MILLISECONDS, 60);
        printWithDelays("1: Boring mode...made for chickens\n2: Chicken warrior...recommended for most vampire chicken slayers\n3: Chicken roast... you'll be chicken dinner\n", TimeUnit.MILLISECONDS, 20);
        double difficulty = in.nextInt();
        if((difficulty > 3 || difficulty < 1))
        {
            System.out.println("That's not a difficulty level!");
        }
        else
        {
            loopRun = false;
        }

        }

    }
}
