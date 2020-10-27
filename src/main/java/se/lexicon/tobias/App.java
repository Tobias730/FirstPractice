package se.lexicon.tobias;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //Name practice part and scanner stuff
        String firstName = "Tobias";
        String secondName = "Lund";
        System.out.println("Hi my name is " + firstName +" "+ secondName);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = scanner.nextLine().trim();
        System.out.println("Hi "+ name + " nice to meet ya");

        //Variables with decimal
        double num1 = 5.3;
        double num2 = 4.6;
        double result = num1 + num2;
        System.out.println(result);


        //Car practice part

        class Car {
            String carBrand;
            String regNumber;
            int maxSpeed;
            String ownerName;
            String carModel;

            public String getInformation() {
                return "Brand:"+ carBrand + " - Registration number:" + regNumber + " - Maximum speed:" + maxSpeed + " - Car owner:" + ownerName + " - Modell:" + carModel;
            }
        }

        Car tesla = new Car();

        tesla.carBrand = "Tesla";
        tesla.regNumber = "718 ARK";
        tesla.maxSpeed = 250;
        tesla.ownerName = "Tobias Lund";
        tesla.carModel = "Model S";

        System.out.println(tesla.getInformation());

        //If and else
        int score = 75;

        if(score >= 65) {
            System.out.println("Hurray you passed!");
        } else {
            System.out.println("Sorry you did not pass");
        }
    }
}
