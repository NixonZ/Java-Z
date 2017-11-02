/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.java;

/**
 *
 * @author PC
 */
public class armstrong {
    static void print(int a){
        int temp,no,digit;
        for(int i=0;i<a;i++){
            no=i;
            temp=0;
            while(no!=0){
                digit=no%10;
                no/=10;
                temp=temp*10+digit;
            }
            if(temp==i)
                System.out.println(i+'\n');
        }
    }
    
}
