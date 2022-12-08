
import java.util.*;
public class App {

    public static void main(String[] args){
    
String input = "GGGTGCTTTTGATATATATATATATACGACAACGATACTAACGCA"; 
char a = 'a';
char g = 'g';
char p = 'c';
char t = 't';
char x = 'A';
char y = 'T';
char z = 'G';
char[] arr = input.toCharArray();
int s = -1;


for ( char c : arr){
    s++;
    if ( c == x || c == a)  {
      System.out.print("U");
    }
    else if ( c == y || c == t)  {
      System.out.print("A");
    }
    else if ( c == z || c == g)   {
      System.out.print("C");
    }
    else if (c == p){
        System.out.print("G");
    }
    else {
      System.out.print("G");
    }
    if ( s%3 == 2 ){  
     System.out.print(" ");


    }



}




}
}