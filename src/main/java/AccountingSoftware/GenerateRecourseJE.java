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
public class GenerateRecourseJE {
    public GenerateRecourseJE(){
        String FactoringAmountString = "";
        int FactoringAmount = 0;
        String FinanceChargeString = "";
        float FinanceChargefl = 0;
        
        String RetainedReservesString = "";
        float RetainedReservesfl = 0;
        
        String RecourseLiabilityString = "";
        int RecourseLiabilityfl = 0;
        
        try {
           FinanceChargeString = FrameforPanel.FinanceChargeInput.getText();
            FinanceChargefl = Integer.parseInt(FinanceChargeString);
       }catch (NumberFormatException e){
          
       }
          try {
           RetainedReservesString = FrameforPanel.RetainedReservesInput.getText();
            RetainedReservesfl = Integer.parseInt(RetainedReservesString);
       }catch (NumberFormatException e){
          
       }
           try {
           FactoringAmountString = FrameforPanel.FactoringAmountInput.getText();
            FactoringAmount = Integer.parseInt(FactoringAmountString);
       }catch (NumberFormatException e){
          
       }
           try {
           RecourseLiabilityString = FrameforPanel.RecourseLiabilityInput.getText();
            RecourseLiabilityfl = Integer.parseInt(RecourseLiabilityString);
       }catch (NumberFormatException e){
          
       }
           DefaultTableModel RecourseTable = (DefaultTableModel) FrameforPanel.RecourseJETable.getModel();
          boolean Recoursetrans = false;
          boolean NonRecoursetrans = false;
           FinanceChargefl =FinanceChargefl/100;
           RetainedReservesfl = RetainedReservesfl/100;
         //  System.out.println("Retained Reserves: " + RetainedReservesfl);
         //  System.out.println("Finance Charge: " + FinanceChargefl);
         
         int DueFromFactorFinal = Math.round(RetainedReservesfl*FactoringAmount);
         int LossOnSale = Math.round(FinanceChargefl *FactoringAmount);
         int CashFinal = Math.round(FactoringAmount - (FactoringAmount *(RetainedReservesfl + FinanceChargefl)));
           if(FrameforPanel.RecourseCheckMark.isSelected()){
               Recoursetrans = true;
           }else if (FrameforPanel.WithoutRecourseCheckMark.isSelected()){
               NonRecoursetrans = true;
           }
           if (FrameforPanel.RecourseCheckMark.isSelected() && FrameforPanel.WithoutRecourseCheckMark.isSelected()){
               Recoursetrans = false;
               NonRecoursetrans = false;
           }
           
           if (NonRecoursetrans == true){
               RecourseTable.addRow(new Object[]{"Debit", "Cash", CashFinal});
               RecourseTable.addRow(new Object[]{"Debit", "Due from Factor", DueFromFactorFinal});
               RecourseTable.addRow(new Object[]{"Debit","Loss on Sales of Receivables",LossOnSale});
               RecourseTable.addRow(new Object[]{"Credit", "Accounts Receivable", FactoringAmount});
           }else if (Recoursetrans == true){
               RecourseTable.addRow(new Object[]{"Debit", "Cash",CashFinal});
               RecourseTable.addRow(new Object[]{"Debit", "Due from Factor",DueFromFactorFinal});
               RecourseTable.addRow(new Object[]{"Debit", "Loss on Sale of Receivables", LossOnSale +RecourseLiabilityfl});
               RecourseTable.addRow(new Object[]{"Credit", "Accounts Receivable", FactoringAmount});
               RecourseTable.addRow(new Object[]{"Credit", "Recourse Liability", RecourseLiabilityfl});
           }
           
           
           
    }
}
