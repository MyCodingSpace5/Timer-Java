
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int i = 1;
        int v = 2000; //Set timer here in seconds
        while(v > i){
            v-=i;
            System.out.println(v);
        }
        if(v == i){
            System.out.println("Timer done!");
        }
    }
}
