package AccountingSoftware;



import AccountingSoftware.FrameforPanel;
import static AccountingSoftware.FrameforPanel.FIFOPerpTable;
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
public class InventoryClass {
   //boolean PreviousID;
   public static boolean Purchase = false;
   public static boolean Sale = false;
    public InventoryClass(boolean Educational, boolean PerpetualEdu, boolean PurchaseEDU, boolean FIFO){
        
        
     
        String UnitString;
        int Unitfl = 0;
        int BeginningInventory;
        
        String SalesPriceString;
        int SalesPricefl = 0;
        
       boolean Periodic = false;
       boolean Perpetual = false;
   
       
       boolean Sale = false;
       
       int finishedprod = 0;
       
       String InventoryIDString = "";
       int InventoryIDfl = 0;
       
       
       
       int AmountOfPurchases = 0;
       
       String BeginInvString = "";
       int BeginInvfl = 0;
       
       int AmountOfPurchasesOnID;
     //  float Balance = 0;
       int InvSale = 0; 
       
      // String IDSelected;
       
      
     
       try {
           InventoryIDString = FrameforPanel.ProductIDInput.getText();
            InventoryIDfl = Integer.parseInt(InventoryIDString);
       }catch (NumberFormatException e){
          
       }
        
        try {
        UnitString = FrameforPanel.Units.getText();
        Unitfl = Integer.parseInt(UnitString);
} catch (NumberFormatException e) {
}   
        try {
        SalesPriceString = FrameforPanel.SalesPrice.getText();
        SalesPricefl  = Integer.parseInt(SalesPriceString);
} catch (NumberFormatException e) {
}   
     //   String Hello = FrameforPanel.InventoryData.getSelectedItem().toString();
         
        if (FrameforPanel.InventoryData.getSelectedItem().equals("Purchase")){
           
            Purchase = true;
        }else if (FrameforPanel.InventoryDataSelected.equals("Sale")){
            Sale = true;
        }
        
        
        
        if (FrameforPanel.PerpetualCheck.isSelected()){
            Perpetual= true;
        }else if (!FrameforPanel.PerpetualCheck.isSelected()){
            Perpetual = false;
           
        }
       if (FrameforPanel.PeriodicCheck.isSelected()){
            Periodic = true;
        }else if (!FrameforPanel.PeriodicCheck.isSelected()){
            Periodic = false;
           
        }
       if (Perpetual == true && Periodic == true){
           Perpetual = false;
           Periodic = false;
       }
       DefaultTableModel IDTab = (DefaultTableModel) FrameforPanel.IDTable.getModel();
       InventoryIDString = FrameforPanel.ProductIDInput.getText();
     System.out.println(FrameforPanel.InventoryData.getSelectedItem());
       
      
       for (int i = 0; i < IDTab.getRowCount(); i++){
         
           if (FrameforPanel.ID.get(i) == InventoryIDfl && FrameforPanel.PreviousID == InventoryIDfl ){
               
               FrameforPanel.PreviousID = FrameforPanel.ID.get(i);
              // System.out.println(PreviousID);
               FrameforPanel.IDSelect = InventoryIDfl;
                FrameforPanel.BeginningInvID.setText("");
              FrameforPanel.ItemNameOutput.setText("");
              FrameforPanel.ItemCategoryOutput.setText("");
              FrameforPanel.EndingInvOutput.setText("");
              
              FrameforPanel.BeginningInvID.setText(FrameforPanel.Stock.get(i).toString());
              FrameforPanel.ItemNameOutput.setText(FrameforPanel.ItemName.get(i).toString());
              FrameforPanel.ItemCategoryOutput.setText(FrameforPanel.Description.get(i).toString());
              FrameforPanel.EndingInvOutput.setText(FrameforPanel.Stock.get(i).toString());
              
           }else if (FrameforPanel.ID.get(i) == InventoryIDfl && FrameforPanel.PreviousID != InventoryIDfl){
               
               FrameforPanel.PreviousID = FrameforPanel.ID.get(i);
                 FrameforPanel.IDSelect = InventoryIDfl;
                FrameforPanel.BeginningInvID.setText("");
              FrameforPanel.ItemNameOutput.setText("");
              FrameforPanel.ItemCategoryOutput.setText("");
              FrameforPanel.EndingInvOutput.setText("");
              
              FrameforPanel.BeginningInvID.setText(FrameforPanel.Stock.get(i).toString());
              FrameforPanel.ItemNameOutput.setText(FrameforPanel.ItemName.get(i).toString());
              FrameforPanel.ItemCategoryOutput.setText(FrameforPanel.Description.get(i).toString());
              FrameforPanel.EndingInvOutput.setText(FrameforPanel.Stock.get(i).toString());
              
               FrameforPanel.Balanceinv = 0;
                 DefaultTableModel dm1 = (DefaultTableModel) FIFOPerpTable.getModel();
                 
                
int rowCount1 = dm1.getRowCount();
//Remove rows one by one from the end of the table
for (int z = rowCount1 - 1; z >= 0; z--) {
    dm1.removeRow(z);
}
    

        DefaultTableModel dm = (DefaultTableModel) FrameforPanel.InventoryManagementJETable.getModel();
                 
                
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int z = rowCount1 - 1; z >= 0; z--) {
    dm.removeRow(z);
}
    }

       }
       if (FrameforPanel.InventoryData.getSelectedItem().equals("Purchase")){
           Purchase = true;
       } else if (FrameforPanel.InventoryData.getSelectedItem().equals("Sale")){
           Sale = true;
       }
    
