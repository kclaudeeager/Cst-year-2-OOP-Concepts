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
public class Trapezium extends Quadrilateral implements Polygone{
    
    public Trapezium()
    {
      super();
       //System.out.println("This is Child class");
    }
   private int n=4;
    @Override
    public String getName() 
    {
      return "Trapezium";         
    }

    @Override
    public int getNumberOfSides() {
       return n;
    }

    @Override
    public int totalIntAngleSum() {
        int totalangle=(n-2)*180;
        return totalangle;
    }
    public static void main(String[] args)
    {
        Trapezium trapez=new Trapezium();
         float a = 0;
        float b = 0;
        float h = 0;
        Scanner input =new Scanner(System.in);
        
        System.out.println("Enter the small base, long base,and height");
            a =input.nextFloat();
         b=input.nextFloat();
           h =input.nextFloat();
           float Area= trapez.GetArea(a, b, h);
            System.out.println("Your "+trapez.getName()+" area is "+Area);
            System.out.println("The number of sides of your "+trapez.getName()+"is: "+
                    trapez.getNumberOfSides());
            System.out.println("With the total angle of "+trapez.totalIntAngleSum());
            thankful_Mesage();
        
    }
    public static void thankful_Mesage()
    {
        System.out.println("Thank you!");
    }
    
}
