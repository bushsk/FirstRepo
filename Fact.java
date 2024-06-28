import java.util.*;
class Fact {
    public static void main(String[] args) {
        int i, fact = 1, a; 
	System.out.println("Enter a number: ");   
        a = Integer.parseInt(args[0]);
	System.out.println(a);
        if(a < 0){
            System.out.println("Invalid input");
        }
        else if (a == 0) {
            System.out.println("The factorial is 1.");
        }
        else{
           for(i = 1; i <= a; ++i)
        {
            fact = fact * i;
        }
        System.out.println("The factorial is " + fact);
        }
    }
}
