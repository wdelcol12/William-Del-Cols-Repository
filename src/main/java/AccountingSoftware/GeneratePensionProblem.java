/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

import static AccountingSoftware.FrameforPanel.ActualReturnPlanAssetsInput;
import static AccountingSoftware.FrameforPanel.ActuaryInput;
import static AccountingSoftware.FrameforPanel.BeginPBOInput;
import static AccountingSoftware.FrameforPanel.BeginPlanAssets;
import static AccountingSoftware.FrameforPanel.BenefitsInput;
import static AccountingSoftware.FrameforPanel.ExpectReturnInput;
import static AccountingSoftware.FrameforPanel.FundingContributionsInput;
import static AccountingSoftware.FrameforPanel.PSCAmortInput;
import static AccountingSoftware.FrameforPanel.PriorServiceBenefitsInput;
import static AccountingSoftware.FrameforPanel.ServiceCostInput;
import static AccountingSoftware.FrameforPanel.SettlementRateInput;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wdelc
 */
public class GeneratePensionProblem {
    public GeneratePensionProblem(){
                   DefaultTableModel dm1 = (DefaultTableModel) FrameforPanel.PensionPlanningTable.getModel();
int rowCount1 = dm1.getRowCount();

for (int i = rowCount1 - 1; i >= 0; i--) {
    dm1.removeRow(i);
}
  DefaultTableModel dm2 = (DefaultTableModel) FrameforPanel.PensionJETable.getModel();
int rowCount2 = dm2.getRowCount();

for (int i = rowCount2 - 1; i >= 0; i--) {
    dm2.removeRow(i);
}
 DefaultTableModel dm3 = (DefaultTableModel) FrameforPanel.PensionAnswerTableEdu.getModel();
int rowCount3 = dm3.getRowCount();

for (int i = rowCount3 - 1; i >= 0; i--) {
    dm3.removeRow(i);
}


ServiceCostInput.setText("");
     SettlementRateInput.setText("");
      ActualReturnPlanAssetsInput.setText("");
       PSCAmortInput.setText("");
        FundingContributionsInput.setText("");
         BenefitsInput.setText("");
          ActuaryInput.setText("");
           BeginPBOInput.setText("");
           BeginPlanAssets.setText("");
            ExpectReturnInput.setText("");
            PriorServiceBenefitsInput.setText("");
        final int MaximumBeginningPBO = 150000;
        final int MinimumBeginningPBO = 100000; 
        final int MaximumBeginningPlanAssets = 150000;
        final int MinimumBeginningPlanAssets = 100000;
        final int MaximumServiceCost = 20000;
        final int MinimumServiceCost = 10000;
        final int MaximumSettleRate = 20;
        final int MinimumSettleRate = 10;
        final int MaximumActualReturn = 20000;
        final int MinimumActualReturn = 10000;
        final int MaximumExpectedReturn = 20000;
        final int MimimumExpectedReturn = 10000;
        final int MaximumAmortizationPSC = 20000;
        final int MinimumAmortizationPSC = 10000;
        final int MaximumFundingContribution = 30000;
        final int MinimumFundingContribution = 10000;
        final int MaximumBenefits = 8000;
        final int MinimumBenefits = 4000;
        final int MaximumPSC = 200000;
        final int MinimumPSC = 100000;
        
        Random rand = new Random();
        DefaultTableModel PensionJE = (DefaultTableModel) FrameforPanel.PensionJETable.getModel();
        DefaultTableModel PensionUser = (DefaultTableModel) FrameforPanel.PensionAnswerTableEdu.getModel();
        FrameforPanel.QuestionAreaPensions.setText("Company Co. has sponsored a defined benefit pension plan for its employees \n On January 1st 2022,the following balances relate to the plan \n");
          int ServiceCost = rand.nextInt(MaximumServiceCost + 1 - MinimumServiceCost) + MinimumServiceCost;
          int SettlementRate = rand.nextInt(MaximumSettleRate + 1 - MinimumSettleRate) + MinimumSettleRate;
           int ActualReturn = rand.nextInt(MaximumActualReturn + 1 - MinimumActualReturn) + MinimumActualReturn;
           int AmortizationPSC = rand.nextInt(MaximumAmortizationPSC + 1 - MinimumAmortizationPSC) + MinimumAmortizationPSC;
              int FundingContribution = rand.nextInt(MaximumFundingContribution + 1 - MinimumFundingContribution) + MinimumFundingContribution;
           int Benefits = rand.nextInt(MaximumBenefits + 1 - MinimumBenefits) + MinimumBenefits;
           int BeginningPBO = rand.nextInt(MaximumBeginningPBO + 1 - MinimumBeginningPBO) + MinimumBeginningPBO;
             int BeginningPlanAssets = rand.nextInt(MaximumBeginningPlanAssets + 1 - MinimumBeginningPlanAssets) + MinimumBeginningPlanAssets;
             int PSC = rand.nextInt(MaximumPSC + 1 - MinimumPSC) + MinimumPSC;
              int ExpectedReturnRandomNumber = rand.nextInt(MaximumExpectedReturn + 1 - MimimumExpectedReturn) + MimimumExpectedReturn;
              
       
         
           FrameforPanel.BeginPBOInput.setText(String.valueOf(BeginningPBO));
           FrameforPanel.BeginPlanAssets.setText(String.valueOf(BeginningPlanAssets));
           FrameforPanel.ServiceCostInput.setText(String.valueOf(ServiceCost));
           FrameforPanel.SettlementRateInput.setText(String.valueOf(SettlementRate));
           FrameforPanel.ActualReturnPlanAssetsInput.setText(String.valueOf(ActualReturn));
           FrameforPanel.PSCAmortInput.setText(String.valueOf(AmortizationPSC));
           FrameforPanel.FundingContributionsInput.setText(String.valueOf(FundingContribution));
           FrameforPanel.BenefitsInput.setText(String.valueOf(Benefits));

           
           int PSCBeginning = rand.nextInt(2)+1;
           int ChangeActuarial = rand.nextInt(2)+1;
           int ExpectedReturn = rand.nextInt(2)+1;
           
             FrameforPanel.QuestionAreaPensions.setText( FrameforPanel.QuestionAreaPensions.getText()+"Projected Benefit Obligation: " + BeginningPBO + "\n");
         FrameforPanel.QuestionAreaPensions.setText( FrameforPanel.QuestionAreaPensions.getText() +"Plan Assets: " + BeginningPlanAssets + "\n");
         FrameforPanel.QuestionAreaPensions.setText(FrameforPanel.QuestionAreaPensions.getText() + "The following additional data is provided by the actuary " + "\n");
         FrameforPanel.QuestionAreaPensions.setText( FrameforPanel.QuestionAreaPensions.getText() +"Service Cost: " + ServiceCost + "\n");
         FrameforPanel.QuestionAreaPensions.setText(FrameforPanel.QuestionAreaPensions.getText() + "Settlement Rate: " + SettlementRate + "\n");
              FrameforPanel.QuestionAreaPensions.setText(FrameforPanel.QuestionAreaPensions.getText() + "Actual Return on Plan Assets: " + ActualReturn + "\n");
              FrameforPanel.QuestionAreaPensions.setText(FrameforPanel.QuestionAreaPensions.getText() + "Amortization of Prior Service Cost: " + AmortizationPSC + "\n");
              FrameforPanel.QuestionAreaPensions.setText(FrameforPanel.QuestionAreaPensions.getText() + "Contributions: " + FundingContribution + "\n");
               FrameforPanel.QuestionAreaPensions.setText(FrameforPanel.QuestionAreaPensions.getText() + "Benefits paid to retirees: " + Benefits + "\n");
           if (PSCBeginning == 1){//1 = Generate a random number for PSC
               FrameforPanel.PriorServiceBenefitsInput.setText(String.valueOf(PSC));
               FrameforPanel.QuestionAreaPensions.setText(FrameforPanel.QuestionAreaPensions.getText() + "Accumulated OCI (PSC): " + PSC + "\n");
           }else if (PSCBeginning ==2){//PSC will not be used in this problem
               
           }
           if (ExpectedReturn == 1){// 1 Generate a random number for expected return
               FrameforPanel.ExpectReturnInput.setText(String.valueOf(ExpectedReturnRandomNumber));
                FrameforPanel.QuestionAreaPensions.setText(FrameforPanel.QuestionAreaPensions.getText() + "Expected Return on Plan Assets: " + ExpectedReturnRandomNumber + "\n");
           }else if (ExpectedReturn == 2){//2 Expected Return will not be used in this problem
               
           }
            FrameforPanel.QuestionAreaPensions.setText(FrameforPanel.QuestionAreaPensions.getText() + "Use the information to create a pension worksheet and fill in the journal entires \n You can also fill in the total account balances instead \n");

           PensionPlanningGenerate gen = new PensionPlanningGenerate();
           
           for (int i = 0; i <  FrameforPanel.PensionJETable.getRowCount(); i++){
               PensionUser.addRow(new Object[]{});
           }
    }
}
