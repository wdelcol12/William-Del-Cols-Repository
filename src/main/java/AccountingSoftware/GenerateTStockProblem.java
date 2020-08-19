/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class GenerateTStockProblem {
    public GenerateTStockProblem(){
        
         DefaultTableModel dm1 = (DefaultTableModel) FrameforPanel.JETableTStocks.getModel();
int rowCount2 = FrameforPanel.JETableTStocks.getRowCount();
//Remove rows one by one from the end of the table

for (int i = rowCount2 - 1; i >= 0; i--) {
    dm1.removeRow(i);
}
 DefaultTableModel dm2 = (DefaultTableModel) FrameforPanel.TStockEducationalTable.getModel();
 int rowCount3 = FrameforPanel.TStockEducationalTable.getRowCount();
 
 for (int i = rowCount3 -1; i>=0; i--){
     dm2.removeRow(i);
 }
        final int OutStandingSharesmaximum = 100000;
        final int OutStandingSharesminimum = 50000;
        final int ParValueOfOutstandingMaximum = 20;
        final int ParValueOfOutstandingMinimum = 10;
        
        //Shares Boundaries
        final int TreasuryStockReaquiredMaximum = 100;
        final int TreasuryStockReaquiredMinimum = 80;
        final int TreasuryStockReissuanceMaximum = 40;
        final int TreasuryStockReissuanceMinimum = 20;
        
        final int MaximumPrice = 100;
        final int MinimumPrice = 70;
        
        final int AmountOfReaquisitionsMaximum = 1;
        final int AmountOfReaquisitionsMinimum = 1;
        final int AmountOfReissuancesMaximum = 2;
        final int AmountOfReissuancesMinimum = 1;
          DefaultTableModel TStocks = (DefaultTableModel) FrameforPanel.JETableTStocks.getModel();
          DefaultTableModel InputTStocks = (DefaultTableModel)FrameforPanel.TStockEducationalTable.getModel();
        Random rand = new Random();
        
        
        int Reaquisition = rand.nextInt(TreasuryStockReaquiredMaximum + 1 - TreasuryStockReaquiredMinimum ) + TreasuryStockReaquiredMinimum;
        //int Reaquisition = rand.nextInt(TreasuryStockReaquiredMaximum + 1 - TreasuryStockReaquiredMinimum ) + TreasuryStockReaquiredMinimum;
        int NumReaquisition = rand.nextInt(AmountOfReaquisitionsMaximum + 1 - AmountOfReaquisitionsMinimum ) + AmountOfReaquisitionsMinimum;
        int NumReissuance = rand.nextInt(AmountOfReissuancesMaximum + 1 - AmountOfReissuancesMinimum) + AmountOfReissuancesMinimum;
        int Price = rand.nextInt(MaximumPrice + 1 - MinimumPrice) + MinimumPrice;
        
        FrameforPanel.SharesReaquiredInput.setText(String.valueOf(Reaquisition));
        FrameforPanel.ReacquisitionPriceInput.setText(String.valueOf(Price));
        
        GenerateJETStock je = new GenerateJETStock(true, true, false);
        FrameforPanel.ProblemFieldTStocks.setText("Fill out the journal entries with the following information: \n Company Co. has reaquired " + Reaquisition + " shares at a price of " + Price + " dollars per share" + "\n");
        
        for (int i = 0; i< NumReissuance; i ++){
            int Price1 = rand.nextInt(MaximumPrice + 1 - MinimumPrice) + MinimumPrice;
            int Reissuance = rand.nextInt(TreasuryStockReissuanceMaximum + 1 - TreasuryStockReissuanceMinimum);
            
            FrameforPanel.SharesReaquiredInput.setText(String.valueOf(Reissuance));
            FrameforPanel.ReacquisitionPriceInput.setText(String.valueOf(Price1));
            FrameforPanel.ProblemFieldTStocks.setText(FrameforPanel.ProblemFieldTStocks.getText() + "Company Co resissued " + Reissuance + " shares at " + Price1 + " dollars per share" + "\n");
            GenerateJETStock O = new GenerateJETStock(true, false, true);
            
            
        }
        for (int i = 0; i<TStocks.getRowCount(); i++){
         InputTStocks.addRow(new Object[]{});   
        }
    }
}
