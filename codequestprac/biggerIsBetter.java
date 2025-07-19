package CodeQuest;
import java.util.Scanner;
public class biggerIsBetter {

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int testcases = Integer.parseInt(scan.nextLine());

            for(int t = 0; t < testcases; t++){
                String s = scan.nextLine();
                String[] arr = s.split(" ");
                int maxIndex = Integer.MIN_VALUE;
                for(String a : arr ){
                    int x = Integer.parseInt(a);
                    if(x>maxIndex){
                        maxIndex = x;
                    }
                }
                System.out.println(maxIndex);
            }
        }
    }


    
}
