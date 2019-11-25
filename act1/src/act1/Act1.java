/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1;

/**
 *
 * @author it11613
 */
public class Act1 {

    public static void main(String[] args)
    {
        for(int i=4; i >= 1; --i)
        {
            for(int j = 1; j <= i; ++j)
            {
            System.out.print("* ");
            }
            System.out.println();
        }
         for(int x = 1; x <= 4; ++x)
         {
            for(int y = 1; y <= x; ++y)
            {
                System.out.print("** ");
            }
            System.out.println();
            }
    }    



