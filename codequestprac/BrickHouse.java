package CodeQuest;
import java.util.Scanner;
public class BrickHouse {
    private static int small;
    private static int med;
    private static int wall;

    public static boolean canBuild(int x, int y, int z){
    small = x;
    med = y;
    wall = z;

        if((x+(5*y))>=z){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int testcases = Integer.parseInt(scan.nextLine());

            for (int t = 0; t < testcases; t++){
                String s = scan.nextLine();
                String [] arr = s.split(" ");
                small = Integer.parseInt(arr[0]);
                med = Integer.parseInt(arr[1]);
                wall = Integer.parseInt(arr[2]);
                System.out.println(canBuild(small, med, wall));
            }
        }
    }
}
