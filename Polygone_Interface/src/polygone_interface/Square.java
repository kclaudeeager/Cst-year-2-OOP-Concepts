/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygone_interface;

import java.util.Scanner;


/**
 *
 * @author Kwizera
 */
public class Square extends Quadrilateral{
    Square(String Type)
    {
        super(Type);
    }
 
   public static void main(String[] args)
   {
      
   String Type="Square";
       
       float side;
     Square SQ= new Square(Type);
       System.out.println("Enter the side of the square");
       Scanner input=new Scanner(System.in);
       side=input.nextFloat();
        float Area=SQ.GetArea(side);
       System.out.println("The area is:");
       
       System.out.println(Area);
       
   
   }
    
}
