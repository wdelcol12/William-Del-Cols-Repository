/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class WasoCalculation {
int WASOFINAL;    

    public WasoCalculation(){
        FrameforPanel fram;
        float WeightedShares = 0;
        float FinalWASO = 0;
        
        float BeginStockOS = 0;
        String BeginStockOSString;
         try {
            BeginStockOSString = FrameforPanel.BeginSharesInput.getText();
            BeginStockOS = Float.parseFloat(BeginStockOSString);
        }catch(NumberFormatException e){
            
        }
          DefaultTableModel Waso = (DefaultTableModel) FrameforPanel.WASOTable.getModel();
        for (int i = 0; i < Waso.getRowCount(); i ++){
           
            WeightedShares = Float.parseFloat(Waso.getValueAt(i,1).toString()) * Float.parseFloat(Waso.getValueAt(i,2).toString()) * Float.parseFloat(Waso.getValueAt(i,3).toString()) * Float.parseFloat(Waso.getValueAt(i,4).toString());
         Waso.setValueAt(WeightedShares, i, 5);
            
           FinalWASO += WeightedShares;
        }
        setWASO(Math.round(FinalWASO));
       FrameforPanel.CalculatedWASO.setText(String.valueOf(FinalWASO));
    }
   public int getWASO(){
       return WASOFINAL;
   }
   public void setWASO(int WASO){
       WASOFINAL = WASO;
}
}
