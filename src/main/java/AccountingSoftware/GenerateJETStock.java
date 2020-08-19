/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class GenerateJETStock {
    
   // ArrayList <Float> PreviousPrice = new ArrayList<Float>();
   // ArrayList <Float> AmountofShares = new ArrayList<Float>();
    
    public GenerateJETStock(boolean Educational, boolean AQEDU, boolean ReissueEDU){
         float zero = 0;
        String OSSharesString = "";
     float OSSharesfl = 0;
      String ParValueString = "";
     float ParValuefl = 0;
      String AcquiredString = "";
     float AQfl = 0;
      String PriceString = "";
     float Price = 0;
     
    boolean Reissue = false;
     boolean AQ = false;
     float AquiredFinal = 0;
     
     float CashIssued;
     float PaidInCapital;
     
        
     DefaultTableModel TStocks = (DefaultTableModel) FrameforPanel.JETableTStocks.getModel();
       
           try {
        AcquiredString =  FrameforPanel.SharesReaquiredInput.getText();
        AQfl  = Float.parseFloat(AcquiredString);
} catch (NumberFormatException e) {
} 
               try {
        PriceString =  FrameforPanel.ReacquisitionPriceInput.getText();
        Price  = Float.parseFloat(PriceString);
} catch (NumberFormatException e) {
} 
        if ( FrameforPanel.IssueCheck.isSelected() &&  FrameforPanel.AQCheck.isSelected()){
            Reissue = false;
            AQ = false;
            
        }else if ( FrameforPanel.IssueCheck.isSelected() && ! FrameforPanel.AQCheck.isSelected() || ReissueEDU == true){
             Reissue = true;
        }else if (!FrameforPanel.IssueCheck.isSelected() &&  FrameforPanel.AQCheck.isSelected() || AQEDU == true){
            AQ = true;
        }
        
        if (AQ == true){
          AquiredFinal = AQfl * Price;
          TStocks.addRow(new Object[]{"Debit", "Treasury Stock", AquiredFinal});
          TStocks.addRow(new Object[]{"Credit", "Cash", AquiredFinal});
          
          FrameforPanel.PreviousPrice.add(Price);
          FrameforPanel.AmountofShares.add(AQfl);
        }else if (Reissue == true){
            for (int i = 0; i < FrameforPanel.PreviousPrice.size(); i++){
                
             //   System.out.println(FrameforPanel.PreviousPrice);
                if (FrameforPanel.PreviousPrice.get(i) != 0 && Price > FrameforPanel.PreviousPrice.get(i)){
              
                    CashIssued = AQfl * Price;
                    PaidInCapital = AQfl * FrameforPanel.PreviousPrice.get(i);
                    TStocks.addRow(new Object[]{"Debit", "Cash", CashIssued});
                    TStocks.addRow(new Object[]{"Credit", "Treasury Stock", PaidInCapital });
                    TStocks.addRow(new Object[]{"Credit", "Paid in Capital", CashIssued - PaidInCapital});
                    
                    FrameforPanel. PreviousPrice.add(zero);
                    FrameforPanel. AmountofShares.add(zero);
                
                i = 100;
                }else if (FrameforPanel.PreviousPrice.get(i) != 0 && Price < FrameforPanel.PreviousPrice.get(i)){
                    CashIssued = AQfl * Price;
                    PaidInCapital = AQfl * FrameforPanel.PreviousPrice.get(i);
                    
                    TStocks.addRow(new Object[]{"Debit", "Cash", CashIssued});
                    TStocks.addRow(new Object[]{"Debit", "Paid in Capital", PaidInCapital - CashIssued});
                    TStocks.addRow(new Object[]{"Credit", "Treasury Stock", PaidInCapital});
                      FrameforPanel.PreviousPrice.add(zero);
                     FrameforPanel.AmountofShares.add(zero);
                     i = 100;
                }
            }
        }
             
    }
}
