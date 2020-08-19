package AccountingSoftware;


//mport AccountingSoftware.FrameforPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wdelc
 */
public class ShowTAccountTest {
    public ShowTAccountTest(String value2){
        TestClass test = new TestClass();
         if (value2.equals("Cash")){
            FrameforPanel.TAccountChoice.setText("Cash T-Account");
            FrameforPanel.CashTAccount.setVisible(true);
            test.getSumCashTAccount(); 
        }else if(!value2.equals("Cash")){
            FrameforPanel.CashTAccount.setVisible(false);
           
        }
        if (value2.equals("Equipment")){
            FrameforPanel.TAccountChoice.setText("Equipment T-Account");
           FrameforPanel. EquipmentTAccount.setVisible(true);
            test.getSumEquipmentTAccount();
        }else if (!value2.equals("Equipment")){
           FrameforPanel. EquipmentTAccount.setVisible(false);
        }
         if (value2.equals("Common Stock")){
            FrameforPanel. TAccountChoice.setText("Common Stock T-Account");
           FrameforPanel. CommonStockTAccount.setVisible(true);
           test.getSumCommonStockTAccount();
        }else if (!value2.equals("Common Stock")){
            FrameforPanel.CommonStockTAccount.setVisible(false);
        }
         if (value2.equals("Supplies")){
            FrameforPanel. TAccountChoice.setText("Supplies T-Account");
          FrameforPanel.  SuppliesTAccount.setVisible(true);
           test.getSumSuppliesTAccount();
        }else if (!value2.equals("Supplies")){
            FrameforPanel.SuppliesTAccount.setVisible(false);
        }
          if (value2.equals("Inventory")){
            FrameforPanel. TAccountChoice.setText("Inventory T-Account");
           FrameforPanel. InventoryTAccount.setVisible(true);
           test. getSumInventoryTAccount();
        }else if (!value2.equals("Inventory")){
            FrameforPanel.InventoryTAccount.setVisible(false);
        }
          if (value2.equals("Accounts Receivable")){
            FrameforPanel. TAccountChoice.setText("Accounts Receivable");
           FrameforPanel.  AccountsReceivableTAccount.setVisible(true);
              test.getSumAccountsRecievableTAccount();
          }else if (!value2.equals ("Accounts Receivable")){
             FrameforPanel. AccountsReceivableTAccount.setVisible(false);
          }
          if (value2.equals("Sales Revenue")){
           FrameforPanel.  TAccountChoice.setText("Sales Revenue");
           FrameforPanel.  SalesRevenueTAccount.setVisible(true);
              test.getSumSalesRevenueTAccount();
          }else if (!value2.equals ("Sales Revenue")){
             FrameforPanel. SalesRevenueTAccount.setVisible(false);
          }
          if (value2.equals("Sales Discount")){
            FrameforPanel. TAccountChoice.setText("Sales Discount");
             FrameforPanel.SalesDiscountTAccount.setVisible(true);
              test.getSumSalesDiscountTAccount();
          }else if (!value2.equals ("Sales Discount")){
              FrameforPanel.SalesDiscountTAccount.setVisible(false);
          }
          if (value2.equals("Sales Discount Forfeited")){
             FrameforPanel.TAccountChoice.setText("Sales Discount Forfeited");
             FrameforPanel.SalesDiscountForfeitedTAccount.setVisible(true);
              test.getSumSalesDiscountForfeitedTAccount();
          }else if (!value2.equals ("Sales Discount")){
              FrameforPanel.SalesDiscountForfeitedTAccount.setVisible(false);
          }
          if (value2.equals("Sales Returns and Allowances")){
             FrameforPanel.TAccountChoice.setText("Sales Returns and Allowances");
             FrameforPanel.SalesReturnsAndAllowancesTAccount.setVisible(true);
              test.getSumSalesReturnsAndAllowances();
          }else if (!value2.equals ("Sales Returns and Allowances")){
              FrameforPanel.SalesReturnsAndAllowancesTAccount.setVisible(false);
          }
          if (value2.equals("Allowance for Sales Returns and Allowances")){
             FrameforPanel.TAccountChoice.setText("Allowance for Sales Returns and Allowances");
             FrameforPanel.AllowanceForSalesReturnsAndAllowancesTAccount.setVisible(true);
              test.getSumAllowanceForReturnsAndAllowances();
          }else if (!value2.equals ("Allowance for Sales Returns and Allowances")){
              FrameforPanel.AllowanceForSalesReturnsAndAllowancesTAccount.setVisible(false);
          }
           if (value2.equals("Allowance for Doubtful Accounts")){
             FrameforPanel.TAccountChoice.setText("Allowance for Doubtful Accounts");
             FrameforPanel.AllowanceForDoubtfulAccountsTAccount.setVisible(true);
              test.getSumAllowanceForDoubtfulAccounts();
          }else if (!value2.equals ("Allowance for Doubtful Accounts")){
              FrameforPanel.AllowanceForDoubtfulAccountsTAccount.setVisible(false);
          }
            if (value2.equals("Bad Debt Expense")){
             FrameforPanel.TAccountChoice.setText("Bad Debt Expense");
            FrameforPanel. BadDebtExpenseTAccount.setVisible(true);
              test.getSumBadDebtExpense();
          }else if (!value2.equals ("Bad Debt Expense")){
             FrameforPanel. BadDebtExpenseTAccount.setVisible(false);
          }
            if (value2.equals("Notes Receivable")){
             FrameforPanel.TAccountChoice.setText("Notes Receivable");
             FrameforPanel.NotesReceivableTAccount.setVisible(true);
              test.getSumNotesReceivable();
          }else if (!value2.equals ("Notes Receivable")){
             FrameforPanel. NotesReceivableTAccount.setVisible(false);
          }
            if (value2.equals("Discount on Notes Receivable")){
             FrameforPanel.TAccountChoice.setText("Discount on Notes Receivable");
            FrameforPanel. DiscountOnNotesReceivableTAccount.setVisible(true);
              test.getSumDiscountOnNotesReceivable();
          }else if (!value2.equals ("Discount on Notes Receivable")){
             FrameforPanel. DiscountOnNotesReceivableTAccount.setVisible(false);
          }
            if (value2.equals("Interest Revenue")){
            FrameforPanel. TAccountChoice.setText("Interest Revenue");
            FrameforPanel. InterestRevenueTAccount.setVisible(true);
              test.getSumBadDebtExpense();
          }else if (!value2.equals ("Interest Revenue")){
            FrameforPanel.  InterestRevenueTAccount.setVisible(false);
          }
            if (value2.equals("Bonds Payable")){
            FrameforPanel. TAccountChoice.setText("Bonds Payable");
            FrameforPanel. BondsPayableTAccount.setVisible(true);
              test.getSumBondsPayable();
          }else if (!value2.equals ("Bonds Payable")){
            FrameforPanel.  BondsPayableTAccount.setVisible(false);
          }
            if (value2.equals("Discount on Bonds Payable")){
            FrameforPanel. TAccountChoice.setText("Bonds Payable");
            FrameforPanel. DiscountOnBondsPayableTAccount.setVisible(true);
              test.getSumDiscountOnBondsPayable();
          }else if (!value2.equals ("Discount on Bonds Payable")){
            FrameforPanel.  DiscountOnBondsPayableTAccount.setVisible(false);
          }
            if (value2.equals("Premium on Bonds Payable")){
            FrameforPanel. TAccountChoice.setText("Premium on Bonds Payable");
            FrameforPanel. PremiumOnBondsPayableTAccount.setVisible(true);
              test.getSumPremiumOnBondsPayable();
          }else if (!value2.equals ("Premium on Bonds Payable")){
            FrameforPanel.  PremiumOnBondsPayableTAccount.setVisible(false);
          }
             if (value2.equals("Loss On Redemption")){
            FrameforPanel. TAccountChoice.setText("Loss On Redemption");
            FrameforPanel.LossRedemptionTAccount.setVisible(true);
              test.getSumLossOnRedemption();
          }else if (!value2.equals ("Loss On Redemption")){
            FrameforPanel.LossRedemptionTAccount.setVisible(false);
          }
             if (value2.equals("Gain On Redemption")){
            FrameforPanel. TAccountChoice.setText("Gain On Redemption");
            FrameforPanel.GainRedemptionTAccount.setVisible(true);
              test.getSumGainOnRedemption();
          }else if (!value2.equals ("Gain On Redemption")){
            FrameforPanel.GainRedemptionTAccount.setVisible(false);
          }
              if (value2.equals("Depreciation Expense")){
            FrameforPanel.TAccountChoice.setText("Depreciation Expense");
            FrameforPanel.DepreciationExpenseTAccount.setVisible(true);
              test.getSumDepreciationExpense();
          }else if (!value2.equals ("Depreciation Expense")){
            FrameforPanel.DepreciationExpenseTAccount.setVisible(false);
          }
                if (value2.equals("Accumulated Depreciation")){
            FrameforPanel. TAccountChoice.setText("Accumulated Depreciation");
            FrameforPanel.AccumulatedDepreciationTAccount.setVisible(true);
              test.getSumAccumulatedDepreciation();
          }else if (!value2.equals ("Accumulated Depreciation")){
            FrameforPanel.AccumulatedDepreciationTAccount.setVisible(false);
          }
                if (value2.equals("Purchases")){
            FrameforPanel. TAccountChoice.setText("Purchases");
            FrameforPanel.PurchasesTAccount.setVisible(true);
              test.getSumPurchases();
          }else if (!value2.equals ("Purchases")){
            FrameforPanel.PurchasesTAccount.setVisible(false);
          }
                if (value2.equals("Accounts Payable")){
            FrameforPanel. TAccountChoice.setText("Accounts Payable");
            FrameforPanel.AccountsPayableTAccount.setVisible(true);
              test.getSumAccountsPayable();
          }else if (!value2.equals ("Accounts Payable")){
            FrameforPanel.AccountsPayableTAccount.setVisible(false);
          }
                 if (value2.equals("Cost of Goods Sold")){
            FrameforPanel. TAccountChoice.setText("Cost of Goods Sold");
            FrameforPanel.CostofGoodsSoldTAccount.setVisible(true);
              test.getSumCostofGoodsSold();
          }else if (!value2.equals ("Cost of Goods Sold")){
            FrameforPanel.CostofGoodsSoldTAccount.setVisible(false);
          }
                    if (value2.equals("Treasury Stock")){
            FrameforPanel. TAccountChoice.setText("Treasury Stock");
            FrameforPanel.TStockTAccount.setVisible(true);
              test.getSumTStock();
          }else if (!value2.equals ("Treasury Stock")){
            FrameforPanel.TStockTAccount.setVisible(false);
          }
                       if (value2.equals("Paid in Capital")){
            FrameforPanel. TAccountChoice.setText("Paid in Capital");
            FrameforPanel.PaidinCapitalTAccount.setVisible(true);
              test.getSumPaidinCapital();
          }else if (!value2.equals ("Paid in Capital")){
            FrameforPanel.PaidinCapitalTAccount.setVisible(false);
          }
    }
    

   
}
