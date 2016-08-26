/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbrersgame;

import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class NUMBRERSGAME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random random = new Random();
        int x = random.nextInt(10) + 1;

        Scanner sn = new Scanner(System.in);

//         a = sn.nextInt();
        int a;

/*        System.out.println("Я загадала число от 1 до 10. Попробуй угадать =) Вводи число");
        
        //for (int i = 1; i < 4; i++) {
        int i=1;
        while (true) {            
            
                    System.out.println("Попытка номер: "+i++);
         a = sn.nextInt();   
        
        if (a == x) {
            System.out.println("Ты угадал!");
            break;

        } else {
            System.out.println("Не угадала, было загадано:"+x
            );
          
        }
        }
       */


        // теперь наоборот
        System.out.println("Загадайте число от 1 до 100.");
        int min=1;
        int max=100;
        int y;
       

        while (true) {            
            
        y=round((max+min)/2);
            
        System.out.println("Это число >, < или ="+y+"? ");
        String str= sn.nextLine();       
        if (str.contains("<")) {
            max=y-1;
                        
        } else {
        if (str.contains(">")){
            min=y+1;
        }
        else {System.out.println("Я угадал");
        break;}       
        }      
            
        }
    }
    }


