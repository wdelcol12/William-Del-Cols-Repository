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
public class CheckAnswerTStockProblems {
    public CheckAnswerTStockProblems(){
        
         DefaultTableModel TStocks = (DefaultTableModel) FrameforPanel.JETableTStocks.getModel();//Answer Model
         DefaultTableModel InputTStocks = (DefaultTableModel)FrameforPanel.TStockEducationalTable.getModel();
         
         int CashSum = 0;
         int TStockSum = 0;
         int PaidInCapitalSum = 0;
         int CashSumCredit = 0;
         int TStockSumCredit =0;
         int PaidInCapitalSumCredit = 0;
         
         int CashSum2 = 0;
         int TStockSum2 = 0;
         int PaidInCapitalSum2 = 0;
          int CashSumCredit2 = 0;
         int TStockSumCredit2 =0;
         int PaidInCapitalSumCredit2 = 0;
         
         for(int i = 0; i<TStocks.getRowCount(); i ++){
              if (TStocks.getValueAt(i,0) != null && TStocks.getValueAt(i,1) !=null && TStocks.getValueAt(i,2) != null){
                  
              float temp =Float.parseFloat(TStocks.getValueAt(i,2).toString());
          temp = Math.round(temp);
                  if (TStocks.getValueAt(i,0).equals("Debit") && TStocks.getValueAt(i,1).equals("Cash")){
                 CashSum += temp;
                 
             }else if (TStocks.getValueAt(i,0).equals("Debit") && TStocks.getValueAt(i,1).equals("Treasury Stock")){
                TStockSum += temp;
             }else if (TStocks.getValueAt(i,0).equals("Debit") && TStocks.getValueAt(i,1).equals("Paid in Capital")){
                PaidInCapitalSum += temp;
             }
             else if (TStocks.getValueAt(i,0).equals("Credit") && TStocks.getValueAt(i,1).equals("Cash")){
                 CashSum -= temp;
             
             }else if (TStocks.getValueAt(i,0).equals("Credit") && TStocks.getValueAt(i,1).equals("Treasury Stock")){
                TStockSum -= temp;
             }else if (TStocks.getValueAt(i,0).equals("Credit") && TStocks.getValueAt(i,1).equals("Paid in Capital")){
                PaidInCapitalSum -= temp;
             }
              }
    }
         for(int i = 0; i<InputTStocks.getRowCount(); i ++){
              if (InputTStocks.getValueAt(i,0) != null && InputTStocks.getValueAt(i,1) !=null && InputTStocks.getValueAt(i,2) != null){
                  
              float temp =Float.parseFloat(InputTStocks.getValueAt(i,2).toString());
          temp = Math.round(temp);
                  if (InputTStocks.getValueAt(i,0).equals("Debit") && InputTStocks.getValueAt(i,1).equals("Cash")){
                 CashSum2 += temp;
                 
             }else if (InputTStocks.getValueAt(i,0).equals("Debit") && InputTStocks.getValueAt(i,1).equals("Treasury Stock")){
                TStockSum2 += temp;
             }else if (InputTStocks.getValueAt(i,0).equals("Debit") && InputTStocks.getValueAt(i,1).equals("Paid in Capital")){
                PaidInCapitalSum2 += temp;
             }
             else if (InputTStocks.getValueAt(i,0).equals("Credit") && InputTStocks.getValueAt(i,1).equals("Cash")){
                 CashSum2 -= temp;
             
             }else if (InputTStocks.getValueAt(i,0).equals("Credit") && InputTStocks.getValueAt(i,1).equals("Treasury Stock")){
                TStockSum2 -= temp;
             }else if (InputTStocks.getValueAt(i,0).equals("Credit") && InputTStocks.getValueAt(i,1).equals("Paid in Capital")){
                PaidInCapitalSum2 -= temp;
             }
              }
          
         }
           CashSum= Math.abs(CashSum);
           TStockSum = Math.abs(TStockSum);
           PaidInCapitalSum = Math.abs(PaidInCapitalSum);
           CashSum2= Math.abs(CashSum2);
           TStockSum2 = Math.abs(TStockSum2);
           PaidInCapitalSum2 = Math.abs(PaidInCapitalSum2);
           
           if (CashSum == CashSum2 && TStockSum == TStockSum2 && PaidInCapitalSum == PaidInCapitalSum2){
               FrameforPanel.OutputTextAreaTStocks.setText("Correct answer!");
           }else {
               FrameforPanel.OutputTextAreaTStocks.setText("That answer is incorrect");
           }
}
}
