/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_mensuration_mark;

import javax.swing.JOptionPane;
public class shape1 {
    int radius;
    String unit;
    public shape1 (){}
    public shape1(int a){
        this.radius=a;
    };
    double total_surface_area(){
        double TSA=4*Math.PI*radius*radius;
        return TSA;
    }
    void shape1_details(){
        System.out.println("Chosen shape: sphere");
        System.out.println("Find the: total surface area");
        String unit1 = JOptionPane.showInputDialog("Enter units used:");
        JOptionPane.showMessageDialog(null, "Entered units is " + unit1);
        
        int A2=Integer.parseInt(JOptionPane.showInputDialog("Enter radius value"));
        JOptionPane.showMessageDialog(null, "Entered radius value is " + A2+" "+unit1);
        System.out.println("radius: "+A2+" "+unit1);
        
        System.out.println("Answer:");
                shape1 shape1 = new shape1 (A2);
                shape1.unit = "sq." +unit1;
                shape1.total_surface_area();
                System.out.print("the total surface area is ");
                System.out.print(shape1.total_surface_area());
                System.out.print(" "+shape1.unit);
                JOptionPane.showMessageDialog(null, "the total surface area is " 
                        +shape1.total_surface_area()+" "+ shape1.unit);
    }
}