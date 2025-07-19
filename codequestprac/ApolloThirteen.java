package CodeQuest;
import java.util.Scanner;
public class ApolloThirteen {
    private static double x;
    private static double y;
    private static double z;

    public static double calculate(double angle){

        double newang = (Math.round(angle-180)*100.00)/100.00;
        
        if(angle<180){

            newang = (Math.round((360-(180-angle))*100.00)/100.00);
        }
        
        
        return newang;
    }



    public static void main(String[] args){

        try(Scanner scan = new Scanner(System.in)){
            int testCases = Integer.parseInt(scan.nextLine());

            for (int t = 0; t < testCases; t++){
                String line = scan.nextLine();
                String[] arr = line.split(" ");
                x = Double.parseDouble(arr[0]);
                y = Double.parseDouble(arr[1]);
                z = Double.parseDouble(arr[2]);
                System.out.println(calculate(x) + " " + calculate(y) + " " + calculate(z));
            }
        }
    }
    
}
