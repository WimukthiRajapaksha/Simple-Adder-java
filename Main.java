package git_project;

import java.util.Scanner;
/**
 *
 * @author Wimukthi Rajapaksha
 */
public class Git_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        String operation;
        int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welocme to my calculator");
        System.out.println("Enter first number: ");
        a = scanner.nextInt();
        System.out.println("Enter second number: ");
        b = scanner.nextInt();
        System.out.println("Enter operation: ");
        operation = scanner.next();
        if("+".equals(operation)){
            answer = add(a,b);
            System.out.println("Answer is: "+answer);
            
        }
        else{
            System.out.println("Unsupported operation");
        }
    }
    
    private static int add(int a, int b){
        return a+b;
    }
    
}
