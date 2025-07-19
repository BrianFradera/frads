package CodeQuest;
import java.util.Scanner;
public class MirrorMirror {
    private static String mirror;

    public static String mirrormirror(String s){
        mirror = s;
        String result = "";
        for(int i = s.length()-1; i>=0; i--){
            if(i==s.length()-1){
            result+=s.substring(i);
        }
        else{
            result+=s.substring(i,i+1);
        }
        }
        return result;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int testcases = Integer.parseInt(scan.nextLine());
            
            for(int i = 0; i<testcases; i++){
                mirror = scan.nextLine();
                System.out.println(mirrormirror(mirror));
            }
        }
    }

    
}
