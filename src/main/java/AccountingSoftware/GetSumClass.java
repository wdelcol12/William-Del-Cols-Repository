package AccountingSoftware;


import AccountingSoftware.FrameforPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wdelc
 */
public class GetSumClass extends FrameforPanel {
       public GetSumClass() {                                             
          System.out.println("GetSumClass");
          System.out.println(value2);
          if (value2.equals("Cash")){
              System.out.println("It found the Cash");
              ShowCashTAccount = true;
            TAccountChoice.setText("Cash T-Account");
            CashTAccount.setVisible(true);
            getSumCashTAccount(); 
        }else if(!value2.equals("Cash")){
            CashTAccount.setVisible(false);
           
        }
        if (value2.equals("Equipment")){
            TAccountChoice.setText("Equipment T-Account");
            EquipmentTAccount.setVisible(true);
            getSumCommonStockTAccount();
        }else if (!value2.equals("Equipment")){
            EquipmentTAccount.setVisible(false);
        }
         if (value2.equals("Common Stock")){
             TAccountChoice.setText("Common Stock T-Account");
            CommonStockTAccount.setVisible(true);
            getSumCommonStockTAccount();
        }else if (!value2.equals("Common Stock")){
            CommonStockTAccount.setVisible(false);
        }
         if (value2.equals("Supplies")){
             TAccountChoice.setText("Supplies T-Account");
            SuppliesTAccount.setVisible(true);
            getSumSuppliesTAccount();
        }else if (!value2.equals("Supplies")){
            SuppliesTAccount.setVisible(false);
        }
          if (value2.equals("Inventory")){
             TAccountChoice.setText("Inventory T-Account");
            InventoryTAccount.setVisible(true);
            getSumInventoryTAccount();
        }else if (!value2.equals("Inventory")){
            InventoryTAccount.setVisible(false);
        }
          if (value2.equals("Accounts Receivable")){
             TAccountChoice.setText("Accounts Receivable");
             AccountsReceivableTAccount.setVisible(true);
              getSumAccountsRecievableTAccount();
          }else if (!value2.equals ("Accounts Receivable")){
              AccountsReceivableTAccount.setVisible(false);
          }
          if (value2.equals("Sales Revenue")){
             TAccountChoice.setText("Sales Revenue");
             SalesRevenueTAccount.setVisible(true);
              getSumSalesRevenueTAccount();
          }else if (!value2.equals ("Sales Revenue")){
              SalesRevenueTAccount.setVisible(false);
          }
          if (value2.equals("Sales Discount")){
             TAccountChoice.setText("Sales Discount");
             SalesDiscountTAccount.setVisible(true);
              getSumSalesDiscountTAccount();
          }else if (!value2.equals ("Sales Discount")){
              SalesDiscountTAccount.setVisible(false);
          }
          if (value2.equals("Sales Discount Forfeited")){
             TAccountChoice.setText("Sales Discount Forfeited");
             SalesDiscountForfeitedTAccount.setVisible(true);
              getSumSalesDiscountForfeitedTAccount();
          }else if (!value2.equals ("Sales Discount")){
              SalesDiscountForfeitedTAccount.setVisible(false);
          }
          if (value2.equals("Sales Returns and Allowances")){
             TAccountChoice.setText("Sales Returns and Allowances");
             SalesReturnsAndAllowancesTAccount.setVisible(true);
              getSumSalesReturnsAndAllowances();
          }else if (!value2.equals ("Sales Returns and Allowances")){
              SalesReturnsAndAllowancesTAccount.setVisible(false);
          }
          if (value2.equals("Allowance for Sales Returns and Allowances")){
             TAccountChoice.setText("Allowance for Sales Returns and Allowances");
             AllowanceForSalesReturnsAndAllowancesTAccount.setVisible(true);
              getSumAllowanceForReturnsAndAllowances();
          }else if (!value2.equals ("Allowance for Sales Returns and Allowances")){
              AllowanceForSalesReturnsAndAllowancesTAccount.setVisible(false);
          }
           if (value2.equals("Allowance for Doubtful Accounts")){
             TAccountChoice.setText("Allowance for Doubtful Accounts");
             AllowanceForDoubtfulAccountsTAccount.setVisible(true);
              getSumAllowanceForDoubtfulAccounts();
          }else if (!value2.equals ("Allowance for Doubtful Accounts")){
              AllowanceForDoubtfulAccountsTAccount.setVisible(false);
          }
            if (value2.equals("Bad Debt Expense")){
             TAccountChoice.setText("Bad Debt Expense");
             BadDebtExpenseTAccount.setVisible(true);
              getSumBadDebtExpense();
          }else if (!value2.equals ("Bad Debt Expense")){
              BadDebtExpenseTAccount.setVisible(false);
          }
            if (value2.equals("Notes Receivable")){
             TAccountChoice.setText("Notes Receivable");
             NotesReceivableTAccount.setVisible(true);
              getSumNotesReceivable();
          }else if (!value2.equals ("Notes Receivable")){
              NotesReceivableTAccount.setVisible(false);
          }
            if (value2.equals("Discount on Notes Receivable")){
             TAccountChoice.setText("Discount on Notes Receivable");
             DiscountOnNotesReceivableTAccount.setVisible(true);
              getSumDiscountOnNotesReceivable();
          }else if (!value2.equals ("Discount on Notes Receivable")){
              DiscountOnNotesReceivableTAccount.setVisible(false);
          }
            if (value2.equals("Interest Revenue")){
             TAccountChoice.setText("Interest Revenue");
             InterestRevenueTAccount.setVisible(true);
              getSumBadDebtExpense();
          }else if (!value2.equals ("Interest Revenue")){
              InterestRevenueTAccount.setVisible(false);
          }
    }                          
    
