import java.util.*;
public class sum{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Ente the second number");
        b=sc.nextInt();
        sc.close();
        int result=a+b;
        System.out.println(result);
    }
}