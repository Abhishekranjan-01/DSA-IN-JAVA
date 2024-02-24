// Perimeter Of Rectangle
import java.util.Scanner;;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length:\t");
        float length = in.nextFloat(); 
        
        System.out.println("Enter Width:\t");
        float width = in.nextFloat();

        System.out.println("Perimeter Of Rectangle:\t"+2*(length+width));

    }
}
