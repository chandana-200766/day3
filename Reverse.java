import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter str value:");
        String str=sc.nextLine();
        String reversed="";
        for (int i=str.length()-1;i>=0;i--)
        {
            reversed=reversed+str.charAt(i);
        }
        System.out.println("Reversed String:"+reversed);
    }
}