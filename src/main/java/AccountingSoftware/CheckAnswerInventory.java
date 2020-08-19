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
public class CheckAnswerInventory {
    private ArrayList <Integer> COGS = new ArrayList<Integer>();
   
    private ArrayList <Integer> Inventory = new ArrayList<Integer>();
    private ArrayList <Integer> InventoryCredit = new ArrayList<Integer>();
    private ArrayList <Integer> AccountsReceivable = new ArrayList<Integer>();
    private ArrayList <Integer> AccountsPayable = new ArrayList<Integer>();
    private ArrayList <Integer> SalesRevenue = new ArrayList<Integer>();
    
    private ArrayList <Integer> COGS2 = new ArrayList<Integer>();
    private ArrayList <Integer> Inventory2 = new ArrayList<Integer>();
    private ArrayList <Integer> Inventory2Credit = new ArrayList<Integer>();
    private ArrayList <Integer> AccountsReceivable2 = new ArrayList<Integer>();
    private ArrayList <Integer> AccountsPayable2 = new ArrayList<Integer>();
    private ArrayList <Integer> SalesRevenue2 = new ArrayList<Integer>();
    
    private int COGSSum;
    private int InventorySum;
    private int AccountsReceivableSum;
    private int AccountsPayableSum;
    private int SalesRevenueSum;
    
