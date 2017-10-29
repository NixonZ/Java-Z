/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    int x,y;
    Calculator(int a,int b){
        x=a;
        y=b;
    }
    float add(){
        return (float)(x+y);
    }
    float sub(){
        return (float)(x-y);
    }
    float divide(){
        return (float)(x/y);
    }
    float multiply(){
        return (float)(x*y);
    }
    float power(){
        float value=1;
        for(int i=0;i<y;i++){
            value*=x;
        }
        return value;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter two no.\n");
        int X,Y,temp;
        Scanner scan=new Scanner(System.in);
        X=scan.nextInt();
        Y=scan.nextInt();
        Calculator A=new Calculator(X,Y);
        float result=0;
        do{
            System.out.println("1-Add\n2-Subtract\n3-Multiply\n4-Divide\n5-Power\n0-Exit\n");
            temp=scan.nextInt();
            switch(temp){
                case (int)(1): result=A.add();
                case (int)(2): result=A.sub();
                case (int)(3): result=A.multiply();
                case (int)(4): result=A.divide();
                case (int)(5): result=A.power();
                default: System.out.println("Wrong choice\n");
            }
            System.out.println("The result is=" + result);
            
        }while(temp!=0);
    }
    
}
