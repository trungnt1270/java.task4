package bt.task3;

import java.util.Scanner;

public class lab0301 {
    public static void main(String[] args){
        int mathsA, scienceA, englishA, mathsB, scienceB, englishB;
        int percenA, percenB, totalA, totalB;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter marks obtained in Maths: ");
        mathsA = in.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        scienceA = in.nextInt();
        System.out.println("Enter marks obtained in English: ");
        englishA = in.nextInt();
        totalA = mathsA + scienceA + englishA;
        percenA = ( mathsA + scienceA + englishA )/3;
        System.out.println("");

        System.out.println("Enter marks obtained in Maths: ");
        mathsB = in.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        scienceB = in.nextInt();
        System.out.println("Enter marks obtained in English: ");
        englishB = in.nextInt();
        totalB = mathsB + scienceB + englishB;
        percenB = ( mathsB + scienceB + englishB )/3;


        System.out.println("Marks of A:");
        System.out.println("Maths = " + mathsA);
        System.out.println("Science = " + scienceA);
        System.out.println("English = " + englishA);
        System.out.println("");
        System.out.println("Marks of B:");
        System.out.println("Maths = " + mathsB);
        System.out.println("Science = " + scienceB);
        System.out.println("English = " + englishB);
        System.out.println("");
        System.out.println("Total marks scored by A = " +totalA);
        System.out.println("Percentage = " + percenA + "%");
        System.out.println("");
        System.out.println("Total marks scored by B = " +totalB);
        System.out.println("Percentage = " + percenB + "%");
        System.out.println("");
        System.out.println("Is A's percentage lesser than B's?" + (percenA < percenB ? "Yes" : "No"));
        System.out.println("Is A's percentage greater than B's?" + (percenA > percenB ? "Yes" : "No"));
        System.out.println("A's and B's percentage are equal?" + (percenA == percenB ? "Yes" : "No"));
        System.out.println("");

        System.out.println("Scholarship Amount for A = " + ( percenA >= 75 ? "$2000" : ( percenA >= 60 && percenA < 75 ) ? "$1000" : "$0"));
        System.out.println("Scholarship Amount for B = " + ( percenB >= 75 ? "$2000" : ( percenB >= 60 && percenB < 75 ) ? "$1000" : "$0"));

    }
}
