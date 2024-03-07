
package com.mycompany.mavenproject6;

import java.util.Arrays;
import java.util.Scanner;



public class Mavenproject6 {
    
    

    public static void main(String[] args) {
        
       int total = 0;
        int c[] = new int[10];
        for (int i = 0; i<c.length; i++) {
	c[i] = i + i;
        }
            for (int i = 0; i<c.length; i++) {
                    total += c[i];
            }
        System.out.println(total);
       
    }
}
