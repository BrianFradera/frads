package CodeQuest;

import java.util.Scanner;

public class batterUp {
    private static String name;
    private static int strike;
    private static int single;
    private static int doub;
    private static int triple;
    private static int homerun;
    private static int walk;
    private static double slugpercent;

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            int testcases = Integer.parseInt(scan.nextLine());

            for (int t = 0;  t <testcases; t++){
                String s = scan.nextLine();
                String [] arr = s.split(":");
                name = arr[0];
                String [] arr2 = arr[1].split(",");
                strike = 
                System.out.println(name+"="+slugpercent);
            }
        }

    }


    public double slugger(String n, int k, int s, int d, int t, int hr){
        n = name;
        k= strike;
        s = single;
        d = doub;
        t = triple;
        hr = homerun;
        int total = k+s+d+t+hr;
        if(total == 0){
            return 0;
        }
        double slugper = (((double) Math.round((s+(2*d)+(3*t)+(4*hr))/total))*1000)/1000;
        return slugper;

    }

    
}
