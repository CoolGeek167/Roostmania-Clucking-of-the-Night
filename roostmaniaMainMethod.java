import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class roostmaniaMainMethod {

    public static void main (String[] args) throws Exception
    {
        printStory(); //Prints out story.
        boolean mainloop = true;
        while(mainloop)
        {
            Scanner in = new Scanner(System.in);

            int difficulty = difficultySelect(); //Selects difficulty for our chicken warrior.
            int mrChickenHealth = mrChickenHealth(difficulty); //Sets Mr. Chicken's health based on difficulty
            int chickulaHealth = chickulaHealth(difficulty); //Sets Chickula's health based on difficulty
            gameplay(mrChickenHealth, chickulaHealth); //Passes Mr. Chickens and Chickula's health into the Gameplay function!

            boolean replayPrompt = true;
            while(replayPrompt) //Asks user if they want to play again
            {
            printWithDelays("\nWould you like to play again? Type 'Y' for Yes and 'N' for No:\n\n", TimeUnit.MILLISECONDS, 60);
            String playAgain = in.next();
            if (playAgain.equals("Y"))
            {
                replayPrompt = false;
            }
            else if (playAgain.equals("N")) //Ends game
            {
                mainloop = false;
                replayPrompt = false;
            }
            else //Reprompts
            {
                printWithDelays("\nYou didn't type a valid choice. Try again loser!\n", TimeUnit.MILLISECONDS, 60);
            }

            }

        }



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

    public static int difficultySelect() throws Exception {
        Scanner in = new Scanner(System.in);
        boolean loopRun = true;
        int difficulty = 0;
        while (loopRun) {
            printWithDelays("", TimeUnit.MILLISECONDS, 100);
            printWithDelays("\nMr. Chicken, pick your level...\n\n", TimeUnit.MILLISECONDS, 60);
            printWithDelays("1: Boring mode...made for chickens\n2: Chicken warrior...recommended for most vampire chicken slayers\n3: Chicken roast...you'll be chicken dinner\n\n", TimeUnit.MILLISECONDS, 20);
            difficulty = in.nextInt();
            if ((difficulty > 3 || difficulty < 1)) {
                printWithDelays("\nThat's not a difficulty level!\n", TimeUnit.MILLISECONDS, 60);
            } else {
                loopRun = false;
            }


        }
        if(difficulty == 3)
        {
            printWithDelays("\nYou picked: Chicken roast! GET ROASTED Mr. Chicken!\nYou have 50 health and Chickula has 75 health\n\n", TimeUnit.MILLISECONDS, 60); //Message for difficulty level 3
        }
        else if(difficulty == 2)
        {
            printWithDelays("\nYou picked: Chicken warrior! You got this!\nYou have 50 health and Chickula has 50!\n\n", TimeUnit.MILLISECONDS, 60); //Message for difficulty level 2
        }
        else
        {
            printWithDelays("\nYou picked: Boring mode! You're such a chicken for picking this mode!\nYou have 75 health and Chickula has 40 health!\n\n", TimeUnit.MILLISECONDS, 60); //Message for difficulty level 1
        }
        return difficulty;
    }

    public static int mrChickenHealth(int difficulty) throws Exception{
        int health;
        if(difficulty == 3 || difficulty == 2)
        {
            health = 50;
        }
        else
        {
            health = 75;
        }
        return health;
    }

    public static int chickulaHealth(int difficulty) throws Exception{
        int health;
        if(difficulty == 3) //Chicken roast
        {
            health = 75;
        }
        else if(difficulty == 2) //Chicken warrior
        {
            health = 50;
        }
        else //Boring mode
        {
            health = 40;
        }
        return health;
    }

    public static int gameplay(int mrChickenHP, int chickulaHP) throws Exception
    {

        Scanner in = new Scanner(System.in);
        boolean loop = true;
        while(loop) {
            int choice;
            int chickulaChoice;
            int probablilityForMrChicken = (int) (1 + Math.random() * 100); //RNG to decide if Mr Chicken's move will work
            int probablilityForChickula =  (int) (1 + Math.random() * 100); //RNG to decide if Chickula's move will work
            do {
                printWithDelays("Pick your move, Mr. Chicken!\n\n", TimeUnit.MILLISECONDS, 60);
                printWithDelays("1: Relic of beaks   (Deals 5 damage)\n2: Holy feed        (Deals 7 damage)\n3: Form of feathers (Deals 9 damage)\n\n", TimeUnit.MILLISECONDS, 20);
                choice = in.nextInt(); //Mr. Chicken picks move

                if (choice > 3 || choice < 1)
                {
                    printWithDelays("\nInvalid choice! Try again!\n\n", TimeUnit.MILLISECONDS, 60);
                }
                else if (choice == 3) //Mr chicken loses 9 HP if attack succeeds
                {

                    if(probablilityForMrChicken <= 50) // 50% chance Form of feathers will work
                    {
                        chickulaHP = chickulaHP - 9; //Mr. Chicken loses 9 HP
                        printWithDelays("\nYou picked Form of feathers. Chickula got tarred and feathered\n", TimeUnit.MILLISECONDS, 60);
                    }
                    else
                    {
                        printWithDelays("\nYou picked Form of feathers. But nothing happened!\n", TimeUnit.MILLISECONDS, 60);
                    }

                }
                else if (choice == 2) //Mr. Chicken loses 7 HP if attack succeeds
                {

                    if(probablilityForMrChicken <= 80) // 80% chance Holy feed will work
                    {
                        chickulaHP = chickulaHP - 7;
                        printWithDelays("\nYou used Holy feed. It's super effective!\n", TimeUnit.MILLISECONDS, 60);
                    }
                    else
                    {
                        printWithDelays("\nYou used Holy feed. Too bad! Chickula evaded Holy feed!\n", TimeUnit.MILLISECONDS, 60);
                    }

                }
                else //Mr. Chicken loses 5 HP if attack succeeds
                {
                    if(probablilityForMrChicken <= 95) // 95% chance Relic of beaks will work
                    {
                        chickulaHP = chickulaHP - 5;
                        printWithDelays("\nYou used Relic of beaks! Chickula gets pecked to death!\n", TimeUnit.MILLISECONDS, 60);
                    }
                    else
                    {
                        printWithDelays("\nYou used Relic of beaks! Unfortunately, Chickula evaded Relic of beaks!\n", TimeUnit.MILLISECONDS, 60);
                    }

                }

            } while (choice > 3 || choice < 1);

            //Sets health to zero in case that numbers become less than or equal to 0
            if (mrChickenHP <= 0) {
                mrChickenHP = 0;
            }
            if (chickulaHP <= 0) {
                chickulaHP = 0;
            }

            // prints game status
            printWithDelays("\nCurrent Stats: Mr. Chicken's HP: ", TimeUnit.MILLISECONDS, 60);
            System.out.print(mrChickenHP);
            printWithDelays(", Chickula's HP: ", TimeUnit.MILLISECONDS, 60);
            System.out.println(chickulaHP);

            if (chickulaHP <= 0) {
                printWithDelays("\nYou have defeated Chickula and saved the coop from his terror!\n", TimeUnit.MILLISECONDS, 60);
                break;
            }

            //Chickula has three moves: 1. Egg blaster (5 HP), 2. Burning feed (7 HP), 3. Lightning! (9 HP)

            //Chickula AI
            chickulaChoice = (int) (1 + Math.random() * 3);
            //Chickula's Moveset
            if (chickulaChoice == 3)
            {

                if(probablilityForChickula <= 30) // 30% chance Chickula's lightning will work
                {
                    printWithDelays("\nChickula used lightning! It's shockingly powerful!\n", TimeUnit.MILLISECONDS, 60);
                    mrChickenHP = mrChickenHP - 9;
                }
                else
                {
                    printWithDelays("\nChickula used lightning! It missed, what a shocker!\n", TimeUnit.MILLISECONDS, 60);
                }




            }
            else if (chickulaChoice == 2)
            {
                if(probablilityForChickula <= 75) //75% chance that Chickula's burning feed will work
                {
                    printWithDelays("\nChickula threw burning feed! It scorched your tail feathers!\n", TimeUnit.MILLISECONDS, 60);
                    mrChickenHP = mrChickenHP - 7;
                }
                else
                {
                    printWithDelays("\nChickula threw burning feed! It missed, Chickula burns with anger!\n", TimeUnit.MILLISECONDS, 60);
                }



            }
            else
            {

                if(probablilityForChickula <= 90) // 90% chance that Chickula's egg blaster will work
                {
                    printWithDelays("\nChickula fired his egg blaster! You're all sticky now!\n", TimeUnit.MILLISECONDS, 60);
                    mrChickenHP = mrChickenHP - 5;
                }
                else
                {
                    printWithDelays("\nChickula fired his egg blaster and somehow missed! Pathetic.\n", TimeUnit.MILLISECONDS, 60);
                }

            }

            //Sets health to zero if mrChicken or chickula have less than or equal to zero health
            if (mrChickenHP <= 0) {
                mrChickenHP = 0;
            }
            if (chickulaHP <= 0) {
                chickulaHP = 0;
            }

            //Prints game status
            printWithDelays("\nCurrent Stats: Mr. Chicken's HP: ", TimeUnit.MILLISECONDS, 60);
            System.out.print(mrChickenHP);
            printWithDelays(", Chickula's HP: ", TimeUnit.MILLISECONDS, 60);
            System.out.println(chickulaHP+"\n");

            if (mrChickenHP <= 0) {
                printWithDelays("\nChickula has defeated you and will continue to rule the coop and terrorize the chickens!\nYou have failed as a hero.\nGame Over\n", TimeUnit.MILLISECONDS, 60);
                break;
            }

        }





        return 0;
    }

}
