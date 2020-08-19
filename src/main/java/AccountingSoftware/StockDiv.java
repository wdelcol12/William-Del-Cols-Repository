/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import java.util.ArrayList;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author wdelc
 */
public class StockDiv {
    public StockDiv(boolean Stockdiv,boolean Educational ,int Month){
        float StockDivfl = 0; 
        String StockDivString = "";
          DefaultTableModel Waso = (DefaultTableModel) FrameforPanel.WASOTable.getModel();
        float StockSplitfl = 0;
        String StockSplitString = "";
        int MonthValue =0;
          String [] Months = {"February", "March", "April","May","June", "July", "August", "September", "October", "November", "December"};
          
          
          
        try {
            StockDivString = FrameforPanel.StockDividendInput.getText();
            StockDivfl = Float.parseFloat(StockDivString);
        }catch(NumberFormatException e){
            
        }
        try {
            StockSplitString = FrameforPanel.StockSplitInput.getText();
            StockSplitfl = Float.parseFloat(StockSplitString);
        }catch(NumberFormatException e){
            
        }
        StockDivfl = 1+(StockDivfl/100);
        if (Stockdiv == true){
           
           for (int i = 0; i < Waso.getRowCount(); i ++){
                 switch (Waso.getValueAt(i,0).toString()){
                  case "January":
                     MonthValue = 1;
                     break;
                   case "February":
                     MonthValue = 2;
                     break;
                     case "March":
                     MonthValue = 3;
                     break;
                     case "April":
                     MonthValue = 4;
                     break;
                     case "May":
                     MonthValue = 5;
                     break;
                     case "June":
                     MonthValue = 6;
                     break;
                     case "July":
                     MonthValue = 7;
                     break;
                     case "August":
                     MonthValue = 8;
                     break;
                     case "September":
                     MonthValue = 9;
                     break;
                     case "October":
                     MonthValue = 10;
                     break;
                     case "November":
                     MonthValue = 11;
                     break;
                     case "December":
                       MonthValue =12;
                       break;
                 }
            if (MonthValue <= Month && Educational == true){
               Waso.setValueAt(StockDivfl, i, 2);
            }else {
               //  Waso.setValueAt(StockDivfl, i, 2);
            }
           }
        }else if (Stockdiv == false){
         
            for(int i = 0; i < Waso.getRowCount(); i ++){
                   switch (Waso.getValueAt(i,0).toString()){
                  case "January":
                     MonthValue = 1;
                     break;
                   case "February":
                     MonthValue = 2;
                     break;
                     case "March":
                     MonthValue = 3;
                     break;
                     case "April":
                     MonthValue = 4;
                     break;
                     case "May":
                     MonthValue = 5;
                     break;
                     case "June":
                     MonthValue = 6;
                     break;
                     case "July":
                     MonthValue = 7;
                     break;
                     case "August":
                     MonthValue = 8;
                     break;
                     case "September":
                     MonthValue = 9;
                     break;
                     case "October":
                     MonthValue = 10;
                     break;
                     case "November":
                     MonthValue = 11;
                     break;
                     case "December":
                       MonthValue =12;
                       break;
                 }
            if (MonthValue <= Month && Educational == true){
               Waso.setValueAt(StockSplitfl, i, 3);
            }else {
               //  Waso.setValueAt(StockDivfl, i, 2);
            }
            //Waso.setValueAt(StockSplitfl, i, 3);
            // System.out.println("After Value At i,4 is:" + Waso.getValueAt(i, 4));
            }
        }
        
        
    }
}