      // Perpetual= true;
       
       
       FrameforPanel.LeftoverInv = Unitfl;
            DefaultTableModel InventoryJE = (DefaultTableModel) FrameforPanel.InventoryManagementJETable.getModel();
       //      DefaultTableModel PeriodicTable = (DefaultTableModel) FrameforPanel.PeriodicInvTable.getModel();
            DefaultTableModel FifoPerp = (DefaultTableModel) FrameforPanel.FIFOPerpTable.getModel();
            if (FrameforPanel.InventoryData.getSelectedItem().equals("Purchase") && Perpetual == true && FrameforPanel.CFAssumption.getSelectedItem().equals("FIFO") || Educational == true && PurchaseEDU == true && PerpetualEdu == true && FIFO == true){
                int InventoryAm = Unitfl*SalesPricefl;
                
            //   InventoryIdentification ID = new InventoryIdentification (InventoryIDfl, Unitfl, SalesPricefl);
               InventoryJE.addRow(new Object[]{"Debit", "Inventory", InventoryAm});
               InventoryJE.addRow(new Object[]{"Credit", "Accounts Payable", InventoryAm});
             //  System.out.println(InventoryAm);
           //  InventoryLeft += Unitfl;
            FrameforPanel. FifoDataPrice.add(SalesPricefl);
            FrameforPanel. FifoDataUnits.add(Unitfl);
               FrameforPanel.Balanceinv = InventoryAm + FrameforPanel.Balanceinv;
              FifoPerp.addRow(new Object []{"Purchase", SalesPricefl,Unitfl, "-","-", FrameforPanel.Balanceinv});
           
            }else if (FrameforPanel.InventoryData.getSelectedItem().equals("Sale") && Perpetual == true && FrameforPanel.CFAssumption.getSelectedItem().equals("FIFO") || Educational == true && PurchaseEDU == false && PerpetualEdu == true && FIFO ==true){
                    int InventoryAm = Unitfl*SalesPricefl;
                //InventoryIdentification.FindID(InventoryIDfl);
               // LeftoverInv = Unitfl;
                
               InventoryJE.addRow(new Object[]{"Debit", "Accounts Receivable", InventoryAm});
               InventoryJE.addRow(new Object[]{"Credit", "Sales Revenue", InventoryAm});
            
               for (int i =0; i< FifoPerp.getRowCount(); i++){
                   if (FifoPerp.getValueAt(i,0).equals ("Purchase")){
                 // InvSale = Float.parseFloat(FifoPerp.getValueAt(i,1).toString()) * Unitfl; 
                 //InventoryLeft = InventoryLeft - Unitfl;
               
               
                   }
               }
             for(int i=0; i< FrameforPanel.FifoDataUnits.size(); i++){
            if (FrameforPanel.FifoDataUnits.get(i) < FrameforPanel.LeftoverInv && FrameforPanel.FifoDataUnits.get(i) != 0){
                //System.out.println(LeftoverInv);
              //   FifoDataUnits.set(i, LeftoverInv);
              FrameforPanel.Balanceinv = FrameforPanel.Balanceinv -(FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i));
                FifoPerp.addRow(new Object[]{"Sale", "-", "-",FrameforPanel.FifoDataPrice.get(i),FrameforPanel.FifoDataUnits.get(i), FrameforPanel.Balanceinv});
                  FrameforPanel.LeftoverInv = FrameforPanel.LeftoverInv- FrameforPanel.FifoDataUnits.get(i);
                //  System.out.println(LeftoverInv);
                 // FifoDataUnits.set(i, LeftoverInv);
                 InventoryJE.addRow(new Object[]{"Debit", "Cost of Goods Sold", FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i)});
               InventoryJE.addRow(new Object[]{"Credit", "Inventory",  FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i)});
                 FrameforPanel.FifoDataUnits.set(i, finishedprod);
                 FrameforPanel.FifoDataPrice.set(i, finishedprod);
             
                
                
                  
            }else  if (FrameforPanel.FifoDataUnits.get(i) >= FrameforPanel.LeftoverInv && FrameforPanel.FifoDataUnits.get(i) != 0 ){
               // System.out.println(LeftoverInv);
           // System.out.println("This went first");
               // LeftoverInv = LeftoverInv-FifoDataUnits.get(i);
              // System.out.println("Balance is: " + Balanceinv);
                FrameforPanel.Balanceinv = FrameforPanel.Balanceinv -(FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv);
                FifoPerp.addRow(new Object[]{"Sale", "-", "-",FrameforPanel.FifoDataPrice.get(i),FrameforPanel.LeftoverInv, FrameforPanel.Balanceinv});
                  InventoryJE.addRow(new Object[]{"Debit", "Cost of Goods Sold", FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv});
               InventoryJE.addRow(new Object[]{"Credit", "Inventory",  FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv});
             FrameforPanel.LeftoverInv = FrameforPanel.FifoDataUnits.get(i) - FrameforPanel.LeftoverInv;
             
               FrameforPanel.FifoDataUnits.set(i,FrameforPanel.LeftoverInv);
               System.out.println(FrameforPanel.FifoDataUnits.get(i));
               i = FrameforPanel.FifoDataUnits.size()+1;
            }
            

             
                   }
             

            }else if (FrameforPanel.InventoryData.getSelectedItem().equals ("Purchase") && Perpetual == true && FrameforPanel.CFAssumption.getSelectedItem().equals("LIFO") || Educational == true && PurchaseEDU == true && PerpetualEdu == true && FIFO == false){
                int InventoryAm = Unitfl*SalesPricefl;
                
            //   InventoryIdentification ID = new InventoryIdentification (InventoryIDfl, Unitfl, SalesPricefl);
               InventoryJE.addRow(new Object[]{"Debit", "Inventory", InventoryAm});
               InventoryJE.addRow(new Object[]{"Credit", "Accounts Payable", InventoryAm});
             //  System.out.println(InventoryAm);
           //  InventoryLeft += Unitfl;
             FrameforPanel.FifoDataPrice.add(SalesPricefl);
            FrameforPanel. FifoDataUnits.add(Unitfl);
             FrameforPanel.AmountLifo++;
              FrameforPanel.Balanceinv = InventoryAm + FrameforPanel.Balanceinv;
              
              
               FifoPerp.addRow(new Object []{"Purchase", SalesPricefl,Unitfl, "-","-", FrameforPanel.Balanceinv});
            }else if (FrameforPanel.InventoryData.getSelectedItem().equals("Sale") && Perpetual == true && FrameforPanel.CFAssumption.getSelectedItem().equals ("LIFO") || Educational == true && PurchaseEDU == false && PerpetualEdu == true && FIFO == false){
                 int InventoryAm = Unitfl*SalesPricefl;
                //InventoryIdentification.FindID(InventoryIDfl);
               // LeftoverInv = Unitfl;
                
               InventoryJE.addRow(new Object[]{"Debit", "Accounts Receivable", InventoryAm});
               InventoryJE.addRow(new Object[]{"Credit", "Sales Revenue", InventoryAm});
            
               for (int i = 0; i< FifoPerp.getRowCount(); i++){
                   if (FifoPerp.getValueAt(i,0).equals ("Purchase")){
                  InvSale = Integer.parseInt(FifoPerp.getValueAt(i,1).toString()) * Unitfl; 
                 FrameforPanel.InventoryLeft = FrameforPanel.InventoryLeft - Unitfl;
               
             //  InventoryJE.addRow(new Object[]{"Debit", "Cost of Goods sold", InvSale});
             //  InventoryJE.addRow(new Object[]{"Credit", "Inventory",  InvSale});
                   }
               }
             for(int i= FrameforPanel.AmountLifo-1; i >= 0; i--){
            if (FrameforPanel.FifoDataUnits.get(i) < FrameforPanel.LeftoverInv && FrameforPanel.FifoDataUnits.get(i) != 0){
                //System.out.println(LeftoverInv);
              //   FifoDataUnits.set(i, LeftoverInv);
              FrameforPanel.Balanceinv =FrameforPanel. Balanceinv -(FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i));
                  FifoPerp.addRow(new Object[]{"Sale", "-", "-",FrameforPanel.FifoDataPrice.get(i),FrameforPanel.FifoDataUnits.get(i), FrameforPanel.Balanceinv});
                    InventoryJE.addRow(new Object[]{"Debit", "Cost of Goods Sold", FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i)});
               InventoryJE.addRow(new Object[]{"Credit", "Inventory",  FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i)});
                  FrameforPanel.LeftoverInv = FrameforPanel.LeftoverInv- FrameforPanel.FifoDataUnits.get(i);
                //  System.out.println(LeftoverInv);
                 // FifoDataUnits.set(i, LeftoverInv);
                FrameforPanel. FifoDataUnits.set(i, finishedprod);
                 FrameforPanel.FifoDataPrice.set(i, finishedprod);
                 
                
                  
            }else  if (FrameforPanel.FifoDataUnits.get(i) > FrameforPanel.LeftoverInv &&FrameforPanel.FifoDataUnits.get(i) != 0 ){
             
               FrameforPanel. Balanceinv = FrameforPanel.Balanceinv -(FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv);
                FifoPerp.addRow(new Object[]{"Sale", "-", "-",FrameforPanel.FifoDataPrice.get(i),FrameforPanel.LeftoverInv, FrameforPanel.Balanceinv});
                  InventoryJE.addRow(new Object[]{"Debit", "Cost of Goods Sold", FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv});
               InventoryJE.addRow(new Object[]{"Credit", "Inventory",  FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv});
             FrameforPanel.LeftoverInv = FrameforPanel.FifoDataUnits.get(i) - FrameforPanel.LeftoverInv;
             
               FrameforPanel.FifoDataUnits.set(i,FrameforPanel.LeftoverInv);
          
             i = -1;
            }
            }
            }
