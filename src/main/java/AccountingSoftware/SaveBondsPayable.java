package AccountingSoftware;



import AccountingSoftware.FrameforPanel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wdelc
 */
public class SaveBondsPayable {
    
    public SaveBondsPayable(){
           String Description = "";
        for (int i =0; i <    FrameforPanel.BondsPayableJETable.getRowCount(); i++){
        if (FrameforPanel.BondsPayableJETable.getValueAt(i,0).equals ("Debit")){
            
              FrameforPanel.BondPayableDebit.add (Float.parseFloat(   FrameforPanel.BondsPayableJETable.getValueAt(i,2).toString()));
            
           
            switch (   FrameforPanel.BondsPayableJETable.getValueAt(i,1).toString()) {
                case "Bonds Payable":
          
                       FrameforPanel.CreateTAccountRowBondsPayable("Date",Description,    FrameforPanel.BondPayableDebit.get(   FrameforPanel.NumberofBondPayableDebit), 0); //Number of invoices = the number of debits in the Journal Entry
                       FrameforPanel.NumberofBondPayableDebit ++;
                    break;
                case "Cash":
                       FrameforPanel.CreateTAccountRowCash("Date",Description,    FrameforPanel.BondPayableDebit.get(   FrameforPanel.NumberofBondPayableDebit), 0);
                       FrameforPanel.NumberofBondPayableDebit ++;
                    break;
                case "Discount on Bonds Payable":
                       FrameforPanel.CreateTAccountRowDiscountOnBondsPayable("Date",Description,    FrameforPanel.BondPayableDebit.get(   FrameforPanel.NumberofBondPayableDebit),0);
                      FrameforPanel. NumberofBondPayableDebit ++;
                    break;
                     case "Premium on Bonds Payable":
                  FrameforPanel.CreateTAccountRowPremiumOnBondsPayable("Date",Description,    FrameforPanel.BondPayableDebit.get(   FrameforPanel.NumberofBondPayableDebit) , 0 );
                   FrameforPanel.NumberofBondPayableDebit++;
                break;
                     case "Loss on Redemption":
                      FrameforPanel.CreateTAccountRowLossOnRedemption("Date",Description,    FrameforPanel.BondPayableDebit.get(   FrameforPanel.NumberofBondPayableDebit), 0);
                     FrameforPanel.NumberofBondPayableDebit++;
               break;
                
                default:
                    break;
            }
            
        }
        if (   FrameforPanel.BondsPayableJETable.getValueAt(i,0).equals("Credit")){
               FrameforPanel.BondPayableCredit.add(Float.parseFloat(   FrameforPanel.BondsPayableJETable.getValueAt(i,2).toString()));
            
           switch (   FrameforPanel.BondsPayableJETable.getValueAt(i,1).toString()){
               case "Bonds Payable":
               
                 FrameforPanel.CreateTAccountRowBondsPayable("Date",Description,0,    FrameforPanel.BondPayableCredit.get(   FrameforPanel.NumberofBondPayableCredit));
                FrameforPanel. NumberofBondPayableCredit++;
              break;
              
               case "Premium on Bonds Payable":
                  FrameforPanel.CreateTAccountRowPremiumOnBondsPayable("Date",Description, 0 ,    FrameforPanel.BondPayableCredit.get(   FrameforPanel.NumberofBondPayableCredit));
                   FrameforPanel.NumberofBondPayableCredit++;
                break;
               case "Cash":
                      FrameforPanel.CreateTAccountRowCash ("Date", Description, 0,    FrameforPanel.BondPayableCredit.get(   FrameforPanel.NumberofBondPayableCredit));
                      FrameforPanel.NumberofBondPayableCredit++;
                break;
                case "Discount on Bonds Payable":
                       FrameforPanel.CreateTAccountRowDiscountOnBondsPayable("Date",Description,0,    FrameforPanel.BondPayableCredit.get(   FrameforPanel.NumberofBondPayableCredit));
                      FrameforPanel. NumberofBondPayableCredit ++;
                    break;
                case "Gain on Redemption":
                       FrameforPanel.CreateTAccountRowGainOnRedemption ("Date", Description, 0,    FrameforPanel.BondPayableCredit.get(   FrameforPanel.NumberofBondPayableCredit));
                       FrameforPanel.NumberofBondPayableCredit++;
           default: 
               break;
            }
       }
        
       }
         FrameforPanel.BondPayableDebit.clear();
           FrameforPanel.BondPayableCredit.clear();
           FrameforPanel.NumberofBondPayableDebit=0;
           FrameforPanel.NumberofBondPayableCredit =0;
         DefaultTableModel dm = (DefaultTableModel)    FrameforPanel.BondsPayableJETable.getModel();
         DefaultTableModel dm2 = (DefaultTableModel)    FrameforPanel.BondsPayableAmortSchedule.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
    
    int rowCount2 = dm2.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount2 - 1; i >= 0; i--) {
    dm2.removeRow(i);
}
    }
}
