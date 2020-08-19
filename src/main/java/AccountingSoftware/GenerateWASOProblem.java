/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;


import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author wdelc
 */
public class GenerateWASOProblem {
    public GenerateWASOProblem(){
           DefaultTableModel dm1 = (DefaultTableModel) FrameforPanel.WASOTable.getModel();
int rowCount1 = dm1.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount1 - 1; i >= 0; i--) {
    dm1.removeRow(i);
}
FrameforPanel.WASOProblemField.setText("");
FrameforPanel.BeginSharesInput.setText("");
        
        
        final int MaximumAmountDates = 6;
        final int MinimumAmountDates = 2;
        final int MaximumAmountBeginningBalance = 200000;
        final int MinimumAmountBeginningBalance = 100000;
        final int MaximumAmountOfIssuances = 4;
        final int MinimumAmountOfIssuances = 2;
        final int MaximumAmountofPurchases = 2;
        final int MinimumAmountofPurchases = 0;
        final int MinimumAmountofStockSplits = 0;
        final int MaximumAmountofStockSplits = 1;
        final int MinimumAmountofStockDividends = 0;
        final int MaximumAmountofStockDividends = 1;
        final int MaximumIssuancesNumber = 50000;
        final int MinimumIssuancesNumber = 20000;
        final int MaximumPurchasesNumber =  40000;
        final int MinimumPurchasesNumber = 20000;
        final int MaximumStockSplitNumber = 3;
        final int MinimumStockSplitNumber = 2;
        final int MaximumStockDividendNumber = 70;
        final int MinimumStockDividendNumber = 20;

         
        Random rand = new Random();
      //  HashMap <String, Integer> OrderOfEvents = new HashMap <String, Integer>();
    //String [] OrderOfEvents = {"Beginning Shares", "Amounts Of Issuances", "Amount of Stock Splits", "Amount of Stock Dividends"};
    FrameforPanel.WASOProblemField.setText("Calculate the final Weighted Average Shares Outstanding. Round to the nearest full number \n");
    ArrayList<String> OrderOfEvents = new ArrayList<String>();
    String [] Months = {"January","February", "March", "April","May","June", "July", "August", "September", "October", "November", "December"};
 
    OrderOfEvents.add("Amount Of Issuances");
    OrderOfEvents.add("Amount Of Purchases");
    OrderOfEvents.add("Amount of Stock Splits");
    OrderOfEvents.add("Amount of Stock Dividends");
    
       int zero = 0; 
        int AmountOfDates = rand.nextInt(MaximumAmountDates + 1 - MinimumAmountDates) + MinimumAmountDates;
        int BeginningShares = rand.nextInt(MaximumAmountBeginningBalance + 1 - MinimumAmountBeginningBalance) + MinimumAmountBeginningBalance;
          int AmountOfIssuances = rand.nextInt(MaximumAmountOfIssuances + 1 - MinimumAmountOfIssuances) + MinimumAmountOfIssuances;
          int AmountOfPurchases = rand.nextInt(MaximumAmountofPurchases + 1 - MinimumAmountofPurchases) + MinimumAmountofPurchases;
        int AmountofStockSplits = rand.nextInt(MaximumAmountofStockSplits + 1 - MinimumAmountofStockSplits) + MinimumAmountofStockSplits;
        int AmountofStockDividends = rand.nextInt(MaximumAmountofStockDividends + 1 - MinimumAmountofStockDividends) + MinimumAmountofStockDividends;
        
 ArrayList <Integer> OrderOfEventsValue = new ArrayList<Integer>();
 OrderOfEventsValue.add(AmountOfIssuances);
 OrderOfEventsValue.add(AmountOfPurchases);
 OrderOfEventsValue.add(AmountofStockSplits);
 OrderOfEventsValue.add(AmountofStockDividends);
int sum = 0;

 for (int i = 0; i< OrderOfEventsValue.size(); i++){
    sum += OrderOfEventsValue.get(i);
    System.out.println("Beginning Sum" + sum);
 }
   FrameforPanel.BeginSharesInput.setText(String.valueOf(BeginningShares));
   FrameforPanel.WASOProblemField.setText(FrameforPanel.WASOProblemField.getText()+" Beginning Shares Outstanding on January 1st: " + BeginningShares + "\n");
   WasoIssuance was8 = new WasoIssuance (false,true, true, "January");
 //while (sum!=0){
 
