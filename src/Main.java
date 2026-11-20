import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        Expedition game = new Expedition();
        boolean running = true;

        while (running){
            System.out.println("RELİC EXPEDİTİON");
            System.out.println("1. New Game");
            System.out.println("2.Exit");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("New Game Starting");
            } else if (choice.equals ("2")){
                System.out.println("Exiting");
                break;
            } else{
                System.out.println("Invalid choice, please enter 1 or 2");

             }
            }
        scanner.close();
        }


    }

