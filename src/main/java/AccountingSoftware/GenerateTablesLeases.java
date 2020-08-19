/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import static AccountingSoftware.FrameforPanel.PensionJETable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class GenerateTablesLeases {
    public GenerateTablesLeases(){
        
        String PaymentString = "";
        float Payments = 0;
        String UsefulLife = "";
        float LifeLease = 0;
        String ResidualValueString = "";
        float ResidualValue = 0;
        String ImplicitRateString = "";
        float ImplicitRate = 0;
        String BorrowingRateString = "";
        float BorrowingRate = 0;
        String PresentValueString = "";
        float PresentValue = 0;
        String CosttoDealerString = "";
        float CostToDealer = 0;
        
        float Liability = 0;
        float IntExpense = 0;
        
        float FinalPresentValue = 0;
            try {
        PaymentString =  FrameforPanel.AnnualPaymentsInput.getText();
        Payments  = Float.parseFloat(PaymentString);
} catch (NumberFormatException e) {
} 
               try {
        UsefulLife =  FrameforPanel.YearsLeaseInput.getText();
        LifeLease  = Float.parseFloat(UsefulLife);
} catch (NumberFormatException e) {
} 
                      try {
        ResidualValueString =  FrameforPanel.ResidualValueInput.getText();
        ResidualValue  = Float.parseFloat(ResidualValueString);
} catch (NumberFormatException e) {
} 
   try {
        ImplicitRateString =  FrameforPanel.ImplicitRateInput.getText();
        ImplicitRate  = Float.parseFloat(ImplicitRateString);
} catch (NumberFormatException e) {
} 
   try {
//        BorrowingRateString =  FrameforPanel.BorrowingRateInput.getText();
 //       BorrowingRate  = Float.parseFloat(BorrowingRateString);
} catch (NumberFormatException e) {
} 
  try {
       PresentValueString  =  FrameforPanel.PresentValueInput.getText();
        PresentValue  = Float.parseFloat(PresentValueString);
} catch (NumberFormatException e) {
} 
  try {
       CosttoDealerString  =  FrameforPanel.CostToDealerInput.getText();
        CostToDealer  = Float.parseFloat(CosttoDealerString);
  }catch (NumberFormatException e){
      
  }
  
  FinalPresentValue = PresentValue;
     DefaultTableModel Amort = (DefaultTableModel) FrameforPanel.AmortTableLeases.getModel();                                  
     DefaultTableModel LeaseJE = (DefaultTableModel) FrameforPanel.LeasesJETable.getModel();
     if (FrameforPanel.FinanceLeaseCheck.isSelected()){
          LeaseJE.addRow(new Object[]{"0","Debit", "Right-of-Use Asset", PresentValue});
          LeaseJE.addRow(new Object[]{"0","Credit", "Lease Liability", PresentValue});
         Amort.addRow(new Object[]{"Beginning Balance", "-", "-", "-", PresentValue});
         PresentValue = PresentValue-Payments;
         Amort.addRow(new Object[]{"0", Payments, "-", Payments, PresentValue});
       
         for (int i = 1; i < LifeLease; i++){
             IntExpense = PresentValue*ImplicitRate;
             Liability = Payments - (ImplicitRate*PresentValue);
             PresentValue = PresentValue - Liability;
            
             Amort.addRow(new Object[]{i, Payments, IntExpense,Liability,PresentValue });
            LeaseJE.addRow(new Object[]{i, "Debit","Interest Expense", IntExpense});
            LeaseJE.addRow(new Object[]{i, "Credit","Lease Liability", IntExpense});
            
            LeaseJE.addRow(new Object[]{i, "Debit", "Amortization Expense", FinalPresentValue/LifeLease});
            LeaseJE.addRow(new Object[]{i, "Credit", "Right-of-Use Asset", FinalPresentValue/LifeLease});
            
            LeaseJE.addRow (new Object[]{i, "Debit", "Lease Liability", Payments});
            LeaseJE.addRow(new Object[]{i, "Credit", "Cash", Payments});
         }
         
     }else if (FrameforPanel.SalesTypeLeaseCheck.isSelected() && !FrameforPanel.ResidualValueInput.equals("")){
         
         LeaseJE.addRow(new Object[]{"0", "Debit", "Lease Receivable", PresentValue});
         LeaseJE.addRow(new Object[]{"0", "Debit", "Cost of Goods Sold", CostToDealer});
         LeaseJE.addRow(new Object[]{"0", "Credit", "Sales Revenue", PresentValue});
         LeaseJE.addRow(new Object[]{"0", "Credit", "Inventory", CostToDealer});
         
          Amort.addRow(new Object[]{"Beginning Balance", "-", "-", "-", PresentValue});
            PresentValue = PresentValue-Payments;
             Amort.addRow(new Object[]{"0", Payments, "-", Payments, PresentValue});
         for (int i = 1; i< LifeLease; i ++){
                IntExpense = PresentValue*ImplicitRate;
             Liability = Payments - (ImplicitRate*PresentValue);
             PresentValue = PresentValue - Liability;
             
             Amort.addRow(new Object[]{i, Payments, IntExpense, Liability, PresentValue});
             
             LeaseJE.addRow(new Object[]{i, "Debit", "Cash", Payments });
             LeaseJE.addRow(new Object[]{i, "Credit", "Lease Recievable", Payments});
             
             LeaseJE.addRow(new Object[]{i, "Debit", "Lease Receivable", IntExpense});
             LeaseJE.addRow(new Object[]{i, "Credit", "Interest Revenue", IntExpense});
             
             
             
         }
           IntExpense = PresentValue*ImplicitRate;
             Liability = ResidualValue - (ImplicitRate*PresentValue);
             PresentValue = PresentValue - Liability;
         Amort.addRow(new Object[]{LifeLease,ResidualValue, IntExpense,Liability,PresentValue});
         LeaseJE.addRow(new Object[]{LifeLease, "Debit", "Inventory", ResidualValue});
         LeaseJE.addRow(new Object[]{LifeLease, "Credit", "Lease Receivable", ResidualValue});
     } else if (FrameforPanel.SalesTypeLeaseCheck.isSelected() && FrameforPanel.ResidualValueInput.equals("")){
          LeaseJE.addRow(new Object[]{"0", "Debit", "Lease Receivable", PresentValue});
         LeaseJE.addRow(new Object[]{"0", "Debit", "Cost of Goods Sold", CostToDealer});
         LeaseJE.addRow(new Object[]{"0", "Credit", "Sales Revenue", PresentValue});
         LeaseJE.addRow(new Object[]{"0", "Credit", "Inventory", CostToDealer});
         
          Amort.addRow(new Object[]{"Beginning Balance", "-", "-", "-", PresentValue});
            PresentValue = PresentValue-Payments;
             Amort.addRow(new Object[]{"0", Payments, "-", Payments, PresentValue});
         for (int i = 1; i< LifeLease; i ++){
                IntExpense = PresentValue*ImplicitRate;
             Liability = Payments - (ImplicitRate*PresentValue);
             PresentValue = PresentValue - Liability;
             
             Amort.addRow(new Object[]{i, Payments, IntExpense, Liability, PresentValue});
             
             LeaseJE.addRow(new Object[]{i, "Debit", "Cash", Payments });
             LeaseJE.addRow(new Object[]{i, "Credit", "Lease Recievable", Payments});
             
             LeaseJE.addRow(new Object[]{i, "Debit", "Lease Receivable", IntExpense});
             LeaseJE.addRow(new Object[]{i, "Credit", "Interest Revenue", IntExpense});

         }
         
     }else if (FrameforPanel.OperatingLeaseCheck.isSelected()){
         
          LeaseJE.addRow(new Object[]{"0","Debit", "Right-of-Use Asset", PresentValue});
          LeaseJE.addRow(new Object[]{"0","Credit", "Lease Liability", PresentValue});
           Amort.addRow(new Object[]{"Beginning Balance", "-", "-", "-", PresentValue});
         PresentValue = PresentValue-Payments;
         Amort.addRow(new Object[]{"0", Payments, 0, Payments, PresentValue});
          for (int i = 1; i < LifeLease; i++){
             IntExpense = PresentValue*ImplicitRate;
             Liability = Payments - (ImplicitRate*PresentValue);
             PresentValue = PresentValue - Liability;
            
             Amort.addRow(new Object[]{i, Payments, IntExpense,Liability,PresentValue});
           
          }
          for(int i = 0; i< LifeLease; i++){
               LeaseJE.addRow(new Object[]{i, "Debit", "Lease Liability", Payments});
             LeaseJE.addRow(new Object[]{i, "Credit", "Cash", Payments});
             if (i == LifeLease - 1){
                 LeaseJE.addRow(new Object[]{i + 1, "Debit", "Lease Expense", Payments});
                 LeaseJE.addRow(new Object[]{i + 1, "Credit", "Right-of-Use Asset", Payments});
             }else {
             LeaseJE.addRow(new Object[]{i + 1, "Debit", "Lease Expense", Payments});
             LeaseJE.addRow(new Object[]{i + 1, "Credit", "Right-of-Use Asset", Payments - Float.parseFloat(Amort.getValueAt(i+2,2).toString())});
             LeaseJE.addRow(new Object[]{i + 1, "Credit", "Lease Liability", Float.parseFloat(Amort.getValueAt(i+2,2).toString())});
             }
             }
             }
          }
     }
                            
    