//            }else {
//                 float InventoryAm = Unitfl*SalesPricefl;
//                
//            //   InventoryIdentification ID = new InventoryIdentification (InventoryIDfl, Unitfl, SalesPricefl);
//               InventoryJE.addRow(new Object[]{"Debit", "Inventory", InventoryAm});
//               InventoryJE.addRow(new Object[]{"Credit", "Accounts Payable", InventoryAm});
//             //  System.out.println(InventoryAm);
//           //  InventoryLeft += Unitfl;
//            FrameforPanel. FifoDataPrice.add(SalesPricefl);
//            FrameforPanel. FifoDataUnits.add(Unitfl);
//               FrameforPanel.Balanceinv = InventoryAm + FrameforPanel.Balanceinv;
//              FifoPerp.addRow(new Object []{"Purchase", SalesPricefl,Unitfl, "-","-", FrameforPanel.Balanceinv});
//            }
//             else if (FrameforPanel.InventoryData.equals ("Sale") && Periodic == true && FrameforPanel.CF.equals("FIFO")){
//                 float InventoryAm = Unitfl*SalesPricefl;
//              InventoryJE.addRow(new Object[]{"Debit", "Accounts Receivable", InventoryAm});
//              InventoryJE.addRow(new Object[]{"Credit", "Sales Revenue", InventoryAm});
//              
//             FrameforPanel.FifoDataPrice.add(SalesPricefl);
//            FrameforPanel. FifoDataUnits.add(Unitfl);
//             FrameforPanel.AmountLifo++;
//              FrameforPanel.Balanceinv = InventoryAm + FrameforPanel.Balanceinv;
//               for(int i=0; i< FrameforPanel.FifoDataUnits.size(); i++){
//            if (FrameforPanel.FifoDataUnits.get(i) < FrameforPanel.LeftoverInv && FrameforPanel.FifoDataUnits.get(i) != 0){
//                //System.out.println(LeftoverInv);
//              //   FifoDataUnits.set(i, LeftoverInv);
//              FrameforPanel.Balanceinv = FrameforPanel.Balanceinv -(FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i));
//                FifoPerp.addRow(new Object[]{"Sale", "-", "-",FrameforPanel.FifoDataPrice.get(i),FrameforPanel.FifoDataUnits.get(i), FrameforPanel.Balanceinv});
//                  FrameforPanel.LeftoverInv = FrameforPanel.LeftoverInv- FrameforPanel.FifoDataUnits.get(i);
//                //  System.out.println(LeftoverInv);
//                 // FifoDataUnits.set(i, LeftoverInv);
//                 InventoryJE.addRow(new Object[]{"Debit", "Cost of Goods Sold", FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i)});
//               InventoryJE.addRow(new Object[]{"Credit", "Inventory",  FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i)});
//                 FrameforPanel.FifoDataUnits.set(i, finishedprod);
//                 FrameforPanel.FifoDataPrice.set(i, finishedprod);
//             
//                
//                
//                  
//            }else  if (FrameforPanel.FifoDataUnits.get(i) > FrameforPanel.LeftoverInv && FrameforPanel.FifoDataUnits.get(i) != 0 ){
//               // System.out.println(LeftoverInv);
//           // System.out.println("This went first");
//               // LeftoverInv = LeftoverInv-FifoDataUnits.get(i);
//              // System.out.println("Balance is: " + Balanceinv);
//                FrameforPanel.Balanceinv = FrameforPanel.Balanceinv -(FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv);
//                FifoPerp.addRow(new Object[]{"Sale", "-", "-",FrameforPanel.FifoDataPrice.get(i),FrameforPanel.LeftoverInv, FrameforPanel.Balanceinv});
//              
//                 InventoryJE.addRow(new Object[]{"Debit", "Cost of Goods Sold", FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv});
//               InventoryJE.addRow(new Object[]{"Credit", "Inventory",  FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv});
//             FrameforPanel.LeftoverInv = FrameforPanel.FifoDataUnits.get(i) - FrameforPanel.LeftoverInv;
//             
//               FrameforPanel.FifoDataUnits.set(i,FrameforPanel.LeftoverInv);
//               System.out.println(FrameforPanel.FifoDataUnits.get(i));
//               i = FrameforPanel.FifoDataUnits.size()+1;
//            }
//               }
//               } else if (FrameforPanel.InventoryDataSelected.equals("Purchase") && Periodic == true && FrameforPanel.CF.equals("FIFO") ){
//                float InventoryAm = Unitfl*SalesPricefl;
//                  //InventoryIdentification ID = new InventoryIdentification (InventoryIDfl, Unitfl, SalesPricefl);
//               InventoryJE.addRow(new Object[]{"Debit", "Purchases", InventoryAm});
//               InventoryJE.addRow(new Object[]{"Credit", "Accounts Payable", InventoryAm});
//               
//                FrameforPanel.FifoDataPrice.add(SalesPricefl);
//            FrameforPanel. FifoDataUnits.add(Unitfl);
//             FrameforPanel.AmountLifo++;
//              FrameforPanel.Balanceinv = InventoryAm + FrameforPanel.Balanceinv;
//              
//               FifoPerp.addRow(new Object []{"Purchase", SalesPricefl,Unitfl, "-","-", FrameforPanel.Balanceinv});
//             // PeriodicTable.addRow(new Object[]{Unitfl, SalesPricefl,Unitfl*SalesPricefl});
//              
//              
//              
//              
//               } else if (FrameforPanel.InventoryDataSelected.equals ("Purchase") && Periodic == true && FrameforPanel.CF.equals("LIFO")){
//                float InventoryAm = Unitfl*SalesPricefl;
//                
//            //   InventoryIdentification ID = new InventoryIdentification (InventoryIDfl, Unitfl, SalesPricefl);
//               InventoryJE.addRow(new Object[]{"Debit", "Inventory", InventoryAm});
//               InventoryJE.addRow(new Object[]{"Credit", "Accounts Payable", InventoryAm});
//             //  System.out.println(InventoryAm);
//           //  InventoryLeft += Unitfl;
//             FrameforPanel.FifoDataPrice.add(SalesPricefl);
//            FrameforPanel. FifoDataUnits.add(Unitfl);
//             FrameforPanel.AmountLifo++;
//              FrameforPanel.Balanceinv = InventoryAm + FrameforPanel.Balanceinv;
//              
//              
//               FifoPerp.addRow(new Object []{"Purchase", SalesPricefl,Unitfl, "-","-", FrameforPanel.Balanceinv});
//            }else if (FrameforPanel.InventoryDataSelected.equals("Sale") && Periodic == true && FrameforPanel.CF.equals ("LIFO")){
//                 float InventoryAm = Unitfl*SalesPricefl;
//                //InventoryIdentification.FindID(InventoryIDfl);
//               // LeftoverInv = Unitfl;
//                
//           //    InventoryJE.addRow(new Object[]{"Debit", "Accounts Receivable", InventoryAm});
//            //   InventoryJE.addRow(new Object[]{"Credit", "Sales Revenue", InventoryAm});
//            InventoryJE.addRow (new Object[]{"Debit", "Accounts Receivable", InventoryAm});
//             InventoryJE.addRow (new Object[]{"Credit", "Sales Revenue", InventoryAm});
//               for (int i = 0; i< FifoPerp.getRowCount(); i++){
//                   if (FifoPerp.getValueAt(i,0).equals ("Purchase")){
//                  InvSale = Float.parseFloat(FifoPerp.getValueAt(i,1).toString()) * Unitfl; 
//                 FrameforPanel.InventoryLeft = FrameforPanel.InventoryLeft - Unitfl;
//               
//             //  InventoryJE.addRow(new Object[]{"Debit", "Cost of Goods sold", InvSale});
//             //  InventoryJE.addRow(new Object[]{"Credit", "Inventory",  InvSale});
//                   }
//               }
//             for(int i= FrameforPanel.AmountLifo-1; i >= 0; i--){
//            if (FrameforPanel.FifoDataUnits.get(i) < FrameforPanel.LeftoverInv && FrameforPanel.FifoDataUnits.get(i) != 0){
//                //System.out.println(LeftoverInv);
//              //   FifoDataUnits.set(i, LeftoverInv);
//              FrameforPanel.Balanceinv =FrameforPanel. Balanceinv -(FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i));
//                  FifoPerp.addRow(new Object[]{"Sale", "-", "-",FrameforPanel.FifoDataPrice.get(i),FrameforPanel.FifoDataUnits.get(i), FrameforPanel.Balanceinv});
//                    InventoryJE.addRow(new Object[]{"Debit", "Cost of Goods Sold", FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i)});
//               InventoryJE.addRow(new Object[]{"Credit", "Inventory",  FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.FifoDataUnits.get(i)});
//                  FrameforPanel.LeftoverInv = FrameforPanel.LeftoverInv- FrameforPanel.FifoDataUnits.get(i);
//                //  System.out.println(LeftoverInv);
//                 // FifoDataUnits.set(i, LeftoverInv);
//                FrameforPanel. FifoDataUnits.set(i, finishedprod);
//                 FrameforPanel.FifoDataPrice.set(i, finishedprod);
//                 
//                
//                  
//            }else  if (FrameforPanel.FifoDataUnits.get(i) > FrameforPanel.LeftoverInv &&FrameforPanel.FifoDataUnits.get(i) != 0 ){
//             
//               FrameforPanel. Balanceinv = FrameforPanel.Balanceinv -(FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv);
//                FifoPerp.addRow(new Object[]{"Sale", "-", "-",FrameforPanel.FifoDataPrice.get(i),FrameforPanel.LeftoverInv, FrameforPanel.Balanceinv});
//                  InventoryJE.addRow(new Object[]{"Debit", "Cost of Goods Sold", FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv});
//               InventoryJE.addRow(new Object[]{"Credit", "Inventory",  FrameforPanel.FifoDataPrice.get(i)*FrameforPanel.LeftoverInv});
//             FrameforPanel.LeftoverInv = FrameforPanel.FifoDataUnits.get(i) - FrameforPanel.LeftoverInv;
//             
//               FrameforPanel.FifoDataUnits.set(i,FrameforPanel.LeftoverInv);
//          
//             i = -1;
//            }
//            }
//            
//              
//              
//            }else if (FrameforPanel.InventoryData.equals("End Of Period") && Perpetual == true){
//                   InventoryJE.addRow(new Object[]{"No Entry", "No Entry", "No Entry"});
//               InventoryJE.addRow(new Object[]{"No Entry", "No Entry", "No Entry"});
//            }else if (FrameforPanel.InventoryData.equals("End Of Period") && Periodic == true){
//                float InventoryAm = Unitfl*SalesPricefl;
//                InventoryIdentification.FindID(InventoryIDfl);
//                InventoryJE.addRow(new Object[]{"Debit", "Inventory", InventoryAm});
//               InventoryJE.addRow(new Object[]{"Credit", "Cost of Goods Sold", InventoryAm});
//               InventoryJE.addRow(new Object[]{"Debit", "Purchases", InventoryIdentification.getCost() * Unitfl});
//               InventoryJE.addRow(new Object[]{"Credit", "Inventory",  InventoryIdentification.getCost() * Unitfl});
//            }
            
            
    } 
   
    }

