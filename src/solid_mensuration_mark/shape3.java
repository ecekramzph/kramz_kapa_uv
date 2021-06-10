/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_mensuration_mark;

import javax.swing.JOptionPane;
public class shape3 {
    int radius;
    int length;
    String unit;
    public shape3 (){}
    public shape3(int r, int l){
        this.radius=r;
        this.length=l;
    };
    double total_surface_area(){
        double TSA=(radius+length)*Math.PI*radius;
        return TSA;
    }
    void shape3_details(){
        System.out.println("Chosen shape: right circular cone");
        System.out.println("Find the: total surface area");
        String unit1 = JOptionPane.showInputDialog("Enter units used:");
        JOptionPane.showMessageDialog(null, "Entered units is " + unit1);
        
        int A1=Integer.parseInt(JOptionPane.showInputDialog("Enter radius value"));
        JOptionPane.showMessageDialog(null, "Entered radius value is " + A1+" "+unit1);
        System.out.println("radius: "+A1+" "+unit1);
        
        int B1=Integer.parseInt(JOptionPane.showInputDialog("Enter length value"));
        JOptionPane.showMessageDialog(null, "Entered length value is " + B1+" "+unit1);
        System.out.println("length: "+B1+" "+unit1);
        
        System.out.println("Answer:");
                shape3 shape1 = new shape3 (A1,B1);
                shape1.unit = "sq." +unit1;
                shape1.total_surface_area();
                System.out.print("the total surface area is ");
                System.out.print(shape1.total_surface_area());
                System.out.print(" "+shape1.unit);
                JOptionPane.showMessageDialog(null, "the total surface area is " 
                        +shape1.total_surface_area()+" "+ shape1.unit);
    }
}