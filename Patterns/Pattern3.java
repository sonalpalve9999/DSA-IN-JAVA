package Patterns;
//print the star pattern ex n = 4
//      1
//    2  3
//  4  5  6
//7  8  9  10
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int number = 0;
        for(int i = 1 ;i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print("  ");
            }
            for(int k = 1 ; k <= i ; k++){
                System.out.print(number++ +"  ");
            }
            System.out.print("\n");
        }
    }
}
