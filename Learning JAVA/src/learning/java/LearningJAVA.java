/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.java;
import java.util.Scanner;
/**
 *
 * @author NixonZ
 */

public class LearningJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the upper limit\n");
        temp=scan.nextInt();
        armstrong.print(temp);
    }
    
}
