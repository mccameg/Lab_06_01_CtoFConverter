import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
       double fahrenheitTemp = 0;
       double celsiusTemp = 0;
       String trash = "";

        Scanner in = new Scanner(System.in); // Creating the scanner and telling it to read from the console (keyboard)

        System.out.print("Enter the temperature in Celsius: "); // prompt to tell the user what to enter
        if(in.hasNextDouble()) // if the input is a valid number, then the code in the if block will run
        {
            celsiusTemp = in.nextDouble(); // if the input is a valid number, the input will be stored in celsiusTemp
            in.nextLine(); // clears the buffer
            fahrenheitTemp = celsiusTemp * 9/5 + 32; // if the input is valid, the input will be converted to fahrenheit with this formula. The converted value will be stored in the fahrenheitTemp variable
            System.out.println("The equivalent temperature in Fahrenheit is " + fahrenheitTemp + " degrees"); // if the input is valid, the converted temp in fahrenheit will display as an output
        }
        else // if the input is not a valid number, the code in the else block will run
        {
            trash = in.nextLine(); // if the input is invalid, it will be stored in the trash variable
            System.out.println("Must enter a valid number for Celsius temperature: " + trash); // if the input is invalid, the output will tell the user that they must input a valid number and will echo their invalid response back
        }

    }
}
