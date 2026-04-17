import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class WaterFour {
public static void main(String[] args) throws IOException {
BufferedReader reader = new BufferedReader(new
InputStreamReader(System.in));
System.out.print("Enter a sentence: ");
String sentence = reader.readLine();
// Manual parsing for other data types
System.out.print("Enter your age: ");
String ageStr = reader.readLine();
int age = Integer.parseInt(ageStr); // Manual conversion
System.out.println("You entered: " + sentence);
System.out.println("Your age: " + age);
reader.close(); // Clean up resources
}
}