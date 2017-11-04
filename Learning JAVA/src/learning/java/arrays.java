/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.java;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class arrays {
    int T;
    int[] A;
    public arrays(int length) {
        this.A = new int[length];
        T=length;
    }

    /**For inputting the array
     *
     */
    public void getarray(){
        Scanner scan=new Scanner(System.in);
        for(short i=0;i<T;i++){
            this.A[i]=scan.nextInt();
        }
    }

    /**For displaying the array
     *
     */
    public void arrayprint(){
        for(short i=0;i<T;i++){
            System.out.println("A["+i+"]:"+A[i]+'\n');
        }
    }
    
}