    private int COGSSum2;
    private int InventorySum2;
    private int AccountsReceivableSum2;
    private int AccountsPayableSum2;
    private int SalesRevenueSum2;
    public CheckAnswerInventory(){
      
        
        int sumd = 0;
        int sumc = 0;
        int sum = 0;
        
        int SalesRevenuefl = 0;
        String SalesRevenueString = "";
        int AccountsReceivablefl = 0;
        String AccountsReceivableString = "";
        int AccountsPayablefl = 0;
        String AccountsPayableString = "";
        int COGSfl = 0;
        String COGSString = "";
        int Inventoryfl = 0;
        String InventoryString = "";
        
          try {
           SalesRevenueString = FrameforPanel.SalesRevenueInput.getText();
            SalesRevenuefl = Integer.parseInt(SalesRevenueString);
       }catch (NumberFormatException e){
          
       }
          try {
           AccountsReceivableString = FrameforPanel.AccountsReceivableInput.getText();
            AccountsReceivablefl = Integer.parseInt(AccountsReceivableString);
       }catch (NumberFormatException e){
          
       }
          try {
           COGSString = FrameforPanel.COGSInput.getText();
            COGSfl = Integer.parseInt(COGSString);
       }catch (NumberFormatException e){
          
       }
          try {
           AccountsPayableString = FrameforPanel.AccountsPayableInput.getText();
            AccountsPayablefl = Integer.parseInt(AccountsPayableString);
       }catch (NumberFormatException e){
          
       }
          try {
           InventoryString = FrameforPanel.InventoryInput.getText();
            Inventoryfl = Integer.parseInt(InventoryString);
       }catch (NumberFormatException e){
          
       }
        
         DefaultTableModel Answer = (DefaultTableModel) FrameforPanel.AnswerTableInventory.getModel();//UserInputTable
         DefaultTableModel InventoryAnswers = (DefaultTableModel) FrameforPanel.InventoryManagementJETable.getModel();//AnswerChecker
         
       
        
   
         
         
         for (int i = 0; i < Answer.getRowCount(); i++){
            // System.out.println("Yo whats going on here");
          
           
            if (Answer.getValueAt(i,0) != null && Answer.getValueAt(i,1) !=null && Answer.getValueAt(i,2) != null){
             if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("Cost of Goods Sold")){
                 COGS.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
                 
             }else if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("Inventory")){
                 Inventory.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
                 
              
             }else if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("Accounts Receivable")){
                 AccountsReceivable.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
             }else if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("Accounts Payable")){
                  AccountsPayable.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
             }else if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("Sales Revenue")){
                  SalesRevenue.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
             }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("Cost of Goods Sold")){
                  COGS.add((Integer.parseInt(Answer.getValueAt(i,2).toString())));
             }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("Inventory")){
                 InventoryCredit.add((Integer.parseInt(Answer.getValueAt(i,2).toString())));
             }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("Accounts Receivable")){
                 AccountsReceivable.add((Integer.parseInt(Answer.getValueAt(i,2).toString())));
             }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("Accounts Payable")){
                  AccountsPayable.add((Integer.parseInt(Answer.getValueAt(i,2).toString())));
             }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("Sales Revenue")){
                  SalesRevenue.add((Integer.parseInt(Answer.getValueAt(i,2).toString())));
             }else{
                 
             }
            
            }
             
         }
            
         for (int i = 0; i < InventoryAnswers.getRowCount(); i++){
             if (InventoryAnswers.getValueAt(i,0).equals("Debit") && InventoryAnswers.getValueAt(i,1).equals("Cost of Goods Sold")){
                 COGS2.add(Integer.parseInt(InventoryAnswers.getValueAt(i,2).toString()));
                 
             }else if (InventoryAnswers.getValueAt(i,0).equals("Debit") && InventoryAnswers.getValueAt(i,1).equals("Inventory")){
                 Inventory2.add(Integer.parseInt(InventoryAnswers.getValueAt(i,2).toString()));
             }else if (InventoryAnswers.getValueAt(i,0).equals("Debit") && InventoryAnswers.getValueAt(i,1).equals("Accounts Receivable")){
                 AccountsReceivable2.add(Integer.parseInt(InventoryAnswers.getValueAt(i,2).toString()));
             }else if (InventoryAnswers.getValueAt(i,0).equals("Debit") && InventoryAnswers.getValueAt(i,1).equals("Accounts Payable")){
                  AccountsPayable2.add(Integer.parseInt(InventoryAnswers.getValueAt(i,2).toString()));
             }else if (InventoryAnswers.getValueAt(i,0).equals("Debit") && InventoryAnswers.getValueAt(i,1).equals("Sales Revenue")){
                  SalesRevenue2.add(Integer.parseInt(InventoryAnswers.getValueAt(i,2).toString()));
             }else if (InventoryAnswers.getValueAt(i,0).equals("Credit") && InventoryAnswers.getValueAt(i,1).equals("Cost of Goods Sold")){
                  COGS2.add((Integer.parseInt(InventoryAnswers.getValueAt(i,2).toString())));
             }else if (InventoryAnswers.getValueAt(i,0).equals("Credit") && InventoryAnswers.getValueAt(i,1).equals("Inventory")){
                 Inventory2Credit.add((Integer.parseInt(InventoryAnswers.getValueAt(i,2).toString())));
             }else if (InventoryAnswers.getValueAt(i,0).equals("Credit") && InventoryAnswers.getValueAt(i,1).equals("Accounts Receivable")){
                 AccountsReceivable2.add((Integer.parseInt(InventoryAnswers.getValueAt(i,2).toString())));
             }else if (InventoryAnswers.getValueAt(i,0).equals("Credit") && InventoryAnswers.getValueAt(i,1).equals("Accounts Payable")){
                  AccountsPayable2.add((Integer.parseInt(InventoryAnswers.getValueAt(i,2).toString())));
             }else if (InventoryAnswers.getValueAt(i,0).equals("Credit") && InventoryAnswers.getValueAt(i,1).equals("Sales Revenue")){
                  SalesRevenue2.add((Integer.parseInt(InventoryAnswers.getValueAt(i,2).toString())));
             }else{
                 
             }  
         
             }
         
        for (int i = 0; i< COGS.size(); i++){
            COGSSum += COGS.get(i);
        } 
         for (int i = 0; i < Inventory.size(); i++){
             InventorySum += Inventory.get(i);
         }
         for (int i = 0; i < InventoryCredit.size(); i++){
             InventorySum -= InventoryCredit.get(i);
         }
         for (int i = 0; i < AccountsPayable.size(); i++){
         AccountsPayableSum+= AccountsPayable.get(i);
         }
         for (int i = 0; i< AccountsReceivable.size(); i++){
             AccountsReceivableSum+= AccountsReceivable.get(i);
         }
         for (int i = 0; i < SalesRevenue.size(); i ++){
             SalesRevenueSum += SalesRevenue.get(i);
         }
         
           for (int i = 0; i< COGS2.size(); i++){
            COGSSum2 += COGS2.get(i);
        } 
         for (int i = 0; i < Inventory2.size(); i++){
             InventorySum2 += Inventory2.get(i);
         }
         for (int i = 0; i < Inventory2Credit.size(); i++){
             InventorySum2 = InventorySum2 - Inventory2Credit.get(i);
         }
         for (int i = 0; i < AccountsPayable2.size(); i++){
         AccountsPayableSum2+= AccountsPayable2.get(i);
         }
         for (int i = 0; i< AccountsReceivable2.size(); i++){
             AccountsReceivableSum2+= AccountsReceivable2.get(i);
         }
         for (int i = 0; i < SalesRevenue2.size(); i ++){
             SalesRevenueSum2 += SalesRevenue2.get(i);
         }
         
         
         
         if (COGSSum == COGSSum2 && InventorySum == InventorySum2 && AccountsReceivableSum == AccountsReceivableSum2 && AccountsPayableSum == AccountsPayableSum2 && SalesRevenueSum == SalesRevenueSum2 
             || COGSSum2 == COGSfl && InventorySum2 == Inventoryfl && AccountsReceivableSum2 == AccountsReceivablefl && AccountsPayableSum2 == AccountsPayablefl && SalesRevenueSum2 == SalesRevenuefl    ){
    FrameforPanel.OutputAnswer.setText("Correct Answer!");      
}else{
    FrameforPanel.OutputAnswer.setText("That answer is incorrect");
}
         }
    
    }

