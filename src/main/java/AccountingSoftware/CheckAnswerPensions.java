/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class CheckAnswerPensions {
//    private ArrayList<Integer> OCI = new ArrayList<Integer>();
//    private ArrayList<Integer> OCICredit = new ArrayList<Integer>();
//    private ArrayList<Integer> PensionAsset = new ArrayList<Integer>();
//    private ArrayList<Integer> PensionLiability = new ArrayList<Integer>();
//    private ArrayList<Integer> PensionExpense = new ArrayList<Integer>();
//    private ArrayList<Integer> Cash = new ArrayList<Integer>();
//    
//     private ArrayList<Integer> OCI2 = new ArrayList<Integer>();
//     private ArrayList<Integer> OCI2Credit = new ArrayList<Integer>();
//    private ArrayList<Integer> PensionAsset2 = new ArrayList<Integer>();
//    private ArrayList<Integer> PensionLiability2 = new ArrayList<Integer>();
//    private ArrayList<Integer> PensionExpense2 = new ArrayList<Integer>();
//    private ArrayList<Integer> Cash2 = new ArrayList<Integer>();
    
  
//    boolean OCICorrect = false;
//    boolean PensionAssetCorrect = false;
//    boolean PensionLiabilityCorrect = false;
//    boolean PensionExpenseCorrect = false;
//    boolean CashCorrect = false;
   
    
    public CheckAnswerPensions(){
        
        
    boolean OCICorrect = false;
    boolean PensionAssetCorrect = false;
    boolean PensionLiabilityCorrect = false;
    boolean PensionExpenseCorrect = false;
    boolean CashCorrect = false;
           int OCISum= 0;
     int PensionAssetSum=0;
     int PensionLiabilitySum =0;
     int PensionExpenseSum =0;
     int CashSum = 0;
     int OCICreditSum = 0;
    
     int OCISum2 =0 ;
     int PensionAssetSum2 =0;
    int PensionLiabilitySum2 = 0;
    int PensionExpenseSum2 = 0;
   int CashSum2 = 0;
    int OCICreditSum2 = 0;
    
        String OCIString = "";
        int OCIfl = 0;
        String PensionAssetString = "";
        int PensionAssetfl = 0;
        String PensionLiabilityString = "";
        int PensionLiabilityfl = 0;
        String PensionExpenseString = "";
        int PensionExpensefl = 0;
        String CashString = "";
        int Cashfl = 0;
        
//         System.out.println("OCI Sum 1: " + OCISum);
//         System.out.println("OCI Sum 2: " + OCISum2);
//         System.out.println("Pension Asset Sum 1: " + PensionAssetSum);
//         System.out.println("Pension Asset Sum 2: " + PensionAssetSum2);
//         System.out.println("Pension Expense Sum 1: " + PensionExpenseSum);
//         System.out.println("Pension Expense Sum 2: " + PensionExpenseSum2);
//         System.out.println("Pension Liability Sum 1: " + PensionLiabilitySum);
//           System.out.println("Pension Liability Sum 2: " + PensionLiabilitySum2);
//         System.out.println("Cash Sum 1: " + CashSum);
//           System.out.println("Cash Sum 2: " + CashSum2);
         try {
           OCIString = FrameforPanel.AccumulatedOCICheckAnswerInput.getText();
            OCIfl = Integer.parseInt(OCIString);
       }catch (NumberFormatException e){
          
       }
         try {
           PensionAssetString = FrameforPanel.PensionAssetCheckAnswerInput.getText();
            PensionAssetfl = Integer.parseInt(PensionAssetString);
       }catch (NumberFormatException e){
          
       }
         try {
           PensionLiabilityString = FrameforPanel.PensionLiabilityCheckAnswerInput.getText();
            PensionLiabilityfl = Integer.parseInt(PensionLiabilityString);
       }catch (NumberFormatException e){
          
       }
         try {
           PensionExpenseString = FrameforPanel.PensionExpenseCheckAnswerInput.getText();
            PensionExpensefl = Integer.parseInt(PensionExpenseString);
       }catch (NumberFormatException e){
          
       }
          try {
           CashString = FrameforPanel.CashAnswerCheckInput.getText();
            Cashfl = Integer.parseInt(CashString);
       }catch (NumberFormatException e){
          
       }
         
          
          
          DefaultTableModel Answer = (DefaultTableModel) FrameforPanel.PensionJETable.getModel();//Answer Checker
         DefaultTableModel PensionAnswers = (DefaultTableModel) FrameforPanel.PensionAnswerTableEdu.getModel();//User input table
         
         
              //float temp =Float.parsefloat(Answer.getVlaueAt(i,2).toString());
          
         for(int i = 0; i<Answer.getRowCount(); i ++){
              if (Answer.getValueAt(i,0) != null && Answer.getValueAt(i,1) !=null && Answer.getValueAt(i,2) != null){
                  
              float temp =Float.parseFloat(Answer.getValueAt(i,2).toString());
          temp = Math.round(temp);
                  if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("OCI")){
                 OCISum += temp;
                 System.out.println("Im dumb and dumber");
             }else if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("Pension Asset")){
                PensionAssetSum += temp;
                 
              
             }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("Pension Liability")){
                    PensionLiabilitySum += temp;
             }else if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("Pension Expense")){
                  PensionExpenseSum += temp;
             }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("Cash")){
                  CashSum += temp;
              }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("OCI")){
                 OCICreditSum += temp;
              }
              }
         }
         for (int i = 0; i < PensionAnswers.getRowCount(); i++){
                if (PensionAnswers.getValueAt(i,0) != null && PensionAnswers.getValueAt(i,1) !=null && PensionAnswers.getValueAt(i,2) != null){
                  
             float temp =Float.parseFloat(PensionAnswers.getValueAt(i,2).toString());
          temp = Math.round(temp);
               if (PensionAnswers.getValueAt(i,0).equals("Debit") && PensionAnswers.getValueAt(i,1).equals("OCI")){
                 OCISum2 += temp;
                 
             }else if (PensionAnswers.getValueAt(i,0).equals("Debit") && PensionAnswers.getValueAt(i,1).equals("Pension Asset")){
                 PensionAssetSum2 += temp;
                 
              
             }else if (PensionAnswers.getValueAt(i,0).equals("Credit") && PensionAnswers.getValueAt(i,1).equals("Pension Liability")){
                PensionLiabilitySum2 += temp;
             }else if (PensionAnswers.getValueAt(i,0).equals("Debit") && PensionAnswers.getValueAt(i,1).equals("Pension Expense")){
                   PensionExpenseSum2 += temp;
             }else if (PensionAnswers.getValueAt(i,0).equals("Credit") && PensionAnswers.getValueAt(i,1).equals("Cash")){
                  CashSum2 += temp;
              }else if (PensionAnswers.getValueAt(i,0).equals("Credit") && PensionAnswers.getValueAt(i,1).equals("OCI")){
                  OCICreditSum2 += temp;
              }
                }
          }
