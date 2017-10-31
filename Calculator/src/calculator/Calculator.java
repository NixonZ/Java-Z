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
    byte x,y;
    Calculator(byte a,byte b){
        x=a;
        y=b;
    }
    byte add(){
        return (byte) (x+y);
    }
    byte sub(){
        return (byte) (x-y);
    }
    float divide(){
        return (x/y);
    }
    byte multiply(){
        return (byte) (x*y);
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
        byte X,Y;
        byte temp;
        Scanner scan=new Scanner(System.in);
        X=scan.nextByte();
        Y=scan.nextByte();
        Calculator A=new Calculator(X,Y);
        float  result=0;
        do{
            System.out.println("1-Add\n2-Subtract\n3-Multiply\n4-Divide\n5-Power\n0-Exit\n");
            temp=scan.nextByte();
            switch(temp){
                case 1: result=A.add(); break;
                case 2: result=A.sub(); break;
                case 3: result=A.multiply(); break;
                case 4: result=A.divide(); break;
                case 5: result=A.power(); break;
                default: System.out.println("Wrong choice\n"); break;
            }
            System.out.println("The result is=" + result);
            
        }while(temp!=0);
    }
    
}
