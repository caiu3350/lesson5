/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucky7;

import java.util.Scanner;

/**
 *
 * @author caiu3350
 */
public class lucky7s {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rolls = 0,num,money,high,highroll = 0;
        Dice d1,d2;
        d1 = new Dice(5);
        d2 = new Dice(5);
        
        System.out.print("How many dollars do you have -> ");
        money = s.nextInt();
        high=money;
        while(true){
            d1.roll();
            d2.roll();
            rolls++;
            num=d1.getNumber()+d2.getNumber();
            if(num==7){
                money+=4;
                if(money>=high){
                    high=money;
                    highroll=rolls;
                }
            }
            else{
                money--;
            }
            if(money<=0)break;
        }
        System.out.println("You are broke after "+rolls+" rolls");
        System.out.println("You should have quit after "+highroll+" when you had $"+high);
        
    }
    
}
