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
public class Rectangle extends Quadrilateral { 
    public Rectangle(String User,String Type)
    {
        super(User,Type);
    }
     
      public static void main(String[] args)
   {   
      
      String Type="Rectangle";
       
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the User name");
       String User=input.next();
       System.out.println("Enter the length and width of the rectangle");
       float length=input.nextFloat();
       float width=input.nextFloat();
      
       Quadrilateral Rect=new Rectangle(User,Type);
       float Area=Rect.GetArea(length,width);
       System.out.println("The area  is : "+Area);
       
       
   }
}
