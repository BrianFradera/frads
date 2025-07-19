package CodeQuest;

import java.util.Scanner;

public class AnimalFarm {
    private static int turkey;
    private static int goat;
    private static int horse;

    public static int countAnimals(int t, int g, int h){
        turkey=t;
        goat=g;
        horse=h;
        return (2*t) + (4*g) + (4*h);
    }

    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = Integer.parseInt(scanner.nextLine());

            for (int t = 0; t < testCases; t++) {
                turkey = scanner.nextInt();
                goat = scanner.nextInt();
                horse = scanner.nextInt();

                System.out.println(countAnimals(turkey,goat,horse));
            }
        }
    }

    
}
