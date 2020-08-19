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
public class CheckAnswerRecourses {
    public CheckAnswerRecourses(){
          DefaultTableModel RecourseTable = (DefaultTableModel) FrameforPanel.RecourseJETable.getModel();
           DefaultTableModel AnswerInputTable = (DefaultTableModel) FrameforPanel.AnswerInputTableRecourses.getModel();
        int CashSum = 0;
        int DueFromFactorSum = 0;
        int LossOnSalesReceivablesSum = 0;
        int AccountsReceivableSum = 0;
        int RecourseLiabilitySum = 0;
        
         int CashSum2 = 0;
        int DueFromFactorSum2 = 0;
        int LossOnSalesReceivablesSum2 = 0;
        int AccountsReceivableSum2 = 0;       
        int RecourseLiabilitySum2 = 0;     
           
           
        for(int i = 0; i<RecourseTable.getRowCount(); i ++){
              if (RecourseTable.getValueAt(i,0) != null && RecourseTable.getValueAt(i,1) !=null && RecourseTable.getValueAt(i,2) != null){
                  
              float temp =Float.parseFloat(RecourseTable.getValueAt(i,2).toString());
          temp = Math.round(temp);
                  if (RecourseTable.getValueAt(i,0).equals("Debit") && RecourseTable.getValueAt(i,1).equals("Cash")){
                 CashSum += temp;
                 
             }else if (RecourseTable.getValueAt(i,0).equals("Debit") && RecourseTable.getValueAt(i,1).equals("Due from Factor")){
                DueFromFactorSum += temp;
             }else if (RecourseTable.getValueAt(i,0).equals("Debit") && RecourseTable.getValueAt(i,1).equals("Loss on Sale of Receivables")){
               LossOnSalesReceivablesSum  += temp;
             }
             else if (RecourseTable.getValueAt(i,0).equals("Debit") && RecourseTable.getValueAt(i,1).equals("Accounts Receivable")){
               AccountsReceivableSum  += temp;
             }else if (RecourseTable.getValueAt(i,0).equals("Debit") && RecourseTable.getValueAt(i,1).equals("Recourse Liability")){
               RecourseLiabilitySum  += temp;
             }
             
             else if (RecourseTable.getValueAt(i,0).equals("Credit") && RecourseTable.getValueAt(i,1).equals("Cash")){
                 CashSum -= temp;
             
             }else if (RecourseTable.getValueAt(i,0).equals("Credit") && RecourseTable.getValueAt(i,1).equals("Due from Factor")){
                DueFromFactorSum -= temp;
             }else if (RecourseTable.getValueAt(i,0).equals("Credit") && RecourseTable.getValueAt(i,1).equals("Loss on Sale of Receivables")){
                LossOnSalesReceivablesSum -= temp;
             }else if (RecourseTable.getValueAt(i,0).equals("Credit") && RecourseTable.getValueAt(i,1).equals("Accounts Receivable")){
                AccountsReceivableSum -= temp;
             }else if (RecourseTable.getValueAt(i,0).equals("Credit") && RecourseTable.getValueAt(i,1).equals("Recourse Liability")){
                RecourseLiabilitySum -= temp;
             }
                  
    }
}
           
        for(int i = 0; i<AnswerInputTable.getRowCount(); i ++){
              if (AnswerInputTable.getValueAt(i,0) != null && AnswerInputTable.getValueAt(i,1) !=null && AnswerInputTable.getValueAt(i,2) != null){
                  
              float temp =Float.parseFloat(AnswerInputTable.getValueAt(i,2).toString());
          temp = Math.round(temp);
                  if (AnswerInputTable.getValueAt(i,0).equals("Debit") && AnswerInputTable.getValueAt(i,1).equals("Cash")){
                 CashSum2 += temp;
                 
             }else if (AnswerInputTable.getValueAt(i,0).equals("Debit") && AnswerInputTable.getValueAt(i,1).equals("Due from Factor")){
                DueFromFactorSum2 += temp;
             }else if (AnswerInputTable.getValueAt(i,0).equals("Debit") && AnswerInputTable.getValueAt(i,1).equals("Loss on Sale of Receivables")){
               LossOnSalesReceivablesSum2  += temp;
             }
             else if (AnswerInputTable.getValueAt(i,0).equals("Debit") && AnswerInputTable.getValueAt(i,1).equals("Accounts Receivable")){
               AccountsReceivableSum2  += temp;
             }
             else if (AnswerInputTable.getValueAt(i,0).equals("Debit") && AnswerInputTable.getValueAt(i,1).equals("Recourse Liability")){
               RecourseLiabilitySum2  += temp;
             }
             
             else if (AnswerInputTable.getValueAt(i,0).equals("Credit") && AnswerInputTable.getValueAt(i,1).equals("Cash")){
                 CashSum2 -= temp;
             
             }else if (AnswerInputTable.getValueAt(i,0).equals("Credit") && AnswerInputTable.getValueAt(i,1).equals("Due from Factor")){
                DueFromFactorSum2 -= temp;
             }else if (AnswerInputTable.getValueAt(i,0).equals("Credit") && AnswerInputTable.getValueAt(i,1).equals("Loss on Sale of Receivables")){
                LossOnSalesReceivablesSum2 -= temp;
             }else if (AnswerInputTable.getValueAt(i,0).equals("Credit") && AnswerInputTable.getValueAt(i,1).equals("Accounts Receivable")){
                AccountsReceivableSum2 -= temp;
             }
                  else if (AnswerInputTable.getValueAt(i,0).equals("Credit") && AnswerInputTable.getValueAt(i,1).equals("Recourse Liability")){
                RecourseLiabilitySum2 -= temp;
             }
                  
    }
}
        
        if (CashSum == CashSum2 && DueFromFactorSum == DueFromFactorSum2 &&LossOnSalesReceivablesSum == LossOnSalesReceivablesSum2 &&AccountsReceivableSum ==AccountsReceivableSum2 && RecourseLiabilitySum == RecourseLiabilitySum2){
            FrameforPanel.OutputReceivableExchange.setText("Correct Answer");
        }else {
            FrameforPanel.OutputReceivableExchange.setText("Incorrect Answer");
        }
    }
}
