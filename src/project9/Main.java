package project9;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int num;
        Stack<Integer> stack1= new Stack<>();
        Stack<Integer> stack2= new Stack<>();
        Stack<Integer> stack3= new Stack<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of disks: "); //Maximum number of disk is 12 due to stackoverflow on 13
        num = scan.nextInt();

        for (int i=0; i<num; i++){
            stack1.push(num-i);
        }

        long startTime = System.currentTimeMillis();

        tower towerOf = new tower();
        towerOf.hanoi(num, stack1, stack2, stack3);

        long endTime = System.currentTimeMillis();
        System.out.println("\nExecution time: " + ((float)(endTime-startTime)/1000) + " seconds");

    }
}
