import java.util.Random;
import java.util.Scanner;

public class ayeoo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("===== POKEMON TYPE BATTLE =====");
        System.out.println("0 = Fire 🔥");
        System.out.println("1 = Water 💧");
        System.out.println("2 = Grass 🌿");

        System.out.print("Enter your choice: ");
        int user = sc.nextInt();

        int computer = ran.nextInt(3);

        String[] type = {"Fire 🔥", "Water 💧", "Grass 🌿"};

        System.out.println("You chose: " + type[user]);
        System.out.println("Computer chose: " + type[computer]);

        if (user == computer) {
            System.out.println(" Draw!");
        }
        else if ((user == 0 && computer == 2) ||   // Fire beats Grass
                (user == 1 && computer == 0) ||   // Water beats Fire
                (user == 2 && computer == 1)) {   // Grass beats Water
            System.out.println("You Win!");
        }
        else {
            System.out.println(" You Lost!");
        }

        sc.close();
    }
}