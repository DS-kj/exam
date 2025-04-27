import java.util.Scanner;
public class codeing1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
if (i*i==n){
    System.out.println("Perfect Square");
}
else{
    System.out.println("not");
}
        }
        sc.close();
    }
}
