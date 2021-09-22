import java.util.Scanner;
public class Dealership {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome the a Java Dealership !");
    System.out.println(" • Select option 'a' to Buy a Car");
    System.out.println(" • Select option 'b' to Sell a Car");
    String option = scan.nextLine();

    switch (option){
        case "a":
            System.out.println("What is your Budget?");
            int budget = scan.nextInt();
            if (budget >= 10000){
                System.out.println("Great! A Nissan Altima is Available");
                System.out.println("\nDo you have Insurance? Type 'yes' or 'no'");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\nDo you have a License? Type 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("\nWhat is your Credit Score?");
                int creditScore = scan.nextInt(); 
                if (insurance.equals("yes") && license.equals("yes") && creditScore >= 650){
                    System.out.println("\nSold, Pleasure doing Business with You!");}
                else{
                    System.out.println("You are not Eligible, Sorry");}}    
            else{
                System.out.println("We don't sell cars under $10,000. Sorry!");}    
            break;
        case "b": 
                System.out.println("\nWhat is your Car Valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your Selling Price?");
                int price = scan.nextInt();
                if (value > price && price < 30000){
                    System.out.println("\nWe will Buy your Car! Pleasure Doing Business!");}
                else{
                    System.out.println("\nWe are not Interested, We are Sorry");}    
                break;
        default: System.out.println("Invalid Option");
    }
    scan.close();
}    
}
