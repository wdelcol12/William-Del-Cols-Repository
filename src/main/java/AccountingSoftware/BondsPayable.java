package AccountingSoftware;




import javax.swing.JOptionPane;
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
public class BondsPayable {
   
    public BondsPayable(){
       
          String PriceOfBondString = "";
        float PriceOfBondfl = 0;
        
        String MonthBetweenInterestString = "";
        int MonthBetweenInterestfl = 0;
        
        String Extinguishyear = "";
        int Extinguishyearfl = 0;
        
        String CallValueString = "";
        float CallValuefl = 0; 
        
        boolean PremiumBond = false;
        boolean DiscountBond= false;
        boolean BondAtPar = false;
        
        String ImplicitRateString;
        float ImplicitRatefl = 0;
        
        String ParValueBondString = "";
        float ParValueBondfl = 0;
        
        String YearsUntilMaturityString;
        int YearsUntilMaturityfl = 0;
        
        String EffectiveInterestRateString;
        float EffectiveInterestRatefl = 0;//fl stands for float
        
        float InterestRevenueTable = 0;
       
        float CashRec;
        try {
        PriceOfBondString =  FrameforPanel.PriceOfBond.getText();
        PriceOfBondfl = Float.parseFloat(PriceOfBondString);
} catch (NumberFormatException e) {
}   
        try {
        EffectiveInterestRateString =  FrameforPanel.EffectiveInterestRate.getText();
        EffectiveInterestRatefl  = Float.parseFloat(EffectiveInterestRateString);
} catch (NumberFormatException e) {
}   
         try {
        ImplicitRateString =  FrameforPanel.BondsPayableImplicit.getText();
        ImplicitRatefl = Float.parseFloat(ImplicitRateString);
} catch (NumberFormatException e) {
}   
     try {
        ParValueBondString =  FrameforPanel.ParValueBond.getText();
        ParValueBondfl = Float.parseFloat(ParValueBondString );
} catch (NumberFormatException e) {
}       
      try {
        YearsUntilMaturityString =  FrameforPanel.YearsUntilMaturityBondsPayable.getText();
        YearsUntilMaturityfl = Integer.parseInt(YearsUntilMaturityString);
} catch (NumberFormatException e) {
}      
       try {
        MonthBetweenInterestString =  FrameforPanel.MonthBetweenInterest.getText();
      MonthBetweenInterestfl = Integer.parseInt(MonthBetweenInterestString);
} catch (NumberFormatException e) {
}   
        try {
        CallValueString =  FrameforPanel.CallValueInput.getText();
      CallValuefl = Float.parseFloat(CallValueString);
} catch (NumberFormatException e) {
}   
         try {
        Extinguishyear =  FrameforPanel.ExtinguishYears.getText();
      Extinguishyearfl = Integer.parseInt(Extinguishyear);
} catch (NumberFormatException e) {
}   
       
        float ratePercentImplicit;
        float ratePercentEffective;
     ratePercentImplicit = (float) (ImplicitRatefl*.01);
     ratePercentEffective = (float) (EffectiveInterestRatefl*.01);
        float InterestRev1 = ratePercentImplicit*ParValueBondfl;
       float DiscountAmortized = PriceOfBondfl*ratePercentEffective; 
        
        float DiscountDifference;
      if (ParValueBondString.equals("") || PriceOfBondString.equals ("")){
          System.out.println();
      }
      else if (ParValueBondfl > PriceOfBondfl ){
           DiscountBond = true;
       }else if (ParValueBondfl < PriceOfBondfl){
           PremiumBond = true;
       }else if (ParValueBondfl == PriceOfBondfl){
           BondAtPar = true;
       }
        
       float Interestex;
       
       boolean BondIssuedInterest = false;
       boolean BondIssuedInterestbetween = false;
       boolean AnnualInterest = false;
        boolean SemiAnnualInterest = false;
        
        
        
         //CashRec = FaceValueBondfl*ratePercentImplicit;
         
        if ( FrameforPanel.BondIssuedInterestDate.isSelected()){
            BondIssuedInterest = true;
        }else if (! FrameforPanel.BondIssuedInterestDate.isSelected()){
           BondIssuedInterest = false;
        }
        if ( FrameforPanel.BondIssuedbetweenInterestDates.isSelected()){
            BondIssuedInterestbetween = true;
        }else if (! FrameforPanel.BondIssuedbetweenInterestDates.isSelected()){
            BondIssuedInterestbetween = false;
        }
        
        if ( FrameforPanel.BondAnnualInterest.isSelected()){
            AnnualInterest = true;
        }else if (! FrameforPanel.BondAnnualInterest.isSelected()){
            AnnualInterest = false;
        }
          if ( FrameforPanel.BondSemiAnnualInterest.isSelected()){
            SemiAnnualInterest = true;
        }else if (! FrameforPanel.BondSemiAnnualInterest.isSelected()){
            SemiAnnualInterest = false;
        }
          if ( FrameforPanel.ExtinguishCheck.isSelected()){
        //   ExtinguishPanel.setVisible(true);
            FrameforPanel.ExtinguishmentOfDebt = true;
           
       }
        
       if (AnnualInterest == true && SemiAnnualInterest == true){
        //   FrameforPanel.JOptionPane.showMessageDialog(FrameforPanel.this,"Error: Cannot select more than one method");
        System.out.println("Error");
           AnnualInterest = false;
           SemiAnnualInterest = false;
       }
       if (BondIssuedInterest == true && BondIssuedInterestbetween == true){
         System.out.println("Error");
           // JOptionPane.showMessageDialog(FrameforPanel.this,"Error: Cannot select more than one method");
       }

         DefaultTableModel BondsPayableJE = (DefaultTableModel)  FrameforPanel.BondsPayableJETable.getModel();
           DefaultTableModel BondPayableAmort = (DefaultTableModel)  FrameforPanel.BondsPayableAmortSchedule.getModel();
         
         
        if(BondIssuedInterest == true && BondAtPar == true && AnnualInterest == true){
            
    BondsPayableJE.addRow(new Object[]{"Debit", "Cash", ParValueBondfl});
      BondsPayableJE.addRow(new Object[]{"Credit", "Bonds Payable", ParValueBondfl});
    BondsPayableJE.addRow(new Object[]{"Debit", "Interest Expense", InterestRev1});
      BondsPayableJE.addRow(new Object[]{"Credit", "Cash", InterestRev1});
     
      
        } else if (BondIssuedInterest == true && BondAtPar == true && SemiAnnualInterest == true &&  FrameforPanel.ExtinguishmentOfDebt == false){
            InterestRev1 = (float) (InterestRev1 *.5);
             BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl});
            BondsPayableJE.addRow(new Object[]{"Credit", "Bonds Payable", PriceOfBondfl });
            BondsPayableJE.addRow(new Object[]{"Debit", "Interest Expense", InterestRev1});
             BondsPayableJE.addRow(new Object[]{"Debit", "Cash", InterestRev1});
              BondPayableAmort.addRow(new Object[]{"Year ","-","-","-", PriceOfBondfl});
              
              
            
             
        }else if (BondIssuedInterest == true && DiscountBond == true && AnnualInterest == true &&  FrameforPanel.ExtinguishmentOfDebt == false){
            BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl});
            BondsPayableJE.addRow (new Object[] {"Debit", "Discount on Bonds Payable", ParValueBondfl - PriceOfBondfl });
            BondsPayableJE.addRow(new Object[]{"Credit", "Bonds Payable", ParValueBondfl});
            
          BondPayableAmort.addRow(new Object[]{"Year ","-","-","-", PriceOfBondfl});
              for (int i = 0; i< YearsUntilMaturityfl; i++){
           
               
             InterestRevenueTable =PriceOfBondfl* (ratePercentEffective);
               DiscountAmortized = InterestRevenueTable - InterestRev1;
               PriceOfBondfl = PriceOfBondfl + DiscountAmortized;
               
               BondPayableAmort.addRow (new Object[]{"Year",InterestRev1,InterestRevenueTable,DiscountAmortized, PriceOfBondfl});
              
        }
            
        }else if (BondIssuedInterest == true && DiscountBond == true && SemiAnnualInterest == true &&  FrameforPanel.ExtinguishmentOfDebt == false){
            InterestRev1 = (float) (InterestRev1 *.5);
            BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl});
            BondsPayableJE.addRow (new Object[] {"Debit", "Discount on Bonds Payable", ParValueBondfl - PriceOfBondfl });
            BondsPayableJE.addRow(new Object[]{"Credit", "Bonds Payable", ParValueBondfl });
            
             BondPayableAmort.addRow(new Object[]{"Year ","-","-","-", PriceOfBondfl});
              for (int i = 0; i< YearsUntilMaturityfl*2; i++){
           
               
             InterestRevenueTable =PriceOfBondfl* (ratePercentEffective/2);
               DiscountAmortized = InterestRevenueTable- InterestRev1;
               PriceOfBondfl = PriceOfBondfl + DiscountAmortized;
               
               BondPayableAmort.addRow (new Object[]{"Year",InterestRev1,InterestRevenueTable,DiscountAmortized, PriceOfBondfl});
              
        }
            
        } else if (BondIssuedInterest == true && PremiumBond == true && AnnualInterest == true &&  FrameforPanel.ExtinguishmentOfDebt == false){
            
            BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl});
            BondsPayableJE.addRow (new Object[] {"Credit", "Premium on Bonds Payable", PriceOfBondfl - ParValueBondfl});
            BondsPayableJE.addRow(new Object[]{"Credit", "BondsPayable", ParValueBondfl });
            
             BondPayableAmort.addRow(new Object[]{"Year ","-","-","-", PriceOfBondfl});
              for (int i = 0; i< YearsUntilMaturityfl; i++){
           
               
             InterestRevenueTable =PriceOfBondfl* (ratePercentEffective);
               DiscountAmortized = InterestRev1-InterestRevenueTable;
               PriceOfBondfl = PriceOfBondfl - DiscountAmortized;
               
               BondPayableAmort.addRow (new Object[]{"Year",InterestRev1,InterestRevenueTable,DiscountAmortized, PriceOfBondfl});
              
        }
        }
         else if (BondIssuedInterest == true && PremiumBond == true && SemiAnnualInterest == true &&  FrameforPanel.ExtinguishmentOfDebt == false){
            InterestRev1 = (float) (InterestRev1 *.5);
            BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl});
            BondsPayableJE.addRow (new Object[] {"Credit", "Premium on Bonds Payable", PriceOfBondfl - ParValueBondfl});
            BondsPayableJE.addRow(new Object[]{"Credit", "BondsPayable", ParValueBondfl });
            
         
             BondPayableAmort.addRow(new Object[]{"Year ","-","-","-", PriceOfBondfl});
              for (int i = 0; i< YearsUntilMaturityfl*2; i++){
           
               
             InterestRevenueTable =PriceOfBondfl* (ratePercentEffective/2);
               DiscountAmortized = InterestRev1-InterestRevenueTable;
               PriceOfBondfl = PriceOfBondfl - DiscountAmortized;
               
               BondPayableAmort.addRow (new Object[]{"Year",InterestRev1,InterestRevenueTable,DiscountAmortized, PriceOfBondfl});
              
        }
         }else if (BondIssuedInterestbetween == true && DiscountBond == true && AnnualInterest == true &&  FrameforPanel.ExtinguishmentOfDebt == false){
             Interestex =  ratePercentImplicit*(MonthBetweenInterestfl/12)*ParValueBondfl;
             BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl + Interestex});
             BondsPayableJE.addRow (new Object[] {"Debit", "Discount on Bonds Payable", ParValueBondfl - PriceOfBondfl});
            BondsPayableJE.addRow (new Object[] {"Credit", "Bonds Payable", ParValueBondfl});
            BondsPayableJE.addRow(new Object[]{"Credit", "Interest Expense", Interestex});
            
            for (int i = 0; i< YearsUntilMaturityfl; i++){
           
               
             InterestRevenueTable =PriceOfBondfl* (ratePercentEffective);
               DiscountAmortized = InterestRevenueTable- InterestRev1;
               PriceOfBondfl = PriceOfBondfl + DiscountAmortized;
               
               BondPayableAmort.addRow (new Object[]{"Year",InterestRev1,InterestRevenueTable,DiscountAmortized, PriceOfBondfl});
              
        }
             
         } else if (BondIssuedInterestbetween == true && BondAtPar == true && AnnualInterest == true){
           Interestex = (MonthBetweenInterestfl/12)*ratePercentImplicit*ParValueBondfl;
             BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl + Interestex});
            BondsPayableJE.addRow (new Object[] {"Credit", "Bonds Payable", ParValueBondfl});
            BondsPayableJE.addRow(new Object[]{"Credit", "Interest Expense", Interestex});
             
         }else if (BondIssuedInterestbetween == true && PremiumBond == true && AnnualInterest == true &&  FrameforPanel.ExtinguishmentOfDebt == false){
             Interestex = (MonthBetweenInterestfl/12)*ratePercentImplicit*ParValueBondfl;
             BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl + Interestex});
              BondsPayableJE.addRow (new Object[] {"Credit", "Premium on Bonds Payable", PriceOfBondfl - ParValueBondfl});
            BondsPayableJE.addRow (new Object[] {"Credit", "Bonds Payable", ParValueBondfl});
            BondsPayableJE.addRow(new Object[]{"Credit", "Interest Expense", Interestex});
            
            BondPayableAmort.addRow(new Object[]{"Year ","-","-","-", PriceOfBondfl});
              for (int i = 0; i< YearsUntilMaturityfl; i++){
           
               
             InterestRevenueTable =PriceOfBondfl* (ratePercentEffective);
               DiscountAmortized = InterestRev1-InterestRevenueTable;
               PriceOfBondfl = PriceOfBondfl - DiscountAmortized;
               
               BondPayableAmort.addRow (new Object[]{"Year",InterestRev1,InterestRevenueTable,DiscountAmortized, PriceOfBondfl});
              
        }
             
          }else if (BondIssuedInterestbetween == true && DiscountBond == true && SemiAnnualInterest == true &&  FrameforPanel.ExtinguishmentOfDebt == false){
             Interestex =  ratePercentImplicit*(MonthBetweenInterestfl/12)*ParValueBondfl;
             BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl + Interestex});
             BondsPayableJE.addRow (new Object[] {"Debit", "Discount on Bonds Payable", ParValueBondfl - PriceOfBondfl});
            BondsPayableJE.addRow (new Object[] {"Credit", "Bonds Payable", ParValueBondfl});
            BondsPayableJE.addRow(new Object[]{"Credit", "Interest Expense", Interestex});
             BondPayableAmort.addRow(new Object[]{"Year ","-","-","-", PriceOfBondfl});
              for (int i = 0; i< YearsUntilMaturityfl*2; i++){
           
               
             InterestRevenueTable =PriceOfBondfl* (ratePercentEffective/2);
               DiscountAmortized = InterestRevenueTable- InterestRev1;
               PriceOfBondfl = PriceOfBondfl + DiscountAmortized;
               
               BondPayableAmort.addRow (new Object[]{"Year",InterestRev1,InterestRevenueTable,DiscountAmortized, PriceOfBondfl});
              
        }
             
         } else if (BondIssuedInterestbetween == true && BondAtPar == true && SemiAnnualInterest == true &&  FrameforPanel.ExtinguishmentOfDebt == false){
           Interestex = (MonthBetweenInterestfl/12)*ratePercentImplicit*ParValueBondfl;
             BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl + Interestex});
            BondsPayableJE.addRow (new Object[] {"Credit", "Bonds Payable", ParValueBondfl});
            BondsPayableJE.addRow(new Object[]{"Credit", "Interest Expense", Interestex});
             
         }else if (BondIssuedInterestbetween == true && PremiumBond == true && SemiAnnualInterest == true &&  FrameforPanel.ExtinguishmentOfDebt == false){
             Interestex = (MonthBetweenInterestfl/12)*ratePercentImplicit*ParValueBondfl;
             BondsPayableJE.addRow(new Object[]{"Debit", "Cash", PriceOfBondfl + Interestex});
              BondsPayableJE.addRow (new Object[] {"Credit", "Premium on Bonds Payable", PriceOfBondfl - ParValueBondfl});
            BondsPayableJE.addRow (new Object[] {"Credit", "Bonds Payable", ParValueBondfl});
            BondsPayableJE.addRow(new Object[]{"Credit", "Interest Expense", Interestex});
             
              BondPayableAmort.addRow(new Object[]{"Year ","-","-","-", PriceOfBondfl});
              for (int i = 0; i< YearsUntilMaturityfl; i++){
           
               
             InterestRevenueTable =PriceOfBondfl* (ratePercentEffective);
               DiscountAmortized = InterestRev1-InterestRevenueTable;
               PriceOfBondfl = PriceOfBondfl - DiscountAmortized;
               
               BondPayableAmort.addRow (new Object[]{"Year",InterestRev1,InterestRevenueTable,DiscountAmortized, PriceOfBondfl});
              
        }
         }else if ( FrameforPanel.ExtinguishmentOfDebt == true && DiscountBond== true){
             float Unamortized = 0;
               
               
               
               BondPayableAmort.addRow(new Object[]{"Year ","-","-","-", PriceOfBondfl});
                for (int i = 0; i< YearsUntilMaturityfl; i++){
      
               
             InterestRevenueTable =PriceOfBondfl* (ratePercentEffective);
               DiscountAmortized = InterestRevenueTable - InterestRev1;
               PriceOfBondfl = PriceOfBondfl + DiscountAmortized;
               
               BondPayableAmort.addRow (new Object[]{"Year",InterestRev1,InterestRevenueTable,DiscountAmortized, PriceOfBondfl});
                FrameforPanel.DiscountUnAmortized.add(DiscountAmortized);
            
               
        }
                
               for (int i = Extinguishyearfl; i<YearsUntilMaturityfl; i++){
                   Unamortized =  FrameforPanel.DiscountUnAmortized.get(i) +  Unamortized;
                }
         
                if ((CallValuefl + Unamortized) > ParValueBondfl){
                    float loss = (CallValuefl + Unamortized) - ParValueBondfl;
               BondsPayableJE.addRow(new Object[]{"Debit", "Bonds Payable", ParValueBondfl});
               BondsPayableJE.addRow (new Object[]{"Debit", "Loss on Redemption", loss});
                BondsPayableJE.addRow(new Object[]{"Credit", "Discount on Bonds Payable",Unamortized});
               BondsPayableJE.addRow(new Object[]{"Credit", "Cash",CallValuefl});
                } else if ((CallValuefl + Unamortized) < ParValueBondfl){
                     float gain = ParValueBondfl - (CallValuefl + Unamortized);
               BondsPayableJE.addRow(new Object[]{"Debit", "Bonds Payable", ParValueBondfl});
               BondsPayableJE.addRow (new Object[]{"Credit", "Gain on Redemption", gain});
                BondsPayableJE.addRow(new Object[]{"Credit", "Discount on Bonds Payable",Unamortized});
                  BondsPayableJE.addRow(new Object[]{"Credit", "Cash",CallValuefl});
                }
                
         
        }else if ( FrameforPanel.ExtinguishmentOfDebt == true && PremiumBond== true){
             float Unamortized = 0;
               
              
               
               
            
             BondPayableAmort.addRow(new Object[]{"Year ","-","-","-", PriceOfBondfl});
              for (int i = 0; i< YearsUntilMaturityfl; i++){
           
               
             InterestRevenueTable =PriceOfBondfl* (ratePercentEffective/2);
               DiscountAmortized = InterestRev1-InterestRevenueTable;
               PriceOfBondfl = PriceOfBondfl - DiscountAmortized;
               
               BondPayableAmort.addRow (new Object[]{"Year",InterestRev1,InterestRevenueTable,DiscountAmortized, PriceOfBondfl});
                FrameforPanel.DiscountUnAmortized.add(DiscountAmortized);
        }

               for (int i = Extinguishyearfl; i<YearsUntilMaturityfl; i++){
                   Unamortized =  FrameforPanel.DiscountUnAmortized.get(i) + Unamortized;
                }
         
                if ((ParValueBondfl + Unamortized) < CallValuefl){
                    float loss = CallValuefl-(ParValueBondfl + Unamortized);
               BondsPayableJE.addRow(new Object[]{"Debit", "Bonds Payable", ParValueBondfl});
               BondsPayableJE.addRow (new Object[]{"Debit", "Loss on Redemption", loss});
                BondsPayableJE.addRow(new Object[]{"Debit", "Premium on Bonds Payable",Unamortized});
               BondsPayableJE.addRow(new Object[]{"Credit", "Cash",CallValuefl});
                } else if ((ParValueBondfl + Unamortized) > CallValuefl){
                     float gain = (ParValueBondfl + Unamortized) - CallValuefl;
               BondsPayableJE.addRow(new Object[]{"Debit", "Bonds Payable", ParValueBondfl});
                BondsPayableJE.addRow(new Object[]{"Debit", "Premium on Bonds Payable",Unamortized});
                 BondsPayableJE.addRow (new Object[]{"Credit", "Gain on Redemption", gain});
                  BondsPayableJE.addRow(new Object[]{"Credit", "Cash",CallValuefl});
                }
                
         }
               
    }
}

