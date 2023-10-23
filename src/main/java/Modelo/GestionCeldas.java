
package Modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class GestionCeldas extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value,boolean isSeleted,
            boolean hasFocus, int row, int colum){
        Component c = super.getTableCellRendererComponent(table, value, isSeleted, hasFocus, row, colum);
        c.setForeground(Color.red);
         // c.setForeground(new java.awt.color(0,0,0,0);
         c.setFont(new java.awt.Font( "verdana",0,12));
         
         if (value instanceof JButton){
             JButton btn = (JButton)value;
             btn.setBorderPainted(false);
             btn.setContentAreaFilled(false);
             return btn;
         }
         return c;
    }
}
