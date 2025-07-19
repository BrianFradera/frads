package CodeQuest;
import java.util.Scanner;
public class DiscoverPlanets {
    private static double temp;
    private static boolean water;
    private static boolean magnet;
    private static double eccentricity;

    public static String habitable(double t, boolean w, boolean mag, double ec){
        temp = t;
        water = w;
        magnet = mag;
        eccentricity = ec;

        if(t>100){
            return "The planet is too hot.";
        }
        if(t<0){
            return "The planet is too cold.";
        }
        if (w==false){
            return "The planet has no water.";
        }
        if (mag==false){
            return "The planet has no magnetic field.";
        }
        if(ec>0.6){
            return "The planet's orbit is not ideal.";
        }
        else{
            return "The planet is habitable.";
        }

        
    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
        int testCases = Integer.parseInt(scan.nextLine());

        for(int t=0; t<testCases; t++){
            String s = scan.nextLine();
            String [] arr = s.split(" ");
            temp = Double.parseDouble(arr[0]);
            water = Boolean.parseBoolean(arr[1]);
            magnet = Boolean.parseBoolean(arr[2]);
            eccentricity = Double.parseDouble(arr[3]);
            System.out.println(habitable(temp,water,magnet,eccentricity));
        }
        }
    }
}