    public void getSumCashTAccount(){
     float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< CashTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(CashTAccountTable.getValueAt(i,3).toString());
        
     }
     for (int i = 0; i< CashTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(CashTAccountTable.getValueAt(i,2).toString());
         
     }
   //  System.out.println(sumd);
   //  System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
         
    // Balance.setText(Integer.toString(sum));
        
 }
        
  public void getSumCommonStockTAccount(){
       float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< CommonStockTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(CommonStockTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< CommonStockTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(CommonStockTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
         
    // Balance.setText(Integer.toString(sum));
     
 }
   public void getSumEquipmentTAccount(){
       float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< EquipmentTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(EquipmentTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< EquipmentTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(EquipmentTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
         
    // Balance.setText(Integer.toString(sum));
     
 }
   public void getSumInventoryTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< InventoryTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(InventoryTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< InventoryTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(InventoryTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
         
    // Balance.setText(Integer.toString(sum));
     
 }
     public void getSumSuppliesTAccount(){
       float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< SuppliesTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(SuppliesTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< SuppliesTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(SuppliesTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
         
    // Balance.setText(Integer.toString(sum));
     
 }
     public void getSumAccountsRecievableTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< AccountsReceivableTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(AccountsReceivableTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< AccountsReceivableTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(AccountsReceivableTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     }
      public void getSumSalesRevenueTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< SalesRevenueTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(SalesRevenueTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< InventoryTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(SalesRevenueTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     }
      public void getSumSalesDiscountTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< SalesDiscountTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(SalesDiscountTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< SalesDiscountTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(SalesDiscountTAccountTable.getValueAt(i,2).toString());
         
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     }
       public void getSumSalesDiscountForfeitedTAccount(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< SalesDiscountForfeitedTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(SalesDiscountForfeitedTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< SalesDiscountForfeitedTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(SalesDiscountForfeitedTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     }
        public void getSumSalesReturnsAndAllowances(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< SalesReturnsAndAllowancesTAccountTable.getRowCount(); i++){
         sumc = sumc + Float.parseFloat(SalesReturnsAndAllowancesTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< SalesReturnsAndAllowancesTAccountTable.getRowCount(); i++){
         sumd = sumd + Float.parseFloat(SalesReturnsAndAllowancesTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     }
        public void getSumAllowanceForReturnsAndAllowances(){
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< AllowanceForSalesReturnsAndAllowancesTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat(AllowanceForSalesReturnsAndAllowancesTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< AllowanceForSalesReturnsAndAllowancesTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat(AllowanceForSalesReturnsAndAllowancesTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     }
         public void getSumAllowanceForDoubtfulAccounts(){
             BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< AllowanceForDoubtfulAccountsTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat(AllowanceForDoubtfulAccountsTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< AllowanceForDoubtfulAccountsTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat(AllowanceForDoubtfulAccountsTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     }
          public void getSumBadDebtExpense(){
              BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< BadDebtExpenseTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat(BadDebtExpenseTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< BadDebtExpenseTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat(BadDebtExpenseTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     }
          public void getSumNotesReceivable(){
             BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< NotesReceivableTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat(NotesReceivableTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< NotesReceivableTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat(NotesReceivableTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     }
         public void getSumInterestRevenue(){
             BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< InterestRevenueTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat(InterestRevenueTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< InterestRevenueTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat(InterestRevenueTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     } 
         public void getSumDiscountOnNotesReceivable(){
             BalanceType.setText("");
      float sumd = 0;
     float sumc = 0;
     float sum = 0;
     for (int i =0; i< DiscountOnNotesReceivableTAccountTable.getRowCount(); i++){
         sumc += Float.parseFloat(DiscountOnNotesReceivableTAccountTable.getValueAt(i,3).toString());
         
     }
     for (int i = 0; i< DiscountOnNotesReceivableTAccountTable.getRowCount(); i++){
         sumd += Float.parseFloat(DiscountOnNotesReceivableTAccountTable.getValueAt(i,2).toString());
     }
     System.out.println(sumd);
     System.out.println(sumc);
     if (sumd > sumc){
         BalanceType.setText("Dr.");
         sum = sumd - sumc;
         Balance.setText(Float.toString(sum));
     }
      if (sumc > sumd){
         BalanceType.setText("Cr.");
         sum =sumc - sumd;
         Balance.setText(Float.toString(sum));
     } 
      if (sumc == sumd){
         Balance.setText(Float.toString(sum));
     }
     } 
}
