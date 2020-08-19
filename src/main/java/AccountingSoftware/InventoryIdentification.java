package AccountingSoftware;


import static AccountingSoftware.FrameforPanel.FIFOPerpTable;
import static AccountingSoftware.FrameforPanel.IDTable;
import java.awt.List;
import java.util.ArrayList;
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
public class InventoryIdentification {
   final float ZeroOut = 0;


    public InventoryIdentification(int NumberID,String ItemN, String ItemDesc){
         DefaultTableModel IDtab = (DefaultTableModel)FrameforPanel.IDTable.getModel();
        FrameforPanel.ID.add(NumberID);
         FrameforPanel.ItemName.add(ItemN);
         FrameforPanel.Description.add(ItemDesc);
         FrameforPanel.Stock.add(ZeroOut);
        IDtab.addRow(new Object[]{ FrameforPanel.ID.get(NumberID),ItemN,ItemDesc, 0});
       // NumberOfIDs++;
           
        //IDtab.addRow(new Object[]{ID.get(NumberOfIDs),ItemN,ItemDesc, 0});
    }
   
}
