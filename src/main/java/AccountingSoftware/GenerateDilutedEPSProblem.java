/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import static AccountingSoftware.FrameforPanel.AmountSecuritiesInput;
import static AccountingSoftware.FrameforPanel.AverageStockPriceInput;
import static AccountingSoftware.FrameforPanel.BasicEPSOutput;
import static AccountingSoftware.FrameforPanel.ConvertibleEPSInput;
import static AccountingSoftware.FrameforPanel.DilutedEPSOutput;
import static AccountingSoftware.FrameforPanel.ExercisePriceEPSInput;
import static AccountingSoftware.FrameforPanel.NetIncomeInputDilutedEPS;
import static AccountingSoftware.FrameforPanel.NumOptionsInput;
import static AccountingSoftware.FrameforPanel.NumSecuritiesConvertibleDilutive;
import static AccountingSoftware.FrameforPanel.OptionsEPSTable;
import static AccountingSoftware.FrameforPanel.ParValueInputEPS;
import static AccountingSoftware.FrameforPanel.SecuritiesEPSInput;
import static AccountingSoftware.FrameforPanel.SecuritiesTable;
import static AccountingSoftware.FrameforPanel.TaxRateInput;
import static AccountingSoftware.FrameforPanel.WASOInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class GenerateDilutedEPSProblem {
    public GenerateDilutedEPSProblem (){
              DefaultTableModel dm = (DefaultTableModel) SecuritiesTable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
        DefaultTableModel dm1 = (DefaultTableModel) OptionsEPSTable.getModel();
int rowCount1 = dm1.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount1 - 1; i >= 0; i--) {
    dm1.removeRow(i);
}
NetIncomeInputDilutedEPS.setText("");
BasicEPSOutput.setText("");
DilutedEPSOutput.setText("");
WASOInput.setText("");
AmountSecuritiesInput.setText("");
SecuritiesEPSInput.setText("");
ParValueInputEPS.setText("");
ConvertibleEPSInput.setText("");
ExercisePriceEPSInput.setText("");
AverageStockPriceInput.setText("");
TaxRateInput.setText("");
NumSecuritiesConvertibleDilutive.setText("");
NumOptionsInput.setText("");
       // String [] SecurityOptions = {"Convertible Bonds Payable", "Cumulative Convertible Preferred Stock", "Convertible Preferred Stock"};
      ArrayList <String> SecurityOption = new ArrayList<String>();
      SecurityOption.add("Convertible Bonds Payable");
      SecurityOption.add("Cumulative Convertible Preferred Stock");
      SecurityOption.add("Convertible Preferred Stock");
      Collections.shuffle(SecurityOption);
        final int NetIncomeMaximum= 500000;
        final int NetIncomeMinimum = 300000;
       
        final int WASOMaximum = 100000;
        final int WASOMinimum = 50000;
        final int AmountOutstandingMaximum= 100000;
        final int AmountOutStandingMinimum = 30000;
        final int SecuritiesPercentageMaximum = 10;
        final int SecuritiesPercentageMinimum = 5;
        final int EachSecurityConvertibleMaximum = 15;
        final int EachSecurityConvertibleMinimum = 5;
        
        final int NumOptionsMaximum = 500000;
        final int NumOptionsMinimum = 200000;
        final int ExercisePriceMaximum = 20;
        final int ExercisePriceMinimum = 10;
        final int AverageStockPriceMaximum = 25;
        final int AverageStockPriceMinimum =15;
        
        final int TaxRate = 20;
        
        final int NumberOfSecuritiesMaximum = 2;
        final int NumberOfSecuritiesMinimum = 1;
        final int NumberOfStockOptionsMaximum = 1;
        final int NumberOfStockOptionsMinimum = 1;
        Random rand = new Random();
        DefaultTableModel Securities = (DefaultTableModel) SecuritiesTable.getModel();
          DefaultTableModel StockOption = (DefaultTableModel) OptionsEPSTable.getModel();
         
        FrameforPanel.EPSProblemField.setText("Compute the Basic EPS and the diluted EPS with the following information. Round to the nearest two decimal places \n");
        
        int NumberOfSecurities = rand.nextInt(NumberOfSecuritiesMaximum + 1 - NumberOfSecuritiesMinimum ) + NumberOfSecuritiesMinimum;
         int NumberOfStockOptions = rand.nextInt(NumberOfStockOptionsMaximum + 1 - NumberOfStockOptionsMinimum ) + NumberOfStockOptionsMinimum;
        
         int NetIncome = rand.nextInt(NetIncomeMaximum + 1 - NetIncomeMinimum) + NetIncomeMinimum;
        int WASO = rand.nextInt(WASOMaximum + 1 - WASOMinimum) + WASOMinimum;
        FrameforPanel.EPSProblemField.setText(FrameforPanel.EPSProblemField.getText() + " Company Co. has a net income of " + NetIncome+ " in 2021 and a tax rate of 20%. The company has an average of " + WASO+ " common stock outstanding throughout 2021.\n None of the securities were converted\n");
        
        
        FrameforPanel.NetIncomeInputDilutedEPS.setText(String.valueOf(NetIncome));
        FrameforPanel.WASOInput.setText(String.valueOf(WASO));
         for(int i = 0; i< NumberOfSecurities; i ++){
         FrameforPanel.AmountSecuritiesInput.setText("");
        FrameforPanel.SecuritiesEPSInput.setText("");
        FrameforPanel.ParValueInputEPS.setText("");
        FrameforPanel.ConvertibleEPSInput.setText("");
        FrameforPanel.NumSecuritiesConvertibleDilutive.setText("");
           //  int RandomSecurity = rand.nextInt(2);
        
        int AmountOutstanding = rand.nextInt(AmountOutstandingMaximum + 1 - AmountOutStandingMinimum) + AmountOutStandingMinimum;
        int SecuritiesPercentage =rand.nextInt(SecuritiesPercentageMaximum + 1 - SecuritiesPercentageMinimum) + SecuritiesPercentageMinimum;
        int EachSecurityConvertible = rand.nextInt(EachSecurityConvertibleMaximum + 1 - EachSecurityConvertibleMinimum) + EachSecurityConvertibleMinimum;
        int Convertible = AmountOutstanding/200;
        FrameforPanel.EPSProblemField.setText(FrameforPanel.EPSProblemField.getText() + " On January 1st 2021 Company Co. issued a $" + AmountOutstanding + " face value, " + SecuritiesPercentage + " percent of " + SecurityOption.get(i) + " at par. Each $" + Convertible + " security is convertible into " + EachSecurityConvertible + " shares of Companys Common Stock. \n ");
        
        // System.out.println("Yo its happening");
        FrameforPanel.AmountSecuritiesInput.setText(String.valueOf(AmountOutstanding));
        FrameforPanel.SecuritiesEPSInput.setText(String.valueOf(SecuritiesPercentage));
        FrameforPanel.ParValueInputEPS.setText(String.valueOf(1));
        FrameforPanel.ConvertibleEPSInput.setText(String.valueOf(EachSecurityConvertible));
        FrameforPanel.NumSecuritiesConvertibleDilutive.setText(String.valueOf(AmountOutstanding/200));
        
        Securities.addRow(new Object[]{FrameforPanel.SecuritiesEPSInput.getText(),SecurityOption.get(i), FrameforPanel.AmountSecuritiesInput.getText(), FrameforPanel.ParValueInputEPS.getText(),FrameforPanel.ConvertibleEPSInput.getText(), FrameforPanel.NumSecuritiesConvertibleDilutive.getText()});
         }
        for(int i = 0; i<NumberOfStockOptions; i ++){
         FrameforPanel.NumOptionsInput.setText("");
        FrameforPanel.ExercisePriceEPSInput.setText("");
            int NumOptions =  rand.nextInt(NumOptionsMaximum + 1 - NumOptionsMinimum) + NumOptionsMinimum;
        int ExercisePrice =  rand.nextInt(ExercisePriceMaximum + 1 - ExercisePriceMinimum) + ExercisePriceMinimum;
       
   // System.out.println("Yo its happening");
        FrameforPanel.NumOptionsInput.setText(String.valueOf(NumOptions));
        FrameforPanel.ExercisePriceEPSInput.setText(String.valueOf(ExercisePrice));
        
     
      StockOption.addRow (new Object[]{NumOptionsInput.getText(),ExercisePriceEPSInput.getText()});
        }
         int AverageStockPrice = rand.nextInt(AverageStockPriceMaximum + 1 - AverageStockPriceMinimum) + AverageStockPriceMinimum;
         FrameforPanel.AverageStockPriceInput.setText(String.valueOf(AverageStockPrice));
         FrameforPanel.TaxRateInput.setText(String.valueOf(TaxRate));
           FrameforPanel.EPSProblemField.setText(FrameforPanel.EPSProblemField.getText() + "Company Co has " + FrameforPanel.NumOptionsInput.getText() + " stock options outstanding with an exercise price of " + FrameforPanel.ExercisePriceEPSInput.getText() + " Company had a "+ FrameforPanel.AverageStockPriceInput.getText() + " average stock price for the year" +"\n");
         GenerateDilutedEPS gen = new GenerateDilutedEPS();
    }
}
