/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import static AccountingSoftware.FrameforPanel.AnswerTableInventory;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class GenerateProblemInventory {
    private boolean FIFO = false;
         private boolean LIFO = false;
    public GenerateProblemInventory(){
        
        
         final int MaximumPricePurchase = 30;
         final int MinimumPricePurchase = 5;
         final int MaximumPriceSale = 60;
         final int MinimumPriceSale = 31;
         final int MaximumUnitPurchase = 100;
         final int MinimumUnitPurchase = 50;
         final int MaximumUnitSale = 50;        
         final int MinimumUnitSale = 20;
         final int AmountPricePurchases = 2;
         final int AmountOfSales = 3;
         
         Random rand = new Random();
         
         
         int FIFOOrLifo = rand.nextInt(2) + 1; //0 = FIFO Option 1 = LIFO Option Randomizes between 0 and 1
         
         if (FIFOOrLifo == 1){ //` = FIFO Option 2 = LIFO Option
             FIFO = true;
         }else if (FIFOOrLifo == 2){
             LIFO = true;
         }
         
         
         
        // String ProblemOpening = "Please fill ALL necessary Journal Entries in the table for the following problem \n Assume Company Co. has a FIFO Perpetual Inventory System with the following events (in order) \n";
         // int PricePurchase = rand.nextInt(MaximumPricePurchase + 1 - MinimumPricePurchase) + MinimumPricePurchase;
        // int  
       //  int PricePurchase = rand.nextInt(MaximumPricePurchase + 1 - MinimumPricePurchase) + MinimumPricePurchase;
       //  int PriceSale = rand.nextInt(MaximumPriceSale + 1 - MinimumPriceSale) + MinimumPriceSale;
        // int UnitPurchase = rand.nextInt(MaximumUnitPurchase + 1 - MinimumUnitPurchase) + MinimumUnitPurchase;
        // int UnitSale = rand.nextInt(MaximumUnitSale + 1 - MinimumUnitSale) + MinimumUnitSale;
        //FrameforPanel.ProblemArea.setText(ProblemOpening);
       // FrameforPanel.ProblemArea.setText("Assume Company Co. has a FIFO Perpetual Inventory System with the following events (in order) ");
      
       //DefaultTableModel Answer = (DefaultTableModel) FrameforPanel.AnswerTableInventory.getModel();
       DefaultTableModel Answer = (DefaultTableModel) FrameforPanel.AnswerTableInventory.getModel();
        
      
int rowCount1 = AnswerTableInventory.getRowCount();
//Remove rows one by one from the end of the table

for (int i = rowCount1 - 1; i >= 0; i--) {
    Answer.removeRow(i);
}
     DefaultTableModel dm1 = (DefaultTableModel) FrameforPanel.InventoryManagementJETable.getModel();
int rowCount2 = FrameforPanel.InventoryManagementJETable.getRowCount();
//Remove rows one by one from the end of the table

for (int i = rowCount2 - 1; i >= 0; i--) {
    dm1.removeRow(i);
}
 DefaultTableModel dm2 = (DefaultTableModel) FrameforPanel.FIFOPerpTable.getModel();
 int rowCount3 = FrameforPanel.FIFOPerpTable.getRowCount();
 
 for (int i = rowCount3 -1; i>=0; i--){
     dm2.removeRow(i);
 }
        if(FIFO == true){
            FrameforPanel.ProblemArea.setText("Please fill ALL necessary Journal Entries in the table for the following problem \n Assume Company Co. has a \n FIFO Perpetual Inventory System with the following events (in order) \n" );
         for (int i = 0; i<AmountPricePurchases; i++){
       InventoryClass.Sale = false;
       int PricePurchase = rand.nextInt(MaximumPricePurchase + 1 - MinimumPricePurchase) + MinimumPricePurchase;
        int UnitPurchase = rand.nextInt(MaximumUnitPurchase + 1 - MinimumUnitPurchase) + MinimumUnitPurchase;
       
       FrameforPanel.Units.setText(String.valueOf(UnitPurchase));
         FrameforPanel.SalesPrice.setText(String.valueOf(PricePurchase));
         FrameforPanel.ProblemArea.setText(FrameforPanel.ProblemArea.getText() + "Purchase of: " + UnitPurchase + " Units at " + PricePurchase + "\n");
   
         InventoryClass.Purchase = true;
         InventoryClass inv = new InventoryClass(true, true,true, true); //In order Educational, Perpetual, Purchase, FIFO
         FrameforPanel.Units.setText("");
         FrameforPanel.SalesPrice.setText("");
         }
         for (int i = 0; i<AmountOfSales; i++){
             InventoryClass.Purchase = false;
              int PriceSale = rand.nextInt(MaximumPriceSale + 1 - MinimumPriceSale) + MinimumPriceSale;
                int UnitSale = rand.nextInt(MaximumUnitSale + 1 - MinimumUnitSale) + MinimumUnitSale;
             FrameforPanel.Units.setText(String.valueOf(UnitSale));
             FrameforPanel.SalesPrice.setText(String.valueOf(PriceSale));
             FrameforPanel.ProblemArea.setText(FrameforPanel.ProblemArea.getText() + "Sale of: " + UnitSale + " Units at " + PriceSale + "\n");
             InventoryClass.Sale = true;
             InventoryClass inv = new InventoryClass(true, true, false, true);
           
              FrameforPanel.Units.setText("");
               FrameforPanel.SalesPrice.setText("");
         }
         FIFO = false;
         for (int i = 0; i< FrameforPanel.InventoryManagementJETable.getRowCount(); i++){
             Answer.addRow(new Object[]{});
         }
        } else if (LIFO == true){
            FrameforPanel.ProblemArea.setText("Please fill ALL necessary Journal Entries in the table for the following problem \n Assume Company Co. has a \n LIFO Perpetual Inventory System with the following events (in order) \n" );
            for (int i = 0; i<AmountPricePurchases; i++){
       InventoryClass.Sale = false;
       int PricePurchase = rand.nextInt(MaximumPricePurchase + 1 - MinimumPricePurchase) + MinimumPricePurchase;
        int UnitPurchase = rand.nextInt(MaximumUnitPurchase + 1 - MinimumUnitPurchase) + MinimumUnitPurchase;
       FrameforPanel.Units.setText(String.valueOf(UnitPurchase));
         FrameforPanel.SalesPrice.setText(String.valueOf(PricePurchase));
         FrameforPanel.ProblemArea.setText(FrameforPanel.ProblemArea.getText() + "Purchase of: " + UnitPurchase + " Units at " + PricePurchase + "\n");
   
         InventoryClass.Purchase = true;
         InventoryClass inv = new InventoryClass(true, true,true, false);
         FrameforPanel.Units.setText("");
         FrameforPanel.SalesPrice.setText("");
         }
         for (int i = 0; i<AmountOfSales; i++){
             InventoryClass.Purchase = false;
              int PriceSale = rand.nextInt(MaximumPriceSale + 1 - MinimumPriceSale) + MinimumPriceSale;
                int UnitSale = rand.nextInt(MaximumUnitSale + 1 - MinimumUnitSale) + MinimumUnitSale;
             FrameforPanel.Units.setText(String.valueOf(UnitSale));
             FrameforPanel.SalesPrice.setText(String.valueOf(PriceSale));
             FrameforPanel.ProblemArea.setText(FrameforPanel.ProblemArea.getText() + "Sale of: " + UnitSale + " Units at " + PriceSale + "\n");
             InventoryClass.Sale = true;
             InventoryClass inv = new InventoryClass(true, true, false, false);
           
              FrameforPanel.Units.setText("");
               FrameforPanel.SalesPrice.setText("");
         }
         for (int i = 0; i< FrameforPanel.InventoryManagementJETable.getRowCount(); i++){
             Answer.addRow(new Object[]{});
         }
         LIFO = false;
        }
    }
}
