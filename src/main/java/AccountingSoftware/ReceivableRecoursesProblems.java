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
public class ReceivableRecoursesProblems {
    public ReceivableRecoursesProblems(){
         DefaultTableModel RecourseTable = (DefaultTableModel) FrameforPanel.RecourseJETable.getModel();
           DefaultTableModel AnswerInputTable = (DefaultTableModel) FrameforPanel.AnswerInputTableRecourses.getModel();
           int rowCount1 = FrameforPanel.RecourseJETable.getRowCount();

for (int i = rowCount1 - 1; i >= 0; i--) {
    RecourseTable.removeRow(i);
}
   int rowCount2 = FrameforPanel.AnswerInputTableRecourses.getRowCount();

for (int i = rowCount2 - 1; i >= 0; i--) {
    AnswerInputTable.removeRow(i);
}


     FrameforPanel.FactoringAmountInput.setText("");
     FrameforPanel.FinanceChargeInput.setText("");
     FrameforPanel.RetainedReservesInput.setText("");
     FrameforPanel.RecourseLiabilityInput.setText("");
         final int FactorMaximum = 200000;
         final int FactorMinimum = 100000;
         
         final int FinanceChargeMaximum = 7;
         final int FinanceChargeMinimum = 2;
         
         final int ReservesMaximum = 5;
         final int ReserveMinimum = 2;
         
         final int RecourseLiabilityMaximum = 2000;
         final int RecourseLiabilityMinimum = 1000;
        
         Random rand = new Random();
         
         
         
          int FactorAm = rand.nextInt(FactorMaximum + 1 - FactorMinimum) + FactorMinimum;
          int FinanceChargeAM = rand.nextInt(FinanceChargeMaximum + 1 - FinanceChargeMinimum) + FinanceChargeMinimum;
           int ReservesAM = rand.nextInt(ReservesMaximum + 1 - ReserveMinimum) + ReserveMinimum;
           int RecourseLiabilityAM = rand.nextInt(RecourseLiabilityMaximum + 1 - RecourseLiabilityMinimum) + RecourseLiabilityMinimum;
            int RecourseOrNonRecourse = rand.nextInt(2+1 -1) + 1;
           
           FrameforPanel.FactoringAmountInput.setText(String.valueOf(FactorAm));
           FrameforPanel.FinanceChargeInput.setText(String.valueOf(FinanceChargeAM));
           FrameforPanel.RetainedReservesInput.setText(String.valueOf(ReservesAM));
           FrameforPanel.RecourseLiabilityInput.setText(String.valueOf(RecourseLiabilityAM));
          if (RecourseOrNonRecourse == 1){
           FrameforPanel.RecourseCheckMark.setSelected(true);
           GenerateRecourseJE je = new GenerateRecourseJE();
           FrameforPanel.RecourseCheckMark.setSelected(false);
           FrameforPanel.RecoursesQuestionArea.setText("Company Co. factors " + FactorAm + " of Accounts Receivable with another company on a recourse basis \n The other company will collect all receivables. There is a finance charge of " +
                  FinanceChargeAM + " percent and reserves equal to " + ReservesAM+ " percent of A/R to cover adjsutments \n Prepare the journal entry for Company Co. given that the recourse obligation is equal to a fair value of " + RecourseLiabilityAM + "\n Round your answers to the nearest full number");
          }else if (RecourseOrNonRecourse == 2){
               FrameforPanel.WithoutRecourseCheckMark.setSelected(true);
           GenerateRecourseJE je = new GenerateRecourseJE();
           FrameforPanel.WithoutRecourseCheckMark.setSelected(false);
            FrameforPanel.RecoursesQuestionArea.setText("Company Co. factors " + FactorAm + " of Accounts Receivable with another company on a nonrecourse basis \n The other company will collect all receivables. There is a finance charge of " +
                  FinanceChargeAM + " percent and reserves equal to " + ReservesAM+ " percent of A/R to cover adjsutments \n Prepare the journal entry for Company Co. "+"\n Round your answers to the nearest full number");
          }
          for (int i = 0; i< RecourseTable.getRowCount(); i ++){
              AnswerInputTable.addRow(new Object[]{});
          }
          
          
    }
}
