package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i=0;i<t;i++){
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int op = B + (2*C);


            if (A >= op){
                System.out.println("YES");
            }else {
                System.out.println("No");
            }

        }
    }
}