//         System.out.println("OCI Sum 1: " + OCISum);
//         System.out.println("OCI Sum 2: " + OCISum2);
//         System.out.println("Pension Asset Sum 1: " + PensionAssetSum);
//         System.out.println("Pension Asset Sum 2: " + PensionAssetSum2);
//         System.out.println("Pension Expense Sum 1: " + PensionExpenseSum);
//         System.out.println("Pension Expense Sum 2: " + PensionExpenseSum2);
//         System.out.println("Pension Liability Sum 1: " + PensionLiabilitySum);
//           System.out.println("Pension Liability Sum 2: " + PensionLiabilitySum2);
//         System.out.println("Cash Sum 1: " + CashSum);
//           System.out.println("Cash Sum 2: " + CashSum2);
         
//          for (int i = 0; i < Answer.getRowCount(); i++){
//          if (Answer.getValueAt(i,0) != null && Answer.getValueAt(i,1) !=null && Answer.getValueAt(i,2) != null){
//             if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("OCI")){
//                 OCI.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
//                 
//             }else if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("Pension Asset")){
//                 PensionAsset.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
//                 
//              
//             }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("Pension Liability")){
//                 PensionLiability.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
//             }else if (Answer.getValueAt(i,0).equals("Debit") && Answer.getValueAt(i,1).equals("Pension Expense")){
//                  PensionExpense.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
//             }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("Cash")){
//                  Cash.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
//              }else if (Answer.getValueAt(i,0).equals("Credit") && Answer.getValueAt(i,1).equals("OCI")){
//                  OCICredit.add(Integer.parseInt(Answer.getValueAt(i,2).toString()));
//              }
//          }
//}
//          for (int i = 0; i < PensionAnswers.getRowCount(); i++){
//               if (PensionAnswers.getValueAt(i,0).equals("Debit") && PensionAnswers.getValueAt(i,1).equals("OCI")){
//                 OCI2.add(Integer.parseInt(PensionAnswers.getValueAt(i,2).toString()));
//                 
//             }else if (PensionAnswers.getValueAt(i,0).equals("Debit") && PensionAnswers.getValueAt(i,1).equals("Pension Asset")){
//                 PensionAsset2.add(Integer.parseInt(PensionAnswers.getValueAt(i,2).toString()));
//                 
//              
//             }else if (PensionAnswers.getValueAt(i,0).equals("Debit") && PensionAnswers.getValueAt(i,1).equals("Pension Liability")){
//                 PensionLiability2.add(Integer.parseInt(PensionAnswers.getValueAt(i,2).toString()));
//             }else if (PensionAnswers.getValueAt(i,0).equals("Debit") && PensionAnswers.getValueAt(i,1).equals("Pension Expense")){
//                  PensionExpense2.add(Integer.parseInt(PensionAnswers.getValueAt(i,2).toString()));
//             }else if (PensionAnswers.getValueAt(i,0).equals("Credit") && PensionAnswers.getValueAt(i,1).equals("Cash")){
//                  Cash2.add(Integer.parseInt(PensionAnswers.getValueAt(i,2).toString()));
//              }else if (PensionAnswers.getValueAt(i,0).equals("Credit") && PensionAnswers.getValueAt(i,1).equals("OCI")){
//                  OCI2Credit.add(Integer.parseInt(PensionAnswers.getValueAt(i,2).toString()));
//              }
//          }
//         
//          for(int i = 0; i< OCI.size(); i++){
//              OCISum += OCI.get(i);
//          }
//           for(int i = 0; i< PensionAsset.size(); i++){
//              PensionAssetSum += PensionAsset.get(i);
//          }
//            for(int i = 0; i< PensionLiability.size(); i++){
//              PensionLiabilitySum += PensionLiability.get(i);
//          }
//             for(int i = 0; i< Cash.size(); i++){
//              CashSum += Cash.get(i);
//          }
//              for(int i = 0; i< OCICredit.size(); i++){
//              OCISum -= OCICredit.get(i);
//          }
//               for(int i = 0; i< OCI2.size(); i++){
//              OCISum2 += OCI2.get(i);
//          }
//                 for(int i = 0; i< PensionAsset2.size(); i++){
//              PensionAssetSum2 += PensionAsset2.get(i);
//          }
//                   for(int i = 0; i< PensionLiability2.size(); i++){
//              PensionLiabilitySum2 += PensionLiability2.get(i);
//          }
//           for(int i = 0; i< PensionExpense2.size(); i++){
//              PensionExpenseSum2 += PensionExpense2.get(i);
//          }
//            for(int i = 0; i< Cash2.size(); i++){
//              CashSum2 += Cash2.get(i);
//          }
//            for(int i = 0; i< OCI2Credit.size(); i++){
//              OCISum2 -= OCI2Credit.get(i);
//          }
             if (OCISum > OCICreditSum){
                OCISum = OCISum - OCICreditSum;
             }else if (OCISum < OCICreditSum){
                 OCISum = OCICreditSum - OCISum;
             }      
             if (OCISum2 > OCICreditSum2){
                OCISum2 = OCISum2 - OCICreditSum2;
             }else if (OCISum2 < OCICreditSum2){
                 OCISum2 = OCICreditSum2 - OCISum2;
             }     
                      System.out.println("OCI Sum 1: " + OCISum);
         System.out.println("OCI Sum 2: " + OCISum2);
         System.out.println("Pension Asset Sum 1: " + PensionAssetSum);
         System.out.println("Pension Asset Sum 2: " + PensionAssetSum2);
         System.out.println("Pension Expense Sum 1: " + PensionExpenseSum);
         System.out.println("Pension Expense Sum 2: " + PensionExpenseSum2);
         System.out.println("Pension Liability Sum 1: " + PensionLiabilitySum);
           System.out.println("Pension Liability Sum 2: " + PensionLiabilitySum2);
         System.out.println("Cash Sum 1: " + CashSum);
           System.out.println("Cash Sum 2: " + CashSum2);
             
           if(OCISum == OCISum2 || OCISum + 1 == OCISum2 || OCISum + 2 == OCISum2 || OCISum -1 == OCISum2 || OCISum -2 == OCISum2){
              OCICorrect = true;
           }
           if (PensionAssetSum == PensionAssetSum2 || PensionAssetSum  + 1 == PensionAssetSum2  || PensionAssetSum  + 2 == PensionAssetSum2  || PensionAssetSum  -1 == PensionAssetSum2  || PensionAssetSum  -2 == PensionAssetSum2 ){
               PensionAssetCorrect = true;
           }
           if (PensionLiabilitySum == PensionLiabilitySum2 || PensionLiabilitySum  + 1 == PensionLiabilitySum2  || PensionLiabilitySum  + 2 == PensionLiabilitySum2  || PensionLiabilitySum  -1 == PensionLiabilitySum2  || PensionLiabilitySum  -2 == PensionLiabilitySum2 ){
               PensionLiabilityCorrect = true;
           }
           if (PensionExpenseSum == PensionExpenseSum2 || PensionExpenseSum  + 1 == PensionExpenseSum2  || PensionExpenseSum  + 2 == PensionExpenseSum2  || PensionExpenseSum  -1 == PensionExpenseSum2  || PensionExpenseSum  -2 == PensionExpenseSum2 ){
               PensionExpenseCorrect = true;
           }
           if (CashSum == CashSum2 || CashSum  + 1 == CashSum2  || CashSum  + 2 == CashSum2  || CashSum  -1 == CashSum2  || CashSum  -2 == CashSum2 ){
               CashCorrect = true;
           }
           
           if(PensionAssetfl == PensionAssetSum){
               PensionAssetCorrect = true;
           }
           if (OCIfl == OCISum){
               OCICorrect = true;
           }
           if (PensionLiabilityfl == PensionLiabilitySum){
               PensionLiabilityCorrect = true;
           }
           if (PensionExpensefl == PensionExpenseSum){
               PensionExpenseCorrect = true;
           }
           if (Cashfl == CashSum){
               CashCorrect = true;
           }
           
           
           
           if(OCICorrect == true && PensionAssetCorrect == true && PensionLiabilityCorrect == true && PensionExpenseCorrect == true && CashCorrect == true){
               System.out.println("You have gotten the pension question correct!");
               FrameforPanel.OutputAreaPension.setText("Correct Answer!");
               OCICorrect = false;
               PensionAssetCorrect = false;
               PensionLiabilityCorrect = false;
               PensionExpenseCorrect = false;
               CashCorrect = false;
               
               OCISum = 0;
               OCISum2 = 0;
               PensionAssetSum =0;
               PensionAssetSum2 = 0;
               PensionLiabilitySum = 0;
               PensionLiabilitySum2 = 0;
               PensionExpenseSum = 0;
               PensionExpenseSum2 = 0;
               CashSum = 0;
               CashSum2 = 0;
           }else{
               FrameforPanel.OutputAreaPension.setText("Incorrect Answer");
           }
         
    }
}
