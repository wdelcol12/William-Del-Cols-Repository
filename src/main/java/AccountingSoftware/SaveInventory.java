/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import static AccountingSoftware.FrameforPanel.CreateTAccountRowAccountsPayable;
import static AccountingSoftware.FrameforPanel.CreateTAccountRowAccountsRecievable;
import static AccountingSoftware.FrameforPanel.CreateTAccountRowCostOfGoodsSold;
import static AccountingSoftware.FrameforPanel.CreateTAccountRowInventory;
import static AccountingSoftware.FrameforPanel.CreateTAccountRowPurchases;
import static AccountingSoftware.FrameforPanel.CreateTAccountRowSalesRevenue;
import static AccountingSoftware.FrameforPanel.EndingInvOutput;
import static AccountingSoftware.FrameforPanel.FIFOPerpTable;
import static AccountingSoftware.FrameforPanel.InventoryCredit;
import static AccountingSoftware.FrameforPanel.InventoryDebit;
import static AccountingSoftware.FrameforPanel.InventoryManagementJETable;
import static AccountingSoftware.FrameforPanel.NumberofInventoryCredit;
import static AccountingSoftware.FrameforPanel.NumberofInventoryDebit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class SaveInventory {
     String EndInv;
    public SaveInventory(){
          String Description = "";
         // String EndInv;
        EndInv =  Float.toString(FrameforPanel.Balanceinv + FrameforPanel.Stock.get(FrameforPanel.IDSelect));
        
        for (int i =0; i < InventoryManagementJETable.getRowCount(); i++){
        if (InventoryManagementJETable.getValueAt(i,0).equals ("Debit")){
            
            InventoryDebit.add (Integer.parseInt(InventoryManagementJETable.getValueAt(i,2).toString()));
            
           
            switch (InventoryManagementJETable.getValueAt(i,1).toString()) {
                case "Inventory":
                    // System.out.println("Working");
                    
                    CreateTAccountRowInventory("Date",Description, InventoryDebit.get(NumberofInventoryDebit), 0); 
                    NumberofInventoryDebit++;
                    break;
                    
                case "Cost of Goods Sold":
                    CreateTAccountRowCostOfGoodsSold("Date",Description, InventoryDebit.get(NumberofInventoryDebit), 0);
                    NumberofInventoryDebit++;
                break;
                
                case "Accounts Receivable":
                    CreateTAccountRowAccountsRecievable("Date", Description, InventoryDebit.get(NumberofInventoryDebit), 0);
                    NumberofInventoryDebit++;
                 break;
                case "Purchases":
               CreateTAccountRowPurchases ("Date", Description,InventoryDebit.get(NumberofInventoryDebit), 0);
                    NumberofInventoryDebit++;
                default:
                    break;
            }
            
        }
        if (InventoryManagementJETable.getValueAt(i,0).equals("Credit")){
            InventoryCredit.add(Integer.parseInt(InventoryManagementJETable.getValueAt(i,2).toString()));
            
           switch (InventoryManagementJETable.getValueAt(i,1).toString()){
               case "Inventory":
               
              CreateTAccountRowInventory("Date",Description,0, InventoryCredit.get(NumberofInventoryCredit));
              NumberofInventoryCredit++;
              break;
              
               case "Sales Revenue":
                   CreateTAccountRowSalesRevenue("Date", Description, 0, InventoryCredit.get(NumberofInventoryCredit));
                    NumberofInventoryCredit++;
              break;
                case "Cost of Goods Sold":
                    CreateTAccountRowCostOfGoodsSold("Date",Description,0, InventoryCredit.get(NumberofInventoryCredit));
                     NumberofInventoryCredit++;
                break;
                case "Accounts Payable":
                    CreateTAccountRowAccountsPayable("Date", Description, 0, InventoryCredit.get(NumberofInventoryCredit));
                     NumberofInventoryCredit++;
           default: 
               break;
            }
       }
        
       }
        EndingInvOutput.setText(EndInv);
       FrameforPanel.Stock.set(FrameforPanel.IDSelect,Float.parseFloat(EndInv));
        FrameforPanel.IDTable.setValueAt(EndInv,FrameforPanel.IDSelect ,3);
       InventoryDebit.clear();
    InventoryCredit.clear();
        NumberofInventoryDebit=0;
        NumberofInventoryCredit =0;
         DefaultTableModel dm = (DefaultTableModel) InventoryManagementJETable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
      DefaultTableModel dm1 = (DefaultTableModel) FIFOPerpTable.getModel();
int rowCount1 = dm1.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount1 - 1; i >= 0; i--) {
    dm1.removeRow(i);
}
    }
}
