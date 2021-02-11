/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygone_interface;

/**
 *
 * @author Kwizera
 */
public class Quadrilateral {
    String Type="Quadrilateral";
    public Quadrilateral(String Type)
    {
        this.Type=Type;
        System.out.println("This is a "+Type);
    }
    public Quadrilateral()
    {
         System.out.println("Hello Student!");
    }
      public Quadrilateral(String User,String Type)
    {
         this.Type=Type;
         System.out.println("Hello "+User+"\nwith type "+Type);
    }
    public  float GetArea(float side)
    {
       return side*side; 
    }
    public float GetArea(float length,float width)
    {
        return length*width;
    }
    public float GetArea(float a,float b,float h)
    {
        return (a+b)*h/2;
    }
}
