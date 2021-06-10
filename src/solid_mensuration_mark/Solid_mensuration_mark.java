/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_mensuration_mark;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER-PC
 */
public class Solid_mensuration_mark {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int shape = Integer.parseInt(JOptionPane.showInputDialog("Find the volume of: \n"
            + "(1) sphere\n"
            + "(2) right circular cylinder\n"
            + "(3) right circular cone\n"));
    switch (shape){
        case 1:
            shape1 A =  new shape1();
            A.shape1_details();
        break;
        case 2:
            shape2 B =  new shape2();
            B.shape2_details();
        break;
        case 3:
            shape3 C =  new shape3();
            C.shape3_details();
        break;
    }
    }
    
}
    