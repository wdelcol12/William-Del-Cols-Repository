/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import static AccountingSoftware.FrameforPanel.OptionsEPSTable;
import static AccountingSoftware.FrameforPanel.SecuritiesTable;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class GenerateDilutedEPS {
    public GenerateDilutedEPS(){
        
//        ArrayList<Float> StockOptionDilutionList1 = new ArrayList<Float>();//Numerator Values
//        ArrayList<Float> StockOptionDilutionList2 = new ArrayList<Float>();//Denominator Values
//        ArrayList<Float> PreferredStockDilutionList1 = new ArrayList<Float>();//Numerator Values
//        ArrayList<Float> PreferredStockDilutionList2 = new ArrayList<Float>();//Denominator Values
//        ArrayList<Float> BondsPayableStockDilutionList1 = new ArrayList<Float>();//Numerator Values
//        ArrayList<Float> BondsPayableStockDilutionList2 = new ArrayList<Float>();//Denominator Values
        ArrayList<Float> OrderOfDilution = new ArrayList<Float>();
        ArrayList<Float> DilutionOrder = new ArrayList<Float>();
     //   ArrayList<Float> DilutionSteps1 = new ArrayList<Float>();//Numerator Values
       // ArrayList<Float> DilutionSteps2 = new ArrayList<Float>();//Denominator Values
        
        float ImpactOfOptions;
        float FinalDilutedEPS = 0;
       float PreviousEPS;
        float SecurityPercent;
        float NumOutstanding;
        float ParValue;
        float AmountConverted;
        
        float SecuritiesDilutionDenominator = 0;
        float BasicEPSNumerator = 0;
        float BasicEPS = 0;
        String NetIncomeString = "";
        float NetIncome = 0;
        String WasoString = "";
        float Waso = 0;
        String AverageStockPriceString = "";
        float AverageStockPrice = 0;
        String TaxRateString = "";
        float TaxRate = 0; 
         String SecuritiesPercentageString = "";
        float SecuritiesPercent; 
        String NumSecuritiesConvertible = "";
        float NumSecuritiesConvertiblefl = 0;
        
        
        float StockOptionNumerator;
        float StockOptionDilution;
        float StockOptionDilutionFinal =0;
        
        float SecuritiesDilutionNumerator = 0;
        float SecuritiesDilutionDenom;
        float SecuritiesDilution = 0;
        
        float BondsPayableDilutionNumerator = 0;
        float BondsPayableDilutionDenom;
        float BondsPayableDilution =0;
        
       float NonCumulativeNumerator = 0;
       float NonCumulativeDenom = 0;
       float NonCumulativeFinal = 0;
    
float BondsPayableStockDilutionDenom = 0;
       
         try {
           NetIncomeString = FrameforPanel.NetIncomeInputDilutedEPS.getText();
            NetIncome = Integer.parseInt(NetIncomeString);
       }catch (NumberFormatException e){
          
       }
        
        try {
        WasoString = FrameforPanel.WASOInput.getText();
        Waso = Float.parseFloat(WasoString);
} catch (NumberFormatException e) {
}   
        try {
        AverageStockPriceString = FrameforPanel.AverageStockPriceInput.getText();
        AverageStockPrice  = Float.parseFloat(AverageStockPriceString);
} catch (NumberFormatException e) {
} 
           try {
        TaxRateString = FrameforPanel.TaxRateInput.getText();
        TaxRate  = Float.parseFloat(TaxRateString);
} catch (NumberFormatException e) {
} 
             try {
        NumSecuritiesConvertible = FrameforPanel.NumSecuritiesConvertibleDilutive.getText();
        NumSecuritiesConvertiblefl  = Float.parseFloat(NumSecuritiesConvertible);
} catch (NumberFormatException e) {
} 
           TaxRate = TaxRate/100;
        
             DefaultTableModel Securities = (DefaultTableModel) SecuritiesTable.getModel();
          DefaultTableModel StockOption = (DefaultTableModel) OptionsEPSTable.getModel();
   
          
       //   System.out.println("We out here");
         // System.out.println(Securities.getRowCount());
        //  BasicEPSNumerator = NetIncome - (Float.parseFloat(Securities.getValueAt(i,2).toString())*Float.parseFloat(Securities.getValueAt(i,3).toString()) *(Float.parseFloat(Securities.getValueAt(i,0).toString())/100));
        BasicEPSNumerator = NetIncome;    
        BasicEPS = BasicEPSNumerator/Waso;
               FrameforPanel.BasicEPSOutput.setText(String.valueOf(BasicEPS));
      for (int i = 0; i < Securities.getRowCount(); i++){
       
          if (Securities.getValueAt(i,1).equals("Cumulative Convertible Preferred Stock")){
                 float SharesOutstandingAssumed = 0;
                 float SharesAssumedIssued = 0;
                 float FinalSharesAdjustment = 0;
             SharesOutstandingAssumed = Float.parseFloat(Securities.getValueAt(i,2).toString())/ Float.parseFloat(Securities.getValueAt(i,5).toString());
             SharesAssumedIssued = SharesOutstandingAssumed*Float.parseFloat(Securities.getValueAt(i,4).toString());
             FinalSharesAdjustment = SharesAssumedIssued;
             FrameforPanel.BasicEPSOutput.setText("");
             BasicEPSNumerator = NetIncome - (Float.parseFloat(Securities.getValueAt(i,2).toString())*Float.parseFloat(Securities.getValueAt(i,3).toString()) *(Float.parseFloat(Securities.getValueAt(i,0).toString())/100));
              BasicEPS = BasicEPSNumerator/Waso;
             FrameforPanel.BasicEPSOutput.setText(String.valueOf(BasicEPS));
              
            //  if(NumSecuritiesConvertible.equals("") || NumSecuritiesConvertiblefl == 0){
          //   SecuritiesDilutionNumerator =  (Float.parseFloat(Securities.getValueAt(i,2).toString())*Float.parseFloat(Securities.getValueAt(i,3).toString()) *(Float.parseFloat(Securities.getValueAt(i,0).toString())/100));
          //   SecuritiesDilution = SecuritiesDilutionNumerator/ (Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString()));
           //   }else if (!NumSecuritiesConvertible.equals("") || NumSecuritiesConvertiblefl != 0){
            SecuritiesDilutionNumerator =  (Float.parseFloat(Securities.getValueAt(i,2).toString())*Float.parseFloat(Securities.getValueAt(i,3).toString()) *(Float.parseFloat(Securities.getValueAt(i,0).toString())/100));      
           //SecuritiesDilutionNumerator = (Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString()));
                  SecuritiesDilution = SecuritiesDilutionNumerator/FinalSharesAdjustment;
             // }
              
         //    SecuritiesDilutionFinal = Float.parseFloat(Securities.getValueAt(i,3).toString()) - SecuritiesDilution;
             System.out.println("The Securities Dilution is: " + SecuritiesDilution);
             
             if (SecuritiesDilution<BasicEPS){
                // PreferredStockDilutionList1.add(SecuritiesDilutionNumerator);
                // PreferredStockDilutionList2.add((Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString())));
                SecuritiesDilutionDenominator = FinalSharesAdjustment;
             }
          }  else if (Securities.getValueAt(i,1).equals("Convertible Preferred Stock")){
                 float SharesOutstandingAssumed = 0;
                 float SharesAssumedIssued = 0;
                 float FinalSharesAdjustment = 0;
             SharesOutstandingAssumed = Float.parseFloat(Securities.getValueAt(i,2).toString())/ Float.parseFloat(Securities.getValueAt(i,5).toString());
             SharesAssumedIssued = SharesOutstandingAssumed*Float.parseFloat(Securities.getValueAt(i,4).toString());
             FinalSharesAdjustment = SharesAssumedIssued;
            //  BasicEPSNumerator = NetIncome - (Float.parseFloat(Securities.getValueAt(i,2).toString())*Float.parseFloat(Securities.getValueAt(i,3).toString()) *(Float.parseFloat(Securities.getValueAt(i,0).toString())/100));
            //  BasicEPS = BasicEPSNumerator/Waso;
             
              
           //   if(Securities.getValueAt(i,5).toString().equals("") || Float.parseFloat(Securities.getValueAt(i,5).toString()) == 0){
           //  NonCumulativeNumerator =  (Float.parseFloat(Securities.getValueAt(i,2).toString())*Float.parseFloat(Securities.getValueAt(i,3).toString()) *(Float.parseFloat(Securities.getValueAt(i,0).toString())/100));
           //  NonCumulativeFinal = SecuritiesDilutionNumerator/ (Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString()));
            //  }else if (!Securities.getValueAt(i,5).toString().equals("") || Float.parseFloat(Securities.getValueAt(i,5).toString()) != 0){
                 
            NonCumulativeNumerator = 1;
                  NonCumulativeFinal = NonCumulativeNumerator/FinalSharesAdjustment;
              
                if (NonCumulativeFinal<BasicEPS ){
                // PreferredStockDilutionList1.add(SecuritiesDilutionNumerator);
                // PreferredStockDilutionList2.add((Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString())));
                NonCumulativeDenom =FinalSharesAdjustment;
           //  }else if (NonCumulativeFinal<BasicEPS && Securities.getValueAt(i,5).toString().equals("") || Float.parseFloat(Securities.getValueAt(i,5).toString()) == 0){
            //      NonCumulativeDenom =(Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString()));
             }
          }   else if (Securities.getValueAt(i,1).equals("Convertible Bonds Payable")){
              float SharesOutstandingAssumed = 0;
                 float SharesAssumedIssued = 0;
                 float FinalSharesAdjustment = 0;
             SharesOutstandingAssumed = Float.parseFloat(Securities.getValueAt(i,2).toString())/ Float.parseFloat(Securities.getValueAt(i,5).toString());
             SharesAssumedIssued = SharesOutstandingAssumed*Float.parseFloat(Securities.getValueAt(i,4).toString());
             FinalSharesAdjustment = SharesAssumedIssued;
           //  if(Securities.getValueAt(i,5).toString().equals("") || Float.parseFloat(Securities.getValueAt(i,5).toString()) == 0){
           //   BondsPayableDilutionNumerator = (Float.parseFloat(Securities.getValueAt(i,0).toString())/100)*Float.parseFloat(Securities.getValueAt(i,2).toString()) *Float.parseFloat(Securities.getValueAt(i,3).toString()) * (1-TaxRate); 
            //  BondsPayableDilution = BondsPayableDilutionNumerator/ (Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString()));
           //  }else if (!Securities.getValueAt(i,5).toString().equals("") || Float.parseFloat(Securities.getValueAt(i,5).toString()) != 0){
                 BondsPayableDilutionNumerator = (Float.parseFloat(Securities.getValueAt(i,0).toString())/100)*Float.parseFloat(Securities.getValueAt(i,2).toString()) *Float.parseFloat(Securities.getValueAt(i,3).toString()) * (1-TaxRate); 
              BondsPayableDilution = BondsPayableDilutionNumerator/FinalSharesAdjustment;
           //  }
              if (BondsPayableDilution <BasicEPS ){
                // PreferredStockDilutionList1.add(SecuritiesDilutionNumerator);
                // PreferredStockDilutionList2.add((Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString())));
                BondsPayableStockDilutionDenom =FinalSharesAdjustment;
            // }else if (BondsPayableDilution<BasicEPS && Securities.getValueAt(i,5).toString().equals("") || Float.parseFloat(Securities.getValueAt(i,5).toString()) == 0){
            //      BondsPayableStockDilutionDenom =(Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString()));
             }
             
              System.out.println("The Bonds Payable Dilution is: " + BondsPayableDilution);
            //  if(BondsPayableDilution < BasicEPS){
                  //BondsPayableStockDilutionList1.add(BondsPayableDilutionNumerator);
                 // BondsPayableStockDilutionList2.add((Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString())));
               //  BondsPayableStockDilutionDenom = Float.parseFloat(Securities.getValueAt(i,4).toString()) * Float.parseFloat(Securities.getValueAt(i,2).toString());
                 System.out.println("Bonds Payable Stock Dilution Denom is " + BondsPayableStockDilutionDenom);
              //}
          }
          
      }
           for (int i = 0; i< StockOption.getRowCount(); i++){
               if(Float.parseFloat(StockOption.getValueAt(i,1).toString()) < AverageStockPrice){
                   StockOptionNumerator = Float.parseFloat(StockOption.getValueAt(i,1).toString()) * Float.parseFloat(StockOption.getValueAt(i,0).toString());
                   StockOptionDilution= StockOptionNumerator/AverageStockPrice;
                   StockOptionDilutionFinal =  Float.parseFloat(StockOption.getValueAt(i,0).toString()) - StockOptionDilution;
                   System.out.println("The Stock Option Dilution is: " + StockOptionDilutionFinal);
                     // StockOptionDilutionList1.add(StockOptionDilutionFinal);
                      
                   
               }else if(Float.parseFloat(StockOption.getValueAt(i,1).toString()) > AverageStockPrice) {
                  System.out.println("Out of the money");
               }
         
               
           }
           if (BondsPayableDilution != 0){
                 OrderOfDilution.add(BondsPayableDilution);
                 System.out.println("Something went right");
           }else{
               System.out.println("Something went wrong");
           }
           if(StockOptionDilutionFinal != 0){
               OrderOfDilution.add(StockOptionDilutionFinal);
           }
           if (SecuritiesDilution != 0){
                 OrderOfDilution.add(SecuritiesDilution);
          
           }
             if (NonCumulativeFinal != 0){
                 OrderOfDilution.add(NonCumulativeFinal);
          
           }
          
         
          // OrderOfDilution.add(BondsPayableDilution);
          // OrderOfDilution.add(StockOptionDilutionFinal);
          // OrderOfDilution.add(SecuritiesDilution);
           
           float SecuritiesDilutionAnswer = 0;
           float StockOptionsAnswer = 0;
           float BondsPayableAnswer = 0;
           float NonCumulativeAnswer = 0;
           float PreviousNumber = 50000000;
           float CurrentNumerator = BasicEPSNumerator;
           float CurrentDenominator = Waso;
         
           for(int i = 0; i < OrderOfDilution.size(); i++){
         float MaxNumber =  Collections.max(OrderOfDilution);
         DilutionOrder.add(MaxNumber);
         OrderOfDilution.remove(OrderOfDilution.indexOf(MaxNumber));
         i--;
         System.out.println("Added the Number " + MaxNumber + " to the Dilution Order");
           }
           
           for(int i =0; i< DilutionOrder.size(); i++){
               System.out.println(i);
              // System.out.println("Dilution Order Size is: " + DilutionOrder.size());
               if(DilutionOrder.get(i) == BondsPayableDilution){
               System.out.println("The Bonds Payable has been recognized");
                   BondsPayableAnswer = (CurrentNumerator + BondsPayableDilutionNumerator)/ (CurrentDenominator + BondsPayableStockDilutionDenom);
                   if(PreviousNumber > BondsPayableAnswer){
                 PreviousNumber = BondsPayableAnswer;
                 CurrentNumerator = (CurrentNumerator + BondsPayableDilutionNumerator);
                 CurrentDenominator =(CurrentDenominator + BondsPayableStockDilutionDenom);
                  System.out.println(PreviousNumber);
                  System.out.println("Current Numerator: " + CurrentNumerator);
                System.out.println("Current Denominator: " + CurrentDenominator);
                  System.out.println("Bonds Payable Tested");
                   }
               }else if (DilutionOrder.get(i) == StockOptionDilutionFinal){
                   StockOptionsAnswer = CurrentNumerator/(StockOptionDilutionFinal);
                   System.out.println("The Stock Options have been recognized");
                   if(PreviousNumber > StockOptionsAnswer){
                   PreviousNumber = StockOptionsAnswer;
                   CurrentNumerator = CurrentNumerator;
                   CurrentDenominator += StockOptionDilutionFinal;
                    System.out.println(PreviousNumber);
                    System.out.println("Current Numerator: " + CurrentNumerator);
                 System.out.println("Current Denominator: " + CurrentDenominator);
                    System.out.println("Stock Options Tested");
                   }
               }else if (DilutionOrder.get(i) == SecuritiesDilution){
                  // System.out.println("Securities Dilution numerator"+SecuritiesDilutionNumerator);
                  // System.out.println("");
                  System.out.println("The Securities have been recognized");
                   SecuritiesDilutionAnswer = (CurrentNumerator + SecuritiesDilutionNumerator)/(CurrentDenominator + SecuritiesDilutionDenominator);
                  if (PreviousNumber > SecuritiesDilutionAnswer){
                   PreviousNumber = SecuritiesDilutionAnswer;
                   CurrentNumerator = (CurrentNumerator + SecuritiesDilutionNumerator);
                   CurrentDenominator = (CurrentDenominator + SecuritiesDilutionDenominator);
                   System.out.println(PreviousNumber);
                   System.out.println("Current Numerator: " + CurrentNumerator);
                 System.out.println("Current Denominator: " + CurrentDenominator);
                   System.out.println("Securities Tested");
                  }
               }else if (DilutionOrder.get(i) == NonCumulativeFinal){
                   NonCumulativeAnswer = (CurrentNumerator + NonCumulativeNumerator)/(CurrentDenominator + NonCumulativeDenom);
                   System.out.println("The Non Cumulative has been reecognized");
                   if (PreviousNumber > NonCumulativeAnswer){
                   PreviousNumber = NonCumulativeAnswer;
                   CurrentNumerator = (CurrentNumerator + NonCumulativeNumerator);
                   CurrentDenominator = (CurrentDenominator + NonCumulativeDenom);
                   System.out.println(PreviousNumber);
                   System.out.println("Current Numerator: " + CurrentNumerator);
                 System.out.println("Current Denominator: " + CurrentDenominator);
                   System.out.println("NonCumulative Tested");
                  } 
               }
           }
         //  float OrderOfDilutionfl =(Math.min(Math.min(BondsPayableDilution,StockOptionDilutionFinal),SecuritiesDilution));
         System.out.println("Current Numerator: " + CurrentNumerator);
         System.out.println("Current Denominator: " + CurrentDenominator);
         FinalDilutedEPS = CurrentNumerator/CurrentDenominator;
         FrameforPanel.DilutedEPSOutput.setText(String.valueOf(FinalDilutedEPS));
           
    }
          
}
