/*
 *  CopyLeft 2023 Niraj
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabeans;
// Show properties and events.
import java.awt.*;
import java.beans.*;
/**
 *
 * @author niraj
 */
public class IntrospectorDemo {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("Colors");
            BeanInfo beanInfo = Introspector.getBeanInfo(c);
            System.out.println("Properties:");
            PropertyDescriptor[] propertyDescriptor
                    = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < propertyDescriptor.length; i++) {
                System.out.println("\t" + propertyDescriptor[i].getName());
            }
            System.out.println("Events:");
            EventSetDescriptor[] eventSetDescriptor
                    = beanInfo.getEventSetDescriptors();
            for (int i = 0; i < eventSetDescriptor.length; i++) {
                System.out.println("\t" + eventSetDescriptor[i].getName());
            }
        } catch (Exception e) {
            System.out.println("Exception caught. " + e);
        }
    }
}
