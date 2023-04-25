import java.util.concurrent.TimeUnit;
public class roostmaniaMainMethod {
    public static void main(String[] args) throws Exception {
        printStory(); //Prints out story
    }

    public static void printStory() throws Exception {

        String chickula = "   Chickula: ";
        String mrChicken = "Mr. Chicken: ";

        printWithDelays("\nRoostmania: Clucking of The Night\n", TimeUnit.MILLISECONDS, 75);
        printWithDelays("Copyright 1997...I mean 2023...wait a sec...it's open source!\n", TimeUnit.MILLISECONDS, 75);
        printWithDelays("This is a fan game and is not affiliated with Konami.\n", TimeUnit.MILLISECONDS, 75);
        System.out.println(); //Space
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

    public static void printWithDelays(String data, TimeUnit unit, long delay)
            throws InterruptedException {
        for (char ch:data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
    }
}

