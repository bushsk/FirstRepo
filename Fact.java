import java.util.*;
class Fact {
    public static void main(String[] args) {
        int i, ans = 1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if(a < 0){
            System.out.println("Invalid input");
        }
        else if (a == 0) {
            System.out.println("The factorial is 1.");
        }
        else{
           for(i = 1; i <= a; ++i)
        {
            ans = ans * i;
        }
        System.out.println("The factorial is " + ans);
        }
    }
}
