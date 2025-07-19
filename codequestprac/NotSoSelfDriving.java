package CodeQuest;
import java.util.Scanner;
public class NotSoSelfDriving {
    private static double velocity;
    private static double distance;

    
    public static String collision(double x, double y){
        if(x!=0){
        if((y/x) <=1){
            return "SWERVE";
        }
        if((y/x) <=5 && (y/x)>1){
            return "BRAKE";
        }
        else   { 
        return "SAFE";
        }
    }
    else{
        return "SAFE";
    }
}

    public static void main(String[] args){

        try(Scanner scanner = new Scanner(System.in)){
            int testcases =  Integer.parseInt(scanner.nextLine());

            for(int t = 0; t< testcases; t++){
                String  s = scanner.nextLine();
                String [] arr = s.split(":");
                velocity = Double.parseDouble(arr[0]);
                distance = Double.parseDouble(arr[1]);
                System.out.println(collision(velocity, distance));
            }
        }
    }
}
