package Patterns;
import java.util.*;
public class First{
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int j = sc.nextInt();
        int temp = n ;
        int res = 0;
        int res_f = 1;
        if( n < 0){
            System.out.println("-1");
        }
       else{
        while(temp > 0){
         res = temp % 10;
         temp  = temp /10;
        res_f = res_f * res;
        }
        System.out.println(res_f);
    }     
        }
}
