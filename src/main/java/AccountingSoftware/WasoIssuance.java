/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import static AccountingSoftware.FrameforPanel.MonthSelected;
import static AccountingSoftware.FrameforPanel.SharesIssuedInput;
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
public class WasoIssuance {
    public WasoIssuance(boolean Was, boolean BeginningWaso, boolean Educational, String Month){
        //  System.out.println("The Value At 1,2 is:" + FrameforPanel.WASOTable.getValueAt(1, 2));
       TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(FrameforPanel.WASOTable.getModel());
FrameforPanel.WASOTable.setRowSorter(sorter);
ArrayList <RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>(25);
sortKeys.add(new RowSorter.SortKey(4, SortOrder.DESCENDING));
//sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
sorter.setSortKeys(sortKeys);
 // System.out.println("The Value At 1,2 is:" + FrameforPanel.WASOTable.getValueAt(1, 2));
        float Begin = 0;
         float Fraction = 0;
         float Divide = 12;
         float Final = 0;
         float BeginStockOS = 0;
        String BeginStockOSString = "";
      
               String str = "";
               String MonthSelect = "";
         float WeightedCalc;
         String SharesOutstandingString;
         float SharesOutstanding = 0;
         if (Educational == false){
         MonthSelect = MonthSelected.getSelectedItem().toString();
         }else if (Educational == true){
             MonthSelect = Month;
         }
          try {
           SharesOutstandingString = FrameforPanel.SharesIssuedInput.getText();
            SharesOutstanding = Float.parseFloat(SharesOutstandingString);
       }catch (NumberFormatException e){
          
       }
         
 switch (MonthSelect){
     case "January": 
         Fraction = 12;
        // Divide = 12;
         Final = (float) Fraction/Divide;
        //str = String.format("%2.02f", Final);
         break;
          
          case "February": 
         Fraction = 11;
         Final = (float) Fraction/Divide;
         break;
          case "March": 
         Fraction = 10;
        Final = (float) Fraction/Divide;
         
         break;
          case "April": 
         Fraction = 9;
          Final = (float) Fraction/Divide;
         break;
          case "May": 
         Fraction = 8;
          Final = Fraction/Divide;
         break;
          case "June": 
         Fraction = 7;
          Final = (float) Fraction/Divide;
         break;
          case "July": 
         Fraction = 6;
          Final = (float) Fraction/Divide;
         break;
          case "August": 
         Fraction = 5;
          Final = (float) Fraction/Divide;
         break;
          case "September": 
         Fraction = 4;
          Final = (float) Fraction/Divide;
         break;
          case "October": 
         Fraction = 3;
          Final = (float) Fraction/Divide;
         break;
          case "November": 
         Fraction = 2;
          Final = (float) Fraction/Divide;
         break;
          case "December": 
         Fraction = 1;
          Final = (float) Fraction/Divide;
         break;
          default:
          
              break;
 }    
 
 try {
            BeginStockOSString = FrameforPanel.BeginSharesInput.getText();
            BeginStockOS = Float.parseFloat(BeginStockOSString);
        }catch(NumberFormatException e){
            
        }
if (BeginningWaso == true){
    DefaultTableModel Waso = (DefaultTableModel) FrameforPanel.WASOTable.getModel();
        
      Waso.addRow (new Object[]{"January",BeginStockOS, 1, 1,1 , 0});
      
} 
  if (Was == true && BeginningWaso == false){
        // WeightedCalc = Float.parseFloat(SharesIssuedInput.getText().toString())*WASOTable.getValueAt() * Fraction;
        DefaultTableModel Waso = (DefaultTableModel) FrameforPanel.WASOTable.getModel();
        
      Waso.addRow (new Object[]{MonthSelect,SharesOutstanding, 1, 1, Final, 0});
      
    } else if (Was == false && BeginningWaso== false){
        DefaultTableModel Waso = (DefaultTableModel) FrameforPanel.WASOTable.getModel();
      Waso.addRow (new Object[]{MonthSelect,SharesOutstanding * -1,1, 1, Final, 0});
        
              
 }     
        // WeightedCalc = Float.parseFloat(SharesIssuedInput.getText().toString())*WASOTable.getValueAt() * Fraction;
     
      
    }
    }

