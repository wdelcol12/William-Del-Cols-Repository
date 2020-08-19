package AccountingSoftware;


import AccountingSoftware.FrameforPanel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wdelc
 */
public class InventoryValuation {
    private String BeginInv = "";
    private float BeginInvfl = 0;
      private String Purchases = "";
    private float Purchasesfl = 0;
      private String Sales= "";
    private float Salesfl= 0;
    
    public InventoryValuation(boolean Gen, boolean Pull){
     
        
        if (Gen == true){
            
         
             try {
        BeginInv = FrameforPanel.BeginInvInput.getText();
        BeginInvfl = Float.parseFloat(BeginInv);
} catch (NumberFormatException e) {
}   
        try {
       Purchases = FrameforPanel.PurchasesAmountInv.getText();
        Purchasesfl = Float.parseFloat(Purchases);
} catch (NumberFormatException e) {
}   
         try {
        Sales = FrameforPanel.SalesInputInv.getText();
        Salesfl = Float.parseFloat(Sales);
} catch (NumberFormatException e) {
}   
         
         DefaultTableModel InvTable = (DefaultTableModel) FrameforPanel.InvValuationTable.getModel();
  
                
    }
    }
}