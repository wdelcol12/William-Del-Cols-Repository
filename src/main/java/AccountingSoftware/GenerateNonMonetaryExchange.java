/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import static AccountingSoftware.FrameforPanel.SecuritiesTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class GenerateNonMonetaryExchange {
    public GenerateNonMonetaryExchange(){
        String FairValueString = "";
        float FairValue = 0;
        
        String DepreciationString = "";
        float Depreciation = 0;
        
        String CashPaidString = "";
        float CashPaid = 0;
        
        String AssetCostString = "";
        float AssetCost = 0;
        
        String ListPriceString = "";
        float ListPrice = 0;
        
        float BookValue = 0;
        boolean CommercialSubstance = false;
        
           try {
        FairValueString =  FrameforPanel.FairValueInput.getText();
        FairValue  = Float.parseFloat(FairValueString);
} catch (NumberFormatException e) {
} 
               try {
        DepreciationString =  FrameforPanel.ADInput.getText();
        Depreciation  = Float.parseFloat(DepreciationString);
} catch (NumberFormatException e) {
} 
                  try {
        CashPaidString =  FrameforPanel.CashInput.getText();
        CashPaid  = Float.parseFloat(CashPaidString);
} catch (NumberFormatException e) {
} 
               try {
        AssetCostString =  FrameforPanel.AssetCostInput.getText();
        AssetCost  = Float.parseFloat(AssetCostString);
} catch (NumberFormatException e) {
} 
                          try {
        ListPriceString =  FrameforPanel.ListPriceInput.getText();
        ListPrice  = Float.parseFloat(ListPriceString);
} catch (NumberFormatException e) {
} 
                          DefaultTableModel Exchanges = (DefaultTableModel) FrameforPanel.ExchangesJETable.getModel();
                    
                          
                if (!FrameforPanel.CommercialSubstanceCheck.isSelected()){
                    CommercialSubstance = false;
                }else if (FrameforPanel.CommercialSubstanceCheck.isSelected()){
                    CommercialSubstance = true;
                }
                
                if (CommercialSubstance == true){
                    
                    if (!CashPaidString.equals("") || CashPaid != 0){
                        BookValue = AssetCost - Depreciation;
                    Exchanges.addRow(new Object[]{"Debit", "Equipment", CashPaid + FairValue});
                    Exchanges.addRow(new Object[]{"Debit", "Accumulated Depreciation",Depreciation});
                     Exchanges.addRow(new Object[]{"Debit", "Loss On Disposal of Equipment", BookValue - FairValue});
                    Exchanges.addRow(new Object[]{"Credit", "Equipment", AssetCost});
                    Exchanges.addRow(new Object[]{"Credit", "Cash", CashPaid});
                   
                    }else if (CashPaid == 0){
                        BookValue = AssetCost - Depreciation;
                   Exchanges.addRow(new Object[]{"Debit", "Equipment", FairValue});
                    Exchanges.addRow(new Object[]{"Debit", "Accumulated Depreciation",Depreciation});
                    if(BookValue > FairValue){
                     Exchanges.addRow(new Object[]{"Debit", "Loss On Disposal of Equipment", BookValue - FairValue});
                    }else if (BookValue<FairValue){
                          Exchanges.addRow(new Object[]{"Credit", "Gain On Disposal of Equipment", FairValue - BookValue});
                    }
                    
                    Exchanges.addRow(new Object[]{"Credit", "Equipment", AssetCost});
                  //  Exchanges.addRow(new Object[]{"Credit", "Cash", CashPaid});
                        
                    }
    }
}
}