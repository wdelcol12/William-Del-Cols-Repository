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
public class PensionPlanningGenerate {
    public PensionPlanningGenerate(){
       ArrayList <Float> PensionExpense = new ArrayList <Float>();
       ArrayList <Float> Cash = new ArrayList<Float>();
       ArrayList <Float> PSC = new ArrayList<Float>();
       ArrayList <Float> GainLoss = new ArrayList<Float>();
       ArrayList <Float> PensionAsset = new ArrayList<Float>();
       ArrayList <Float> PBORecords = new ArrayList<Float>();
       ArrayList <Float> PlanAssetsRecord = new ArrayList<Float>();
       
       boolean EndingAssetLiabCredit = false;
       boolean EndingAssetLiabDebit = false;
       boolean BeginningAssetLiabDebit = false;
       boolean BeginningAssetLiabCredit = false;
       boolean UnexpectedGain = false;
       boolean UnexpectedLoss = false;
       
       
      float LiabilityIncrease;
      float AssetIncrease;
        float FinalTotalPBO = 0;
        String ServiceCostString = "";
        float ServiceCost = 0;
        
        String SettlementRateString = "";
        float SettlementRate = 0;
        
        String ActualReturnString = "";
        float ActualReturn = 0;
        
        String AmortizationPSCString = "";
        float AmortizationPSC = 0;
        
        String FundingContributionsString = "";
        float FundingContributions = 0;
        
        String BenefitsPaidString = "";
        float BenefitsPaid = 0;
        
        String ChangesinActuaryString = "";
        float ChangesinActuary = 0;
        
        String BeginningPBOString = "";
        float BeginningPBO = 0;
        
        String BeginningPlanAssetsString = "";
        float BeginningPlanAssets = 0;
        
        String ExpectedReturnString = "";
        float ExpectedReturn = 0;
        
        String PSCBenefitsString = "";
        float PSCBenefits = 0;
        
        
        float TotalPensionExpense =0;
        float TotalCash = 0;
        float TotalPSC = 0;
        float TotalGL = 0;
        float TotalPensionAssetLiability = 0;
        float TotalPBO = 0;
        float TotalPlanAssets = 0;
        
           try {
        ServiceCostString =  FrameforPanel.ServiceCostInput.getText();
        ServiceCost  = Float.parseFloat(ServiceCostString);
} catch (NumberFormatException e) {
} 
            try {
        SettlementRateString =  FrameforPanel.SettlementRateInput.getText();
        SettlementRate  = Float.parseFloat(SettlementRateString);
} catch (NumberFormatException e) {
} 
try {
        ActualReturnString =  FrameforPanel.ActualReturnPlanAssetsInput.getText();
        ActualReturn  = Float.parseFloat(ActualReturnString);
} catch (NumberFormatException e) {
} 
   try {
        AmortizationPSCString =  FrameforPanel.PSCAmortInput.getText();
        AmortizationPSC  = Float.parseFloat(AmortizationPSCString);
} catch (NumberFormatException e) {
} 
  try {
        FundingContributionsString =  FrameforPanel.FundingContributionsInput.getText();
        FundingContributions  = Float.parseFloat(FundingContributionsString);
} catch (NumberFormatException e) {
} 
   try {
        BenefitsPaidString =  FrameforPanel.BenefitsInput.getText();
        BenefitsPaid  = Float.parseFloat(BenefitsPaidString);
} catch (NumberFormatException e) {
} 
       try {
        ChangesinActuaryString =  FrameforPanel.ActuaryInput.getText();
        ChangesinActuary  = Float.parseFloat(ChangesinActuaryString);
} catch (NumberFormatException e) {
} 
           try {
        BeginningPBOString =  FrameforPanel.BeginPBOInput.getText();
        BeginningPBO  = Float.parseFloat(BeginningPBOString);
} catch (NumberFormatException e) {
} 
    try {
        BeginningPlanAssetsString =  FrameforPanel.BeginPlanAssets.getText();
        BeginningPlanAssets  = Float.parseFloat(BeginningPlanAssetsString);
} catch (NumberFormatException e) {
}
    try {
        ExpectedReturnString =  FrameforPanel.ExpectReturnInput.getText();
        ExpectedReturn  = Float.parseFloat(ExpectedReturnString);
} catch (NumberFormatException e) {
} 
      try {
        PSCBenefitsString =  FrameforPanel.PriorServiceBenefitsInput.getText();
        PSCBenefits  = Float.parseFloat(PSCBenefitsString);
} catch (NumberFormatException e) {
} 
    
    SettlementRate = SettlementRate/100;
   DefaultTableModel Pension = (DefaultTableModel) FrameforPanel.PensionPlanningTable.getModel();
   DefaultTableModel PensionJE = (DefaultTableModel) FrameforPanel.PensionJETable.getModel();
   if (!PSCBenefitsString.equals("")){
       Pension.addRow (new Object[]{"End of Previous Year Balance", "-", "-", "-","-",BeginningPBO- BeginningPlanAssets, BeginningPBO, BeginningPlanAssets});
       Pension.addRow(new Object[]{"Prior Service Cost", "-", "-",PSCBenefits + " Dr","-", "-", PSCBenefits + " Cr", "-"});
       BeginningPBO += PSCBenefits;
     //  PSC.add(PSCBenefits);
   } 
   
   
 
   if (BeginningPBO>BeginningPlanAssets){
       BeginningAssetLiabCredit = true;
   Pension.addRow (new Object[]{"Beginning Balance", "-", "-", "-","-",BeginningPBO - BeginningPlanAssets, BeginningPBO, BeginningPlanAssets});
   PBORecords.add(BeginningPBO);
   PlanAssetsRecord.add(BeginningPlanAssets);
      }else if (BeginningPBO<BeginningPlanAssets){
          BeginningAssetLiabDebit = true;
              Pension.addRow (new Object[]{"Beginning Balance", "-", "-", "-","-",BeginningPlanAssets - BeginningPBO, BeginningPBO, BeginningPlanAssets});
              PBORecords.add(BeginningPBO);
            PlanAssetsRecord.add(BeginningPlanAssets);
       }
   
   Pension.addRow (new Object[]{"Service Cost", ServiceCost + " Dr", "-", "-", "-", "-", ServiceCost + " Cr", "-"});
   PensionExpense.add(ServiceCost);//0
   PBORecords.add(ServiceCost);//0
   
   Pension.addRow (new Object[]{"Interest Cost", (BeginningPBO) * SettlementRate + " Dr", "-", "-", "-", "-", (BeginningPBO) * SettlementRate + "Cr", "-"});
   PensionExpense.add((BeginningPBO) * SettlementRate);//1
   PBORecords.add((BeginningPBO) * SettlementRate);//1
   
   Pension.addRow (new Object[]{"Actual Return", ActualReturn + " Cr", "-", "-", "-", "-", "-", ActualReturn + " Dr"});
   PensionExpense.add(-1*ActualReturn);//2
   PlanAssetsRecord.add(ActualReturn);//0
   
   Pension.addRow (new Object[]{"Amortization of PSC", AmortizationPSC + " Dr", "-", AmortizationPSC +  "Cr", "-", "-", "-", "-"});
   PensionExpense.add(AmortizationPSC);//3
   PSC.add(AmortizationPSC);//0
   
   Pension.addRow(new Object[]{"Contributions", "-", FundingContributions + " Cr", "-", "-", "-", "-", FundingContributions + " Dr"});
   Cash.add(FundingContributions);//0
   PlanAssetsRecord.add(FundingContributions);//1
   Pension.addRow(new Object[]{"Benefits", "-", "-", "-", "-", "-", BenefitsPaid + " Dr", BenefitsPaid + " Cr"});
   PBORecords.add(-1*BenefitsPaid);//2
   PlanAssetsRecord.add(-1*BenefitsPaid);//2

   System.out.println("The Expected Return is: " + ExpectedReturn);
   System.out.println("The Actual Return is: " + ActualReturn);
   if (ExpectedReturn > ActualReturn){
      Pension.addRow (new Object[]{"Unexpected Loss", ExpectedReturn - ActualReturn + " Cr", "-", "-", ExpectedReturn - ActualReturn + " Dr", "-", "-", "-"});
      PensionExpense.add(-1*(ExpectedReturn - ActualReturn));//4
      GainLoss.add(ExpectedReturn - ActualReturn);//0
      UnexpectedLoss = true;
  }else if (ActualReturn > ExpectedReturn){
        Pension.addRow (new Object[]{"Unexpected Gain", ActualReturn - ExpectedReturn + " Dr", "-", "-", ActualReturn - ExpectedReturn + " Cr", "-", "-", "-"});
        PensionExpense.add(ActualReturn - ExpectedReturn);//4
              GainLoss.add(ActualReturn - ExpectedReturn);//0
              UnexpectedGain = true;
              
  }else {
      
  }

   for (int i = 0; i < PBORecords.size(); i++){
       TotalPBO += PBORecords.get(i);
   }
   if(TotalPBO <ChangesinActuary && !ChangesinActuaryString.equals("")){
      LiabilityIncrease =ChangesinActuary - TotalPBO;
      
   
      Pension.addRow(new Object[]{"Liability Increase", "-", "-", "-", LiabilityIncrease + " Dr", "-", LiabilityIncrease + " Cr", "-" });
      GainLoss.add(LiabilityIncrease);
      PBORecords.add(LiabilityIncrease);
   }else if (TotalPBO >ChangesinActuary && !ChangesinActuaryString.equals("")){
       AssetIncrease = TotalPensionExpense - TotalPBO;
        Pension.addRow(new Object[]{"Asset Increase", "-", "-", "-", AssetIncrease + " Cr", "-", AssetIncrease + " Dr", "-" });
        GainLoss.add(AssetIncrease*-1);
        PBORecords.add(AssetIncrease*-1);
   }
   for (int i = 0; i< PlanAssetsRecord.size(); i++){
       TotalPlanAssets += PlanAssetsRecord.get(i);
   }
    for (int i = 0; i< PensionExpense.size(); i++){
      TotalPensionExpense += PensionExpense.get(i);
      
      
   }
   
   for (int i = 0; i < Cash.size(); i++){
       TotalCash += Cash.get(i);
   }
   for (int i = 0; i< GainLoss.size(); i++){
       TotalGL += GainLoss.get(i);
   }
   for (int i = 0; i < PensionAsset.size(); i++){
     
       TotalPensionAssetLiability += PensionAsset.get(i);
   }
   for (int i = 0; i< PBORecords.size(); i++){
       FinalTotalPBO += PBORecords.get(i);
   }
   for (int i = 0; i < PSC.size(); i ++){
       TotalPSC = PSC.get(i);
   }
   if (FinalTotalPBO > TotalPlanAssets){
       EndingAssetLiabCredit = true;
       TotalPensionAssetLiability = FinalTotalPBO - TotalPlanAssets;
        Pension.addRow(new Object[]{"Total", TotalPensionExpense,TotalCash,TotalPSC, TotalGL, TotalPensionAssetLiability, FinalTotalPBO, TotalPlanAssets});
   }else if (FinalTotalPBO < TotalPlanAssets){
       EndingAssetLiabDebit = true;
          TotalPensionAssetLiability = TotalPlanAssets - FinalTotalPBO;
        Pension.addRow(new Object[]{"Total", TotalPensionExpense,TotalCash,TotalPSC, TotalGL, TotalPensionAssetLiability, FinalTotalPBO, TotalPlanAssets});
   }else {
       Pension.addRow(new Object[]{"Total", TotalPensionExpense,TotalCash,TotalPSC, TotalGL, 0, FinalTotalPBO, TotalPlanAssets});
   }
//   System.out.println("Total Pension Expense is: " + TotalPensionExpense);
//   System.out.println("Total Cash is: " + TotalCash);
//   System.out.println("Total GainLoss is: " + TotalGL);
//   System.out.println("Total TotalPensionAssetLiability is: " + TotalPensionAssetLiability);
//   System.out.println("Total TotalPBO is: " + FinalTotalPBO);
//   System.out.println("Total PlanAssets is: " + TotalPlanAssets);
   
   
   
  PensionJE.addRow(new Object[]{"Debit", "Pension Expense", TotalPensionExpense});
  if (UnexpectedLoss == true){
  PensionJE.addRow(new Object[]{"Debit", "OCI", TotalGL});
  
  }else if (UnexpectedGain == true){
      PensionJE.addRow(new Object[]{"Credit", "OCI", TotalGL});
  }
  PensionJE.addRow(new Object[]{"Credit", "Cash", TotalCash});
 
      if(FinalTotalPBO > TotalPlanAssets && BeginningAssetLiabCredit == true && TotalPensionAssetLiability > Float.parseFloat(Pension.getValueAt(0,5).toString())){
  PensionJE.addRow(new Object[]{"Credit", "Pension Liability", TotalPensionAssetLiability - ( Float.parseFloat(Pension.getValueAt(0,5).toString()))});
      } else if (FinalTotalPBO > TotalPlanAssets && BeginningAssetLiabCredit == true && TotalPensionAssetLiability < Float.parseFloat(Pension.getValueAt(0,5).toString())){
          PensionJE.addRow(new Object[]{"Debit", "Pension Asset",  (Float.parseFloat(Pension.getValueAt(0,5).toString()) - TotalPensionAssetLiability)});
          
   }else if(FinalTotalPBO > TotalPlanAssets && BeginningAssetLiabCredit == false){
        PensionJE.addRow(new Object[]{"Credit", "Pension Liability", TotalPensionAssetLiability + ( Float.parseFloat(Pension.getValueAt(0,5).toString()))});
   
       
  }else if (TotalPlanAssets > FinalTotalPBO && BeginningAssetLiabDebit == true && TotalPensionAssetLiability > Float.parseFloat(Pension.getValueAt(0,5).toString())){
      
        PensionJE.addRow(new Object[]{"Debit", "Pension Asset", TotalPensionAssetLiability -  Float.parseFloat(Pension.getValueAt(0,5).toString())});
        
  } else if(TotalPlanAssets > FinalTotalPBO && BeginningAssetLiabDebit == true && TotalPensionAssetLiability < Float.parseFloat(Pension.getValueAt(0,5).toString())){
                 PensionJE.addRow(new Object[]{"Credit", "Pension Liability",   Float.parseFloat(Pension.getValueAt(0,5).toString()) - TotalPensionAssetLiability});
                
   }else if (TotalPlanAssets > FinalTotalPBO && BeginningAssetLiabDebit == false){
         PensionJE.addRow(new Object[]{"Debit", "Pension Asset", TotalPensionAssetLiability +  Float.parseFloat(Pension.getValueAt(0,5).toString())});
   }
       if (!PSCBenefitsString.equals("")){
      PensionJE.addRow (new Object[]{"Debit", "OCI",PSCBenefits -TotalPSC});
  }else if (PSCBenefitsString.equals("")) {
  PensionJE.addRow(new Object[]{"Credit", "OCI", TotalPSC});
  }
  
  
}
}

