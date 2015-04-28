/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

public class multiples {
    
    public void mp(){
        int number=0;
        for (int i=1; i<1000; i++){
            if (i%3==0 || i%5==0){
                number = number + i;
            }
        }
        System.out.println(number);
    }
    
    public static void main(String[] args){
        multiples main = new multiples();
        main.mp();
    }
}