 for(int i =0; i< sum; i++){
  
  int RandomOrder = rand.nextInt(3);
  int RandomMonth = rand.nextInt(11);
  System.out.println("Random Number is:" + RandomOrder);
  
  if (RandomOrder == 0 && OrderOfEventsValue.get(0) != 0){
    //  OrderOfEventsValue.get(0);
      int SharesIssued = rand.nextInt(MaximumIssuancesNumber + 1 - MinimumIssuancesNumber) + MinimumIssuancesNumber;
      String Month = Months[RandomMonth];
      FrameforPanel.SharesIssuedInput.setText(String.valueOf(SharesIssued));
      WasoIssuance was = new WasoIssuance(true,false,true, Month);
      OrderOfEventsValue.set(0, OrderOfEventsValue.get(0) - 1);
      //sum--;
      FrameforPanel.WASOProblemField.setText(FrameforPanel.WASOProblemField.getText() + "Issuance of "+ SharesIssued + " shares on " + Month + " 1st" + "\n");
      FrameforPanel.SharesIssuedInput.setText("");
     // System.out.println(sum);
      
  }else if (RandomOrder == 1 && OrderOfEventsValue.get(1) !=0){
       int PurchasesIssued = rand.nextInt(MaximumPurchasesNumber + 1 - MinimumPurchasesNumber) + MinimumPurchasesNumber;
      FrameforPanel.SharesIssuedInput.setText(String.valueOf(PurchasesIssued));
    String Month = Months[RandomMonth];
      WasoIssuance was = new WasoIssuance (false, false, true, Month);
      FrameforPanel.WASOProblemField.setText(FrameforPanel.WASOProblemField.getText() + "Repurchase of "+ PurchasesIssued + " shares on " + Month + " 1st" + "\n");
      
      OrderOfEventsValue.set(1, OrderOfEventsValue.get(1) -1);
      
     // sum--;
      FrameforPanel.SharesIssuedInput.setText("");
        //System.out.println(sum);
  }
 }
 for(int i =0; i < sum; i ++){
     int RandomOrder = rand.nextInt(3+1-2)+2;
      int RandomMonth = rand.nextInt(11);
 if (RandomOrder == 2 && OrderOfEventsValue.get(2) !=0){
     
       int StockSplit = rand.nextInt(MaximumStockSplitNumber + 1 - MinimumStockSplitNumber) + MinimumStockSplitNumber;
       FrameforPanel.StockSplitInput.setText(String.valueOf(StockSplit));
       StockDiv sto = new StockDiv(false,true ,RandomMonth+1);
       OrderOfEventsValue.set(2, OrderOfEventsValue.get(2)-1);
        String Month = Months[RandomMonth];
         FrameforPanel.WASOProblemField.setText(FrameforPanel.WASOProblemField.getText() + "Issuance of a "+ StockSplit + " for one stock split on " + Month + " 1st" + "\n");
      // sum--;
       // System.out.println(sum);
      FrameforPanel.StockSplitInput.setText("");
  }else if (RandomOrder == 3 && OrderOfEventsValue.get(3) !=0){
        
       int StockDividend = rand.nextInt(MaximumStockDividendNumber + 1 - MinimumStockDividendNumber) + MinimumStockDividendNumber;
       FrameforPanel.StockDividendInput.setText(String.valueOf(StockDividend));
       StockDiv sto = new StockDiv (true,true ,RandomMonth+1);
       OrderOfEventsValue.set(3, OrderOfEventsValue.get(3) -1);
       String Month = Months[RandomMonth];
         FrameforPanel.WASOProblemField.setText(FrameforPanel.WASOProblemField.getText() + "Issuance of a "+ StockDividend + " percent stock dividend on " + Month + " 1st" + "\n");
      // sum --;
       FrameforPanel.StockDividendInput.setText("");
      //  System.out.println(sum);
  }else{
  }
 }
 }
    
    }   
  //  }

