/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import static AccountingSoftware.FrameforPanel.AmountofShares;
import static AccountingSoftware.FrameforPanel.CreateTAccountRowCash;
import static AccountingSoftware.FrameforPanel.CreateTAccountRowPaidinCapital;
import static AccountingSoftware.FrameforPanel.CreateTAccountRowTStock;
import static AccountingSoftware.FrameforPanel.JETableTStocks;
import static AccountingSoftware.FrameforPanel.NumberofTStockCredit;
import static AccountingSoftware.FrameforPanel.NumberofTStockDebit;
import static AccountingSoftware.FrameforPanel.PreviousPrice;
import static AccountingSoftware.FrameforPanel.ReacquisitionPriceInput;
import static AccountingSoftware.FrameforPanel.SharesReaquiredInput;
import static AccountingSoftware.FrameforPanel.TStockCredit;
import static AccountingSoftware.FrameforPanel.TStockDebit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class SaveJETStock {
    public SaveJETStock(){
          String Description = "";
        
        for (int i =0; i < JETableTStocks.getRowCount(); i++){
        if (JETableTStocks.getValueAt(i,0).equals ("Debit")){
            
            TStockDebit.add (Float.parseFloat(JETableTStocks.getValueAt(i,2).toString()));
            
           
            switch (JETableTStocks.getValueAt(i,1).toString()) {
                case "Treasury Stock":
                    
                    
                    CreateTAccountRowTStock("Date",Description, TStockDebit.get(NumberofTStockDebit), 0); 
                    NumberofTStockDebit++;
                    break;
                case "Cash":
                    CreateTAccountRowCash("Date",Description, TStockDebit.get(NumberofTStockDebit), 0); 
                    NumberofTStockDebit++;
                break;
                case "Paid in Capital":
                    CreateTAccountRowPaidinCapital("Date",Description, TStockDebit.get(NumberofTStockDebit), 0); 
                    NumberofTStockDebit++;
                break;
                default:
                    break;
            }
            
        }
        if (JETableTStocks.getValueAt(i,0).equals("Credit")){
            TStockCredit.add(Float.parseFloat(JETableTStocks.getValueAt(i,2).toString()));
            
           switch (JETableTStocks.getValueAt(i,1).toString()){
               case "Treasury Stock":
               
              CreateTAccountRowTStock("Date",Description,0, TStockCredit.get(NumberofTStockCredit));
              NumberofTStockCredit++;
              break;
              case "Cash":
               
              CreateTAccountRowCash("Date",Description,0, TStockCredit.get(NumberofTStockCredit));
              NumberofTStockCredit++;
              break;
              
               case "Paid in Capital":
               
              CreateTAccountRowPaidinCapital("Date",Description,0, TStockCredit.get(NumberofTStockCredit));
              NumberofTStockCredit++;
              break;
              
           default: 
               break;
            }
       }
        
       }
       TStockDebit.clear();
    TStockCredit.clear();
        NumberofTStockDebit=0;
        NumberofTStockCredit =0;
        
        
        DefaultTableModel dm = (DefaultTableModel) JETableTStocks.getModel();
int rowCount = JETableTStocks.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
      
SharesReaquiredInput.setText("");
ReacquisitionPriceInput.setText("");
 PreviousPrice.clear();
AmountofShares.clear();
    }
}
