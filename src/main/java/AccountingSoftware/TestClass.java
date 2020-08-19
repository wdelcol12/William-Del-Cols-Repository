package AccountingSoftware;



import AccountingSoftware.FrameforPanel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wdelc
 */
public class TestClass {
    
   
            
    
  public void getSumCashTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< FrameforPanel.CashTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(FrameforPanel.CashTAccountTable.getValueAt(i,3).toString());
         System.out.println("First Test");
     }
     for (int i = 0; i< FrameforPanel.CashTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(FrameforPanel.CashTAccountTable.getValueAt(i,2).toString());
         System.out.println("Second Test");
     }
   //  System.out.println(FrameforPanel.CashTAccountTable.getValueAt(0,3).toString());
     System.out.println(sumd);
     System.out.println(sumc);
     System.out.println("Working for now");
     if (sumd > sumc){
     FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
       FrameforPanel.Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel.BalanceType.setText("Cr.");
         sum =sumc - sumd;
      FrameforPanel.Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
     FrameforPanel.Balance.setText(Float.toString(sum));
     }
        
    // Balance.setText(Integer.toString(sum));
    // System.out.println(FrameforPanel.CashTAccountTable.getValueAt(0,3).toString());
 }
  public void getSumCommonStockTAccount(){
       float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.CommonStockTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat( FrameforPanel.CommonStockTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.CommonStockTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat( FrameforPanel.CommonStockTAccountTable.getValueAt(i,2).toString());
         
     }
     
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
          FrameforPanel.Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
          FrameforPanel.BalanceType.setText("Cr.");
         sum =sumc - sumd;
          FrameforPanel.Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
         
    // Balance.setText(Integer.toString(sum));
     
 }
   public void getSumEquipmentTAccount(){
       float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.EquipmentTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat( FrameforPanel.EquipmentTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.EquipmentTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat( FrameforPanel.EquipmentTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
          FrameforPanel.BalanceType.setText("Cr.");
         sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel.Balance.setText(Float.toString(sum));
     }
         
    // Balance.setText(Integer.toString(sum));
     
 }
   public void getSumInventoryTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.InventoryTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat( FrameforPanel.InventoryTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.InventoryTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat( FrameforPanel.InventoryTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         FrameforPanel. BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
          FrameforPanel.BalanceType.setText("Cr.");
         sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
         
    // Balance.setText(Integer.toString(sum));
     
 }
     public void getSumSuppliesTAccount(){
       float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.SuppliesTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat( FrameforPanel.SuppliesTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.SuppliesTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat( FrameforPanel.SuppliesTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         FrameforPanel. BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
          FrameforPanel.BalanceType.setText("Cr.");
         sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
          FrameforPanel.Balance.setText(Float.toString(sum));
     }
         
    // Balance.setText(Integer.toString(sum));
     
 }
     public void getSumAccountsRecievableTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.AccountsReceivableTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat( FrameforPanel.AccountsReceivableTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.AccountsReceivableTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat( FrameforPanel.AccountsReceivableTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
          FrameforPanel.Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
         sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     }
      public void getSumSalesRevenueTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.SalesRevenueTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat( FrameforPanel.SalesRevenueTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.SalesRevenueTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat( FrameforPanel.SalesRevenueTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         FrameforPanel. BalanceType.setText("Dr.");
         sum = sumd - sumc;
        FrameforPanel.  Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
        FrameforPanel.  BalanceType.setText("Cr.");
         sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     }
      public void getSumSalesDiscountTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.SalesDiscountTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat( FrameforPanel.SalesDiscountTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.SalesDiscountTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat( FrameforPanel.SalesDiscountTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         FrameforPanel. BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
         sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     }
       public void getSumSalesDiscountForfeitedTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.SalesDiscountForfeitedTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat( FrameforPanel.SalesDiscountForfeitedTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.SalesDiscountForfeitedTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat( FrameforPanel.SalesDiscountForfeitedTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
         sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
          FrameforPanel.Balance.setText(Float.toString(sum));
     }
     }
        public void getSumSalesReturnsAndAllowances(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.SalesReturnsAndAllowancesTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat( FrameforPanel.SalesReturnsAndAllowancesTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.SalesReturnsAndAllowancesTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat( FrameforPanel.SalesReturnsAndAllowancesTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         FrameforPanel. BalanceType.setText("Dr.");
         sum = sumd - sumc;
          FrameforPanel.Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
         sum =sumc - sumd;
          FrameforPanel.Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
          FrameforPanel.Balance.setText(Float.toString(sum));
     }
     }
        public void getSumAllowanceForReturnsAndAllowances(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.AllowanceForSalesReturnsAndAllowancesTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.AllowanceForSalesReturnsAndAllowancesTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.AllowanceForSalesReturnsAndAllowancesTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.AllowanceForSalesReturnsAndAllowancesTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
          FrameforPanel.BalanceType.setText("Cr.");
         sum =sumc - sumd;
          FrameforPanel.Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
        FrameforPanel.Balance.setText(Float.toString(sum));
     }
     }
         public void getSumAllowanceForDoubtfulAccounts(){
             FrameforPanel. BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.AllowanceForDoubtfulAccountsTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.AllowanceForDoubtfulAccountsTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.AllowanceForDoubtfulAccountsTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.AllowanceForDoubtfulAccountsTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         FrameforPanel. BalanceType.setText("Dr.");
         sum = sumd - sumc;
          FrameforPanel.Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
          FrameforPanel.BalanceType.setText("Cr.");
         sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     }
          public void getSumBadDebtExpense(){
               FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.BadDebtExpenseTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.BadDebtExpenseTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.BadDebtExpenseTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.BadDebtExpenseTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         FrameforPanel. BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
         sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     }
          public void getSumNotesReceivable(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.NotesReceivableTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.NotesReceivableTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.NotesReceivableTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.NotesReceivableTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         FrameforPanel. BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
        FrameforPanel.  BalanceType.setText("Cr.");
         sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     }
         public void getSumInterestRevenue(){
             FrameforPanel. BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.InterestRevenueTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.InterestRevenueTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.InterestRevenueTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.InterestRevenueTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
          FrameforPanel.Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
         sum =sumc - sumd;
          FrameforPanel.Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
         public void getSumDiscountOnNotesReceivable(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.DiscountOnNotesReceivableTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.DiscountOnNotesReceivableTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.DiscountOnNotesReceivableTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.DiscountOnNotesReceivableTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
         public void getSumBondsPayable(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.BondsPayableTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.BondsPayableTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.BondsPayableTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.BondsPayableTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
         public void getSumDiscountOnBondsPayable(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.DiscountOnBondsPayableTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.DiscountOnBondsPayableTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.DiscountOnBondsPayableTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.DiscountOnBondsPayableTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
         public void getSumPremiumOnBondsPayable(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.PremiumOnBondsPayableTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.PremiumOnBondsPayableTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.PremiumOnBondsPayableTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.PremiumOnBondsPayableTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
         public void getSumLossOnRedemption(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.LossRedemptionTAccountTable.getRowCount(); i++){
        sumc += Float.parseFloat( FrameforPanel.LossRedemptionTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.LossRedemptionTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.LossRedemptionTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
         public void getSumGainOnRedemption(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.GainOnRedemptionTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.GainOnRedemptionTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.GainOnRedemptionTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.GainOnRedemptionTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
         public void getSumDepreciationExpense(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.DepreciationTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.DepreciationTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.DepreciationTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.DepreciationTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
         public void getSumAccumulatedDepreciation(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.AccumulatedDepreciationTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.AccumulatedDepreciationTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.AccumulatedDepreciationTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.AccumulatedDepreciationTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
          public void getSumPurchases(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.PurchasesTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.PurchasesTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.PurchasesTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.PurchasesTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
           public void getSumAccountsPayable(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.AccountsPayableTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.AccountsPayableTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.AccountsPayableTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.AccountsPayableTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
           public void getSumCostofGoodsSold(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.CostofGoodsSoldTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.CostofGoodsSoldTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.CostofGoodsSoldTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.CostofGoodsSoldTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
               public void getSumTStock(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.TStockTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.TStockTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.TStockTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.TStockTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
               public void getSumPaidinCapital(){
              FrameforPanel.BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i<  FrameforPanel.PaidinCapitalTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat( FrameforPanel.PaidinCapitalTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i<  FrameforPanel.PaidinCapitalTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat( FrameforPanel.PaidinCapitalTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
          FrameforPanel.BalanceType.setText("Dr.");
         sum = sumd - sumc;
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         FrameforPanel. BalanceType.setText("Cr.");
          sum =sumc - sumd;
         FrameforPanel. Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         FrameforPanel. Balance.setText(Float.toString(sum));
     }
     } 
  }
   

