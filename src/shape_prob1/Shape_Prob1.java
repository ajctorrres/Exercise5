/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shape_prob1;

/**
 *
 * @author torresar_cis21035
 */
public class Shape_Prob1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Shape shape1 = new Shape("red", true);
       System.out.println(shape1.toString());
       Shape shape2 = new Shape();
       System.out.println(shape2.toString());
       
       Circle cir = new Circle();
       System.out.println(cir.toString());
       
       Circle cir1 = new Circle(5);
       System.out.println(cir1.toString());
       System.out.println(cir1.getArea());
       System.out.println(cir1.getPerimeter());
       
       Rectangle rec = new Rectangle();
       
    }
    
}
