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
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
       return color; 
    }
    
    public void setColor(String color){
        color = this.getColor();
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
       filled = this.isFilled(); 
    }
    
    public String toString(){
        String status;
        if(isFilled()==true){
            status = "filled";
        }else{
            status = "not filled";
        }
        return "A Shape with color of " +this.getColor()+ " and " +status+".";
    }
}
