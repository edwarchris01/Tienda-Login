
package Modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class GestionCelda extends DefaultTableCellRenderer {
    
    
     public Component getTableCellRenderer(JTable table, Object value,boolean isSelected,
             boolean hasFocus, int row, int colum){
         Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, colum);
         c.setForeground(Color.red);
         // c.setForeground(new java.awt.color(0,0,0,0);
         c.setFont(new java.awt.Font( "verdana",0,12));
         return null;
     }
}
