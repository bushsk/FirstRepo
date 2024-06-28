import java.util.Scanner;

class Priyanka {
    public static void main(String[] args) {
        System.out.println("Enter the number to find Factorial:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        int i;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("fact = "+fact);
    }
}