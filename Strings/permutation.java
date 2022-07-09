package Strings;
import java.util.*;
public class permutation {

     void permute(String s  ,  int start ,  int end)
     {
     if(start == end ){
         System.out.println(s);
     }else{
         for(int i = 0 ;  i < s.length() ; i++)
         {
         s = Swap(s,start,i);
         permute(s, start+1, end);
         s = Swap(s, start, i);
         }
     }
    }
     public String Swap(String str , int m , int n )
{
   char temp;
  char[] arr = str.toCharArray();
  temp = arr[m];
  arr[m] = arr[n];
  arr[n] = temp;
  return String.valueOf(arr);
     }
  
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String str = sc.nextLine();
    int n = str.length();
    permutation permutation = new permutation();
    permutation.permute(str, 0, n-1);
    
    }
}
