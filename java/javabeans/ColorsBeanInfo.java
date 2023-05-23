/*
 *  CopyLeft 2023 Niraj
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabeans;

// A Bean information class.
import java.beans.*;
/**
 *
 * @author niraj
 */
public class ColorsBeanInfo extends SimpleBeanInfo {

    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
            PropertyDescriptor[] pd = {rectangular};
            return pd;
        } catch (Exception e) {
            System.out.println("Exception caught. " + e);
        }
        return null;
    }
}
