package AccountingSoftware;


import AccountingSoftware.BondsPayable;
import java.awt.Container;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import javax.imageio.ImageIO;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wdelc
 */
public class FrameforPanel extends javax.swing.JFrame {
 private String value;
 public String NoteValue = "";
 public String TAccountSelection;
    private static String debit;
    private static String credit;
    private static int debitvalue;
    private static int creditvalue;
    public static int PreviousID;
    public static int IDSelect=0;
    public static int ValueOfBegInv;
   public static int clickcounter = 0;
    public static int clickcountOnInventory = 0;
    public String DepreciationDataSelected = "";
    public static String InventoryDataSelected = "";
    public static String CF = "";
  public static  boolean BPActive;
  public static boolean StDiv;
  
  public static ArrayList <Integer> ID = new ArrayList<Integer>();
   public static ArrayList<String> ItemName = new ArrayList<String>();
   public static ArrayList<String> Description = new ArrayList<String>();
   public static ArrayList<Float> Stock = new ArrayList<Float>();
  
  public static int NumberOfIDs= 0; 
   public static boolean BeginEntry = false;
    boolean ShowCashTAccount = false;
  //  private int clickcount;
  // private int clickcountgenerated;
    public String value2 = "Cash";
    private static String date;
   // private static String desc;
    String CashAmount1;
    private static float CashAmount;
    boolean Accountpayable = false;
    String TimeValueChoice;
    public static float InventoryLeft;
   
    String AnnuityChoice;
    int NumberofInvoices = 0;
    int NumberofInvoicesCredit = 0;
    int NumberofAllowancesDebit = 0;
     int NumberofAllowancesCredit = 0;
     int NumberofUncollectiblesDebit = 0;
      int NumberofUncollectiblesCredit = 0;
      int NumberofNoteReceivableDebit = 0;
      int NumberofNoteReceivableCredit = 0;
    public static  int NumberofBondPayableDebit=0;
     public static int NumberofBondPayableCredit = 0;
     public static int NumberofDepreciationDebit = 0;
     public static int NumberofDepreciationCredit = 0;
     public static int NumberofInventoryDebit = 0;
     public static int NumberofInventoryCredit = 0;
          public static int NumberofTStockDebit = 0;
     public static int NumberofTStockCredit = 0;
      
      
    boolean CashDiscountTaken;
    boolean NetMethod;
    boolean GrossMethod;
    
    public static boolean ExtinguishmentOfDebt;
   public static boolean WasoIssuance= false ;
    
   public static int Balanceinv = 0;
  public static  int AmountLifo = 0;
   public static int LeftoverInv;
    boolean Discountperiodexpire = false;
    boolean Discountperiodtaken = false;
    ArrayList<Float> InvoiceDebit = new ArrayList<Float>();
       ArrayList<Float> InvoiceCredit = new ArrayList<Float>();
      ArrayList<Float> SalesReturnsDebit = new ArrayList<Float>();
       ArrayList<Float> SalesReturnsCredit = new ArrayList<Float>();
         ArrayList<Float> UncollectiblesDebit = new ArrayList<Float>();
       ArrayList<Float> UncollectiblesCredit = new ArrayList<Float>();
       ArrayList<Float> NotesReceivableDebit = new ArrayList<Float>();
       ArrayList<Float> NotesReceivableCredit = new ArrayList<Float>();
     public static ArrayList <Float> PreviousPrice = new ArrayList<Float>();
    public static ArrayList <Float> AmountofShares = new ArrayList<Float>();
       public static ArrayList<Float> DepreciationDebit = new ArrayList<Float>();
      public static ArrayList<Float> DepreciationCredit = new ArrayList<Float>();
      public static  ArrayList<Float> BondPayableDebit = new ArrayList<Float>();
      public static ArrayList<Float> BondPayableCredit = new ArrayList<Float>();
     public static ArrayList<Float> DiscountUnAmortized = new ArrayList<Float>();
     public static ArrayList<Float> InventoryID = new ArrayList<Float>();
      public static ArrayList<Integer> InventoryDebit= new ArrayList<Integer>();
     public static ArrayList<Integer> InventoryCredit = new ArrayList<Integer>();
     
     public static ArrayList<Float> TStockDebit = new ArrayList<Float>();
       public static ArrayList<Float> TStockCredit = new ArrayList<Float>();
     public static ArrayList<Integer> FifoDataUnits = new ArrayList<Integer>();
     public static ArrayList<Integer> FifoDataPrice = new ArrayList<Integer>();
   
    String Types [] = {"Cash","Equipment","Common Stock","Inventory", "Supplies","Accounts Receivable", "Sales Revenue", "Sales Discount", "Sales Disconts Forefeited"};
    /**
     * Creates new form FrameforPanel
     */
//    InventoryIdentification Inv = new InventoryIdentification();
 //public  DefaultTableModel IDtab = (DefaultTableModel)IDTable.getModel();
  
    public FrameforPanel()  {
        initComponents();
         Debitarea.setEditable(false);
        Creditarea.setEditable(false);
        CashTAccount.setVisible(false);
         EquipmentTAccount.setVisible(false);
          CommonStockTAccount.setVisible(false);
          SuppliesTAccount.setVisible(false);
          InventoryTAccount.setVisible(false);
          AccountsReceivableTAccount.setVisible(false);
          SalesRevenueTAccount.setVisible (false);
          SalesDiscountTAccount.setVisible(false);
          SalesDiscountForfeitedTAccount.setVisible(false);
          SalesReturnsAndAllowancesTAccount.setVisible(false);
          AllowanceForSalesReturnsAndAllowancesTAccount.setVisible(false);
          AllowanceForDoubtfulAccountsTAccount.setVisible(false);
          BadDebtExpenseTAccount.setVisible(false);
          DiscountOnNotesReceivableTAccount.setVisible (false);
          InterestRevenueTAccount.setVisible (false);
          NotesReceivableTAccount.setVisible(false);
          BondsPayableTAccount.setVisible (false);
          DiscountOnBondsPayableTAccount.setVisible (false);
        PremiumOnBondsPayableTAccount.setVisible (false);
        ExtinguishPanel.setVisible(false);
        DepreciationExpenseTAccount.setVisible(false);
        AccumulatedDepreciationTAccount.setVisible(false);
        CostofGoodsSoldTAccount.setVisible(false);
        PurchasesTAccount.setVisible(false);
        AccountsPayableTAccount.setVisible(false);
        
       // landingJPanel.setVisible(true);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        landingJPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        BasicPurchasesCash = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        SaleOfARButtonMainMenu = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        WASOCalcButton = new javax.swing.JLabel();
        TreasuryStockButton = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        PensionPlanningButton = new javax.swing.JLabel();
        LeasesMenuButton = new javax.swing.JLabel();
        InvoicesPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        GenerateJEInvoices = new javax.swing.JButton();
        ResetInvoices = new javax.swing.JButton();
        SaveJEInvoices = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        InvoicesJETable = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        QuantityInvoices = new javax.swing.JTextField();
        UnitPriceInvoices = new javax.swing.JTextField();
        GrossMethodCheckBox = new javax.swing.JCheckBox();
        NetMethodCheckBox = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        CashDiscountPercent = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        DaysTillDiscount = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        NetPaymentDate = new javax.swing.JTextField();
        PaymentInDiscount = new javax.swing.JCheckBox();
        PaymentAfterDiscount = new javax.swing.JCheckBox();
        BackButtonInvoices = new javax.swing.JButton();
        TimeValueOfMoneyPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NumPeriods = new javax.swing.JTextField();
        InterestRate = new javax.swing.JTextField();
        PresentValue = new javax.swing.JTextField();
        FutureValue = new javax.swing.JTextField();
        ComputeTimeValue = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        TimeValueOption = new javax.swing.JList<>();
        TimeValueOutput = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        PMTInput = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        AnnuityOption = new javax.swing.JList<>();
        TAccountsBack = new javax.swing.JPanel();
        TAccounts = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BackButton2 = new javax.swing.JButton();
        ShowTAccount = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        TAccountOptions = new javax.swing.JList<>();
        EquipmentTAccount = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        EquipmentTAccountTable = new javax.swing.JTable();
        CashTAccount = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CashTAccountTable = new javax.swing.JTable();
        CommonStockTAccount = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CommonStockTAccountTable = new javax.swing.JTable();
        SuppliesTAccount = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        SuppliesTAccountTable = new javax.swing.JTable();
        TAccountChoice = new javax.swing.JTextField();
        InventoryTAccount = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        InventoryTAccountTable = new javax.swing.JTable();
        BalanceType = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AccountsReceivableTAccount = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        AccountsReceivableTAccountTable = new javax.swing.JTable();
        SalesRevenueTAccount = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        SalesRevenueTAccountTable = new javax.swing.JTable();
        SalesDiscountTAccount = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        SalesDiscountTAccountTable = new javax.swing.JTable();
        SalesDiscountForfeitedTAccount = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        SalesDiscountForfeitedTAccountTable = new javax.swing.JTable();
        SalesReturnsAndAllowancesTAccount = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        SalesReturnsAndAllowancesTAccountTable = new javax.swing.JTable();
        AllowanceForSalesReturnsAndAllowancesTAccount = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        AllowanceForSalesReturnsAndAllowancesTAccountTable = new javax.swing.JTable();
        AllowanceForDoubtfulAccountsTAccount = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        AllowanceForDoubtfulAccountsTAccountTable = new javax.swing.JTable();
        BadDebtExpenseTAccount = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        BadDebtExpenseTAccountTable = new javax.swing.JTable();
        NotesReceivableTAccount = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        NotesReceivableTAccountTable = new javax.swing.JTable();
        InterestRevenueTAccount = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        InterestRevenueTAccountTable = new javax.swing.JTable();
        DiscountOnNotesReceivableTAccount = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        DiscountOnNotesReceivableTAccountTable = new javax.swing.JTable();
        DiscountOnBondsPayableTAccount = new javax.swing.JPanel();
        jScrollPane29 = new javax.swing.JScrollPane();
        DiscountOnBondsPayableTAccountTable = new javax.swing.JTable();
        PremiumOnBondsPayableTAccount = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        PremiumOnBondsPayableTAccountTable = new javax.swing.JTable();
        BondsPayableTAccount = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        BondsPayableTAccountTable = new javax.swing.JTable();
        GainRedemptionTAccount = new javax.swing.JPanel();
        jScrollPane32 = new javax.swing.JScrollPane();
        GainOnRedemptionTAccountTable = new javax.swing.JTable();
        LossRedemptionTAccount = new javax.swing.JPanel();
        jScrollPane33 = new javax.swing.JScrollPane();
        LossRedemptionTAccountTable = new javax.swing.JTable();
        DepreciationExpenseTAccount = new javax.swing.JPanel();
        jScrollPane37 = new javax.swing.JScrollPane();
        DepreciationTAccountTable = new javax.swing.JTable();
        AccumulatedDepreciationTAccount = new javax.swing.JPanel();
        jScrollPane38 = new javax.swing.JScrollPane();
        AccumulatedDepreciationTAccountTable = new javax.swing.JTable();
        AccountsPayableTAccount = new javax.swing.JLayeredPane();
        jScrollPane41 = new javax.swing.JScrollPane();
        AccountsPayableTAccountTable = new javax.swing.JTable();
        CostofGoodsSoldTAccount = new javax.swing.JLayeredPane();
        jScrollPane42 = new javax.swing.JScrollPane();
        CostofGoodsSoldTAccountTable = new javax.swing.JTable();
        PurchasesTAccount = new javax.swing.JLayeredPane();
        jScrollPane43 = new javax.swing.JScrollPane();
        PurchasesTAccountTable = new javax.swing.JTable();
        TStockTAccount = new javax.swing.JLayeredPane();
        jScrollPane50 = new javax.swing.JScrollPane();
        TStockTAccountTable = new javax.swing.JTable();
        PaidinCapitalTAccount = new javax.swing.JLayeredPane();
        jScrollPane51 = new javax.swing.JScrollPane();
        PaidinCapitalTAccountTable = new javax.swing.JTable();
        LogTable = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CashTable = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        HomeJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CompanyName = new javax.swing.JTextField();
        CashSpent = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CashOptions = new javax.swing.JList<>();
        AccountPayableCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Debitarea = new javax.swing.JTextField();
        Creditarea = new javax.swing.JTextField();
        GenerateJE = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        SaveJE = new javax.swing.JButton();
        DollarDebit = new javax.swing.JTextField();
        DollarCredit = new javax.swing.JTextField();
        DescriptionBasic = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DateText = new javax.swing.JLabel();
        SalesReturnsAndAllowancesPanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        AllowanceAmountInput = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        EstimateSalesReturns = new javax.swing.JCheckBox();
        GrantedAllowanceSalesReturns = new javax.swing.JCheckBox();
        GenerateJESalesReturns = new javax.swing.JButton();
        ResetSalesReturns = new javax.swing.JButton();
        SaveJESalesReturns = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        AllowanceJETable = new javax.swing.JTable();
        BackButtonSalesReturns = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        DescriptionSalesReturns = new javax.swing.JTextField();
        WriteOffPanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        BackButtonUncollectible = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        AmountUncollected = new javax.swing.JTextField();
        jScrollPane19 = new javax.swing.JScrollPane();
        UncollectibleJETable = new javax.swing.JTable();
        GenerateJEButtonUncollectible = new javax.swing.JButton();
        ResetUncollectibleButton = new javax.swing.JButton();
        SaveJEButtonUncollectible = new javax.swing.JButton();
        DirectWriteOff = new javax.swing.JCheckBox();
        EstimatedUncollectibles = new javax.swing.JCheckBox();
        WriteOffAllowanceAccount = new javax.swing.JCheckBox();
        RecoveryOfUncollectibleAccount = new javax.swing.JCheckBox();
        NotesReceivablePanel = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        BackButtonNotesReceivable = new javax.swing.JButton();
        PresentValueOfNoteInput = new javax.swing.JTextField();
        NoteIssuedFaceValue = new javax.swing.JCheckBox();
        InterestBearingNotes = new javax.swing.JCheckBox();
        ZeroInterestBearingNotes = new javax.swing.JCheckBox();
        GenerateJENotesReceivable = new javax.swing.JButton();
        ResetButtonNotesReceivable = new javax.swing.JButton();
        SaveJENotesReceivable = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        FaceValueNoteInput = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        EffectiveInterestRateInput = new javax.swing.JTextField();
        ImplicitInterestRateInput = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        NotesReceivableJETable = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        YearsUntilMaturityInput = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        NoteDiscountAmortJETable = new javax.swing.JTable();
        NotesPayInput = new javax.swing.JComboBox<>();
        BondsPayablePanel = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        PriceOfBond = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        ParValueBond = new javax.swing.JTextField();
        BondIssuedInterestDate = new javax.swing.JCheckBox();
        BondIssuedbetweenInterestDates = new javax.swing.JCheckBox();
        BondAnnualInterest = new javax.swing.JCheckBox();
        BondSemiAnnualInterest = new javax.swing.JCheckBox();
        jScrollPane27 = new javax.swing.JScrollPane();
        BondsPayableJETable = new javax.swing.JTable();
        jScrollPane28 = new javax.swing.JScrollPane();
        BondsPayableAmortSchedule = new javax.swing.JTable();
        GenerateJEBondPayable = new javax.swing.JButton();
        ResetButtonBondsPayable = new javax.swing.JButton();
        SaveJEBondPayable = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        BondsPayableImplicit = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        EffectiveInterestRate = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        YearsUntilMaturityBondsPayable = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        MonthBetweenInterest = new javax.swing.JTextField();
        BackButtonBondsPayable = new javax.swing.JButton();
        ExtinguishCheck = new javax.swing.JCheckBox();
        ExtinguishPanel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        ExtinguishYears = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        CallValueInput = new javax.swing.JTextField();
        DepreciationPanel = new javax.swing.JPanel();
        BackButtonDepreciation = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        OrigCost = new javax.swing.JTextField();
        SalvValue = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        EstUsefulLife = new javax.swing.JTextField();
        DepreciationType = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        GenerateJEDepreciation = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        SaveJEDepreciation = new javax.swing.JButton();
        jScrollPane34 = new javax.swing.JScrollPane();
        DepreciationJETable = new javax.swing.JTable();
        SumOfYearPanel = new javax.swing.JPanel();
        jScrollPane35 = new javax.swing.JScrollPane();
        SumOfYearTable = new javax.swing.JTable();
        DecliningBalancePanel = new javax.swing.JLayeredPane();
        jScrollPane36 = new javax.swing.JScrollPane();
        DecliningBalanceTable = new javax.swing.JTable();
        InventoryManagementPanel = new javax.swing.JPanel();
        BackButtonInventoryManagement = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Units = new javax.swing.JFormattedTextField();
        SalesPrice = new javax.swing.JFormattedTextField();
        jScrollPane39 = new javax.swing.JScrollPane();
        InventoryManagementJETable = new javax.swing.JTable();
        InventoryData = new javax.swing.JComboBox<>();
        GenerateJEInventory = new javax.swing.JButton();
        ResetButtonInventory = new javax.swing.JButton();
        SaveJEInventory = new javax.swing.JButton();
        PerpetualCheck = new javax.swing.JCheckBox();
        PeriodicCheck = new javax.swing.JCheckBox();
        CFAssumption = new javax.swing.JComboBox<>();
        jScrollPane40 = new javax.swing.JScrollPane();
        FIFOPerpTable = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        BeginningInvID = new javax.swing.JLabel();
        ProductIDInput = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        ItemNameOutput = new javax.swing.JLabel();
        ItemCategoryOutput = new javax.swing.JLabel();
        EndingInvOutput = new javax.swing.JLabel();
        InventoryValuationPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        BeginInvInput = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        PurchasesAmountInv = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        SalesInputInv = new javax.swing.JTextField();
        GenerateJEInvValuation = new javax.swing.JButton();
        ResetButtonInvValuation = new javax.swing.JButton();
        SaveJEInvValuation = new javax.swing.JButton();
        PullDataJE = new javax.swing.JButton();
        BackButtonInvValuation = new javax.swing.JButton();
        jScrollPane44 = new javax.swing.JScrollPane();
        InvValuationTable = new javax.swing.JTable();
        InventoryMainMen = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        EducationalInventoryButton = new javax.swing.JToggleButton();
        InventoryIdentification = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        ItemNameInput = new javax.swing.JTextField();
        ItemDescInput = new javax.swing.JTextField();
        AddIDButton = new javax.swing.JButton();
        DeleteIDButton = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane45 = new javax.swing.JScrollPane();
        IDTable = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        DilutedEPSPanel = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        GenerateEPS = new javax.swing.JButton();
        ResetButtonEPS = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        SecurityChoice = new javax.swing.JComboBox<>();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        NetIncomeInputDilutedEPS = new javax.swing.JTextField();
        WASOInput = new javax.swing.JTextField();
        NumOptionsInput = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        ExercisePriceEPSInput = new javax.swing.JTextField();
        AverageStockPriceInput = new javax.swing.JTextField();
        TaxRateInput = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        ParValueInputEPS = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        ConvertibleEPSInput = new javax.swing.JTextField();
        AddSecurityEPS = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        AmountSecuritiesInput = new javax.swing.JTextField();
        SecuritiesEPSInput = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel157 = new javax.swing.JLabel();
        NumSecuritiesConvertibleDilutive = new javax.swing.JTextField();
        jScrollPane46 = new javax.swing.JScrollPane();
        SecuritiesTable = new javax.swing.JTable();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jScrollPane47 = new javax.swing.JScrollPane();
        OptionsEPSTable = new javax.swing.JTable();
        BasicEPSOutput = new javax.swing.JLabel();
        DilutedEPSOutput = new javax.swing.JLabel();
        HomeButtonEPSCalc = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        WASOPanel = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        MonthSelected = new javax.swing.JComboBox<>();
        jLabel101 = new javax.swing.JLabel();
        BeginSharesInput = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        ResetButtonWaso = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        SharesIssuedInput = new javax.swing.JTextField();
        StockSplitFrame = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        StockSplitInput = new javax.swing.JTextField();
        StockDividendPanel = new javax.swing.JPanel();
        StockDividendInput = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        AddStockSplit = new javax.swing.JButton();
        AddStockDividend = new javax.swing.JButton();
        jScrollPane48 = new javax.swing.JScrollPane();
        WASOTable = new javax.swing.JTable();
        jLabel107 = new javax.swing.JLabel();
        CalculatedWASO = new javax.swing.JLabel();
        HomeButtonWaso = new javax.swing.JButton();
        EducationalProblemsWASOButton = new javax.swing.JButton();
        TStockPane = new javax.swing.JPanel();
        jScrollPane49 = new javax.swing.JScrollPane();
        JETableTStocks = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        SharesReaquiredInput = new javax.swing.JTextField();
        ReacquisitionPriceInput = new javax.swing.JTextField();
        GenerateJEButtonTStock = new javax.swing.JButton();
        ResetButtonTStock = new javax.swing.JButton();
        SaveJETStock = new javax.swing.JButton();
        AQCheck = new javax.swing.JCheckBox();
        IssueCheck = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        TreasuryStockPracticeProblemsButton = new javax.swing.JButton();
        NonMonetaryExchangePanel = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        FairValueInput = new javax.swing.JTextField();
        ADInput = new javax.swing.JTextField();
        CashInput = new javax.swing.JTextField();
        AssetCostInput = new javax.swing.JTextField();
        CommercialSubstanceCheck = new javax.swing.JCheckBox();
        jLabel115 = new javax.swing.JLabel();
        ListPriceInput = new javax.swing.JTextField();
        GenerateJENonMonetaryExchanges = new javax.swing.JButton();
        ResetButtonNonMonExchanges = new javax.swing.JButton();
        SaveJENonMonExchange = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jScrollPane52 = new javax.swing.JScrollPane();
        ExchangesJETable = new javax.swing.JTable();
        PensionPlanningPanel = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        ServiceCostInput = new javax.swing.JTextField();
        SettlementRateInput = new javax.swing.JTextField();
        ActualReturnPlanAssetsInput = new javax.swing.JTextField();
        PSCAmortInput = new javax.swing.JTextField();
        FundingContributionsInput = new javax.swing.JTextField();
        BenefitsInput = new javax.swing.JTextField();
        ActuaryInput = new javax.swing.JTextField();
        BeginPBOInput = new javax.swing.JTextField();
        BeginPlanAssets = new javax.swing.JTextField();
        ExpectReturnInput = new javax.swing.JTextField();
        GenerateJEPensions = new javax.swing.JButton();
        ResetPensions = new javax.swing.JButton();
        SavePensions = new javax.swing.JButton();
        jLabel129 = new javax.swing.JLabel();
        PriorServiceBenefitsInput = new javax.swing.JTextField();
        EducationalPensionButton = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane53 = new javax.swing.JScrollPane();
        PensionPlanningTable = new javax.swing.JTable();
        jScrollPane54 = new javax.swing.JScrollPane();
        PensionJETable = new javax.swing.JTable();
        LeasesPanel = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        FinanceLeaseCheck = new javax.swing.JCheckBox();
        OperatingLeaseCheck = new javax.swing.JCheckBox();
        jLabel131 = new javax.swing.JLabel();
        AnnualPaymentsInput = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        YearsLeaseInput = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        ResidualValueInput = new javax.swing.JTextField();
        ImplicitRateInput = new javax.swing.JTextField();
        GenerateTablesLeases = new javax.swing.JButton();
        ResetButtonLeases = new javax.swing.JButton();
        PresentValueInput = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        SalesTypeLeaseCheck = new javax.swing.JCheckBox();
        jLabel137 = new javax.swing.JLabel();
        CostToDealerInput = new javax.swing.JTextField();
        HomeButtonLeases = new javax.swing.JButton();
        jScrollPane55 = new javax.swing.JScrollPane();
        AmortTableLeases = new javax.swing.JTable();
        jScrollPane56 = new javax.swing.JScrollPane();
        LeasesJETable = new javax.swing.JTable();
        EducationalInventory = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        GenerateProblemInventory = new javax.swing.JButton();
        jScrollPane57 = new javax.swing.JScrollPane();
        AnswerTableInventory = new javax.swing.JTable();
        jScrollPane58 = new javax.swing.JScrollPane();
        ProblemArea = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel140 = new javax.swing.JLabel();
        jScrollPane59 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel141 = new javax.swing.JLabel();
        COGSInput = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        SalesRevenueInput = new javax.swing.JTextField();
        AccountsPayableInput = new javax.swing.JTextField();
        AccountsReceivableInput = new javax.swing.JTextField();
        InventoryInput = new javax.swing.JTextField();
        jScrollPane60 = new javax.swing.JScrollPane();
        OutputAnswer = new javax.swing.JTextArea();
        jLabel146 = new javax.swing.JLabel();
        EducationalWASO = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        GenerateProblemWASO = new javax.swing.JButton();
        jLabel148 = new javax.swing.JLabel();
        jScrollPane61 = new javax.swing.JScrollPane();
        WASOProblemField = new javax.swing.JTextArea();
        WASOAnswerInput = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        jScrollPane62 = new javax.swing.JScrollPane();
        WASOProblemOutput = new javax.swing.JTextArea();
        jButton14 = new javax.swing.JButton();
        EducationalPensionPanel = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        jScrollPane63 = new javax.swing.JScrollPane();
        QuestionAreaPensions = new javax.swing.JTextArea();
        GenerateQuestionPension = new javax.swing.JButton();
        jScrollPane64 = new javax.swing.JScrollPane();
        PensionAnswerTableEdu = new javax.swing.JTable();
        CheckAnswersPension = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        AccumulatedOCICheckAnswerInput = new javax.swing.JFormattedTextField();
        PensionAssetCheckAnswerInput = new javax.swing.JFormattedTextField();
        PensionLiabilityCheckAnswerInput = new javax.swing.JFormattedTextField();
        CashAnswerCheckInput = new javax.swing.JFormattedTextField();
        PensionExpenseCheckAnswerInput = new javax.swing.JFormattedTextField();
        jScrollPane65 = new javax.swing.JScrollPane();
        OutputAreaPension = new javax.swing.JTextArea();
        jLabel156 = new javax.swing.JLabel();
        EducationalDilutedEPSPanel = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        GenerateEPSProblemButton = new javax.swing.JButton();
        jScrollPane66 = new javax.swing.JScrollPane();
        EPSProblemField = new javax.swing.JTextArea();
        CheckAnswerButtonDilutedEPS = new javax.swing.JButton();
        jLabel159 = new javax.swing.JLabel();
        BasicEPSCheckerInput = new javax.swing.JTextField();
        jLabel160 = new javax.swing.JLabel();
        DilutedEPSCheckerInput = new javax.swing.JTextField();
        jScrollPane67 = new javax.swing.JScrollPane();
        OutputDilutedEPSCheckAnswer = new javax.swing.JTextArea();
        EducationalTStockPracticeProblems = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        GenerateEducationalTStockProblem = new javax.swing.JButton();
        jScrollPane68 = new javax.swing.JScrollPane();
        ProblemFieldTStocks = new javax.swing.JTextArea();
        jScrollPane69 = new javax.swing.JScrollPane();
        TStockEducationalTable = new javax.swing.JTable();
        CheckAnswerTStockProblems = new javax.swing.JButton();
        jScrollPane70 = new javax.swing.JScrollPane();
        OutputTextAreaTStocks = new javax.swing.JTextArea();
        jLabel162 = new javax.swing.JLabel();
        EducationalInvoicePractice = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jScrollPane71 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane72 = new javax.swing.JScrollPane();
        InvoicesInputCheckTable = new javax.swing.JTable();
        SalesRecoursePanel = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel163 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        FactoringAmountInput = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        FinanceChargeInput = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        RetainedReservesInput = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        ResetButtonSalesRecourses = new javax.swing.JButton();
        RecourseCheckMark = new javax.swing.JCheckBox();
        WithoutRecourseCheckMark = new javax.swing.JCheckBox();
        jLabel168 = new javax.swing.JLabel();
        RecourseLiabilityInput = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jScrollPane73 = new javax.swing.JScrollPane();
        RecourseJETable = new javax.swing.JTable();
        RecourseEDU = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel169 = new javax.swing.JLabel();
        HomeButtonRecourseEDU = new javax.swing.JButton();
        GenerateProblemRecourseEDU = new javax.swing.JButton();
        CheckAnswerRecourseEDU = new javax.swing.JButton();
        jScrollPane74 = new javax.swing.JScrollPane();
        RecoursesQuestionArea = new javax.swing.JTextArea();
        jScrollPane75 = new javax.swing.JScrollPane();
        AnswerInputTableRecourses = new javax.swing.JTable();
        jScrollPane76 = new javax.swing.JScrollPane();
        OutputReceivableExchange = new javax.swing.JTextArea();
        jLabel170 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 255)));
        Panel.setForeground(new java.awt.Color(51, 51, 255));
        Panel.setLayout(new java.awt.CardLayout());

        landingJPanel.setBackground(new java.awt.Color(255, 255, 255));
        landingJPanel.setMaximumSize(new java.awt.Dimension(1200, 600));
        landingJPanel.setMinimumSize(new java.awt.Dimension(1200, 600));
        landingJPanel.setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel3.setBackground(new java.awt.Color(3, 120, 178));

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Accounting Management & Information Systems ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(864, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(101, 196, 255));

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setIcon(new javax.swing.ImageIcon("C:\\Users\\wdelc\\OneDrive\\Pictures\\FLAT\\business\\png\\32\\shopping_basket.png")); // NOI18N
        jLabel61.setText("Inventory Management");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Asset Management");

        BasicPurchasesCash.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BasicPurchasesCash.setForeground(new java.awt.Color(255, 255, 255));
        BasicPurchasesCash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BasicPurchasesCash.setText("Purchases ");
        BasicPurchasesCash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BasicPurchasesCash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BasicPurchasesCashMouseClicked(evt);
            }
        });

        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Invoices ");
        jLabel64.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Sales Returns & Allowances");
        jLabel65.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });

        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Uncollectible Accounts");
        jLabel67.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });

        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Depreciation");
        jLabel68.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });

        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("Exchange of Nonmonetary Assets");
        jLabel106.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        jLabel106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel106MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addComponent(BasicPurchasesCash, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BasicPurchasesCash, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Long Term ");

        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Bonds Payable");
        jLabel66.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });

        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Notes Receivable");
        jLabel69.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });

        SaleOfARButtonMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        SaleOfARButtonMainMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaleOfARButtonMainMenu.setText("Sale of Accounts Receivable");
        SaleOfARButtonMainMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        SaleOfARButtonMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaleOfARButtonMainMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SaleOfARButtonMainMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SaleOfARButtonMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 153, 0));

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Management & Reports");

        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("T-Accounts");
        jLabel71.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });

        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("JE Log");
        jLabel72.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 153, 102));

        jLabel83.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Equity");

        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Diluted EPS Calculator");
        jLabel84.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel84MouseClicked(evt);
            }
        });

        WASOCalcButton.setForeground(new java.awt.Color(255, 255, 255));
        WASOCalcButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WASOCalcButton.setText("WASO Calculator");
        WASOCalcButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        WASOCalcButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WASOCalcButtonMouseClicked(evt);
            }
        });

        TreasuryStockButton.setForeground(new java.awt.Color(255, 255, 255));
        TreasuryStockButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TreasuryStockButton.setText("Treasury Stock");
        TreasuryStockButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        TreasuryStockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreasuryStockButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WASOCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TreasuryStockButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WASOCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TreasuryStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 51));

        jLabel117.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("Other");

        PensionPlanningButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PensionPlanningButton.setText("Pension Planning");
        PensionPlanningButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        PensionPlanningButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PensionPlanningButtonMouseClicked(evt);
            }
        });

        LeasesMenuButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LeasesMenuButton.setText("Leases");
        LeasesMenuButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 204)));
        LeasesMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeasesMenuButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addComponent(PensionPlanningButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LeasesMenuButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PensionPlanningButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeasesMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout landingJPanelLayout = new javax.swing.GroupLayout(landingJPanel);
        landingJPanel.setLayout(landingJPanelLayout);
        landingJPanelLayout.setHorizontalGroup(
            landingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(landingJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        landingJPanelLayout.setVerticalGroup(
            landingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landingJPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(landingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Panel.add(landingJPanel, "card2");

        InvoicesPanel.setMaximumSize(new java.awt.Dimension(825, 461));
        InvoicesPanel.setMinimumSize(new java.awt.Dimension(825, 461));
        InvoicesPanel.setPreferredSize(new java.awt.Dimension(825, 461));

        jLabel17.setText("Invoices Menu");

        GenerateJEInvoices.setText("Generate JE");
        GenerateJEInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJEInvoicesActionPerformed(evt);
            }
        });

        ResetInvoices.setText("Reset");
        ResetInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetInvoicesActionPerformed(evt);
            }
        });

        SaveJEInvoices.setText("Save JE");
        SaveJEInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJEInvoicesActionPerformed(evt);
            }
        });

        InvoicesJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Value"
            }
        ));
        jScrollPane11.setViewportView(InvoicesJETable);

        jLabel18.setText("Quantity Sold");

        jLabel19.setText("Unit Price");

        GrossMethodCheckBox.setText("Gross Method");
        GrossMethodCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrossMethodCheckBoxActionPerformed(evt);
            }
        });

        NetMethodCheckBox.setText("Net Method");
        NetMethodCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetMethodCheckBoxActionPerformed(evt);
            }
        });

        jLabel20.setText("Add a Cash Discount");

        jLabel21.setText("%/");

        jLabel22.setText("Net");

        PaymentInDiscount.setText("Payment within discount period");

        PaymentAfterDiscount.setText("Payment after discount period");
        PaymentAfterDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentAfterDiscountActionPerformed(evt);
            }
        });

        BackButtonInvoices.setText("Back");
        BackButtonInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonInvoicesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InvoicesPanelLayout = new javax.swing.GroupLayout(InvoicesPanel);
        InvoicesPanel.setLayout(InvoicesPanelLayout);
        InvoicesPanelLayout.setHorizontalGroup(
            InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvoicesPanelLayout.createSequentialGroup()
                .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InvoicesPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(UnitPriceInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(QuantityInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PaymentInDiscount)
                        .addGap(18, 18, 18)
                        .addComponent(PaymentAfterDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)))
                .addGap(412, 412, 412))
            .addGroup(InvoicesPanelLayout.createSequentialGroup()
                .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InvoicesPanelLayout.createSequentialGroup()
                                .addComponent(GenerateJEInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(ResetInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InvoicesPanelLayout.createSequentialGroup()
                                .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CashDiscountPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DaysTillDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NetPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                                        .addComponent(GrossMethodCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NetMethodCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(97, 97, 97)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(BackButtonInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(SaveJEInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InvoicesPanelLayout.setVerticalGroup(
            InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvoicesPanelLayout.createSequentialGroup()
                .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButtonInvoices)))
                .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QuantityInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(8, 8, 8)
                        .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UnitPriceInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(CashDiscountPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DaysTillDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(NetPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GrossMethodCheckBox)
                            .addComponent(NetMethodCheckBox))
                        .addGap(18, 18, 18)
                        .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaymentInDiscount)
                            .addComponent(PaymentAfterDiscount)))
                    .addGroup(InvoicesPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(142, 142, 142)
                .addGroup(InvoicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateJEInvoices)
                    .addComponent(ResetInvoices))
                .addGap(28, 28, 28)
                .addComponent(SaveJEInvoices)
                .addGap(106, 106, 106))
        );

        Panel.add(InvoicesPanel, "card7");

        jLabel11.setText("Time Value of Money");

        jLabel12.setText("Number of Periods");

        jLabel13.setText("Interest Rate");

        jLabel14.setText("Present Value");

        jLabel15.setText("Future Value ");

        ComputeTimeValue.setText("Compute");
        ComputeTimeValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeTimeValueActionPerformed(evt);
            }
        });

        TimeValueOption.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Future Value", "Present Value", "InterestRate", "Number of Periods", "PMT" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        TimeValueOption.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                TimeValueOptionValueChanged(evt);
            }
        });
        jScrollPane9.setViewportView(TimeValueOption);

        jLabel16.setText("PMT");

        AnnuityOption.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AnnuityOptionValueChanged(evt);
            }
        });
        jScrollPane10.setViewportView(AnnuityOption);

        javax.swing.GroupLayout TimeValueOfMoneyPanelLayout = new javax.swing.GroupLayout(TimeValueOfMoneyPanel);
        TimeValueOfMoneyPanel.setLayout(TimeValueOfMoneyPanelLayout);
        TimeValueOfMoneyPanelLayout.setHorizontalGroup(
            TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeValueOfMoneyPanelLayout.createSequentialGroup()
                .addContainerGap(582, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(TimeValueOfMoneyPanelLayout.createSequentialGroup()
                .addGroup(TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TimeValueOfMoneyPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NumPeriods)
                            .addComponent(InterestRate)
                            .addComponent(PresentValue)
                            .addComponent(FutureValue)
                            .addComponent(PMTInput, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addComponent(TimeValueOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TimeValueOfMoneyPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ComputeTimeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TimeValueOfMoneyPanelLayout.setVerticalGroup(
            TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeValueOfMoneyPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addGap(38, 38, 38)
                .addGroup(TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(NumPeriods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(InterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(PresentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeValueOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(FutureValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(PMTInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(TimeValueOfMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComputeTimeValue)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        Panel.add(TimeValueOfMoneyPanel, "card6");

        TAccountsBack.setLayout(new java.awt.CardLayout());

        jLabel8.setText("TAccounts");

        BackButton2.setText("Back");
        BackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton2ActionPerformed(evt);
            }
        });

        ShowTAccount.setText("Show T Account");
        ShowTAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTAccountActionPerformed(evt);
            }
        });

        TAccountOptions.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cash", "Equipment", "Supplies", "Inventory", "Common Stock", "Accounts Receivable", "Sales Revenue", "Sales Discount", "Sales Discount Forfeited", "Sales Returns and Allowances", "Allowance for Sales Returns and Allowances", "Bad Debt Expense", "Allowance for Doubtful Accounts", "Notes Receivable", "Interest Revenue", "Discount on Notes Receivable", "Bonds Payable", "Discount on Bonds Payable", "Premium on Bonds Payable", "Loss On Redemption", "Gain On Redemption", "Depreciation Expense", "Accumulated Depreciation", "Purchases", "Cost of Goods Sold", "Accounts Payable", "Treasury Stock", "Paid in Capital" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        TAccountOptions.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                TAccountOptionsValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(TAccountOptions);

        EquipmentTAccount.setMaximumSize(new java.awt.Dimension(551, 247));
        EquipmentTAccount.setMinimumSize(new java.awt.Dimension(551, 247));

        EquipmentTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        EquipmentTAccountTable.setAlignmentX(0.0F);
        EquipmentTAccountTable.setAlignmentY(0.0F);
        jScrollPane4.setViewportView(EquipmentTAccountTable);

        javax.swing.GroupLayout EquipmentTAccountLayout = new javax.swing.GroupLayout(EquipmentTAccount);
        EquipmentTAccount.setLayout(EquipmentTAccountLayout);
        EquipmentTAccountLayout.setHorizontalGroup(
            EquipmentTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
            .addGroup(EquipmentTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
        );
        EquipmentTAccountLayout.setVerticalGroup(
            EquipmentTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
            .addGroup(EquipmentTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );

        CashTAccount.setAlignmentX(0.0F);
        CashTAccount.setAlignmentY(0.0F);
        CashTAccount.setMaximumSize(new java.awt.Dimension(551, 247));
        CashTAccount.setMinimumSize(new java.awt.Dimension(551, 247));
        CashTAccount.setPreferredSize(new java.awt.Dimension(551, 247));

        CashTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CashTAccountTable.setAlignmentX(0.0F);
        CashTAccountTable.setAlignmentY(0.0F);
        jScrollPane3.setViewportView(CashTAccountTable);

        javax.swing.GroupLayout CashTAccountLayout = new javax.swing.GroupLayout(CashTAccount);
        CashTAccount.setLayout(CashTAccountLayout);
        CashTAccountLayout.setHorizontalGroup(
            CashTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CashTAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        CashTAccountLayout.setVerticalGroup(
            CashTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        CommonStockTAccount.setMaximumSize(new java.awt.Dimension(551, 247));
        CommonStockTAccount.setMinimumSize(new java.awt.Dimension(551, 247));
        CommonStockTAccount.setPreferredSize(new java.awt.Dimension(551, 247));

        CommonStockTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane5.setViewportView(CommonStockTAccountTable);

        javax.swing.GroupLayout CommonStockTAccountLayout = new javax.swing.GroupLayout(CommonStockTAccount);
        CommonStockTAccount.setLayout(CommonStockTAccountLayout);
        CommonStockTAccountLayout.setHorizontalGroup(
            CommonStockTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        CommonStockTAccountLayout.setVerticalGroup(
            CommonStockTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        SuppliesTAccount.setMaximumSize(new java.awt.Dimension(551, 247));
        SuppliesTAccount.setMinimumSize(new java.awt.Dimension(551, 247));
        SuppliesTAccount.setPreferredSize(new java.awt.Dimension(551, 247));

        SuppliesTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane7.setViewportView(SuppliesTAccountTable);

        javax.swing.GroupLayout SuppliesTAccountLayout = new javax.swing.GroupLayout(SuppliesTAccount);
        SuppliesTAccount.setLayout(SuppliesTAccountLayout);
        SuppliesTAccountLayout.setHorizontalGroup(
            SuppliesTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        SuppliesTAccountLayout.setVerticalGroup(
            SuppliesTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        InventoryTAccount.setAlignmentX(0.0F);
        InventoryTAccount.setAlignmentY(0.0F);
        InventoryTAccount.setMaximumSize(new java.awt.Dimension(551, 247));
        InventoryTAccount.setMinimumSize(new java.awt.Dimension(551, 247));
        InventoryTAccount.setPreferredSize(new java.awt.Dimension(551, 247));

        InventoryTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane8.setViewportView(InventoryTAccountTable);

        javax.swing.GroupLayout InventoryTAccountLayout = new javax.swing.GroupLayout(InventoryTAccount);
        InventoryTAccount.setLayout(InventoryTAccountLayout);
        InventoryTAccountLayout.setHorizontalGroup(
            InventoryTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        InventoryTAccountLayout.setVerticalGroup(
            InventoryTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        Balance.setText("jLabel7");

        jLabel7.setText("Balance:");

        AccountsReceivableTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit ", "Credit"
            }
        ));
        jScrollPane12.setViewportView(AccountsReceivableTAccountTable);

        javax.swing.GroupLayout AccountsReceivableTAccountLayout = new javax.swing.GroupLayout(AccountsReceivableTAccount);
        AccountsReceivableTAccount.setLayout(AccountsReceivableTAccountLayout);
        AccountsReceivableTAccountLayout.setHorizontalGroup(
            AccountsReceivableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );
        AccountsReceivableTAccountLayout.setVerticalGroup(
            AccountsReceivableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );

        SalesRevenueTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane13.setViewportView(SalesRevenueTAccountTable);

        javax.swing.GroupLayout SalesRevenueTAccountLayout = new javax.swing.GroupLayout(SalesRevenueTAccount);
        SalesRevenueTAccount.setLayout(SalesRevenueTAccountLayout);
        SalesRevenueTAccountLayout.setHorizontalGroup(
            SalesRevenueTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        SalesRevenueTAccountLayout.setVerticalGroup(
            SalesRevenueTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        SalesDiscountTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane14.setViewportView(SalesDiscountTAccountTable);

        javax.swing.GroupLayout SalesDiscountTAccountLayout = new javax.swing.GroupLayout(SalesDiscountTAccount);
        SalesDiscountTAccount.setLayout(SalesDiscountTAccountLayout);
        SalesDiscountTAccountLayout.setHorizontalGroup(
            SalesDiscountTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        SalesDiscountTAccountLayout.setVerticalGroup(
            SalesDiscountTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );

        SalesDiscountForfeitedTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane15.setViewportView(SalesDiscountForfeitedTAccountTable);

        javax.swing.GroupLayout SalesDiscountForfeitedTAccountLayout = new javax.swing.GroupLayout(SalesDiscountForfeitedTAccount);
        SalesDiscountForfeitedTAccount.setLayout(SalesDiscountForfeitedTAccountLayout);
        SalesDiscountForfeitedTAccountLayout.setHorizontalGroup(
            SalesDiscountForfeitedTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        SalesDiscountForfeitedTAccountLayout.setVerticalGroup(
            SalesDiscountForfeitedTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );

        SalesReturnsAndAllowancesTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane17.setViewportView(SalesReturnsAndAllowancesTAccountTable);

        javax.swing.GroupLayout SalesReturnsAndAllowancesTAccountLayout = new javax.swing.GroupLayout(SalesReturnsAndAllowancesTAccount);
        SalesReturnsAndAllowancesTAccount.setLayout(SalesReturnsAndAllowancesTAccountLayout);
        SalesReturnsAndAllowancesTAccountLayout.setHorizontalGroup(
            SalesReturnsAndAllowancesTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        SalesReturnsAndAllowancesTAccountLayout.setVerticalGroup(
            SalesReturnsAndAllowancesTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        AllowanceForSalesReturnsAndAllowancesTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane18.setViewportView(AllowanceForSalesReturnsAndAllowancesTAccountTable);

        javax.swing.GroupLayout AllowanceForSalesReturnsAndAllowancesTAccountLayout = new javax.swing.GroupLayout(AllowanceForSalesReturnsAndAllowancesTAccount);
        AllowanceForSalesReturnsAndAllowancesTAccount.setLayout(AllowanceForSalesReturnsAndAllowancesTAccountLayout);
        AllowanceForSalesReturnsAndAllowancesTAccountLayout.setHorizontalGroup(
            AllowanceForSalesReturnsAndAllowancesTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        AllowanceForSalesReturnsAndAllowancesTAccountLayout.setVerticalGroup(
            AllowanceForSalesReturnsAndAllowancesTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );

        AllowanceForDoubtfulAccountsTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane20.setViewportView(AllowanceForDoubtfulAccountsTAccountTable);

        javax.swing.GroupLayout AllowanceForDoubtfulAccountsTAccountLayout = new javax.swing.GroupLayout(AllowanceForDoubtfulAccountsTAccount);
        AllowanceForDoubtfulAccountsTAccount.setLayout(AllowanceForDoubtfulAccountsTAccountLayout);
        AllowanceForDoubtfulAccountsTAccountLayout.setHorizontalGroup(
            AllowanceForDoubtfulAccountsTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        AllowanceForDoubtfulAccountsTAccountLayout.setVerticalGroup(
            AllowanceForDoubtfulAccountsTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );

        BadDebtExpenseTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane21.setViewportView(BadDebtExpenseTAccountTable);

        javax.swing.GroupLayout BadDebtExpenseTAccountLayout = new javax.swing.GroupLayout(BadDebtExpenseTAccount);
        BadDebtExpenseTAccount.setLayout(BadDebtExpenseTAccountLayout);
        BadDebtExpenseTAccountLayout.setHorizontalGroup(
            BadDebtExpenseTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        BadDebtExpenseTAccountLayout.setVerticalGroup(
            BadDebtExpenseTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        NotesReceivableTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane24.setViewportView(NotesReceivableTAccountTable);

        javax.swing.GroupLayout NotesReceivableTAccountLayout = new javax.swing.GroupLayout(NotesReceivableTAccount);
        NotesReceivableTAccount.setLayout(NotesReceivableTAccountLayout);
        NotesReceivableTAccountLayout.setHorizontalGroup(
            NotesReceivableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        NotesReceivableTAccountLayout.setVerticalGroup(
            NotesReceivableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );

        InterestRevenueTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane25.setViewportView(InterestRevenueTAccountTable);

        javax.swing.GroupLayout InterestRevenueTAccountLayout = new javax.swing.GroupLayout(InterestRevenueTAccount);
        InterestRevenueTAccount.setLayout(InterestRevenueTAccountLayout);
        InterestRevenueTAccountLayout.setHorizontalGroup(
            InterestRevenueTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        InterestRevenueTAccountLayout.setVerticalGroup(
            InterestRevenueTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );

        DiscountOnNotesReceivableTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane26.setViewportView(DiscountOnNotesReceivableTAccountTable);

        javax.swing.GroupLayout DiscountOnNotesReceivableTAccountLayout = new javax.swing.GroupLayout(DiscountOnNotesReceivableTAccount);
        DiscountOnNotesReceivableTAccount.setLayout(DiscountOnNotesReceivableTAccountLayout);
        DiscountOnNotesReceivableTAccountLayout.setHorizontalGroup(
            DiscountOnNotesReceivableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );
        DiscountOnNotesReceivableTAccountLayout.setVerticalGroup(
            DiscountOnNotesReceivableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );

        DiscountOnBondsPayableTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane29.setViewportView(DiscountOnBondsPayableTAccountTable);

        javax.swing.GroupLayout DiscountOnBondsPayableTAccountLayout = new javax.swing.GroupLayout(DiscountOnBondsPayableTAccount);
        DiscountOnBondsPayableTAccount.setLayout(DiscountOnBondsPayableTAccountLayout);
        DiscountOnBondsPayableTAccountLayout.setHorizontalGroup(
            DiscountOnBondsPayableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        DiscountOnBondsPayableTAccountLayout.setVerticalGroup(
            DiscountOnBondsPayableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        );

        PremiumOnBondsPayableTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane30.setViewportView(PremiumOnBondsPayableTAccountTable);

        javax.swing.GroupLayout PremiumOnBondsPayableTAccountLayout = new javax.swing.GroupLayout(PremiumOnBondsPayableTAccount);
        PremiumOnBondsPayableTAccount.setLayout(PremiumOnBondsPayableTAccountLayout);
        PremiumOnBondsPayableTAccountLayout.setHorizontalGroup(
            PremiumOnBondsPayableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );
        PremiumOnBondsPayableTAccountLayout.setVerticalGroup(
            PremiumOnBondsPayableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );

        BondsPayableTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane31.setViewportView(BondsPayableTAccountTable);

        javax.swing.GroupLayout BondsPayableTAccountLayout = new javax.swing.GroupLayout(BondsPayableTAccount);
        BondsPayableTAccount.setLayout(BondsPayableTAccountLayout);
        BondsPayableTAccountLayout.setHorizontalGroup(
            BondsPayableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        BondsPayableTAccountLayout.setVerticalGroup(
            BondsPayableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        );

        GainOnRedemptionTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane32.setViewportView(GainOnRedemptionTAccountTable);

        javax.swing.GroupLayout GainRedemptionTAccountLayout = new javax.swing.GroupLayout(GainRedemptionTAccount);
        GainRedemptionTAccount.setLayout(GainRedemptionTAccountLayout);
        GainRedemptionTAccountLayout.setHorizontalGroup(
            GainRedemptionTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        GainRedemptionTAccountLayout.setVerticalGroup(
            GainRedemptionTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        LossRedemptionTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane33.setViewportView(LossRedemptionTAccountTable);

        javax.swing.GroupLayout LossRedemptionTAccountLayout = new javax.swing.GroupLayout(LossRedemptionTAccount);
        LossRedemptionTAccount.setLayout(LossRedemptionTAccountLayout);
        LossRedemptionTAccountLayout.setHorizontalGroup(
            LossRedemptionTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        LossRedemptionTAccountLayout.setVerticalGroup(
            LossRedemptionTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );

        DepreciationTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane37.setViewportView(DepreciationTAccountTable);

        javax.swing.GroupLayout DepreciationExpenseTAccountLayout = new javax.swing.GroupLayout(DepreciationExpenseTAccount);
        DepreciationExpenseTAccount.setLayout(DepreciationExpenseTAccountLayout);
        DepreciationExpenseTAccountLayout.setHorizontalGroup(
            DepreciationExpenseTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane37, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        DepreciationExpenseTAccountLayout.setVerticalGroup(
            DepreciationExpenseTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane37, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );

        AccumulatedDepreciationTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane38.setViewportView(AccumulatedDepreciationTAccountTable);

        javax.swing.GroupLayout AccumulatedDepreciationTAccountLayout = new javax.swing.GroupLayout(AccumulatedDepreciationTAccount);
        AccumulatedDepreciationTAccount.setLayout(AccumulatedDepreciationTAccountLayout);
        AccumulatedDepreciationTAccountLayout.setHorizontalGroup(
            AccumulatedDepreciationTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane38, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        AccumulatedDepreciationTAccountLayout.setVerticalGroup(
            AccumulatedDepreciationTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane38, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );

        AccountsPayableTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Desc", "Debit", "Credit"
            }
        ));
        jScrollPane41.setViewportView(AccountsPayableTAccountTable);

        AccountsPayableTAccount.setLayer(jScrollPane41, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AccountsPayableTAccountLayout = new javax.swing.GroupLayout(AccountsPayableTAccount);
        AccountsPayableTAccount.setLayout(AccountsPayableTAccountLayout);
        AccountsPayableTAccountLayout.setHorizontalGroup(
            AccountsPayableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane41, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
        AccountsPayableTAccountLayout.setVerticalGroup(
            AccountsPayableTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane41, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );

        CostofGoodsSoldTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane42.setViewportView(CostofGoodsSoldTAccountTable);

        CostofGoodsSoldTAccount.setLayer(jScrollPane42, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout CostofGoodsSoldTAccountLayout = new javax.swing.GroupLayout(CostofGoodsSoldTAccount);
        CostofGoodsSoldTAccount.setLayout(CostofGoodsSoldTAccountLayout);
        CostofGoodsSoldTAccountLayout.setHorizontalGroup(
            CostofGoodsSoldTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane42, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        CostofGoodsSoldTAccountLayout.setVerticalGroup(
            CostofGoodsSoldTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane42, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        PurchasesTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane43.setViewportView(PurchasesTAccountTable);

        PurchasesTAccount.setLayer(jScrollPane43, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PurchasesTAccountLayout = new javax.swing.GroupLayout(PurchasesTAccount);
        PurchasesTAccount.setLayout(PurchasesTAccountLayout);
        PurchasesTAccountLayout.setHorizontalGroup(
            PurchasesTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane43, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        PurchasesTAccountLayout.setVerticalGroup(
            PurchasesTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane43, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
        );

        TStockTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane50.setViewportView(TStockTAccountTable);

        TStockTAccount.setLayer(jScrollPane50, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout TStockTAccountLayout = new javax.swing.GroupLayout(TStockTAccount);
        TStockTAccount.setLayout(TStockTAccountLayout);
        TStockTAccountLayout.setHorizontalGroup(
            TStockTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane50, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        TStockTAccountLayout.setVerticalGroup(
            TStockTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane50, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        PaidinCapitalTAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Credit"
            }
        ));
        jScrollPane51.setViewportView(PaidinCapitalTAccountTable);

        PaidinCapitalTAccount.setLayer(jScrollPane51, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PaidinCapitalTAccountLayout = new javax.swing.GroupLayout(PaidinCapitalTAccount);
        PaidinCapitalTAccount.setLayout(PaidinCapitalTAccountLayout);
        PaidinCapitalTAccountLayout.setHorizontalGroup(
            PaidinCapitalTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane51, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );
        PaidinCapitalTAccountLayout.setVerticalGroup(
            PaidinCapitalTAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane51, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TAccountsLayout = new javax.swing.GroupLayout(TAccounts);
        TAccounts.setLayout(TAccountsLayout);
        TAccountsLayout.setHorizontalGroup(
            TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAccountsLayout.createSequentialGroup()
                .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TAccountsLayout.createSequentialGroup()
                        .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TAccountsLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(ShowTAccount))
                            .addGroup(TAccountsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CashTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TAccountsLayout.createSequentialGroup()
                        .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TAccountsLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(BackButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(245, 245, 245)
                                .addComponent(TAccountChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(BalanceType, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)))
                        .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136)))
                .addGap(71, 71, 71))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TAccountsLayout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(EquipmentTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(141, 141, 141)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(233, Short.MAX_VALUE)
                    .addComponent(CommonStockTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(216, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(233, Short.MAX_VALUE)
                    .addComponent(SuppliesTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(216, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(231, Short.MAX_VALUE)
                    .addComponent(InventoryTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(218, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(227, Short.MAX_VALUE)
                    .addComponent(AccountsReceivableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(229, Short.MAX_VALUE)
                    .addComponent(SalesRevenueTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(222, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(244, Short.MAX_VALUE)
                    .addComponent(SalesDiscountTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(232, Short.MAX_VALUE)
                    .addComponent(SalesDiscountForfeitedTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(231, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(239, Short.MAX_VALUE)
                    .addComponent(SalesReturnsAndAllowancesTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(224, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(234, Short.MAX_VALUE)
                    .addComponent(AllowanceForSalesReturnsAndAllowancesTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(236, Short.MAX_VALUE)
                    .addComponent(AllowanceForDoubtfulAccountsTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(212, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(234, Short.MAX_VALUE)
                    .addComponent(BadDebtExpenseTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(229, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(235, Short.MAX_VALUE)
                    .addComponent(NotesReceivableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(239, Short.MAX_VALUE)
                    .addComponent(InterestRevenueTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(232, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(243, Short.MAX_VALUE)
                    .addComponent(DiscountOnNotesReceivableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(225, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(243, Short.MAX_VALUE)
                    .addComponent(DiscountOnBondsPayableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(230, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(235, Short.MAX_VALUE)
                    .addComponent(PremiumOnBondsPayableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(212, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(244, Short.MAX_VALUE)
                    .addComponent(BondsPayableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(238, Short.MAX_VALUE)
                    .addComponent(GainRedemptionTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(243, Short.MAX_VALUE)
                    .addComponent(LossRedemptionTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(229, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(240, Short.MAX_VALUE)
                    .addComponent(DepreciationExpenseTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(219, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(238, Short.MAX_VALUE)
                    .addComponent(AccumulatedDepreciationTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(247, Short.MAX_VALUE)
                    .addComponent(AccountsPayableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(222, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(239, Short.MAX_VALUE)
                    .addComponent(CostofGoodsSoldTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(227, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(234, Short.MAX_VALUE)
                    .addComponent(PurchasesTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addComponent(TStockTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(219, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(254, Short.MAX_VALUE)
                    .addComponent(PaidinCapitalTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(227, Short.MAX_VALUE)))
        );
        TAccountsLayout.setVerticalGroup(
            TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAccountsLayout.createSequentialGroup()
                .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TAccountsLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7))
                    .addGroup(TAccountsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TAccountsLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(BackButton2)
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(ShowTAccount))
                    .addGroup(TAccountsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TAccountsLayout.createSequentialGroup()
                                .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TAccountChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BalanceType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                                .addComponent(Balance)
                                .addGap(37, 37, 37)))
                        .addComponent(CashTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TAccountsLayout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(EquipmentTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(113, 113, 113)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(193, Short.MAX_VALUE)
                    .addComponent(CommonStockTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(198, Short.MAX_VALUE)
                    .addComponent(SuppliesTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(195, Short.MAX_VALUE)
                    .addComponent(InventoryTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(187, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(187, Short.MAX_VALUE)
                    .addComponent(AccountsReceivableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(197, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(190, Short.MAX_VALUE)
                    .addComponent(SalesRevenueTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(201, Short.MAX_VALUE)
                    .addComponent(SalesDiscountTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(195, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(193, Short.MAX_VALUE)
                    .addComponent(SalesDiscountForfeitedTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(201, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(198, Short.MAX_VALUE)
                    .addComponent(SalesReturnsAndAllowancesTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(199, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(191, Short.MAX_VALUE)
                    .addComponent(AllowanceForSalesReturnsAndAllowancesTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(202, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(198, Short.MAX_VALUE)
                    .addComponent(AllowanceForDoubtfulAccountsTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(198, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(192, Short.MAX_VALUE)
                    .addComponent(BadDebtExpenseTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(190, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(197, Short.MAX_VALUE)
                    .addComponent(NotesReceivableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(201, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(200, Short.MAX_VALUE)
                    .addComponent(InterestRevenueTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(198, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(203, Short.MAX_VALUE)
                    .addComponent(DiscountOnNotesReceivableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(197, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(167, Short.MAX_VALUE)
                    .addComponent(DiscountOnBondsPayableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(209, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(172, Short.MAX_VALUE)
                    .addComponent(PremiumOnBondsPayableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(202, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(188, Short.MAX_VALUE)
                    .addComponent(BondsPayableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(197, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(182, Short.MAX_VALUE)
                    .addComponent(GainRedemptionTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(199, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(187, Short.MAX_VALUE)
                    .addComponent(LossRedemptionTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(196, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(194, Short.MAX_VALUE)
                    .addComponent(DepreciationExpenseTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(200, Short.MAX_VALUE)
                    .addComponent(AccumulatedDepreciationTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(201, Short.MAX_VALUE)
                    .addComponent(AccountsPayableTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(193, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(182, Short.MAX_VALUE)
                    .addComponent(CostofGoodsSoldTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(187, Short.MAX_VALUE)
                    .addComponent(PurchasesTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(199, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(187, Short.MAX_VALUE)
                    .addComponent(TStockTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(210, Short.MAX_VALUE)))
            .addGroup(TAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAccountsLayout.createSequentialGroup()
                    .addContainerGap(201, Short.MAX_VALUE)
                    .addComponent(PaidinCapitalTAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );

        TAccountsBack.add(TAccounts, "card2");

        Panel.add(TAccountsBack, "card6");

        LogTable.setPreferredSize(new java.awt.Dimension(754, 350));

        jLabel6.setText("TAccounts");

        CashTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Debit", "Value", "Credit", "Value"
            }
        ));
        jScrollPane2.setViewportView(CashTable);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogTableLayout = new javax.swing.GroupLayout(LogTable);
        LogTable.setLayout(LogTableLayout);
        LogTableLayout.setHorizontalGroup(
            LogTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogTableLayout.createSequentialGroup()
                .addGroup(LogTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogTableLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LogTableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogTableLayout.setVerticalGroup(
            LogTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogTableLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(LogTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Back))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        Panel.add(LogTable, "card4");

        HomeJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Purchases Dealt");

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Client Company");

        jLabel3.setText("Cash Spent");

        CashSpent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashSpentActionPerformed(evt);
            }
        });

        CashOptions.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Equipment", "Common Stock", "Inventory", "Supplies", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        CashOptions.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                CashOptionsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(CashOptions);

        AccountPayableCheckBox.setText("Due within 12 Months");
        AccountPayableCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AccountPayableCheckBoxStateChanged(evt);
            }
        });
        AccountPayableCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountPayableCheckBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Dr.");

        jLabel5.setText("Cr.");

        Debitarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitareaActionPerformed(evt);
            }
        });

        GenerateJE.setText("GenerateJE");
        GenerateJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJEActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        SaveJE.setText("Save JE");
        SaveJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJEActionPerformed(evt);
            }
        });

        jLabel9.setText("Description of Transaction:");

        jLabel10.setText("Date:");

        javax.swing.GroupLayout HomeJPanelLayout = new javax.swing.GroupLayout(HomeJPanel);
        HomeJPanel.setLayout(HomeJPanelLayout);
        HomeJPanelLayout.setHorizontalGroup(
            HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeJPanelLayout.createSequentialGroup()
                .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeJPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HomeJPanelLayout.createSequentialGroup()
                                .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(HomeJPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CashSpent, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(HomeJPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AccountPayableCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HomeJPanelLayout.createSequentialGroup()
                                .addComponent(GenerateJE, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SaveJE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(HomeJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomeJPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(HomeJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Debitarea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HomeJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Creditarea)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DollarDebit)
                            .addComponent(DollarCredit, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                        .addContainerGap(340, Short.MAX_VALUE))
                    .addGroup(HomeJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeJPanelLayout.createSequentialGroup()
                                .addComponent(DescriptionBasic)
                                .addGap(30, 30, 30))
                            .addGroup(HomeJPanelLayout.createSequentialGroup()
                                .addComponent(DateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        HomeJPanelLayout.setVerticalGroup(
            HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(jLabel1))
                .addGap(53, 53, 53)
                .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Debitarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DollarDebit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Creditarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CashSpent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(AccountPayableCheckBox)
                    .addComponent(DollarCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeJPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HomeJPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DescriptionBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateJE)
                    .addComponent(ResetButton)
                    .addComponent(SaveJE))
                .addContainerGap(292, Short.MAX_VALUE))
        );

        Panel.add(HomeJPanel, "card3");

        SalesReturnsAndAllowancesPanel.setPreferredSize(new java.awt.Dimension(819, 461));

        jLabel23.setText("Sales Returns & Allowances");

        AllowanceAmountInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllowanceAmountInputActionPerformed(evt);
            }
        });

        jLabel24.setText("Allowance Amount");

        EstimateSalesReturns.setText("Estimate");

        GrantedAllowanceSalesReturns.setText("Granted Allowance");

        GenerateJESalesReturns.setText("Generate JE");
        GenerateJESalesReturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJESalesReturnsActionPerformed(evt);
            }
        });

        ResetSalesReturns.setText("Reset");

        SaveJESalesReturns.setText("Save JE");
        SaveJESalesReturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJESalesReturnsActionPerformed(evt);
            }
        });

        AllowanceJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Value"
            }
        ));
        jScrollPane16.setViewportView(AllowanceJETable);

        BackButtonSalesReturns.setText("Back");
        BackButtonSalesReturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonSalesReturnsActionPerformed(evt);
            }
        });

        jLabel25.setText("Add a Description");

        javax.swing.GroupLayout SalesReturnsAndAllowancesPanelLayout = new javax.swing.GroupLayout(SalesReturnsAndAllowancesPanel);
        SalesReturnsAndAllowancesPanel.setLayout(SalesReturnsAndAllowancesPanelLayout);
        SalesReturnsAndAllowancesPanelLayout.setHorizontalGroup(
            SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalesReturnsAndAllowancesPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BackButtonSalesReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addGroup(SalesReturnsAndAllowancesPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EstimateSalesReturns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AllowanceAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GrantedAllowanceSalesReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))
            .addGroup(SalesReturnsAndAllowancesPanelLayout.createSequentialGroup()
                .addGroup(SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SalesReturnsAndAllowancesPanelLayout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescriptionSalesReturns))
                    .addGroup(SalesReturnsAndAllowancesPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(SaveJESalesReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SalesReturnsAndAllowancesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GenerateJESalesReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(ResetSalesReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        SalesReturnsAndAllowancesPanelLayout.setVerticalGroup(
            SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesReturnsAndAllowancesPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(BackButtonSalesReturns))
                .addGroup(SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SalesReturnsAndAllowancesPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(AllowanceAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EstimateSalesReturns)
                            .addComponent(GrantedAllowanceSalesReturns)))
                    .addGroup(SalesReturnsAndAllowancesPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(DescriptionSalesReturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(SalesReturnsAndAllowancesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateJESalesReturns)
                    .addComponent(ResetSalesReturns))
                .addGap(28, 28, 28)
                .addComponent(SaveJESalesReturns)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        Panel.add(SalesReturnsAndAllowancesPanel, "card8");

        WriteOffPanel.setPreferredSize(new java.awt.Dimension(825, 461));

        jLabel27.setText("Write Off of Uncollectible Accounts");

        BackButtonUncollectible.setText("Back");
        BackButtonUncollectible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonUncollectibleActionPerformed(evt);
            }
        });

        jLabel28.setText("Amount Uncollected or Recovered:");

        UncollectibleJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane19.setViewportView(UncollectibleJETable);

        GenerateJEButtonUncollectible.setText("Generate JE");
        GenerateJEButtonUncollectible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJEButtonUncollectibleActionPerformed(evt);
            }
        });

        ResetUncollectibleButton.setText("Reset");

        SaveJEButtonUncollectible.setText("Save JE");
        SaveJEButtonUncollectible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJEButtonUncollectibleActionPerformed(evt);
            }
        });

        DirectWriteOff.setText("Direct Write Off");
        DirectWriteOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectWriteOffActionPerformed(evt);
            }
        });

        EstimatedUncollectibles.setText("Estimated Uncollectibles");

        WriteOffAllowanceAccount.setText("Write off of Allowance Account");

        RecoveryOfUncollectibleAccount.setText("Recovery of Uncollectible Account");

        javax.swing.GroupLayout WriteOffPanelLayout = new javax.swing.GroupLayout(WriteOffPanel);
        WriteOffPanel.setLayout(WriteOffPanelLayout);
        WriteOffPanelLayout.setHorizontalGroup(
            WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WriteOffPanelLayout.createSequentialGroup()
                .addGroup(WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WriteOffPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BackButtonUncollectible, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WriteOffPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(GenerateJEButtonUncollectible, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(ResetUncollectibleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(WriteOffPanelLayout.createSequentialGroup()
                .addGroup(WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WriteOffPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WriteOffPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(SaveJEButtonUncollectible, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87))
                            .addGroup(WriteOffPanelLayout.createSequentialGroup()
                                .addGroup(WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(WriteOffPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AmountUncollected, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(WriteOffPanelLayout.createSequentialGroup()
                                        .addComponent(DirectWriteOff, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(EstimatedUncollectibles, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WriteOffPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(WriteOffAllowanceAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RecoveryOfUncollectibleAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(77, 77, 77)))
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        WriteOffPanelLayout.setVerticalGroup(
            WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WriteOffPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButtonUncollectible))
                .addGroup(WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WriteOffPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(AmountUncollected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DirectWriteOff)
                            .addComponent(EstimatedUncollectibles))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(WriteOffAllowanceAccount)
                        .addGap(18, 18, 18)
                        .addComponent(RecoveryOfUncollectibleAccount))
                    .addGroup(WriteOffPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addGroup(WriteOffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateJEButtonUncollectible)
                    .addComponent(ResetUncollectibleButton))
                .addGap(32, 32, 32)
                .addComponent(SaveJEButtonUncollectible)
                .addGap(85, 85, 85))
        );

        Panel.add(WriteOffPanel, "card9");

        NotesReceivablePanel.setPreferredSize(new java.awt.Dimension(825, 461));

        jLabel29.setText("Notes Receivable");

        jLabel30.setText("Present Value of Note");

        BackButtonNotesReceivable.setText("Back");
        BackButtonNotesReceivable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonNotesReceivableActionPerformed(evt);
            }
        });

        NoteIssuedFaceValue.setText("Note Issued Face Value");
        NoteIssuedFaceValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoteIssuedFaceValueActionPerformed(evt);
            }
        });

        InterestBearingNotes.setText("Interest-Bearing Notes");

        ZeroInterestBearingNotes.setText("Zero Interest Bearing Notes");

        GenerateJENotesReceivable.setText("Generate JE");
        GenerateJENotesReceivable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJENotesReceivableActionPerformed(evt);
            }
        });

        ResetButtonNotesReceivable.setText("Reset");
        ResetButtonNotesReceivable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonNotesReceivableActionPerformed(evt);
            }
        });

        SaveJENotesReceivable.setText("Save JE");
        SaveJENotesReceivable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJENotesReceivableActionPerformed(evt);
            }
        });

        jLabel31.setText("Face Value of Note");

        jLabel32.setText("Effective Interest Rate");

        jLabel33.setText("Implicit Interest Rate");

        NotesReceivableJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane22.setViewportView(NotesReceivableJETable);

        jLabel34.setText("Years unitl Maturity");

        jLabel35.setText("Schedule of Note Discount Amortization");

        NoteDiscountAmortJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Cash Received", "Interest Revenue", "Discount Amortized", "Carrying Amount"
            }
        ));
        jScrollPane23.setViewportView(NoteDiscountAmortJETable);

        NotesPayInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Purchase", "Issuance" }));
        NotesPayInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotesPayInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NotesReceivablePanelLayout = new javax.swing.GroupLayout(NotesReceivablePanel);
        NotesReceivablePanel.setLayout(NotesReceivablePanelLayout);
        NotesReceivablePanelLayout.setHorizontalGroup(
            NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BackButtonNotesReceivable, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ZeroInterestBearingNotes)
                    .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                        .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NoteIssuedFaceValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NotesReceivablePanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NotesPayInput, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                                .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FaceValueNoteInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(PresentValueOfNoteInput, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EffectiveInterestRateInput)
                                    .addComponent(ImplicitInterestRateInput, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(YearsUntilMaturityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                                .addComponent(InterestBearingNotes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GenerateJENotesReceivable, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ResetButtonNotesReceivable, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(SaveJENotesReceivable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NotesReceivablePanelLayout.setVerticalGroup(
            NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(BackButtonNotesReceivable))
                .addGap(12, 12, 12)
                .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(FaceValueNoteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(EffectiveInterestRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(YearsUntilMaturityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(PresentValueOfNoteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(ImplicitInterestRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                        .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoteIssuedFaceValue)
                            .addComponent(InterestBearingNotes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ZeroInterestBearingNotes)
                        .addGap(18, 18, 18)
                        .addComponent(NotesPayInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateJENotesReceivable)
                    .addComponent(ResetButtonNotesReceivable)
                    .addComponent(jLabel35))
                .addGroup(NotesReceivablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NotesReceivablePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SaveJENotesReceivable)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotesReceivablePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        Panel.add(NotesReceivablePanel, "card10");

        BondsPayablePanel.setPreferredSize(new java.awt.Dimension(825, 461));

        jLabel36.setText("Bonds Payable");

        jLabel37.setText("Price of Bond");

        jLabel38.setText("Par Value of Bond");

        BondIssuedInterestDate.setText("Issued on Interest Date");

        BondIssuedbetweenInterestDates.setText("Issued in between Interest Dates");

        BondAnnualInterest.setText("Annual Interest");

        BondSemiAnnualInterest.setText("Semi Annual Interest");

        BondsPayableJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Value"
            }
        ));
        jScrollPane27.setViewportView(BondsPayableJETable);

        BondsPayableAmortSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Cash Paid", "Interest Expense", "Discount Amortized", "Carrying Amount"
            }
        ));
        jScrollPane28.setViewportView(BondsPayableAmortSchedule);

        GenerateJEBondPayable.setText("Generate JE");
        GenerateJEBondPayable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJEBondPayableActionPerformed(evt);
            }
        });

        ResetButtonBondsPayable.setText("Reset");

        SaveJEBondPayable.setText("Save JE");
        SaveJEBondPayable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJEBondPayableActionPerformed(evt);
            }
        });

        jLabel39.setText("Implicit Interest Rate");

        jLabel40.setText("Effective Interest Rate");

        jLabel41.setText("Years Until Maturity");

        jLabel43.setText("Month Between Interest Date");

        BackButtonBondsPayable.setText("Back");
        BackButtonBondsPayable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonBondsPayableActionPerformed(evt);
            }
        });

        ExtinguishCheck.setText("Extinguishment Of Debt");
        ExtinguishCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ExtinguishCheckStateChanged(evt);
            }
        });

        jLabel42.setText("Years after Issue Date");

        jLabel44.setText("Call Value");

        javax.swing.GroupLayout ExtinguishPanelLayout = new javax.swing.GroupLayout(ExtinguishPanel);
        ExtinguishPanel.setLayout(ExtinguishPanelLayout);
        ExtinguishPanelLayout.setHorizontalGroup(
            ExtinguishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExtinguishPanelLayout.createSequentialGroup()
                .addGroup(ExtinguishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ExtinguishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExtinguishYears, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(CallValueInput))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        ExtinguishPanelLayout.setVerticalGroup(
            ExtinguishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExtinguishPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ExtinguishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(ExtinguishYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ExtinguishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(CallValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BondsPayablePanelLayout = new javax.swing.GroupLayout(BondsPayablePanel);
        BondsPayablePanel.setLayout(BondsPayablePanelLayout);
        BondsPayablePanelLayout.setHorizontalGroup(
            BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ParValueBond)
                            .addComponent(BondsPayableImplicit)
                            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                .addComponent(EffectiveInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GenerateJEBondPayable)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(YearsUntilMaturityBondsPayable, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                        .addComponent(BondAnnualInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BondSemiAnnualInterest))
                                    .addComponent(ExtinguishPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(SaveJEBondPayable, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BackButtonBondsPayable, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PriceOfBond, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(ExtinguishCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BondIssuedInterestDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BondIssuedbetweenInterestDates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(MonthBetweenInterest))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane28)
                        .addContainerGap())))
            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(ResetButtonBondsPayable, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BondsPayablePanelLayout.setVerticalGroup(
            BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(BackButtonBondsPayable))
                .addGap(19, 19, 19)
                .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(PriceOfBond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BondIssuedInterestDate))
                        .addGap(18, 18, 18)
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(ParValueBond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BondIssuedbetweenInterestDates))
                        .addGap(18, 18, 18)
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BondsPayableImplicit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel43)))
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(EffectiveInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BondsPayablePanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(MonthBetweenInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(YearsUntilMaturityBondsPayable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BondAnnualInterest)
                            .addComponent(BondSemiAnnualInterest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExtinguishCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExtinguishPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addGroup(BondsPayablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GenerateJEBondPayable)
                            .addComponent(ResetButtonBondsPayable))
                        .addGap(30, 30, 30)
                        .addComponent(SaveJEBondPayable))))
        );

        Panel.add(BondsPayablePanel, "card11");

        BackButtonDepreciation.setText("Back");
        BackButtonDepreciation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonDepreciationActionPerformed(evt);
            }
        });

        jLabel45.setText("Depreciation Methods & Impairment");

        jLabel46.setText("Original Cost");

        jLabel47.setText("Salvage Value");

        jLabel48.setText("Estimated useful life");

        DepreciationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Straight Line", "Sum of the years digits", "Declining Balance" }));
        DepreciationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepreciationTypeActionPerformed(evt);
            }
        });

        jLabel49.setText("Depreciation Type");

        GenerateJEDepreciation.setText("Generate JE ");
        GenerateJEDepreciation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJEDepreciationActionPerformed(evt);
            }
        });

        jButton4.setText("Reset");

        SaveJEDepreciation.setText("Save JE ");
        SaveJEDepreciation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJEDepreciationActionPerformed(evt);
            }
        });

        DepreciationJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Value"
            }
        ));
        jScrollPane34.setViewportView(DepreciationJETable);

        SumOfYearTable.setBackground(new java.awt.Color(204, 204, 255));
        SumOfYearTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Depreciation Base", "Remaining Life", "Depreciation Fraction", "Depreciation Exp"
            }
        ));
        jScrollPane35.setViewportView(SumOfYearTable);

        javax.swing.GroupLayout SumOfYearPanelLayout = new javax.swing.GroupLayout(SumOfYearPanel);
        SumOfYearPanel.setLayout(SumOfYearPanelLayout);
        SumOfYearPanelLayout.setHorizontalGroup(
            SumOfYearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane35, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );
        SumOfYearPanelLayout.setVerticalGroup(
            SumOfYearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane35, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        DecliningBalanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Depreciation Base", "Rate Declining", "Depreciation Expense"
            }
        ));
        jScrollPane36.setViewportView(DecliningBalanceTable);

        DecliningBalancePanel.setLayer(jScrollPane36, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DecliningBalancePanelLayout = new javax.swing.GroupLayout(DecliningBalancePanel);
        DecliningBalancePanel.setLayout(DecliningBalancePanelLayout);
        DecliningBalancePanelLayout.setHorizontalGroup(
            DecliningBalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DecliningBalancePanelLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DecliningBalancePanelLayout.setVerticalGroup(
            DecliningBalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecliningBalancePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane36, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout DepreciationPanelLayout = new javax.swing.GroupLayout(DepreciationPanel);
        DepreciationPanel.setLayout(DepreciationPanelLayout);
        DepreciationPanelLayout.setHorizontalGroup(
            DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepreciationPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BackButtonDepreciation, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepreciationPanelLayout.createSequentialGroup()
                .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepreciationPanelLayout.createSequentialGroup()
                        .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DepreciationPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                            .addGroup(DepreciationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EstUsefulLife, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(OrigCost)
                                .addComponent(SalvValue, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))))
                    .addGroup(DepreciationPanelLayout.createSequentialGroup()
                        .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DepreciationPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DepreciationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(GenerateJEDepreciation, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DepreciationType, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DepreciationPanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(SaveJEDepreciation, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SumOfYearPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepreciationPanelLayout.createSequentialGroup()
                    .addContainerGap(313, Short.MAX_VALUE)
                    .addComponent(DecliningBalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        DepreciationPanelLayout.setVerticalGroup(
            DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepreciationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButtonDepreciation)
                    .addComponent(jLabel45))
                .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepreciationPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(OrigCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(SalvValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(EstUsefulLife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DepreciationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepreciationPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GenerateJEDepreciation)
                        .addComponent(jButton4))
                    .addComponent(SumOfYearPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(SaveJEDepreciation)
                .addContainerGap())
            .addGroup(DepreciationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepreciationPanelLayout.createSequentialGroup()
                    .addContainerGap(289, Short.MAX_VALUE)
                    .addComponent(DecliningBalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(99, Short.MAX_VALUE)))
        );

        Panel.add(DepreciationPanel, "card12");

        InventoryManagementPanel.setBackground(new java.awt.Color(255, 255, 255));

        BackButtonInventoryManagement.setText("Back ");
        BackButtonInventoryManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonInventoryManagementActionPerformed(evt);
            }
        });

        jLabel51.setText("Units");

        jLabel52.setText("Sales Price");

        Units.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        SalesPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        InventoryManagementJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Value"
            }
        ));
        jScrollPane39.setViewportView(InventoryManagementJETable);

        InventoryData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Purchase", "Sale", " " }));
        InventoryData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryDataActionPerformed(evt);
            }
        });

        GenerateJEInventory.setText("Generate JE");
        GenerateJEInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJEInventoryActionPerformed(evt);
            }
        });

        ResetButtonInventory.setText("Reset");
        ResetButtonInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonInventoryActionPerformed(evt);
            }
        });

        SaveJEInventory.setText("Save JE");
        SaveJEInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJEInventoryActionPerformed(evt);
            }
        });

        PerpetualCheck.setText("Perpetual");

        PeriodicCheck.setText("Periodic");

        CFAssumption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIFO", "LIFO", "Average-Cost", "Dollar-Value LIFO" }));
        CFAssumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFAssumptionActionPerformed(evt);
            }
        });

        FIFOPerpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchase/Sale", "Purchased @", "Units", "Sold @", "Units", "Balance"
            }
        ));
        jScrollPane40.setViewportView(FIFOPerpTable);

        jLabel79.setText("Product Identification");

        jLabel50.setText("Beginning Inventory (value):");

        jLabel54.setText("Item Name ");

        jLabel81.setText("Item Category:");

        jLabel82.setText("Ending Inventory (value):");

        javax.swing.GroupLayout InventoryManagementPanelLayout = new javax.swing.GroupLayout(InventoryManagementPanel);
        InventoryManagementPanel.setLayout(InventoryManagementPanelLayout);
        InventoryManagementPanelLayout.setHorizontalGroup(
            InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                        .addComponent(BackButtonInventoryManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                        .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                                .addComponent(GenerateJEInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(ResetButtonInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(SaveJEInventory)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                        .addComponent(PerpetualCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PeriodicCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                        .addComponent(InventoryData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(CFAssumption, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                        .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InventoryManagementPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProductIDInput))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InventoryManagementPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Units, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BeginningInvID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ItemNameOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ItemCategoryOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EndingInvOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        InventoryManagementPanelLayout.setVerticalGroup(
            InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButtonInventoryManagement)
                .addGap(18, 18, 18)
                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(ProductIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(Units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(SalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InventoryData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CFAssumption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PerpetualCheck)
                            .addComponent(PeriodicCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                        .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GenerateJEInventory)
                            .addComponent(ResetButtonInventory))
                        .addGap(32, 32, 32)
                        .addComponent(SaveJEInventory))
                    .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                        .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InventoryManagementPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BeginningInvID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50))
                                .addGap(17, 17, 17)
                                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel54)
                                    .addComponent(ItemNameOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel81)
                                    .addComponent(ItemCategoryOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(InventoryManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel82)
                                    .addComponent(EndingInvOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
        );

        Panel.add(InventoryManagementPanel, "card13");

        jLabel53.setText("Inventory Valuation");

        jLabel55.setText("Beginning Inv");

        jLabel56.setText("Purchases");

        jLabel57.setText("Sales");

        GenerateJEInvValuation.setText("Generate JE");

        ResetButtonInvValuation.setText("Reset");

        SaveJEInvValuation.setText("Save JE");

        PullDataJE.setText("Pull Data from JE");
        PullDataJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PullDataJEActionPerformed(evt);
            }
        });

        BackButtonInvValuation.setText("Back");
        BackButtonInvValuation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonInvValuationActionPerformed(evt);
            }
        });

        InvValuationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Cost", "Retail"
            }
        ));
        jScrollPane44.setViewportView(InvValuationTable);

        javax.swing.GroupLayout InventoryValuationPanelLayout = new javax.swing.GroupLayout(InventoryValuationPanel);
        InventoryValuationPanel.setLayout(InventoryValuationPanelLayout);
        InventoryValuationPanelLayout.setHorizontalGroup(
            InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryValuationPanelLayout.createSequentialGroup()
                .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventoryValuationPanelLayout.createSequentialGroup()
                        .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SaveJEInvValuation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GenerateJEInvValuation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResetButtonInvValuation, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PullDataJE)))
                    .addGroup(InventoryValuationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(InventoryValuationPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(SalesInputInv, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                .addGroup(InventoryValuationPanelLayout.createSequentialGroup()
                                    .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BeginInvInput)
                                        .addComponent(PurchasesAmountInv, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventoryValuationPanelLayout.createSequentialGroup()
                                .addComponent(BackButtonInvValuation, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventoryValuationPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventoryValuationPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                        .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        InventoryValuationPanelLayout.setVerticalGroup(
            InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryValuationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(InventoryValuationPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(BackButtonInvValuation)
                .addGap(18, 18, 18)
                .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(BeginInvInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(PurchasesAmountInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(SalesInputInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateJEInvValuation)
                    .addComponent(ResetButtonInvValuation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InventoryValuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveJEInvValuation)
                    .addComponent(PullDataJE))
                .addGap(14, 14, 14))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Panel.add(InventoryValuationPanel, "card14");

        InventoryMainMen.setMaximumSize(new java.awt.Dimension(1200, 600));
        InventoryMainMen.setMinimumSize(new java.awt.Dimension(1200, 600));
        InventoryMainMen.setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));
        jPanel7.setAlignmentX(0.0F);
        jPanel7.setAlignmentY(0.0F);

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Home");
        jLabel73.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black));
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setAlignmentX(0.0F);
        jPanel8.setAlignmentY(0.0F);

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Welcome to Inventory Management");

        jLabel75.setText("Please select an option to continue");

        jButton1.setText("Create/Add New Inventory ID's");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sales & Purchase of Inventory");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        EducationalInventoryButton.setText("Educational Problem LIFO FIFO");
        EducationalInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationalInventoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(EducationalInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75)
                .addGap(84, 84, 84)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EducationalInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout InventoryMainMenLayout = new javax.swing.GroupLayout(InventoryMainMen);
        InventoryMainMen.setLayout(InventoryMainMenLayout);
        InventoryMainMenLayout.setHorizontalGroup(
            InventoryMainMenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryMainMenLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InventoryMainMenLayout.setVerticalGroup(
            InventoryMainMenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(InventoryMainMen, "card16");

        InventoryIdentification.setMaximumSize(new java.awt.Dimension(1200, 600));
        InventoryIdentification.setMinimumSize(new java.awt.Dimension(1200, 600));
        InventoryIdentification.setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel9.setBackground(new java.awt.Color(102, 153, 255));

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Inputs");

        jLabel77.setText("Item Name");

        jLabel78.setText("Item Description/ Category");

        AddIDButton.setText("Add ID");
        AddIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddIDButtonActionPerformed(evt);
            }
        });

        DeleteIDButton.setText("Delete ID");
        DeleteIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteIDButtonActionPerformed(evt);
            }
        });

        jLabel80.setText("Please Note ID #'s are Automatically Generated");

        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        IDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID#", "Item Description", "Item Category", "Item Value in Stock"
            }
        ));
        jScrollPane45.setViewportView(IDTable);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(AddIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel80)
                                    .addComponent(ItemNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ItemDescInput, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ItemNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ItemDescInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(90, 90, 90))))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout InventoryIdentificationLayout = new javax.swing.GroupLayout(InventoryIdentification);
        InventoryIdentification.setLayout(InventoryIdentificationLayout);
        InventoryIdentificationLayout.setHorizontalGroup(
            InventoryIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryIdentificationLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        InventoryIdentificationLayout.setVerticalGroup(
            InventoryIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(InventoryIdentification, "card17");

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(51, 255, 255));

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Required Inputs");

        jLabel86.setText("Net Income");

        jLabel87.setText("WASO");

        jLabel88.setText("Securities Percentage");

        GenerateEPS.setText("Generate Diluted EPS");
        GenerateEPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateEPSActionPerformed(evt);
            }
        });

        ResetButtonEPS.setText("Reset");
        ResetButtonEPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonEPSActionPerformed(evt);
            }
        });

        jLabel89.setText("Types of Securities:");

        SecurityChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convertible Bonds Payable", "Cumulative Convertible Preferred Stock", "Convertible Preferred Stock" }));

        jLabel90.setText("# of Options:");

        jLabel91.setText("Average Stock Price");

        jLabel92.setText("Tax Rate");

        NumOptionsInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumOptionsInputActionPerformed(evt);
            }
        });

        jLabel93.setText("Exercise Price:");

        jLabel94.setText("Par Value");

        jLabel95.setText("Each Security Convertible ");

        AddSecurityEPS.setText("Add Security");
        AddSecurityEPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSecurityEPSActionPerformed(evt);
            }
        });

        jLabel98.setText("Amount Outstanding");

        jButton5.setText("Add Options");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel157.setText("# of Securities Convertible");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SecurityChoice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NumOptionsInput)
                                .addComponent(AverageStockPriceInput)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TaxRateInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ExercisePriceEPSInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(47, 47, 47))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NetIncomeInputDilutedEPS)
                                .addComponent(WASOInput)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(ParValueInputEPS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(SecuritiesEPSInput))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddSecurityEPS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(ResetButtonEPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(GenerateEPS))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConvertibleEPSInput)))
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AmountSecuritiesInput)
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumSecuritiesConvertibleDilutive)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel85)
                .addGap(43, 43, 43)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(NetIncomeInputDilutedEPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WASOInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(AmountSecuritiesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(SecuritiesEPSInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ParValueInputEPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConvertibleEPSInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel157)
                    .addComponent(NumSecuritiesConvertibleDilutive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecurityChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumOptionsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExercisePriceEPSInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel91)
                    .addComponent(AverageStockPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92)
                            .addComponent(TaxRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddSecurityEPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(ResetButtonEPS)
                        .addGap(30, 30, 30)))
                .addComponent(GenerateEPS))
        );

        SecuritiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Security Percent", "Type", "# Outstanding ", "Par Value", "Amount Convertible", "# Securities Convertible"
            }
        ));
        jScrollPane46.setViewportView(SecuritiesTable);

        jLabel96.setText("Dilutive EPS:");

        jLabel97.setText("Basic EPS:");

        OptionsEPSTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Options", "Exercise Price"
            }
        ));
        jScrollPane47.setViewportView(OptionsEPSTable);

        HomeButtonEPSCalc.setText("Home");
        HomeButtonEPSCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonEPSCalcActionPerformed(evt);
            }
        });

        jButton16.setText("Diluted EPS Practice Problems");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane47)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(DilutedEPSOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BasicEPSOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(HomeButtonEPSCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(BasicEPSOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96)
                    .addComponent(DilutedEPSOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(HomeButtonEPSCalc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DilutedEPSPanelLayout = new javax.swing.GroupLayout(DilutedEPSPanel);
        DilutedEPSPanel.setLayout(DilutedEPSPanelLayout);
        DilutedEPSPanelLayout.setHorizontalGroup(
            DilutedEPSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DilutedEPSPanelLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DilutedEPSPanelLayout.setVerticalGroup(
            DilutedEPSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(DilutedEPSPanel, "card18");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(51, 255, 255));

        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Required Inputs");

        jLabel100.setText("Month Shares were Issued:");

        MonthSelected.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel101.setText("Beginning Shares Outstanding");

        jLabel102.setText("# of Shares Issued/Purchased");

        jButton6.setText("Add Issuance");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        ResetButtonWaso.setText("Reset");
        ResetButtonWaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonWasoActionPerformed(evt);
            }
        });

        jButton8.setText("Calculate WASO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        StockSplitFrame.setBackground(new java.awt.Color(0, 255, 255));

        jLabel104.setText("for 1 Stock Split");

        javax.swing.GroupLayout StockSplitFrameLayout = new javax.swing.GroupLayout(StockSplitFrame);
        StockSplitFrame.setLayout(StockSplitFrameLayout);
        StockSplitFrameLayout.setHorizontalGroup(
            StockSplitFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockSplitFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StockSplitInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel104)
                .addGap(87, 87, 87))
        );
        StockSplitFrameLayout.setVerticalGroup(
            StockSplitFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockSplitFrameLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(StockSplitFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(StockSplitInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StockDividendPanel.setBackground(new java.awt.Color(0, 255, 255));

        jLabel105.setText("Percent Stock Dividend");

        javax.swing.GroupLayout StockDividendPanelLayout = new javax.swing.GroupLayout(StockDividendPanel);
        StockDividendPanel.setLayout(StockDividendPanelLayout);
        StockDividendPanelLayout.setHorizontalGroup(
            StockDividendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockDividendPanelLayout.createSequentialGroup()
                .addComponent(StockDividendInput, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        StockDividendPanelLayout.setVerticalGroup(
            StockDividendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StockDividendPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(StockDividendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StockDividendInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105))
                .addContainerGap())
        );

        jButton9.setText("Add Purchase");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        AddStockSplit.setText("Add Stock Split");
        AddStockSplit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStockSplitActionPerformed(evt);
            }
        });

        AddStockDividend.setText("Add Stock Dividend");
        AddStockDividend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStockDividendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BeginSharesInput))
            .addComponent(StockSplitFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel102)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SharesIssuedInput, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(StockDividendPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(AddStockDividend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddStockSplit)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MonthSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(ResetButtonWaso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99)
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(BeginSharesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MonthSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(SharesIssuedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(StockSplitFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(StockDividendPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(AddStockSplit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(AddStockDividend))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(ResetButtonWaso))
                .addGap(27, 27, 27))
        );

        WASOTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dates Outstanding", "Shares Outstanding", "Dividend ", "Split", "Fraction of Years", "Weighted Calculation"
            }
        ));
        jScrollPane48.setViewportView(WASOTable);

        jLabel107.setText("Calculated WASO:");

        HomeButtonWaso.setText("Home");
        HomeButtonWaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonWasoActionPerformed(evt);
            }
        });

        EducationalProblemsWASOButton.setText("Educational Problems WASO");
        EducationalProblemsWASOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationalProblemsWASOButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane48, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CalculatedWASO, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EducationalProblemsWASOButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(HomeButtonWaso, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(CalculatedWASO, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EducationalProblemsWASOButton)
                    .addComponent(HomeButtonWaso))
                .addGap(66, 154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout WASOPanelLayout = new javax.swing.GroupLayout(WASOPanel);
        WASOPanel.setLayout(WASOPanelLayout);
        WASOPanelLayout.setHorizontalGroup(
            WASOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        WASOPanelLayout.setVerticalGroup(
            WASOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(WASOPanel, "card19");

        JETableTStocks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane49.setViewportView(JETableTStocks);

        jPanel16.setBackground(new java.awt.Color(0, 255, 255));

        jLabel103.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Required Inputs");

        jLabel109.setText("Reacquisition/Reissuance Price:");

        jLabel110.setText("Shares reaquired/reissued:");

        SharesReaquiredInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SharesReaquiredInputActionPerformed(evt);
            }
        });

        GenerateJEButtonTStock.setText("Generate JE");
        GenerateJEButtonTStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJEButtonTStockActionPerformed(evt);
            }
        });

        ResetButtonTStock.setText("Reset");
        ResetButtonTStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonTStockActionPerformed(evt);
            }
        });

        SaveJETStock.setText("Save JE");
        SaveJETStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJETStockActionPerformed(evt);
            }
        });

        AQCheck.setText("Reacuisition of Stock");

        IssueCheck.setText("Reissuance of Stocks");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel109))
                            .addGap(16, 16, 16)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SharesReaquiredInput, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(ReacquisitionPriceInput)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                            .addComponent(AQCheck)
                            .addGap(18, 18, 18)
                            .addComponent(IssueCheck)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GenerateJEButtonTStock)
                        .addGap(54, 54, 54)
                        .addComponent(ResetButtonTStock, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(SaveJETStock)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel103)
                .addGap(30, 30, 30)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(SharesReaquiredInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReacquisitionPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AQCheck)
                    .addComponent(IssueCheck))
                .addGap(43, 43, 43)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateJEButtonTStock)
                    .addComponent(ResetButtonTStock))
                .addGap(33, 33, 33)
                .addComponent(SaveJETStock)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        jButton7.setText("Home");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        TreasuryStockPracticeProblemsButton.setText("Treasury Stock Practice Problems");
        TreasuryStockPracticeProblemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreasuryStockPracticeProblemsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TStockPaneLayout = new javax.swing.GroupLayout(TStockPane);
        TStockPane.setLayout(TStockPaneLayout);
        TStockPaneLayout.setHorizontalGroup(
            TStockPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TStockPaneLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TStockPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TStockPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane49, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
                    .addGroup(TStockPaneLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(TreasuryStockPracticeProblemsButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        TStockPaneLayout.setVerticalGroup(
            TStockPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TStockPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(TStockPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(TreasuryStockPracticeProblemsButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel.add(TStockPane, "card20");

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(0, 255, 255));

        jLabel108.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel108.setText("Required Inputs");

        jLabel111.setText("Fair Value of Asset: ");

        jLabel112.setText("A/D on Asset:");

        jLabel113.setText("Cash Paid/Recieved (if any):");

        jLabel114.setText("Asset given up (at cost):");

        CommercialSubstanceCheck.setText("Commercial Substance");

        jLabel115.setText("List Price of new Machine:");

        GenerateJENonMonetaryExchanges.setText("Generate JE");
        GenerateJENonMonetaryExchanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJENonMonetaryExchangesActionPerformed(evt);
            }
        });

        ResetButtonNonMonExchanges.setText("Reset");

        SaveJENonMonExchange.setText("Save JE");

        jLabel116.setText("This Section is Not complete please do not use.");

        jButton25.setText("Back");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ResetButtonNonMonExchanges, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel111, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                            .addComponent(jLabel115)
                            .addComponent(SaveJENonMonExchange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FairValueInput)
                            .addComponent(ADInput)
                            .addComponent(CashInput)
                            .addComponent(AssetCostInput)
                            .addComponent(ListPriceInput, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GenerateJENonMonetaryExchanges)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(CommercialSubstanceCheck)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(jButton25))
                .addGap(36, 36, 36)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(FairValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(CashInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssetCostInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(ListPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(CommercialSubstanceCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateJENonMonetaryExchanges)
                    .addComponent(ResetButtonNonMonExchanges))
                .addGap(30, 30, 30)
                .addComponent(SaveJENonMonExchange)
                .addGap(102, 102, 102))
        );

        ExchangesJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane52.setViewportView(ExchangesJETable);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane52, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NonMonetaryExchangePanelLayout = new javax.swing.GroupLayout(NonMonetaryExchangePanel);
        NonMonetaryExchangePanel.setLayout(NonMonetaryExchangePanelLayout);
        NonMonetaryExchangePanelLayout.setHorizontalGroup(
            NonMonetaryExchangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NonMonetaryExchangePanelLayout.setVerticalGroup(
            NonMonetaryExchangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(NonMonetaryExchangePanel, "card21");

        jPanel20.setBackground(new java.awt.Color(0, 255, 255));

        jLabel118.setText(" Inputs");

        jLabel119.setText("Service Cost");

        jLabel120.setText("Settlement Rate");

        jLabel121.setText("Actual Return on plan assets");

        jLabel122.setText("Amortization of PSC");

        jLabel123.setText("Annual funding contributions");

        jLabel124.setText("Benefits paid to retirees");

        jLabel125.setText("Changes in Actuarial Assumption");

        jLabel126.setText("Beginning PBO");

        jLabel127.setText("Beginning Plan Assets");

        jLabel128.setText("Expected Return on plan assets");

        GenerateJEPensions.setText("Generate");
        GenerateJEPensions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateJEPensionsActionPerformed(evt);
            }
        });

        ResetPensions.setText("Reset");
        ResetPensions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetPensionsActionPerformed(evt);
            }
        });

        SavePensions.setText("SaveJE");

        jLabel129.setText("Prior Service Benefits (if any):");

        EducationalPensionButton.setText("Educational Pension Problems");
        EducationalPensionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationalPensionButtonActionPerformed(evt);
            }
        });

        jButton10.setText("Home");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel127)
                            .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel124, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BenefitsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ActuaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BeginPBOInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BeginPlanAssets, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ExpectReturnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addComponent(jLabel123)
                                    .addGap(18, 18, 18)
                                    .addComponent(FundingContributionsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ServiceCostInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SettlementRateInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PSCAmortInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ActualReturnPlanAssetsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EducationalPensionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(GenerateJEPensions, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(ResetPensions, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PriorServiceBenefitsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(SavePensions, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel118)
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServiceCostInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(SettlementRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(ActualReturnPlanAssetsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122)
                    .addComponent(PSCAmortInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(FundingContributionsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(BenefitsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(ActuaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(BeginPBOInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(BeginPlanAssets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(ExpectReturnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(PriorServiceBenefitsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateJEPensions)
                    .addComponent(ResetPensions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SavePensions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EducationalPensionButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PensionPlanningTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items", "Annual Pension Expense", "Cash", "PSC", "Gains/Losses", "Pension Asset/Liab", "PBO", "Plan Assets"
            }
        ));
        jScrollPane53.setViewportView(PensionPlanningTable);

        PensionJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane54.setViewportView(PensionJETable);

        javax.swing.GroupLayout PensionPlanningPanelLayout = new javax.swing.GroupLayout(PensionPlanningPanel);
        PensionPlanningPanel.setLayout(PensionPlanningPanelLayout);
        PensionPlanningPanelLayout.setHorizontalGroup(
            PensionPlanningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PensionPlanningPanelLayout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PensionPlanningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PensionPlanningPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane53))
                    .addGroup(PensionPlanningPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 168, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PensionPlanningPanelLayout.setVerticalGroup(
            PensionPlanningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PensionPlanningPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        Panel.add(PensionPlanningPanel, "card22");

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jPanel23.setBackground(new java.awt.Color(51, 255, 255));

        jLabel130.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("Inputs");

        FinanceLeaseCheck.setText("Finance Lease");

        OperatingLeaseCheck.setText("Operating Lease");

        jLabel131.setText("Payments");

        AnnualPaymentsInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnualPaymentsInputActionPerformed(evt);
            }
        });

        jLabel132.setText("Length of Lease");

        jLabel133.setText("Residual Value (if any)  ");

        jLabel134.setText("Implicit Rate (if known)");

        GenerateTablesLeases.setText("Generate Tables");
        GenerateTablesLeases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateTablesLeasesActionPerformed(evt);
            }
        });

        ResetButtonLeases.setText("Reset");
        ResetButtonLeases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonLeasesActionPerformed(evt);
            }
        });

        jLabel136.setText("Present Value of Payments");

        SalesTypeLeaseCheck.setText("Sales Type Lease (Lessor)");

        jLabel137.setText("Cost to the dealer:");

        HomeButtonLeases.setText("Home");
        HomeButtonLeases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonLeasesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel132))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AnnualPaymentsInput)
                            .addComponent(YearsLeaseInput, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(GenerateTablesLeases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(FinanceLeaseCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel136))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(OperatingLeaseCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ImplicitRateInput)
                                    .addComponent(ResidualValueInput))
                                .addGap(82, 82, 82))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(ResetButtonLeases, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CostToDealerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PresentValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(SalesTypeLeaseCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(HomeButtonLeases, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel130)
                .addGap(27, 27, 27)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FinanceLeaseCheck)
                    .addComponent(OperatingLeaseCheck))
                .addGap(11, 11, 11)
                .addComponent(SalesTypeLeaseCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(AnnualPaymentsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel132)
                    .addComponent(YearsLeaseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(ResidualValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(ImplicitRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(PresentValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CostToDealerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel137))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateTablesLeases)
                    .addComponent(ResetButtonLeases))
                .addGap(18, 18, 18)
                .addComponent(HomeButtonLeases)
                .addGap(34, 34, 34))
        );

        AmortTableLeases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Period", "Lease Payment", "Interest", "Liability/Asset", "Lease Value"
            }
        ));
        jScrollPane55.setViewportView(AmortTableLeases);

        LeasesJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year ", "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane56.setViewportView(LeasesJETable);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LeasesPanelLayout = new javax.swing.GroupLayout(LeasesPanel);
        LeasesPanel.setLayout(LeasesPanelLayout);
        LeasesPanelLayout.setHorizontalGroup(
            LeasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeasesPanelLayout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LeasesPanelLayout.setVerticalGroup(
            LeasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(LeasesPanel, "card23");

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        jLabel139.setText("Financial Accounting LIFO FIFO Problems");

        GenerateProblemInventory.setText("Generate a Problem");
        GenerateProblemInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateProblemInventoryActionPerformed(evt);
            }
        });

        AnswerTableInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane57.setViewportView(AnswerTableInventory);

        ProblemArea.setEditable(false);
        ProblemArea.setColumns(20);
        ProblemArea.setRows(5);
        jScrollPane58.setViewportView(ProblemArea);

        jButton11.setText("Home");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Check Answer");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel140.setText("Generated Question:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Put answers in the form of journal entries in the table\nto the right, or enter the ending balances of the\nfollowing accounts, assuming the balance at the\nbeginning of the period is zero\n");
        jScrollPane59.setViewportView(jTextArea1);

        jLabel141.setText("Cost of Goods Sold:");

        jLabel142.setText("Inventory");

        jLabel143.setText("Accounts Recievable");

        jLabel144.setText("Accounts Payable:");

        jLabel145.setText("Sales Revenue:");

        OutputAnswer.setEditable(false);
        OutputAnswer.setColumns(20);
        OutputAnswer.setRows(5);
        jScrollPane60.setViewportView(OutputAnswer);

        jLabel146.setText("Output:");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane59))
                    .addComponent(jScrollPane58)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(InventoryInput))
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel144, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel143, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel25Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(AccountsPayableInput, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel25Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(AccountsReceivableInput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel25Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(COGSInput, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SalesRevenueInput, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 239, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(GenerateProblemInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel139)
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GenerateProblemInventory)
                    .addComponent(jLabel140))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145)
                    .addComponent(SalesRevenueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel144)
                    .addComponent(AccountsPayableInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel143)
                    .addComponent(AccountsReceivableInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel142)
                    .addComponent(InventoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COGSInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel141))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(20, 20, 20))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton12)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel146)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EducationalInventoryLayout = new javax.swing.GroupLayout(EducationalInventory);
        EducationalInventory.setLayout(EducationalInventoryLayout);
        EducationalInventoryLayout.setHorizontalGroup(
            EducationalInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EducationalInventoryLayout.setVerticalGroup(
            EducationalInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EducationalInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel.add(EducationalInventory, "card25");

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jLabel147.setText("WASO Practice Problems");

        jButton13.setText("Home");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        GenerateProblemWASO.setText("Generate Problem");
        GenerateProblemWASO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateProblemWASOActionPerformed(evt);
            }
        });

        jLabel148.setText("Final Calculated WASO:");

        WASOProblemField.setEditable(false);
        WASOProblemField.setColumns(20);
        WASOProblemField.setRows(5);
        jScrollPane61.setViewportView(WASOProblemField);

        jLabel149.setText("Output:");

        WASOProblemOutput.setEditable(false);
        WASOProblemOutput.setColumns(20);
        WASOProblemOutput.setRows(5);
        jScrollPane62.setViewportView(WASOProblemOutput);

        jButton14.setText("Check Answer");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WASOAnswerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane62, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GenerateProblemWASO, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton14)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel147)
                    .addComponent(jButton13)
                    .addComponent(GenerateProblemWASO)
                    .addComponent(jButton14))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane61, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WASOAnswerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel149)
                            .addComponent(jLabel148))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );

        javax.swing.GroupLayout EducationalWASOLayout = new javax.swing.GroupLayout(EducationalWASO);
        EducationalWASO.setLayout(EducationalWASOLayout);
        EducationalWASOLayout.setHorizontalGroup(
            EducationalWASOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EducationalWASOLayout.setVerticalGroup(
            EducationalWASOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(EducationalWASO, "card26");

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jLabel150.setText("Pension Questions");

        QuestionAreaPensions.setEditable(false);
        QuestionAreaPensions.setColumns(20);
        QuestionAreaPensions.setRows(5);
        jScrollPane63.setViewportView(QuestionAreaPensions);

        GenerateQuestionPension.setText("Generate Question");
        GenerateQuestionPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateQuestionPensionActionPerformed(evt);
            }
        });

        PensionAnswerTableEdu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Account Type", "Amount"
            }
        ));
        jScrollPane64.setViewportView(PensionAnswerTableEdu);

        CheckAnswersPension.setText("Check Answer");
        CheckAnswersPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAnswersPensionActionPerformed(evt);
            }
        });

        jButton15.setText("Home");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel151.setText("Accumulated OCI:");

        jLabel152.setText("Pension Asset:");

        jLabel153.setText("Pension Liability:");

        jLabel154.setText("Cash:");

        jLabel155.setText("Pension Expense:");

        AccumulatedOCICheckAnswerInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        PensionAssetCheckAnswerInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        PensionAssetCheckAnswerInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PensionAssetCheckAnswerInputActionPerformed(evt);
            }
        });

        PensionLiabilityCheckAnswerInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        CashAnswerCheckInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        PensionExpenseCheckAnswerInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        OutputAreaPension.setColumns(20);
        OutputAreaPension.setRows(5);
        jScrollPane65.setViewportView(OutputAreaPension);

        jLabel156.setText("Output");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(GenerateQuestionPension, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(CheckAnswersPension, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(322, 322, 322))))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel151, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(jLabel152, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AccumulatedOCICheckAnswerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PensionAssetCheckAnswerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PensionLiabilityCheckAnswerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CashAnswerCheckInput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PensionExpenseCheckAnswerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel150)
                .addGap(7, 7, 7)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(CheckAnswersPension)
                    .addComponent(GenerateQuestionPension))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel151)
                            .addComponent(AccumulatedOCICheckAnswerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel152)
                            .addComponent(PensionAssetCheckAnswerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel153)
                                    .addComponent(PensionLiabilityCheckAnswerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel154)
                                    .addComponent(CashAnswerCheckInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel155)
                                    .addComponent(PensionExpenseCheckAnswerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel156)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))))
                .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout EducationalPensionPanelLayout = new javax.swing.GroupLayout(EducationalPensionPanel);
        EducationalPensionPanel.setLayout(EducationalPensionPanelLayout);
        EducationalPensionPanelLayout.setHorizontalGroup(
            EducationalPensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EducationalPensionPanelLayout.setVerticalGroup(
            EducationalPensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(EducationalPensionPanel, "card27");

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel158.setText("Diluted EPS Problem Generator");

        jButton17.setText("Home");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        GenerateEPSProblemButton.setText("Generate EPS Problem");
        GenerateEPSProblemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateEPSProblemButtonActionPerformed(evt);
            }
        });

        EPSProblemField.setEditable(false);
        EPSProblemField.setColumns(20);
        EPSProblemField.setRows(5);
        jScrollPane66.setViewportView(EPSProblemField);

        CheckAnswerButtonDilutedEPS.setText("Check Answer");
        CheckAnswerButtonDilutedEPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAnswerButtonDilutedEPSActionPerformed(evt);
            }
        });

        jLabel159.setText("Basic EPS:");

        jLabel160.setText("Diluted EPS: ");

        OutputDilutedEPSCheckAnswer.setColumns(20);
        OutputDilutedEPSCheckAnswer.setRows(5);
        jScrollPane67.setViewportView(OutputDilutedEPSCheckAnswer);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane66)
                .addContainerGap())
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(GenerateEPSProblemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(CheckAnswerButtonDilutedEPS))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel160, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jLabel159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BasicEPSCheckerInput)
                            .addComponent(DilutedEPSCheckerInput, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel158)
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(GenerateEPSProblemButton)
                    .addComponent(CheckAnswerButtonDilutedEPS))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel159)
                            .addComponent(BasicEPSCheckerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel160)
                            .addComponent(DilutedEPSCheckerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EducationalDilutedEPSPanelLayout = new javax.swing.GroupLayout(EducationalDilutedEPSPanel);
        EducationalDilutedEPSPanel.setLayout(EducationalDilutedEPSPanelLayout);
        EducationalDilutedEPSPanelLayout.setHorizontalGroup(
            EducationalDilutedEPSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EducationalDilutedEPSPanelLayout.setVerticalGroup(
            EducationalDilutedEPSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(EducationalDilutedEPSPanel, "card28");

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel161.setText("Treasury Stock Practice Problems ");

        jButton19.setText("Home");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        GenerateEducationalTStockProblem.setText("Generate Problem");
        GenerateEducationalTStockProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateEducationalTStockProblemActionPerformed(evt);
            }
        });

        ProblemFieldTStocks.setEditable(false);
        ProblemFieldTStocks.setColumns(20);
        ProblemFieldTStocks.setRows(5);
        jScrollPane68.setViewportView(ProblemFieldTStocks);

        TStockEducationalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane69.setViewportView(TStockEducationalTable);

        CheckAnswerTStockProblems.setText("Check Answer");
        CheckAnswerTStockProblems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAnswerTStockProblemsActionPerformed(evt);
            }
        });

        OutputTextAreaTStocks.setColumns(20);
        OutputTextAreaTStocks.setRows(5);
        jScrollPane70.setViewportView(OutputTextAreaTStocks);

        jLabel162.setText("Output:");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane70, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(372, 372, 372)
                                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(GenerateEducationalTStockProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(CheckAnswerTStockProblems, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel161)
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(GenerateEducationalTStockProblem)
                    .addComponent(CheckAnswerTStockProblems))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel162)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane70, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout EducationalTStockPracticeProblemsLayout = new javax.swing.GroupLayout(EducationalTStockPracticeProblems);
        EducationalTStockPracticeProblems.setLayout(EducationalTStockPracticeProblemsLayout);
        EducationalTStockPracticeProblemsLayout.setHorizontalGroup(
            EducationalTStockPracticeProblemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EducationalTStockPracticeProblemsLayout.setVerticalGroup(
            EducationalTStockPracticeProblemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(EducationalTStockPracticeProblems, "card29");

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setText("Invoices Practice Problems");

        jButton18.setText("Home");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton20.setText("Generate Problem");

        jButton21.setText("Check Answer");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane71.setViewportView(jTextArea2);

        InvoicesInputCheckTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane72.setViewportView(InvoicesInputCheckTable);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton20)
                        .addGap(29, 29, 29)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(468, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton20)
                    .addComponent(jButton21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout EducationalInvoicePracticeLayout = new javax.swing.GroupLayout(EducationalInvoicePractice);
        EducationalInvoicePractice.setLayout(EducationalInvoicePracticeLayout);
        EducationalInvoicePracticeLayout.setHorizontalGroup(
            EducationalInvoicePracticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EducationalInvoicePracticeLayout.setVerticalGroup(
            EducationalInvoicePracticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(EducationalInvoicePractice, "card30");

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel163.setText("Sales Recourses");

        jPanel32.setBackground(new java.awt.Color(0, 255, 255));

        jLabel164.setText("Required Inputs");

        jLabel165.setText("Factoring Amount");

        jLabel166.setText("Finance Charge (percentage):");

        jLabel167.setText("Reserves Retained (percentage):");

        jButton22.setText("Generate JE");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        ResetButtonSalesRecourses.setText("Reset");
        ResetButtonSalesRecourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonSalesRecoursesActionPerformed(evt);
            }
        });

        RecourseCheckMark.setText("Recourse");

        WithoutRecourseCheckMark.setText("Without Recourse");

        jLabel168.setText("Fair Value of Recourse Liability (for Recourse Transactions):");

        jButton24.setText("Educational Receivable Problems");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton23.setText("Back");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(jLabel166)
                                .addGap(18, 18, 18)
                                .addComponent(FinanceChargeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel167))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel32Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(ResetButtonSalesRecourses, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(RetainedReservesInput)))))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FactoringAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(122, 122, 122))
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(RecourseCheckMark, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(WithoutRecourseCheckMark, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel168)
                        .addGap(18, 18, 18)
                        .addComponent(RecourseLiabilityInput)))
                .addContainerGap())
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel164)
                    .addComponent(jButton23))
                .addGap(31, 31, 31)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel165)
                    .addComponent(FactoringAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FinanceChargeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel167)
                    .addComponent(RetainedReservesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecourseCheckMark)
                    .addComponent(WithoutRecourseCheckMark))
                .addGap(33, 33, 33)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel168)
                    .addComponent(RecourseLiabilityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22)
                    .addComponent(ResetButtonSalesRecourses))
                .addGap(28, 28, 28)
                .addComponent(jButton24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RecourseJETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane73.setViewportView(RecourseJETable);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane73, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel163)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane73, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout SalesRecoursePanelLayout = new javax.swing.GroupLayout(SalesRecoursePanel);
        SalesRecoursePanel.setLayout(SalesRecoursePanelLayout);
        SalesRecoursePanelLayout.setHorizontalGroup(
            SalesRecoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesRecoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SalesRecoursePanelLayout.setVerticalGroup(
            SalesRecoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(SalesRecoursePanel, "card31");

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jLabel169.setText("Receivable Exchange Practice Problems");

        HomeButtonRecourseEDU.setText("Home");
        HomeButtonRecourseEDU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonRecourseEDUActionPerformed(evt);
            }
        });

        GenerateProblemRecourseEDU.setText("Generate Problem");
        GenerateProblemRecourseEDU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateProblemRecourseEDUActionPerformed(evt);
            }
        });

        CheckAnswerRecourseEDU.setText("Check Answer");
        CheckAnswerRecourseEDU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAnswerRecourseEDUActionPerformed(evt);
            }
        });

        RecoursesQuestionArea.setColumns(20);
        RecoursesQuestionArea.setRows(5);
        jScrollPane74.setViewportView(RecoursesQuestionArea);

        AnswerInputTableRecourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Debit/Credit", "Type", "Amount"
            }
        ));
        jScrollPane75.setViewportView(AnswerInputTableRecourses);

        OutputReceivableExchange.setColumns(20);
        OutputReceivableExchange.setRows(5);
        jScrollPane76.setViewportView(OutputReceivableExchange);

        jLabel170.setText("Output:");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addComponent(HomeButtonRecourseEDU, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(GenerateProblemRecourseEDU)
                                .addGap(29, 29, 29)
                                .addComponent(CheckAnswerRecourseEDU, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGap(434, 434, 434)
                                .addComponent(jLabel169)))
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel33Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jScrollPane74, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane75, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane76, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel169)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HomeButtonRecourseEDU)
                    .addComponent(GenerateProblemRecourseEDU)
                    .addComponent(CheckAnswerRecourseEDU))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane74, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane75, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel170))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout RecourseEDULayout = new javax.swing.GroupLayout(RecourseEDU);
        RecourseEDU.setLayout(RecourseEDULayout);
        RecourseEDULayout.setHorizontalGroup(
            RecourseEDULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RecourseEDULayout.setVerticalGroup(
            RecourseEDULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(RecourseEDU, "card32");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        HomeJPanel.setVisible(false);
        landingJPanel.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
        DollarDebit.setText("");
        DollarCredit.setText("");
        Debitarea.setText("");
         Creditarea.setText("");
        CashSpent.setText("");
        CompanyName.setText("");
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void SaveJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJEActionPerformed
        // TODO add your handling code here:
         String Debit = Debitarea.getText();
    String Credit = Creditarea.getText();
    String Debitval = DollarDebit.getText();
    String Creditval = DollarCredit.getText();
    String Desc = DescriptionBasic.getText();
    String Date = DateText.getText();
    float cash = CashAmount;
    CreateListRow(Date,Desc,Debit,CashAmount, Credit, CashAmount);
    System.out.println(Credit);
    
    if (Credit.equals(Types[0])){
        CreateTAccountRowCash(Date,Desc,0, cash);
    } else if (Debit.equals(Types[0])){
        CreateTAccountRowCash(Date,Desc,cash, 0);
    }
    if (Credit.equals(Types[1])){
        CreateTAccountRowEquipment(Date,Desc,0,cash);
    } else if (Debit.equals(Types[1])){
        
        CreateTAccountRowEquipment(Date,Desc,cash,0);
    }
    
    if (Credit.equals(Types[2])){
        CreateTAccountRowCommonStock(Date,Desc,0,cash);
        
    }else if (Debit.equals(Types[2])){
        CreateTAccountRowCommonStock(Date,Desc,cash,0);
    }
     if (Credit.equals(Types[3])){
        CreateTAccountRowInventory(Date,Desc,0,cash);
        
    }else if (Debit.equals(Types[3])){
        CreateTAccountRowInventory(Date,Desc,cash,0);
    }
     if (Credit.equals(Types[4])){
        CreateTAccountRowSupplies(Date,Desc,0,cash);
        
    }else if (Debit.equals(Types[4])){
        CreateTAccountRowSupplies(Date,Desc,cash,0);
    }
  // if (Debit.equals (Types[0])){
      
  // }
   // CreateTAccountRow(Debit, Credit,CashAmount);
    }//GEN-LAST:event_SaveJEActionPerformed

    private void DebitareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebitareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DebitareaActionPerformed

    private void CashSpentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashSpentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashSpentActionPerformed

    private void GenerateJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJEActionPerformed
        // TODO add your handling code here:
        // SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss");
        Date obj = new Date();
           
            date = obj.toString(); 
           DateText.setText(date);
           try {
        CashAmount1 = CashSpent.getText();
    CashAmount = Float.parseFloat(CashAmount1);
} catch (NumberFormatException e) {
    // One of the integer fields failed to parse. Do something to alert the user.
    //area.setText("Error: You cannot enter characters in Cash Spent area ");
} catch(Exception e){
    System.out.println("Error");
}
           
           if (AccountPayableCheckBox.isSelected()){
        Accountpayable = true;
    }
                  
           
           CashAmount = Float.parseFloat(CashAmount1);
          // Debitarea.setText(Debitarea.getText()+"\n" + date + "\n\n");
          // Creditarea.setText(Creditarea.getText()+ "Company "+ CompanyName.getText() + "\n\n");
        if (value.equals ("Equipment") && Accountpayable == false){
            Debitarea.setText(Debitarea.getText()+ "Equipment");
            DollarDebit.setText(DollarDebit.getText()+ CashAmount);
            Creditarea.setText(Creditarea.getText()+ "Cash");
            DollarCredit.setText(DollarCredit.getText()+"$"+ CashAmount);
           // area.setText(area.getText() + "End" + "\n\n");
        } else if (value.equals("Equipment") && Accountpayable == true){
          Debitarea.setText(Debitarea.getText()+ "Equipment");
            DollarDebit.setText(DollarDebit.getText()+ CashAmount);
            Creditarea.setText(Creditarea.getText()+ "Accounts Payable");
            DollarCredit.setText(DollarCredit.getText()+"$"+ CashAmount);
        }
         if (value.equals ("Supplies") && Accountpayable == false){
            Debitarea.setText(Debitarea.getText()+ "Supplies" );
            DollarDebit.setText(DollarDebit.getText()+ CashAmount);
            Creditarea.setText(Creditarea.getText()+ "Cash");
            DollarCredit.setText(DollarCredit.getText()+"$"+ CashAmount);
        } else if (value.equals("Supplies") && Accountpayable == true){
         Debitarea.setText(Debitarea.getText()+ "Supplies");
            DollarDebit.setText(DollarDebit.getText()+ "$ " + CashAmount);
            Creditarea.setText(Creditarea.getText()+ "Accounts Paybale");
            DollarCredit.setText(DollarCredit.getText()+"$ "+ CashAmount);
        }
          if (value.equals ("Common Stock") && Accountpayable == false){
            Debitarea.setText(Debitarea.getText()+"Common Stock");
            DollarDebit.setText(DollarDebit.getText()+ "$ " + CashAmount);
            Creditarea.setText(Creditarea.getText()+ "Cash");
            DollarCredit.setText(DollarCredit.getText()+"$ "+ CashAmount);
        }else if (value.equals("Common Stock") && Accountpayable == true){
           Debitarea.setText(Debitarea.getText()+ "Common Stock");
            DollarDebit.setText(DollarDebit.getText()+ "$ " + CashAmount);
            Creditarea.setText(Creditarea.getText()+ "Accounts Payable");
            DollarCredit.setText(DollarCredit.getText()+"$ "+ CashAmount);
            
        }
           if (value.equals ("Inventory") && Accountpayable == false){
          Debitarea.setText(Debitarea.getText()+ "Inventory");
            DollarDebit.setText(DollarDebit.getText()+ "$" + CashAmount);
            Creditarea.setText(Creditarea.getText()+ "Cash");
            DollarCredit.setText(DollarCredit.getText()+"$ "+ CashAmount);
        }else if (value.equals("Inventory") && Accountpayable == true){
           Debitarea.setText(Debitarea.getText()+ "Inventory" );
            DollarDebit.setText(DollarDebit.getText()+ "$ " + CashAmount);
            Creditarea.setText(Creditarea.getText()+ "Accounts Payable");
            DollarCredit.setText(DollarCredit.getText()+"$"+ CashAmount);
        }
    }//GEN-LAST:event_GenerateJEActionPerformed

    private void CashOptionsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_CashOptionsValueChanged
        // TODO add your handling code here:
         if (evt.getValueIsAdjusting()){
             value =  (String) CashOptions.getSelectedValue();
         }
    }//GEN-LAST:event_CashOptionsValueChanged

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        landingJPanel.setVisible(true);
        LogTable.setVisible (false);
    }//GEN-LAST:event_BackActionPerformed

    private void BackButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton2ActionPerformed
        // TODO add your handling code here:
        landingJPanel.setVisible(true);
        TAccountsBack.setVisible(false);
    }//GEN-LAST:event_BackButton2ActionPerformed

    private void TAccountOptionsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_TAccountOptionsValueChanged
        // TODO add your handling code here:
        if (evt.getValueIsAdjusting()){
             value2 =  (String) TAccountOptions.getSelectedValue();
         }
    }//GEN-LAST:event_TAccountOptionsValueChanged

    private void ShowTAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTAccountActionPerformed
 
    ShowTAccountTest show = new ShowTAccountTest(value2);

    }//GEN-LAST:event_ShowTAccountActionPerformed

    private void TimeValueOptionValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_TimeValueOptionValueChanged
        // TODO add your handling code here:
        if (evt.getValueIsAdjusting()){
             TimeValueChoice = (String) TimeValueOption.getSelectedValue();
         }
    }//GEN-LAST:event_TimeValueOptionValueChanged

   // DefaultListModel model = new DefaultListModel();
    private void ComputeTimeValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeTimeValueActionPerformed
    
   
    }//GEN-LAST:event_ComputeTimeValueActionPerformed

    private void AnnuityOptionValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AnnuityOptionValueChanged
        // TODO add your handling code here:
         if (evt.getValueIsAdjusting()){
             AnnuityChoice = (String) AnnuityOption.getSelectedValue();
         }
    }//GEN-LAST:event_AnnuityOptionValueChanged

    private void GenerateJEInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJEInvoicesActionPerformed
        // TODO add your handling code here:
        String QtySolds;//Quantity Sold string version
        float QtySold = 0;
        String UnitPrices; // Unit Prices String version
        float UnitPriceInvoice = 0;
        float InvoicePrice;
        float SaleDiscountPrice;
        
        float Discountresult = 0;
        
        
        String CashDiscountString;
        float CashDiscount = 0;
        String DaysUntilDisocuntString;
        int DaysUntilDiscount;
        
          try {
        QtySolds = QuantityInvoices.getText();
        QtySold = Float.parseFloat(QtySolds);
} catch (NumberFormatException e) {
    
    
}   
       try {
       UnitPrices = UnitPriceInvoices.getText();
        UnitPriceInvoice = Float.parseFloat(UnitPrices);
} catch (NumberFormatException e) {
    
    
}     
        try {
        CashDiscountString = CashDiscountPercent.getText();
        CashDiscount = Float.parseFloat(CashDiscountString);
} catch (NumberFormatException e) {
    
    
}   
         try {
        DaysUntilDisocuntString = DaysTillDiscount.getText();
        DaysUntilDiscount = Integer.parseInt(DaysUntilDisocuntString);
} catch (NumberFormatException e) {
    
    
}   
         if (PaymentInDiscount.isSelected()){
             Discountperiodtaken = true;
         } else if (!PaymentInDiscount.isSelected()){
             Discountperiodtaken = false;
         }
         if (PaymentAfterDiscount.isSelected()){
              Discountperiodexpire = true;
         }else if (!PaymentAfterDiscount.isSelected()){
             Discountperiodexpire = false;
         }
         if (PaymentInDiscount.isSelected() && PaymentAfterDiscount.isSelected()){
           JOptionPane.showMessageDialog(FrameforPanel.this,"Error cannot select more than one option");
       }
         
       if (GrossMethodCheckBox.isSelected()){
           GrossMethod = true;
       }else if (!GrossMethodCheckBox.isSelected()){
           GrossMethod = false;
       }
       if (NetMethodCheckBox.isSelected()){
           NetMethod = true;
       }else  if (!NetMethodCheckBox.isSelected()){
           NetMethod = false;
       } if (GrossMethodCheckBox.isSelected() && NetMethodCheckBox.isSelected()){
           JOptionPane.showMessageDialog(FrameforPanel.this,"Error: Cannot select more than one method");
           
       }
       if (!CashDiscountPercent.equals("") && !DaysTillDiscount.equals("") && !NetPaymentDate.equals("")){
          Discountresult = (float) (CashDiscount*.01); 
         CashDiscountTaken = true;
       }
    InvoicePrice = QtySold*UnitPriceInvoice; 
        DefaultTableModel InvoicesJE = (DefaultTableModel) InvoicesJETable.getModel();
        if(GrossMethod == true && CashDiscountTaken == true && Discountperiodtaken == false){
      InvoicesJE.addRow(new Object[]{"Debit", "Accounts Receivable", InvoicePrice});
      InvoicesJE.addRow(new Object[]{"Credit", "Sales Revenue", InvoicePrice});
        } else if (GrossMethod == true && CashDiscountTaken == false && Discountperiodtaken == false){
             InvoicesJE.addRow(new Object[]{"Debit", "Accounts Receivable", InvoicePrice});
      InvoicesJE.addRow(new Object[]{"Credit", "Sales Revenue", InvoicePrice});
        } else if (GrossMethod == true && CashDiscountTaken == true && Discountperiodtaken == true){
            SaleDiscountPrice = InvoicePrice*Discountresult;
           float CashInvoicePrice = InvoicePrice - SaleDiscountPrice;
              InvoicesJE.addRow(new Object[]{"Debit", "Cash", CashInvoicePrice});
              InvoicesJE.addRow(new Object[]{"Debit", "Sales Discounts", SaleDiscountPrice});
      InvoicesJE.addRow(new Object[]{"Credit", "Accounts Receivable", InvoicePrice});
        }
        if (NetMethod == true && CashDiscountTaken == true && Discountperiodtaken == false && Discountperiodexpire == false){
            InvoicePrice -= InvoicePrice * Discountresult;
        InvoicesJE.addRow(new Object[]{"Debit", "Accounts Receivable", InvoicePrice});
      InvoicesJE.addRow(new Object[]{"Credit", "Sales Revenue", InvoicePrice});
        } else if (NetMethod == true && CashDiscountTaken == false && Discountperiodtaken == false && Discountperiodexpire == false){
              InvoicesJE.addRow(new Object[]{"Debit", "Accounts Receivable", InvoicePrice});
      InvoicesJE.addRow(new Object[]{"Credit", "Sales Revenue", InvoicePrice});
        } else if (NetMethod == true && CashDiscountTaken == true && Discountperiodtaken == true && Discountperiodexpire == false){
            InvoicePrice -= InvoicePrice * Discountresult;
        InvoicesJE.addRow(new Object[]{"Debit", "Accounts Receivable", InvoicePrice});
      InvoicesJE.addRow(new Object[]{"Credit", "Sales Revenue", InvoicePrice});
        } else if (NetMethod == true && CashDiscountTaken == true && Discountperiodtaken == false && Discountperiodexpire == true){
            float InPrice = InvoicePrice * Discountresult ;
            float InPriceAR = InvoicePrice - InPrice;
               InvoicesJE.addRow(new Object[]{"Debit", "Cash", InvoicePrice});
               InvoicesJE.addRow (new Object[] {"Credit", "Accounts Receivable", InPriceAR});
                InvoicesJE.addRow(new Object[]{"Credit", "Sales Discounts Forfeited", InPrice});
        }
          
    }//GEN-LAST:event_GenerateJEInvoicesActionPerformed
    
    private void ResetInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetInvoicesActionPerformed
        // TODO add your handling code here:
        QuantityInvoices.setText("");
        UnitPriceInvoices.setText("");
        CashDiscountPercent.setText("");
        DaysTillDiscount.setText("");
        NetPaymentDate.setText("");
        NumberofInvoices = 0;
        NumberofInvoicesCredit = 0;
        InvoiceDebit.clear();
        InvoiceCredit.clear();
        DefaultTableModel dm = (DefaultTableModel) InvoicesJETable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
    }//GEN-LAST:event_ResetInvoicesActionPerformed

    private void SaveJEInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJEInvoicesActionPerformed
        // TODO add your handling code here:
        String InvoiceDebit1;
        String InvoiceDebit2;
        String InvoiceCredit1;
       // int n = 0;
       
    String Description = "";
//    if (Discountperiodtaken == true){
//    Description = CashDiscountPercent.getText() + "%/ " + DaysTillDiscount.getText() + " Net " + NetPaymentDate.getText() + "Discount taken " + DescriptionInvoices.getText();
//    } else if (Discountperiodexpire == true){
//         Description = CashDiscountPercent.getText() + "%/ " + DaysTillDiscount.getText() + "Net " + NetPaymentDate.getText() + "Discount not taken " + DescriptionInvoices.getText();
//    }
        
       for (int i =0; i < InvoicesJETable.getRowCount(); i++){
        if (InvoicesJETable.getValueAt(i,0).equals ("Debit")){
            
            InvoiceDebit.add (Float.parseFloat(InvoicesJETable.getValueAt(i,2).toString()));
            
           // System.out.println(n);
           // System.out.println("Working");
            System.out.println(InvoicesJETable.getValueAt(i,2));
//            System.out.println(InvoiceDebit.get(i));
            switch (InvoicesJETable.getValueAt(i,1).toString()) {
                case "Accounts Receivable":
                    // System.out.println("Working");
                    
                    CreateTAccountRowAccountsRecievable("Date",Description, InvoiceDebit.get(NumberofInvoices), 0); //Number of invoices = the number of debits in the Journal Entry
                    NumberofInvoices++;
                    break;
                case "Cash":
                    CreateTAccountRowCash("Date",Description, InvoiceDebit.get(NumberofInvoices), 0);
                    NumberofInvoices++;
                    break;
                case "Sales Discounts":
                    CreateTAccountRowSalesDiscount("Date",Description, InvoiceDebit.get(NumberofInvoices),0);
                    NumberofInvoices++;
                    break;
                default:
                    break;
            }
            
        }
        if (InvoicesJETable.getValueAt(i,0).equals("Credit")){
            InvoiceCredit.add(Float.parseFloat(InvoicesJETable.getValueAt(i,2).toString()));
            
           switch (InvoicesJETable.getValueAt(i,1).toString()){
               case "Accounts Receivable":
               
              CreateTAccountRowAccountsRecievable("Date",Description,0, InvoiceCredit.get(NumberofInvoicesCredit));
              NumberofInvoicesCredit++;
              break;
              
               case "Sales Discounts Forefeited":
                CreateTAccountRowSalesDiscountsForefeited ("Date",Description, 0 , InvoiceCredit.get(NumberofInvoicesCredit));
                NumberofInvoicesCredit++;
                break;
            
           case "Sales Revenue":
                CreateTAccountRowSalesRevenue("Date",Description, 0, InvoiceCredit.get(NumberofInvoicesCredit));
                NumberofInvoicesCredit++;
                break;
           default: 
               break;
            }
       }
        
       }
       InvoiceDebit.clear();
        InvoiceCredit.clear();
        NumberofInvoices=0;
        NumberofInvoicesCredit =0;
         DefaultTableModel dm = (DefaultTableModel) InvoicesJETable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
       
    }//GEN-LAST:event_SaveJEInvoicesActionPerformed

    private void GrossMethodCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrossMethodCheckBoxActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_GrossMethodCheckBoxActionPerformed

    private void NetMethodCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetMethodCheckBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_NetMethodCheckBoxActionPerformed

    private void AccountPayableCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountPayableCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountPayableCheckBoxActionPerformed

    private void AccountPayableCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AccountPayableCheckBoxStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountPayableCheckBoxStateChanged

    private void PaymentAfterDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentAfterDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentAfterDiscountActionPerformed

    private void BackButtonInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonInvoicesActionPerformed
        // TODO add your handling code here:
        InvoicesPanel.setVisible(false);
        landingJPanel.setVisible (true);
    }//GEN-LAST:event_BackButtonInvoicesActionPerformed

    private void AllowanceAmountInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllowanceAmountInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AllowanceAmountInputActionPerformed

    private void GenerateJESalesReturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJESalesReturnsActionPerformed
      boolean Estimate = false;
      boolean GrantedAllowance = false;
        
      String AllowanceAmountString;
      float AllowanceAmount = 0;
      
          try {
        AllowanceAmountString = AllowanceAmountInput.getText();
        AllowanceAmount = Float.parseFloat(AllowanceAmountString);
} catch (NumberFormatException e) {
    
    
}   
          DefaultTableModel AllowanceJE = (DefaultTableModel) AllowanceJETable.getModel();
        if (EstimateSalesReturns.isSelected()){
          Estimate = true;
      } else if (!EstimateSalesReturns.isSelected()){
          Estimate = false;
      }
        if (GrantedAllowanceSalesReturns.isSelected()){
            GrantedAllowance = true;
        }else if (!GrantedAllowanceSalesReturns.isSelected()){
            GrantedAllowance = false;
        }
        if (GrantedAllowanceSalesReturns.isSelected() && EstimateSalesReturns.isSelected()){
            JOptionPane.showMessageDialog(FrameforPanel.this,"Error cannot select more than one option");
        }
        
       if (Estimate == true){
           AllowanceJE.addRow(new Object[]{"Debit", "Sales Returns & Allowances", AllowanceAmount});
      AllowanceJE.addRow(new Object[]{"Credit", "Allowance for Sales Returns & Allowances", AllowanceAmount});
       } else if (GrantedAllowance == true){
           AllowanceJE.addRow(new Object[]{"Debit", "Sales Returns & Allowances", AllowanceAmount});
      AllowanceJE.addRow(new Object[]{"Credit", "Accounts Receivable", AllowanceAmount});
       }
        
    }//GEN-LAST:event_GenerateJESalesReturnsActionPerformed

    private void SaveJESalesReturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJESalesReturnsActionPerformed
         String Description;
        
         Description = DescriptionSalesReturns.getText();
        for (int i =0; i < AllowanceJETable.getRowCount(); i++){
        if (AllowanceJETable.getValueAt(i,0).equals ("Debit")){
            
            SalesReturnsDebit.add (Float.parseFloat(AllowanceJETable.getValueAt(i,2).toString()));
            
           // System.out.println(n);
           // System.out.println("Working");
            System.out.println(AllowanceJETable.getValueAt(i,2));
//            System.out.println(InvoiceDebit.get(i));
            switch (AllowanceJETable.getValueAt(i,1).toString()) {
                case "Sales Returns & Allowances":
                    // System.out.println("Working");
                    
                    CreateTAccountRowSalesReturnsAndAllowances("Date",Description, SalesReturnsDebit.get(NumberofAllowancesDebit), 0); //Number of invoices = the number of debits in the Journal Entry
                    NumberofAllowancesDebit++;
                  break;
                default:
                    break;
            }
            
        }
        if (AllowanceJETable.getValueAt(i,0).equals("Credit")){
            SalesReturnsCredit.add(Float.parseFloat(AllowanceJETable.getValueAt(i,2).toString()));
            
           switch (AllowanceJETable.getValueAt(i,1).toString()){
               case "Accounts Receivable":
               
              CreateTAccountRowAccountsRecievable("Date",Description, 0, SalesReturnsCredit.get(NumberofAllowancesCredit));
              NumberofAllowancesCredit++;
              break;
              
               case "Allowance for Sales Returns & Allowances":
                CreateTAccountRowAllowanceForSalesReturnsAndAllowances("Date", Description, 0 , SalesReturnsCredit.get(NumberofInvoicesCredit));
                NumberofAllowancesCredit++;
                break;
            
          
           default: 
               break;
            }
       }
        
       }
        
       InvoiceDebit.clear();
        InvoiceCredit.clear();
        NumberofAllowancesDebit=0;
        NumberofAllowancesCredit =0;
         DefaultTableModel dm = (DefaultTableModel) AllowanceJETable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
    }//GEN-LAST:event_SaveJESalesReturnsActionPerformed

    private void BackButtonSalesReturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonSalesReturnsActionPerformed
        landingJPanel.setVisible(true);
        SalesReturnsAndAllowancesPanel.setVisible(false);
    }//GEN-LAST:event_BackButtonSalesReturnsActionPerformed

    private void BackButtonUncollectibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonUncollectibleActionPerformed
       landingJPanel.setVisible (true);
       WriteOffPanel.setVisible (false);
    }//GEN-LAST:event_BackButtonUncollectibleActionPerformed

    private void DirectWriteOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectWriteOffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DirectWriteOffActionPerformed

    private void GenerateJEButtonUncollectibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJEButtonUncollectibleActionPerformed
        
        boolean DirectWriteOffbool = false;
        boolean EstimatedUncollectiblesbool = false;
        boolean Recovery = false;
        boolean WriteOffAllowanceAccountbool = false;
        
        String AmountUncollectedString;
        float AmountUncollectedfl = 0;
        
        
          try {
        AmountUncollectedString = AmountUncollected.getText();
        AmountUncollectedfl = Float.parseFloat(AmountUncollectedString);
} catch (NumberFormatException e) {
    
    
}   
        
         if (DirectWriteOff.isSelected()){
          DirectWriteOffbool = true;
      } else if (!DirectWriteOff.isSelected()){
          DirectWriteOffbool = false;
      }
        if (EstimatedUncollectibles.isSelected()){
            EstimatedUncollectiblesbool = true;
        }else if (!GrantedAllowanceSalesReturns.isSelected()){
              EstimatedUncollectiblesbool = false;
        }
        
         if (WriteOffAllowanceAccount.isSelected()){
            WriteOffAllowanceAccountbool = true;
        }else if (!WriteOffAllowanceAccount.isSelected()){
             WriteOffAllowanceAccountbool = false;
        }
          if (RecoveryOfUncollectibleAccount.isSelected()){
            Recovery = true;
        }else if (!RecoveryOfUncollectibleAccount.isSelected()){
              Recovery = false;
        }
          if (EstimatedUncollectiblesbool == true &&  WriteOffAllowanceAccountbool == true 
                  ||EstimatedUncollectiblesbool == true &&  Recovery == true
                  ||EstimatedUncollectiblesbool == true &&  DirectWriteOffbool == true 
                  ||Recovery == true &&  WriteOffAllowanceAccountbool == true 
                  ||Recovery == true &&  EstimatedUncollectiblesbool== true
                  ||Recovery == true &&  DirectWriteOffbool == true
                  ||DirectWriteOffbool == true &&  WriteOffAllowanceAccountbool == true 
                  ||DirectWriteOffbool== true &&  EstimatedUncollectiblesbool== true
                  ||DirectWriteOffbool== true &&  Recovery == true
                  ||WriteOffAllowanceAccountbool == true &&  DirectWriteOffbool == true 
                  ||WriteOffAllowanceAccountbool== true &&  EstimatedUncollectiblesbool== true
                  ||WriteOffAllowanceAccountbool== true &&  Recovery == true){
              JOptionPane.showMessageDialog(FrameforPanel.this,"Error: Cannot select more than one method");
               DirectWriteOffbool = false;
        EstimatedUncollectiblesbool = false;
         Recovery = false;
        WriteOffAllowanceAccountbool = false;
          }
          
          
        DefaultTableModel UncollectibleJE = (DefaultTableModel) UncollectibleJETable.getModel();
        if(DirectWriteOffbool == true){
     UncollectibleJE.addRow(new Object[]{"Debit", "Bad Debt Expense", AmountUncollectedfl});
      UncollectibleJE.addRow(new Object[]{"Credit", "Accounts Receivable", AmountUncollectedfl});
        } else if (EstimatedUncollectiblesbool == true){
             UncollectibleJE.addRow(new Object[]{"Debit", "Bad Debt Expense", AmountUncollectedfl});
     UncollectibleJE.addRow(new Object[]{"Credit", "Allowance for Doubtful Accounts", AmountUncollectedfl});
        } else if (WriteOffAllowanceAccountbool == true){
              UncollectibleJE.addRow(new Object[]{"Debit", "Allowance for Doubtful Accounts",AmountUncollectedfl });
              UncollectibleJE.addRow(new Object[]{"Credit", "Accounts Receivable", AmountUncollectedfl});
      
        }else if (Recovery == true){
            UncollectibleJE.addRow(new Object[]{"Debit", "Accounts Receivable",AmountUncollectedfl });
              UncollectibleJE.addRow(new Object[]{"Credit", "Allowance for Doubtful Accounts", AmountUncollectedfl});
               UncollectibleJE.addRow(new Object[]{"Debit", "Cash", AmountUncollectedfl});
              UncollectibleJE.addRow(new Object[]{"Credit", "Allowance for Doubtful Accounts", AmountUncollectedfl});
        }
    }//GEN-LAST:event_GenerateJEButtonUncollectibleActionPerformed

    private void SaveJEButtonUncollectibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJEButtonUncollectibleActionPerformed
        String Description = "";
        
        for (int i =0; i < UncollectibleJETable.getRowCount(); i++){
        if (UncollectibleJETable.getValueAt(i,0).equals ("Debit")){
            
            UncollectiblesDebit.add (Float.parseFloat(UncollectibleJETable.getValueAt(i,2).toString()));
            
           
            switch (UncollectibleJETable.getValueAt(i,1).toString()) {
                case "Accounts Receivable":
                    // System.out.println("Working");
                    
                    CreateTAccountRowAccountsRecievable("Date",Description, UncollectiblesDebit.get(NumberofUncollectiblesDebit), 0); //Number of invoices = the number of debits in the Journal Entry
                    NumberofUncollectiblesDebit++;
                    break;
                case "Cash":
                    CreateTAccountRowCash("Date",Description, UncollectiblesDebit.get(NumberofUncollectiblesDebit), 0);
                    NumberofUncollectiblesDebit++;
                    break;
                case "Bad Debt Expense":
                    CreateTAccountRowBadDebtExpense("Date",Description, UncollectiblesDebit.get(NumberofUncollectiblesDebit),0);
                    NumberofUncollectiblesDebit++;
                    break;
                case "Allowance for Doubtful Accounts":
                    CreateTAccountRowAllowanceforDoubtfulAccounts("Date",Description, UncollectiblesDebit.get(NumberofUncollectiblesDebit),0);
                    NumberofUncollectiblesDebit++;
                    break;
                
                default:
                    break;
            }
            
        }
        if (UncollectibleJETable.getValueAt(i,0).equals("Credit")){
            UncollectiblesCredit.add(Float.parseFloat(UncollectibleJETable.getValueAt(i,2).toString()));
            
           switch (UncollectibleJETable.getValueAt(i,1).toString()){
               case "Accounts Receivable":
               
              CreateTAccountRowAccountsRecievable("Date",Description,0, UncollectiblesCredit.get(NumberofUncollectiblesCredit));
              NumberofUncollectiblesCredit++;
              break;
              
               case "Allowance for Doubtful Accounts":
               CreateTAccountRowAllowanceforDoubtfulAccounts("Date",Description, 0 , UncollectiblesCredit.get(NumberofUncollectiblesCredit));
                NumberofUncollectiblesCredit++;
                break;
           default: 
               break;
            }
       }
        
       }
       UncollectiblesDebit.clear();
        UncollectiblesCredit.clear();
        NumberofUncollectiblesDebit=0;
        NumberofUncollectiblesCredit =0;
         DefaultTableModel dm = (DefaultTableModel) UncollectibleJETable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
    }//GEN-LAST:event_SaveJEButtonUncollectibleActionPerformed

    private void BackButtonNotesReceivableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonNotesReceivableActionPerformed
        landingJPanel.setVisible(true);
        NotesReceivablePanel.setVisible (false);
    }//GEN-LAST:event_BackButtonNotesReceivableActionPerformed

    private void GenerateJENotesReceivableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJENotesReceivableActionPerformed
        
        String MonthsAfterDateIssueString;
        float MonthsAfterDateIssuefl;
        
        String CallValueString;
        float  CallValuefl = 0;
        
        String PresentValueNoteString;
        float PresentValueNotefl = 0;
        
        String ImplicitRateString;
        float ImplicitRatefl = 0;
        
        String FaceValueNoteString;
        float FaceValueNotefl = 0;
        
        String YearsUntilMaturityString;
        int YearsUntilMaturityfl = 0;
        
        String EffectiveInterestRateString;
        float EffectiveInterestRatefl = 0;//fl stands for float
        
        float InterestRevenueTable = 0;
       
        float CashRec;
              try {
        PresentValueNoteString = PresentValueOfNoteInput.getText();
        PresentValueNotefl = Float.parseFloat(PresentValueNoteString);
} catch (NumberFormatException e) {
}   
        try {
        EffectiveInterestRateString = EffectiveInterestRateInput.getText();
        EffectiveInterestRatefl  = Float.parseFloat(EffectiveInterestRateString);
} catch (NumberFormatException e) {
}   
         try {
        ImplicitRateString = ImplicitInterestRateInput.getText();
        ImplicitRatefl = Float.parseFloat(ImplicitRateString);
} catch (NumberFormatException e) {
}   
     try {
        FaceValueNoteString = FaceValueNoteInput.getText();
        FaceValueNotefl = Float.parseFloat(FaceValueNoteString);
} catch (NumberFormatException e) {
}       
      try {
        YearsUntilMaturityString = YearsUntilMaturityInput.getText();
        YearsUntilMaturityfl = Integer.parseInt(YearsUntilMaturityString);
} catch (NumberFormatException e) {
}      
        float ratePercentImplicit;
        float ratePercentEffective;
     ratePercentImplicit = (float) (ImplicitRatefl*.01);
     ratePercentEffective = (float) (EffectiveInterestRatefl*.01);
        float InterestRev1 = ratePercentEffective*PresentValueNotefl;
       float DiscountAmortized = PresentValueNotefl*ratePercentEffective; 
        
        float DiscountDifference;
        DiscountDifference = FaceValueNotefl - PresentValueNotefl;
       float CashDifference = FaceValueNotefl - DiscountDifference;
         
        boolean NoteIssuedFaceValuebool = false;
        boolean InterestBearingNotesbool = false;
        boolean ZeroInterestBearingNotesbool = false;
        
         CashRec = FaceValueNotefl*ratePercentImplicit;
         
         
         
        if (NoteIssuedFaceValue.isSelected()){
            NoteIssuedFaceValuebool = true;
        }else if (!NoteIssuedFaceValue.isSelected()){
            NoteIssuedFaceValuebool = false;
        }
        if (InterestBearingNotes.isSelected()){
            InterestBearingNotesbool = true;
        }else if (!InterestBearingNotes.isSelected()){
            InterestBearingNotesbool = false;
        }
        
        if (ZeroInterestBearingNotes.isSelected()){
            ZeroInterestBearingNotesbool = true;
        }else if (!ZeroInterestBearingNotes.isSelected()){
            ZeroInterestBearingNotesbool = false;
        }
        
        if (ZeroInterestBearingNotesbool == true && InterestBearingNotesbool == true 
                ||ZeroInterestBearingNotesbool == true && NoteIssuedFaceValuebool == true
                ||InterestBearingNotesbool == true && NoteIssuedFaceValuebool == true
                ||InterestBearingNotesbool == true && ZeroInterestBearingNotesbool == true 
                || NoteIssuedFaceValuebool == true && ZeroInterestBearingNotesbool == true
                || NoteIssuedFaceValuebool == true && InterestBearingNotesbool == true){
         JOptionPane.showMessageDialog(FrameforPanel.this,"Error: Cannot select more than one method");
              NoteIssuedFaceValuebool = false;
         InterestBearingNotesbool = false;
         ZeroInterestBearingNotesbool = false;
        }

         DefaultTableModel NotesReceivableJE = (DefaultTableModel) NotesReceivableJETable.getModel();
           DefaultTableModel NoteDiscountAmortJE = (DefaultTableModel) NoteDiscountAmortJETable.getModel();
         if (NoteValue.equals("Issuance")){
             
         }else{
             
        if(NoteIssuedFaceValuebool == true){
     NotesReceivableJE.addRow(new Object[]{"Debit", "Notes Receivable", FaceValueNotefl});
      NotesReceivableJE.addRow(new Object[]{"Credit", "Cash", FaceValueNotefl});
      NotesReceivableJE.addRow(new Object[]{"Debit", "Interest Receivable", InterestRev1});
      NotesReceivableJE.addRow(new Object[]{"Credit", "Interest Revenue", InterestRev1});
      
        } else if (ZeroInterestBearingNotesbool == true){
             NotesReceivableJE.addRow(new Object[]{"Debit", "Notes Receivable", FaceValueNotefl});
            NotesReceivableJE.addRow(new Object[]{"Credit", "Discount on Notes Receivable", DiscountDifference});
            NotesReceivableJE.addRow(new Object[]{"Credit", "Cash", PresentValueNotefl});
         //   NotesReceivableJE.addRow(new Object[]{"", "Discount on Notes Receivable", DiscountDifference});
          //  NotesReceivableJE.addRow(new Object[]{"Credit", "Cash", PresentValueNotefl});
            
             NoteDiscountAmortJE.addRow(new Object[]{"Year 0",0,"-","-", PresentValueNotefl});
             
            for (int i = 0; i< YearsUntilMaturityfl; i++){
             
               PresentValueNotefl = PresentValueNotefl + DiscountAmortized;
           NoteDiscountAmortJE.addRow(new Object[]{"Year " + i,0,DiscountAmortized,DiscountAmortized, PresentValueNotefl});
               
                DiscountAmortized =PresentValueNotefl* ratePercentEffective; 
            }
        } else if (InterestBearingNotesbool == true){
            NotesReceivableJE.addRow(new Object[]{"Debit", "Notes Receivable", FaceValueNotefl});
            NotesReceivableJE.addRow(new Object[]{"Credit", "Discount on Notes Receivable", DiscountDifference});
              NotesReceivableJE.addRow(new Object[]{"Credit", "Cash", CashDifference});
              
             
              NoteDiscountAmortJE.addRow(new Object[]{"Year ","-","-","-", PresentValueNotefl});
              for (int i = 0; i< YearsUntilMaturityfl; i++){
           
               //PresentValueNotefl = PresentValueNotefl - DiscountAmortized;
             InterestRevenueTable =PresentValueNotefl* ratePercentEffective;
               DiscountAmortized = InterestRevenueTable - CashRec;
               PresentValueNotefl = PresentValueNotefl + DiscountAmortized;
           NoteDiscountAmortJE.addRow(new Object[]{"Year " + i, CashRec ,InterestRevenueTable,DiscountAmortized, PresentValueNotefl});
                // InterestRevenueTable =PresentValueNotefl* ratePercentEffective;
                //InterestRevenueTable =PresentValueNotefl* ratePercentEffective; 
               // DiscountAmortized = InterestRevenueTable - CashRec;
            }
              
        }
         }
    }//GEN-LAST:event_GenerateJENotesReceivableActionPerformed

    private void SaveJENotesReceivableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJENotesReceivableActionPerformed
        String Description = "";
        for (int i =0; i < NotesReceivableJETable.getRowCount(); i++){
        if (NotesReceivableJETable.getValueAt(i,0).equals ("Debit")){
            
            NotesReceivableDebit.add (Float.parseFloat(NotesReceivableJETable.getValueAt(i,2).toString()));
            
           
            switch (NotesReceivableJETable.getValueAt(i,1).toString()) {
                case "Notes Receivable":
          
                    CreateTAccountRowNotesReceivable("Date",Description, NotesReceivableDebit.get(NumberofNoteReceivableDebit), 0); //Number of invoices = the number of debits in the Journal Entry
                    NumberofNoteReceivableDebit ++;
                    break;
                case "Cash":
                    CreateTAccountRowCash("Date",Description, NotesReceivableDebit.get(NumberofNoteReceivableDebit), 0);
                    NumberofNoteReceivableDebit ++;
                    break;
                case "Discount on Notes Receivable":
                    CreateTAccountRowDiscountOnNotesReceivable("Date",Description, NotesReceivableDebit.get(NumberofNoteReceivableDebit),0);
                    NumberofNoteReceivableDebit ++;
                    break;
               
                
                default:
                    break;
            }
            
        }
        if (NotesReceivableJETable.getValueAt(i,0).equals("Credit")){
            NotesReceivableCredit.add(Float.parseFloat(NotesReceivableJETable.getValueAt(i,2).toString()));
            
           switch (NotesReceivableJETable.getValueAt(i,1).toString()){
               case "Interest Revenue":
               
              CreateTAccountRowInterestRevenue("Date",Description,0, NotesReceivableCredit.get(NumberofNoteReceivableCredit));
              NumberofNoteReceivableCredit++;
              break;
              
               case "Discount on Notes Receivable":
               CreateTAccountRowDiscountOnNotesReceivable("Date",Description, 0 , NotesReceivableCredit.get(NumberofNoteReceivableCredit));
                NumberofNoteReceivableCredit++;
                break;
               case "Cash":
                   CreateTAccountRowCash ("Date", Description, 0, NotesReceivableCredit.get(NumberofNoteReceivableCredit));
                   NumberofNoteReceivableCredit++;
                break;
           default: 
               break;
            }
       }
        
       }
      NotesReceivableDebit.clear();
        NotesReceivableCredit.clear();
        NumberofNoteReceivableDebit=0;
        NumberofNoteReceivableCredit =0;
         DefaultTableModel dm = (DefaultTableModel) NotesReceivableJETable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
    }//GEN-LAST:event_SaveJENotesReceivableActionPerformed

    private void ResetButtonNotesReceivableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonNotesReceivableActionPerformed
      FaceValueNoteInput.setText("");
      PresentValueOfNoteInput.setText("");
      EffectiveInterestRateInput.setText("");
      ImplicitInterestRateInput.setText("");
      YearsUntilMaturityInput.setText("");
      DefaultTableModel dm = (DefaultTableModel) NotesReceivableJETable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
DefaultTableModel dm2 = (DefaultTableModel) NoteDiscountAmortJETable.getModel();
int rowCount2 = dm2.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount2 - 1; i >= 0; i--) {
    dm2.removeRow(i);
}



    }//GEN-LAST:event_ResetButtonNotesReceivableActionPerformed

    private void GenerateJEBondPayableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJEBondPayableActionPerformed

BondsPayable b = new BondsPayable();
    }//GEN-LAST:event_GenerateJEBondPayableActionPerformed

    private void SaveJEBondPayableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJEBondPayableActionPerformed
SaveBondsPayable BS = new SaveBondsPayable();

    }//GEN-LAST:event_SaveJEBondPayableActionPerformed

    private void BackButtonBondsPayableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonBondsPayableActionPerformed
        landingJPanel.setVisible(true);
        BondsPayablePanel.setVisible(false);
    }//GEN-LAST:event_BackButtonBondsPayableActionPerformed

    private void ExtinguishCheckStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ExtinguishCheckStateChanged
        
       if (ExtinguishCheck.isSelected()){
           ExtinguishPanel.setVisible(true);
           ExtinguishmentOfDebt = true;
           
       }else if (!ExtinguishCheck.isSelected()){
           ExtinguishPanel.setVisible(false);
           ExtinguishmentOfDebt = false;
       }
    }//GEN-LAST:event_ExtinguishCheckStateChanged

    private void BackButtonDepreciationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonDepreciationActionPerformed
       landingJPanel.setVisible (true);
       DepreciationPanel.setVisible(false);
    }//GEN-LAST:event_BackButtonDepreciationActionPerformed

    private void DepreciationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepreciationTypeActionPerformed
    DepreciationDataSelected = DepreciationType.getSelectedItem().toString();
    }//GEN-LAST:event_DepreciationTypeActionPerformed

    private void GenerateJEDepreciationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJEDepreciationActionPerformed
        String OriginalCostString;
        float OriginalCostfl = 0;
        
        String SalvageValueString;
        float SalvageValuefl = 0;
        
        String EstUsefulLifeString;
        float EstUsefulLifefl = 0;
        
        boolean Straightline = false;
        boolean SumOfYears = false;
        boolean DoubleDeclining = false;
        
        Float Deprec;
        
        try {
        OriginalCostString = OrigCost.getText();
        OriginalCostfl = Float.parseFloat(OriginalCostString);
} catch (NumberFormatException e) {
}   
        try {
        SalvageValueString = SalvValue.getText();
        SalvageValuefl  = Float.parseFloat(SalvageValueString);
} catch (NumberFormatException e) {
}   
         try {
        EstUsefulLifeString = EstUsefulLife.getText();
        EstUsefulLifefl = Float.parseFloat(EstUsefulLifeString);
} catch (NumberFormatException e) {
}   
          DefaultTableModel DepreciationJE = (DefaultTableModel) DepreciationJETable.getModel();
          DefaultTableModel YearsMethod = (DefaultTableModel) SumOfYearTable.getModel();
          DefaultTableModel Declining = (DefaultTableModel) DecliningBalanceTable.getModel();
         if (DepreciationDataSelected.equals ("Straight Line")){
             
             Deprec = (OriginalCostfl - SalvageValuefl)/ EstUsefulLifefl;
              
             DepreciationJE.addRow (new Object[]{"Debit", "Depreciation Expense",Deprec});
             DepreciationJE.addRow (new Object[]{"Credit", "Accumulated Depreciation",Deprec});
             
             
         }else if (DepreciationDataSelected.equals("Sum of the years digits")){
             SumOfYearPanel.setVisible(true);
              float DeprecBase = OriginalCostfl - SalvageValuefl;
              float Remaininglife;
              double SumofAllYears = (Math.pow(EstUsefulLifefl,2) + EstUsefulLifefl)/2;
              double DepreciationFrac;
              double DeprecExpense;
              double BookValue = OriginalCostfl - SalvageValuefl;
              for (int i = 0; i < EstUsefulLifefl; i ++){
                  Remaininglife = EstUsefulLifefl - i;
                  DepreciationFrac = Remaininglife/SumofAllYears;
                   DeprecExpense = DeprecBase*DepreciationFrac;
               
                  YearsMethod.addRow(new Object[]{"Year" , DeprecBase,Remaininglife,DepreciationFrac, DeprecExpense});
              }  
               Remaininglife = EstUsefulLifefl;
                  DepreciationFrac = Remaininglife/SumofAllYears;
                   DeprecExpense = DeprecBase*DepreciationFrac;
                   DepreciationJE.addRow (new Object[]{"Debit", "Depreciation Expense",DeprecExpense});
             DepreciationJE.addRow (new Object[]{"Credit", "Accumulated Depreciation",DeprecExpense});
            //  DepreciationJE.addRow (new Object[]{"Debit", "Depreciation Expense",DeprecExpense});
            // DepreciationJE.addRow (new Object[]{"Debit", "Accumulated Depreciation",Deprec});
             
         } else if (DepreciationDataSelected.equals("Declining Balance")){
             DecliningBalancePanel.setVisible(true);
             float BookValue = OriginalCostfl;
             float RemainingLife = EstUsefulLifefl/2;
             float DecliningPercent = EstUsefulLifefl/100*4;
             float DeprecExpense = 0;
             for (int i = 0; i < EstUsefulLifefl/2; i++){
                  BookValue = BookValue-DeprecExpense;
                 if(BookValue- DeprecExpense > SalvageValuefl){
                
                 DeprecExpense = BookValue* DecliningPercent;
                         
                 Declining.addRow(new Object[]{"Year",BookValue, DecliningPercent, DeprecExpense});
                 
                 }else if (BookValue-DeprecExpense < SalvageValuefl){
                     DeprecExpense = BookValue -SalvageValuefl;
                     
                       Declining.addRow(new Object[]{"Year",BookValue, DecliningPercent, DeprecExpense});
                     
                 }
             }
             DeprecExpense = BookValue* DecliningPercent;
             DepreciationJE.addRow (new Object[]{"Debit", "Depreciation Expense",DeprecExpense});
             DepreciationJE.addRow (new Object[]{"Credit", "Accumulated Depreciation",DeprecExpense});
            
         }else { 
             Deprec = (OriginalCostfl - SalvageValuefl)/ EstUsefulLifefl;
              
             DepreciationJE.addRow (new Object[]{"Debit", "Depreciation Expense",Deprec});
             DepreciationJE.addRow (new Object[]{"Credit", "Accumulated Depreciation",Deprec});
         }
         
    }//GEN-LAST:event_GenerateJEDepreciationActionPerformed

   
    private void SaveJEDepreciationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJEDepreciationActionPerformed
         String Description = "";
        
        for (int i =0; i < DepreciationJETable.getRowCount(); i++){
        if (DepreciationJETable.getValueAt(i,0).equals ("Debit")){
            
            DepreciationDebit.add (Float.parseFloat(DepreciationJETable.getValueAt(i,2).toString()));
            
           
            switch (DepreciationJETable.getValueAt(i,1).toString()) {
                case "Depreciation Expense":
                    // System.out.println("Working");
                    
                    CreateTAccountRowDepreciationExpense("Date",Description, DepreciationDebit.get(NumberofDepreciationDebit), 0); 
                    NumberofDepreciationDebit++;
                    break;
                
                default:
                    break;
            }
            
        }
        if (DepreciationJETable.getValueAt(i,0).equals("Credit")){
            DepreciationCredit.add(Float.parseFloat(DepreciationJETable.getValueAt(i,2).toString()));
            
           switch (DepreciationJETable.getValueAt(i,1).toString()){
               case "Accumulated Depreciation":
               
              CreateTAccountRowAccumulatedDepreciation("Date",Description,0, DepreciationCredit.get(NumberofDepreciationCredit));
              NumberofDepreciationCredit++;
              break;
              
              
           default: 
               break;
            }
       }
        
       }
       DepreciationDebit.clear();
    DepreciationCredit.clear();
        NumberofDepreciationDebit=0;
        NumberofDepreciationCredit =0;
         DefaultTableModel dm = (DefaultTableModel) DepreciationJETable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
    }//GEN-LAST:event_SaveJEDepreciationActionPerformed

    private void BackButtonInventoryManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonInventoryManagementActionPerformed
        landingJPanel.setVisible(true);
        InventoryManagementPanel.setVisible (false);
    }//GEN-LAST:event_BackButtonInventoryManagementActionPerformed

    private void InventoryDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryDataActionPerformed
        InventoryDataSelected = InventoryData.getSelectedItem().toString();
    }//GEN-LAST:event_InventoryDataActionPerformed

    private void GenerateJEInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJEInventoryActionPerformed
InventoryClass inv = new InventoryClass(false, false, false, false);

    }//GEN-LAST:event_GenerateJEInventoryActionPerformed

    private void CFAssumptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFAssumptionActionPerformed
        CF = CFAssumption.getSelectedItem().toString();
    }//GEN-LAST:event_CFAssumptionActionPerformed

    private void ResetButtonInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonInventoryActionPerformed
        DefaultTableModel dm = (DefaultTableModel) InventoryManagementJETable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
        DefaultTableModel dm1 = (DefaultTableModel) FIFOPerpTable.getModel();
int rowCount1 = dm1.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount1 - 1; i >= 0; i--) {
    dm1.removeRow(i);
}
Units.setText("");
SalesPrice.setText("");
    }//GEN-LAST:event_ResetButtonInventoryActionPerformed

    private void SaveJEInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJEInventoryActionPerformed
SaveInventory save = new SaveInventory();
    }//GEN-LAST:event_SaveJEInventoryActionPerformed

    private void PullDataJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PullDataJEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PullDataJEActionPerformed

    private void BackButtonInvValuationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonInvValuationActionPerformed
       landingJPanel.setVisible(true);
       InventoryValuationPanel.setVisible(false);
    }//GEN-LAST:event_BackButtonInvValuationActionPerformed

    private void NoteIssuedFaceValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoteIssuedFaceValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoteIssuedFaceValueActionPerformed

    private void NotesPayInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotesPayInputActionPerformed
    NoteValue = NotesPayInput.getSelectedItem().toString();
    }//GEN-LAST:event_NotesPayInputActionPerformed

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
          InventoryMainMen.setVisible(true);
        landingJPanel.setVisible(false);
    }//GEN-LAST:event_jLabel61MouseClicked

    private void BasicPurchasesCashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BasicPurchasesCashMouseClicked
       landingJPanel.setVisible(false);
        HomeJPanel.setVisible(true);
    }//GEN-LAST:event_BasicPurchasesCashMouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
          landingJPanel.setVisible(false);
       SalesReturnsAndAllowancesPanel.setVisible (true);
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        BondsPayablePanel.setVisible(true);
        landingJPanel.setVisible(false);
        BondsPayable BP = new BondsPayable();
        BPActive = true;
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
        landingJPanel.setVisible (false);
       WriteOffPanel.setVisible(true);
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
         landingJPanel.setVisible(false);
        DepreciationPanel.setVisible (true);
        SumOfYearPanel.setVisible(false);
        DecliningBalancePanel.setVisible(false);
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
       landingJPanel.setVisible(false);
        NotesReceivablePanel.setVisible(true);
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
          TAccountsBack.setVisible(true);
        CashTAccount.setVisible (false);
        landingJPanel.setVisible (false);
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
          LogTable.setVisible(true);
        landingJPanel.setVisible(false);
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        InvoicesPanel.setVisible(true);
        landingJPanel.setVisible(false);
    }//GEN-LAST:event_jLabel64MouseClicked

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
      landingJPanel.setVisible(true);
      InventoryMainMen.setVisible(false);
    }//GEN-LAST:event_jLabel73MouseClicked

    private void AddIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddIDButtonActionPerformed
      String ItemNameString =ItemNameInput.getText();
      String ItemDescription = ItemDescInput.getText();
          InventoryIdentification inv = new InventoryIdentification(NumberOfIDs, ItemNameString, ItemDescription);
               NumberOfIDs++;
    }//GEN-LAST:event_AddIDButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InventoryIdentification.setVisible(true);
        InventoryMainMen.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       InventoryIdentification.setVisible(false);
       InventoryMainMen.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DeleteIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteIDButtonActionPerformed
  DefaultTableModel IDtab = (DefaultTableModel)IDTable.getModel();
  float Zero = 0;
        int SelectedRow = IDTable.getSelectedRow();
        if(SelectedRow != -1) {
               // remove selected row from the model
               IDtab.removeRow(SelectedRow);
        }
       Stock.remove(SelectedRow);
       ItemName.remove(SelectedRow);
    Description.remove(SelectedRow);
    
    for(int i = SelectedRow; i< IDTable.getRowCount(); i++){
        IDTable.setValueAt(i,i,0);
    }
    }//GEN-LAST:event_DeleteIDButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       InventoryMainMen.setVisible(false);
       InventoryManagementPanel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseClicked
       DilutedEPSPanel.setVisible(true);
       landingJPanel.setVisible(false);
    }//GEN-LAST:event_jLabel84MouseClicked

    private void NumOptionsInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumOptionsInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumOptionsInputActionPerformed

    private void AddSecurityEPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSecurityEPSActionPerformed
   DefaultTableModel Securities = (DefaultTableModel) SecuritiesTable.getModel();
         
         Securities.addRow(new Object[]{SecuritiesEPSInput.getText(), SecurityChoice.getSelectedItem(), AmountSecuritiesInput.getText(), ParValueInputEPS.getText(),ConvertibleEPSInput.getText(), NumSecuritiesConvertibleDilutive.getText()});
    }//GEN-LAST:event_AddSecurityEPSActionPerformed

    private void GenerateEPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateEPSActionPerformed
       GenerateDilutedEPS eps = new GenerateDilutedEPS();
    }//GEN-LAST:event_GenerateEPSActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      DefaultTableModel StockOption = (DefaultTableModel) OptionsEPSTable.getModel();
      StockOption.addRow (new Object[]{NumOptionsInput.getText(),ExercisePriceEPSInput.getText()});
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ResetButtonEPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonEPSActionPerformed
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
    }//GEN-LAST:event_ResetButtonEPSActionPerformed

    private void HomeButtonEPSCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonEPSCalcActionPerformed
      landingJPanel.setVisible(true);
      DilutedEPSPanel.setVisible(false);
    }//GEN-LAST:event_HomeButtonEPSCalcActionPerformed

    private void WASOCalcButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WASOCalcButtonMouseClicked
     landingJPanel.setVisible(false);
     WASOPanel.setVisible(true);
    }//GEN-LAST:event_WASOCalcButtonMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    WasoIssuance = true;
    if (clickcounter == 0){
        BeginEntry = true;
        clickcounter++;
    } else if (clickcounter == 1 || clickcounter!=0){
        BeginEntry = false;
    }
        WasoIssuance waso = new WasoIssuance(WasoIssuance, BeginEntry, false, "");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      WasoIssuance = false;
      if (clickcounter == 0){
        BeginEntry = true;
        clickcounter++;
    } else if (clickcounter == 1 || clickcounter!=0){
        BeginEntry = false;
    }
          WasoIssuance waso = new WasoIssuance(WasoIssuance, BeginEntry, false, "");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      WasoCalculation waso = new WasoCalculation();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void AddStockSplitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStockSplitActionPerformed
       StDiv = false;
       StockDiv sto = new StockDiv(StDiv, false, 0);
    }//GEN-LAST:event_AddStockSplitActionPerformed

    private void AddStockDividendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStockDividendActionPerformed
       StDiv = true;
       StockDiv sto = new StockDiv(StDiv, false, 0);
    }//GEN-LAST:event_AddStockDividendActionPerformed

    private void ResetButtonWasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonWasoActionPerformed
            DefaultTableModel dm = (DefaultTableModel) WASOTable.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
      
BeginSharesInput.setText("");
SharesIssuedInput.setText("");
StockSplitInput.setText("");
WASOInput.setText("");
StockDividendInput.setText("");
clickcounter = 0;

    }//GEN-LAST:event_ResetButtonWasoActionPerformed

    private void HomeButtonWasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonWasoActionPerformed
       landingJPanel.setVisible(true);
       WASOPanel.setVisible(false);
    }//GEN-LAST:event_HomeButtonWasoActionPerformed

    private void TreasuryStockButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreasuryStockButtonMouseClicked
    landingJPanel.setVisible(false);
    TStockPane.setVisible(true);
    }//GEN-LAST:event_TreasuryStockButtonMouseClicked

    private void SharesReaquiredInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SharesReaquiredInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SharesReaquiredInputActionPerformed

    private void GenerateJEButtonTStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJEButtonTStockActionPerformed

    GenerateJETStock JE = new GenerateJETStock(false,false,false);

    }//GEN-LAST:event_GenerateJEButtonTStockActionPerformed

    private void ResetButtonTStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonTStockActionPerformed
                DefaultTableModel dm = (DefaultTableModel) JETableTStocks.getModel();
int rowCount = JETableTStocks.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
      
SharesReaquiredInput.setText("");
ReacquisitionPriceInput.setText("");
 PreviousPrice.clear();
AmountofShares.clear();
    }//GEN-LAST:event_ResetButtonTStockActionPerformed

    private void SaveJETStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJETStockActionPerformed
    SaveJETStock t = new SaveJETStock();
    }//GEN-LAST:event_SaveJETStockActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        landingJPanel.setVisible(true);
        TStockPane.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel106MouseClicked
        landingJPanel.setVisible(false);
        NonMonetaryExchangePanel.setVisible(true);
    }//GEN-LAST:event_jLabel106MouseClicked

    private void GenerateJENonMonetaryExchangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJENonMonetaryExchangesActionPerformed
        GenerateNonMonetaryExchange yuh = new GenerateNonMonetaryExchange();
        
    }//GEN-LAST:event_GenerateJENonMonetaryExchangesActionPerformed

    private void PensionPlanningButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PensionPlanningButtonMouseClicked
        landingJPanel.setVisible(false);
        PensionPlanningPanel.setVisible(true);
    }//GEN-LAST:event_PensionPlanningButtonMouseClicked

    private void GenerateJEPensionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateJEPensionsActionPerformed
       PensionPlanningGenerate gen = new PensionPlanningGenerate();
    }//GEN-LAST:event_GenerateJEPensionsActionPerformed

    private void ResetPensionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetPensionsActionPerformed
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
            
               DefaultTableModel dm = (DefaultTableModel) PensionPlanningTable.getModel();
int rowCount = PensionPlanningTable.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
         
               DefaultTableModel dm1 = (DefaultTableModel) PensionJETable.getModel();
int rowCount1 = PensionJETable.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount1 - 1; i >= 0; i--) {
    dm1.removeRow(i);
}
            
            
    }//GEN-LAST:event_ResetPensionsActionPerformed

    private void LeasesMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeasesMenuButtonMouseClicked
    landingJPanel.setVisible(false);
    LeasesPanel.setVisible(true);
    }//GEN-LAST:event_LeasesMenuButtonMouseClicked

    private void GenerateTablesLeasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateTablesLeasesActionPerformed
      GenerateTablesLeases gen = new GenerateTablesLeases();
    }//GEN-LAST:event_GenerateTablesLeasesActionPerformed

    private void AnnualPaymentsInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnualPaymentsInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnnualPaymentsInputActionPerformed

    private void ResetButtonLeasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonLeasesActionPerformed
  
        AnnualPaymentsInput.setText("");
        YearsLeaseInput.setText("");
        ResidualValueInput.setText("");
        ImplicitRateInput.setText("");
        PresentValueInput.setText("");
        CostToDealerInput.setText("");
        
        DefaultTableModel dm = (DefaultTableModel) AmortTableLeases.getModel();
int rowCount = AmortTableLeases.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
 DefaultTableModel dm1 = (DefaultTableModel) LeasesJETable.getModel();
int rowCount1 = LeasesJETable.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount1 - 1; i >= 0; i--) {
    dm1.removeRow(i);
}
    }//GEN-LAST:event_ResetButtonLeasesActionPerformed

    private void HomeButtonLeasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonLeasesActionPerformed
      landingJPanel.setVisible(true);
      LeasesPanel.setVisible(false);
    }//GEN-LAST:event_HomeButtonLeasesActionPerformed

    private void EducationalInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationalInventoryButtonActionPerformed
     InventoryMainMen.setVisible(false);
     EducationalInventory.setVisible(true);
    // DefaultTableModel Answer = (DefaultTableModel) AnswerTableInventory.getModel();
     TableColumn testcol = AnswerTableInventory.getColumnModel().getColumn(0);
     TableColumn testcol2 = AnswerTableInventory.getColumnModel().getColumn(1);
    JComboBox DebitChoice = new JComboBox<>();
   JComboBox TypeOfAccount = new JComboBox<>();
     DebitChoice.addItem("Debit");
     DebitChoice.addItem("Credit");
     TypeOfAccount.addItem ("Inventory");
     TypeOfAccount.addItem("Cost of Goods Sold");
     TypeOfAccount.addItem("Accounts Receivable");
     TypeOfAccount.addItem("Accounts Payable");
     TypeOfAccount.addItem("Sales Revenue");
     testcol2.setCellEditor(new DefaultCellEditor(TypeOfAccount));
     testcol.setCellEditor(new DefaultCellEditor(DebitChoice));
    }//GEN-LAST:event_EducationalInventoryButtonActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        CheckAnswerInventory check = new CheckAnswerInventory();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        landingJPanel.setVisible(true);
        EducationalInventory.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void GenerateProblemInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateProblemInventoryActionPerformed
       FifoDataUnits.clear();
       FifoDataPrice.clear();
       AmountLifo = 0;
       Balanceinv = 0;
       LeftoverInv = 0;
       
        GenerateProblemInventory inv = new GenerateProblemInventory();
               
    }//GEN-LAST:event_GenerateProblemInventoryActionPerformed

    private void EducationalProblemsWASOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationalProblemsWASOButtonActionPerformed
      WASOPanel.setVisible(false);
      EducationalWASO.setVisible(true);
      
    }//GEN-LAST:event_EducationalProblemsWASOButtonActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    landingJPanel.setVisible(true);
    EducationalWASO.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void GenerateProblemWASOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateProblemWASOActionPerformed
            GenerateWASOProblem prob = new GenerateWASOProblem(); 
    }//GEN-LAST:event_GenerateProblemWASOActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
     CheckAnswerWASO was = new CheckAnswerWASO ();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void EducationalPensionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationalPensionButtonActionPerformed
       EducationalPensionPanel.setVisible(true);
       PensionPlanningPanel.setVisible(false);
       TableColumn testcol = PensionAnswerTableEdu.getColumnModel().getColumn(0);
     TableColumn testcol2 = PensionAnswerTableEdu.getColumnModel().getColumn(1);
    JComboBox DebitChoice = new JComboBox<>();
   JComboBox TypeOfAccount = new JComboBox<>();
     DebitChoice.addItem("Debit");
     DebitChoice.addItem("Credit");
     TypeOfAccount.addItem ("Pension Expense");
     TypeOfAccount.addItem("OCI");
     TypeOfAccount.addItem("Cash");
     TypeOfAccount.addItem("Pension Asset");
     TypeOfAccount.addItem("Pension Liability");
     testcol2.setCellEditor(new DefaultCellEditor(TypeOfAccount));
     testcol.setCellEditor(new DefaultCellEditor(DebitChoice));
    }//GEN-LAST:event_EducationalPensionButtonActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
      landingJPanel.setVisible(true);
      EducationalPensionPanel.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void GenerateQuestionPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateQuestionPensionActionPerformed
     GeneratePensionProblem gen = new GeneratePensionProblem();
    }//GEN-LAST:event_GenerateQuestionPensionActionPerformed

    private void CheckAnswersPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAnswersPensionActionPerformed
        CheckAnswerPensions pen = new CheckAnswerPensions();
    }//GEN-LAST:event_CheckAnswersPensionActionPerformed

    private void PensionAssetCheckAnswerInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PensionAssetCheckAnswerInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PensionAssetCheckAnswerInputActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      landingJPanel.setVisible(true);
      EducationalDilutedEPSPanel.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    EducationalDilutedEPSPanel.setVisible(true);
    DilutedEPSPanel.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void GenerateEPSProblemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateEPSProblemButtonActionPerformed
       GenerateDilutedEPSProblem gen = new GenerateDilutedEPSProblem();
    }//GEN-LAST:event_GenerateEPSProblemButtonActionPerformed

    private void CheckAnswerButtonDilutedEPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAnswerButtonDilutedEPSActionPerformed
    float DilutedEPSAnswer = Float.parseFloat(DilutedEPSOutput.getText());
    float BasicEPSAnswer = Float.parseFloat(BasicEPSOutput.getText());
    
    float DilutedEPSInput = Float.parseFloat(DilutedEPSCheckerInput.getText());
    float BasicEPSInput = Float.parseFloat(BasicEPSCheckerInput.getText());
   // DilutedEPSCheckerInput

    BigDecimal bd1 = new BigDecimal(DilutedEPSAnswer).setScale(2, RoundingMode.HALF_UP);
     BigDecimal bd2 = new BigDecimal(DilutedEPSInput).setScale(2, RoundingMode.HALF_UP);
    float FinalCheckDiluted = bd1.floatValue();
      float FinalInputDiluted = bd2.floatValue();
     
      BigDecimal bd3 = new BigDecimal(BasicEPSAnswer).setScale(2, RoundingMode.HALF_UP);
        BigDecimal bd4 = new BigDecimal(BasicEPSInput).setScale(2, RoundingMode.HALF_UP);
      float FinalCheckBasic = bd3.floatValue();
      float FinalBasicEPSInput = bd4.floatValue();
    System.out.println("Final Check Diluted "+FinalCheckDiluted);
    System.out.println("Final Input Dilted " + FinalInputDiluted);
    if (FinalCheckDiluted == FinalInputDiluted || FinalCheckDiluted == FinalInputDiluted +.01 || FinalCheckDiluted == FinalInputDiluted+.02 || FinalCheckDiluted == FinalInputDiluted - .01 || FinalCheckDiluted == FinalInputDiluted - .02){
        OutputDilutedEPSCheckAnswer.setText("Correct DilutedEPS!");
        
    }else {
         OutputDilutedEPSCheckAnswer.setText("Incorrect Diluted EPS");
         
    }
     if (FinalCheckBasic == FinalBasicEPSInput || FinalCheckBasic == FinalBasicEPSInput +.01 || FinalCheckBasic == FinalBasicEPSInput+.02 || FinalCheckBasic == FinalBasicEPSInput - .01 || FinalCheckBasic == FinalBasicEPSInput - .02){
        OutputDilutedEPSCheckAnswer.setText(OutputDilutedEPSCheckAnswer.getText() +" Correct Basic EPS!");
    }else {
     OutputDilutedEPSCheckAnswer.setText(OutputDilutedEPSCheckAnswer.getText() +" Incorrect Basic EPS!");
     }
    }//GEN-LAST:event_CheckAnswerButtonDilutedEPSActionPerformed

    private void TreasuryStockPracticeProblemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreasuryStockPracticeProblemsButtonActionPerformed
       EducationalTStockPracticeProblems.setVisible(true);
       TStockPane.setVisible(false);
        TableColumn testcol = TStockEducationalTable.getColumnModel().getColumn(0);
     TableColumn testcol2 = TStockEducationalTable.getColumnModel().getColumn(1);
    JComboBox DebitChoice = new JComboBox<>();
   JComboBox TypeOfAccount = new JComboBox<>();
     DebitChoice.addItem("Debit");
     DebitChoice.addItem("Credit");
     TypeOfAccount.addItem ("Treasury Stock");
     TypeOfAccount.addItem("Cash");
     TypeOfAccount.addItem("Paid in Capital");
     testcol2.setCellEditor(new DefaultCellEditor(TypeOfAccount));
     testcol.setCellEditor(new DefaultCellEditor(DebitChoice));
    }//GEN-LAST:event_TreasuryStockPracticeProblemsButtonActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       landingJPanel.setVisible(true);
       EducationalTStockPracticeProblems.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void GenerateEducationalTStockProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateEducationalTStockProblemActionPerformed
        GenerateTStockProblem gen = new GenerateTStockProblem();
    }//GEN-LAST:event_GenerateEducationalTStockProblemActionPerformed

    private void CheckAnswerTStockProblemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAnswerTStockProblemsActionPerformed
      CheckAnswerTStockProblems tstock = new CheckAnswerTStockProblems();
    }//GEN-LAST:event_CheckAnswerTStockProblemsActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
     landingJPanel.setVisible(true);
     EducationalInvoicePractice.setVisible(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        GenerateRecourseJE je = new GenerateRecourseJE();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void SaleOfARButtonMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaleOfARButtonMainMenuMouseClicked
      landingJPanel.setVisible(false);
      SalesRecoursePanel.setVisible(true);
    }//GEN-LAST:event_SaleOfARButtonMainMenuMouseClicked

    private void HomeButtonRecourseEDUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonRecourseEDUActionPerformed
    landingJPanel.setVisible(true);
    RecourseEDU.setVisible(false);
    }//GEN-LAST:event_HomeButtonRecourseEDUActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
      RecourseEDU.setVisible(true);
      SalesRecoursePanel.setVisible(false);
      TableColumn testcol = AnswerInputTableRecourses.getColumnModel().getColumn(0);
     TableColumn testcol2 = AnswerInputTableRecourses.getColumnModel().getColumn(1);
    JComboBox DebitChoice = new JComboBox<>();
   JComboBox TypeOfAccount = new JComboBox<>();
     DebitChoice.addItem("Debit");
     DebitChoice.addItem("Credit");
     TypeOfAccount.addItem ("Cash");
     TypeOfAccount.addItem("Due from Factor");
     TypeOfAccount.addItem("Loss on Sale of Receivables");
     TypeOfAccount.addItem("Accounts Receivable");
     TypeOfAccount.addItem("Recourse Liability");
     testcol2.setCellEditor(new DefaultCellEditor(TypeOfAccount));
     testcol.setCellEditor(new DefaultCellEditor(DebitChoice));
    }//GEN-LAST:event_jButton24ActionPerformed

    private void CheckAnswerRecourseEDUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAnswerRecourseEDUActionPerformed
        CheckAnswerRecourses recourse = new CheckAnswerRecourses ();
    }//GEN-LAST:event_CheckAnswerRecourseEDUActionPerformed

    private void GenerateProblemRecourseEDUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateProblemRecourseEDUActionPerformed
       ReceivableRecoursesProblems je = new ReceivableRecoursesProblems();
    }//GEN-LAST:event_GenerateProblemRecourseEDUActionPerformed

    private void ResetButtonSalesRecoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonSalesRecoursesActionPerformed
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
    }//GEN-LAST:event_ResetButtonSalesRecoursesActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
       landingJPanel.setVisible(true);
       SalesRecoursePanel.setVisible(false);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
     landingJPanel.setVisible(true);
     NonMonetaryExchangePanel.setVisible(false);
    }//GEN-LAST:event_jButton25ActionPerformed
   
    

    public static void CreateListRow(String date,String desc,String debit,float am, String credit, float amount){
        DefaultTableModel model = (DefaultTableModel) CashTable.getModel();
model.addRow(new Object[]{date, desc, debit,"$ "+ am, credit,"$ "+ amount});

   }
 public static void CreateTAccountRowCash(String date, String desc, float debit, float credit){
        DefaultTableModel model2 = (DefaultTableModel) CashTAccountTable.getModel();
     model2.addRow(new Object[]{date, desc, debit, credit});
     
   }
 public static void CreateTAccountRowEquipment(String date,String desc,float debit, float credit){
        DefaultTableModel model3 = (DefaultTableModel) EquipmentTAccountTable.getModel();
     model3.addRow(new Object[]{date, desc, debit, credit});
     
   }
 public static void CreateTAccountRowCommonStock (String date,String desc,float debit, float credit){
       DefaultTableModel model4 = (DefaultTableModel) CommonStockTAccountTable.getModel();
     model4.addRow(new Object[]{date, desc, debit, credit});
 }
 public static void CreateTAccountRowSupplies(String date,String desc,float debit, float credit){
       DefaultTableModel model5 = (DefaultTableModel) SuppliesTAccountTable.getModel();
     model5.addRow(new Object[]{date, desc, debit, credit});
 }
 public static void CreateTAccountRowInventory(String date,String desc, float debit, float credit){
       DefaultTableModel model6 = (DefaultTableModel) InventoryTAccountTable.getModel();
     model6.addRow(new Object[]{date, desc, debit, credit});
 }
 public static void CreateTAccountRowAccountsRecievable(String date,String desc, float debit, float credit){
     DefaultTableModel model7 = (DefaultTableModel) AccountsReceivableTAccountTable.getModel();
     model7.addRow(new Object[]{date,desc, debit, credit});
 }
 public static void CreateTAccountRowSalesRevenue(String date, String desc, float debit, float credit){
     DefaultTableModel model8 = (DefaultTableModel) SalesRevenueTAccountTable.getModel();
     model8.addRow(new Object[]{date,desc, debit, credit});
 }
  public static void CreateTAccountRowSalesDiscount(String date,String desc, float debit, float credit){
  
     DefaultTableModel model9 = (DefaultTableModel) SalesDiscountTAccountTable.getModel();
     model9.addRow(new Object[]{date,desc, debit, credit});
 }
  public static void CreateTAccountRowSalesDiscountsForefeited (String date, String desc, float debit, float credit){
      DefaultTableModel model10 = (DefaultTableModel) SalesDiscountForfeitedTAccountTable.getModel();
     model10.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowSalesReturnsAndAllowances (String date,String desc ,float debit, float credit){
      DefaultTableModel model11 = (DefaultTableModel) SalesReturnsAndAllowancesTAccountTable.getModel();
     model11.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowAllowanceForSalesReturnsAndAllowances (String date, String desc, float debit, float credit){
      DefaultTableModel model12 = (DefaultTableModel) AllowanceForSalesReturnsAndAllowancesTAccountTable.getModel();
     model12.addRow(new Object[]{date,desc, debit, credit});
  }
   public static void CreateTAccountRowBadDebtExpense (String date,String desc ,float debit, float credit){
      DefaultTableModel model13 = (DefaultTableModel) BadDebtExpenseTAccountTable.getModel();
     model13.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowAllowanceforDoubtfulAccounts(String date, String desc, float debit, float credit){
      DefaultTableModel model14 = (DefaultTableModel) AllowanceForDoubtfulAccountsTAccountTable.getModel();
     model14.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowNotesReceivable(String date,String desc ,float debit, float credit){
      DefaultTableModel model15 = (DefaultTableModel) NotesReceivableTAccountTable.getModel();
     model15.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowInterestRevenue(String date, String desc, float debit, float credit){
      DefaultTableModel model16 = (DefaultTableModel) InterestRevenueTAccountTable.getModel();
     model16.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowDiscountOnNotesReceivable(String date, String desc, float debit, float credit){
      DefaultTableModel model17 = (DefaultTableModel) DiscountOnNotesReceivableTAccountTable.getModel();
     model17.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowDiscountOnBondsPayable(String date, String desc, float debit, float credit){
      DefaultTableModel model18 = (DefaultTableModel) DiscountOnBondsPayableTAccountTable.getModel();
     model18.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowBondsPayable(String date, String desc, float debit, float credit){
      DefaultTableModel model19 = (DefaultTableModel)BondsPayableTAccountTable.getModel();
     model19.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowPremiumOnBondsPayable(String date, String desc, float debit, float credit){
      DefaultTableModel model19 = (DefaultTableModel) PremiumOnBondsPayableTAccountTable.getModel();
     model19.addRow(new Object[]{date,desc, debit, credit});
  }
   public static void CreateTAccountRowLossOnRedemption(String date, String desc, float debit, float credit){
      DefaultTableModel model20 = (DefaultTableModel)LossRedemptionTAccountTable.getModel();
     model20.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowGainOnRedemption(String date, String desc, float debit, float credit){
      DefaultTableModel model21 = (DefaultTableModel) GainOnRedemptionTAccountTable.getModel();
     model21.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowDepreciationExpense(String date, String desc, float debit, float credit){
      DefaultTableModel model22 = (DefaultTableModel)DepreciationTAccountTable.getModel();
     model22.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowAccumulatedDepreciation(String date, String desc, float debit, float credit){
      DefaultTableModel model23 = (DefaultTableModel) AccumulatedDepreciationTAccountTable.getModel();
     model23.addRow(new Object[]{date,desc, debit, credit});
  }
  public static void CreateTAccountRowAccountsPayable(String date, String desc, float debit, float credit){
      DefaultTableModel model24 = (DefaultTableModel) AccountsPayableTAccountTable.getModel();
     model24.addRow(new Object[]{date,desc, debit, credit});
  }
   public static void CreateTAccountRowCostOfGoodsSold(String date, String desc, float debit, float credit){
     
      DefaultTableModel model25 = (DefaultTableModel) CostofGoodsSoldTAccountTable.getModel();
     model25.addRow(new Object[]{date,desc, debit, credit});
  }
   public static void CreateTAccountRowPurchases(String date, String desc, float debit, float credit){
      DefaultTableModel model26 = (DefaultTableModel) PurchasesTAccountTable.getModel();
     model26.addRow(new Object[]{date,desc, debit, credit});
  }
   public static void CreateTAccountRowTStock(String date, String desc, float debit, float credit){
      DefaultTableModel model27 = (DefaultTableModel) TStockTAccountTable.getModel();
     model27.addRow(new Object[]{date,desc, debit, credit});
  }
   public static void CreateTAccountRowPaidinCapital(String date, String desc, float debit, float credit){
      DefaultTableModel model28 = (DefaultTableModel) PaidinCapitalTAccountTable.getModel();
     model28.addRow(new Object[]{date,desc, debit, credit});
  }
  
  
    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ADInput;
    public static javax.swing.JCheckBox AQCheck;
    private javax.swing.JCheckBox AccountPayableCheckBox;
    public static javax.swing.JTextField AccountsPayableInput;
    public static javax.swing.JLayeredPane AccountsPayableTAccount;
    public static javax.swing.JTable AccountsPayableTAccountTable;
    public static javax.swing.JTextField AccountsReceivableInput;
    public static javax.swing.JPanel AccountsReceivableTAccount;
    public static javax.swing.JTable AccountsReceivableTAccountTable;
    public static javax.swing.JPanel AccumulatedDepreciationTAccount;
    public static javax.swing.JTable AccumulatedDepreciationTAccountTable;
    public static javax.swing.JFormattedTextField AccumulatedOCICheckAnswerInput;
    public static javax.swing.JTextField ActualReturnPlanAssetsInput;
    public static javax.swing.JTextField ActuaryInput;
    private javax.swing.JButton AddIDButton;
    private javax.swing.JButton AddSecurityEPS;
    private javax.swing.JButton AddStockDividend;
    private javax.swing.JButton AddStockSplit;
    private javax.swing.JTextField AllowanceAmountInput;
    public static javax.swing.JPanel AllowanceForDoubtfulAccountsTAccount;
    public static javax.swing.JTable AllowanceForDoubtfulAccountsTAccountTable;
    public static javax.swing.JPanel AllowanceForSalesReturnsAndAllowancesTAccount;
    public static javax.swing.JTable AllowanceForSalesReturnsAndAllowancesTAccountTable;
    private javax.swing.JTable AllowanceJETable;
    public static javax.swing.JTable AmortTableLeases;
    public static javax.swing.JTextField AmountSecuritiesInput;
    private javax.swing.JTextField AmountUncollected;
    public static javax.swing.JTextField AnnualPaymentsInput;
    private javax.swing.JList<String> AnnuityOption;
    public static javax.swing.JTable AnswerInputTableRecourses;
    public static javax.swing.JTable AnswerTableInventory;
    public static javax.swing.JTextField AssetCostInput;
    public static javax.swing.JTextField AverageStockPriceInput;
    private javax.swing.JButton Back;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BackButton2;
    private javax.swing.JButton BackButtonBondsPayable;
    private javax.swing.JButton BackButtonDepreciation;
    private javax.swing.JButton BackButtonInvValuation;
    private javax.swing.JButton BackButtonInventoryManagement;
    private javax.swing.JButton BackButtonInvoices;
    private javax.swing.JButton BackButtonNotesReceivable;
    private javax.swing.JButton BackButtonSalesReturns;
    private javax.swing.JButton BackButtonUncollectible;
    public static javax.swing.JPanel BadDebtExpenseTAccount;
    public static javax.swing.JTable BadDebtExpenseTAccountTable;
    public static javax.swing.JLabel Balance;
    public static javax.swing.JLabel BalanceType;
    private javax.swing.JTextField BasicEPSCheckerInput;
    public static javax.swing.JLabel BasicEPSOutput;
    private javax.swing.JLabel BasicPurchasesCash;
    public static javax.swing.JTextField BeginInvInput;
    public static javax.swing.JTextField BeginPBOInput;
    public static javax.swing.JTextField BeginPlanAssets;
    public static javax.swing.JTextField BeginSharesInput;
    public static javax.swing.JLabel BeginningInvID;
    public static javax.swing.JTextField BenefitsInput;
    public static javax.swing.JCheckBox BondAnnualInterest;
    public static javax.swing.JCheckBox BondIssuedInterestDate;
    public static javax.swing.JCheckBox BondIssuedbetweenInterestDates;
    public static javax.swing.JCheckBox BondSemiAnnualInterest;
    public static javax.swing.JTable BondsPayableAmortSchedule;
    public static javax.swing.JTextField BondsPayableImplicit;
    public static javax.swing.JTable BondsPayableJETable;
    private javax.swing.JPanel BondsPayablePanel;
    public static javax.swing.JPanel BondsPayableTAccount;
    public static javax.swing.JTable BondsPayableTAccountTable;
    public static javax.swing.JComboBox<String> CFAssumption;
    public static javax.swing.JTextField COGSInput;
    public static javax.swing.JLabel CalculatedWASO;
    public static javax.swing.JTextField CallValueInput;
    public static javax.swing.JFormattedTextField CashAnswerCheckInput;
    private javax.swing.JTextField CashDiscountPercent;
    public static javax.swing.JTextField CashInput;
    private javax.swing.JList<String> CashOptions;
    private javax.swing.JTextField CashSpent;
    public static javax.swing.JPanel CashTAccount;
    public static javax.swing.JTable CashTAccountTable;
    private static javax.swing.JTable CashTable;
    private javax.swing.JButton CheckAnswerButtonDilutedEPS;
    private javax.swing.JButton CheckAnswerRecourseEDU;
    private javax.swing.JButton CheckAnswerTStockProblems;
    private javax.swing.JButton CheckAnswersPension;
    public static javax.swing.JCheckBox CommercialSubstanceCheck;
    public static javax.swing.JPanel CommonStockTAccount;
    public static javax.swing.JTable CommonStockTAccountTable;
    private javax.swing.JTextField CompanyName;
    private javax.swing.JButton ComputeTimeValue;
    public static javax.swing.JTextField ConvertibleEPSInput;
    public static javax.swing.JTextField CostToDealerInput;
    public static javax.swing.JLayeredPane CostofGoodsSoldTAccount;
    public static javax.swing.JTable CostofGoodsSoldTAccountTable;
    private javax.swing.JTextField Creditarea;
    private javax.swing.JLabel DateText;
    private javax.swing.JTextField DaysTillDiscount;
    private javax.swing.JTextField Debitarea;
    private javax.swing.JLayeredPane DecliningBalancePanel;
    private javax.swing.JTable DecliningBalanceTable;
    private javax.swing.JButton DeleteIDButton;
    public static javax.swing.JPanel DepreciationExpenseTAccount;
    private javax.swing.JTable DepreciationJETable;
    private javax.swing.JPanel DepreciationPanel;
    public static javax.swing.JTable DepreciationTAccountTable;
    private javax.swing.JComboBox<String> DepreciationType;
    private javax.swing.JTextField DescriptionBasic;
    private javax.swing.JTextField DescriptionSalesReturns;
    private javax.swing.JTextField DilutedEPSCheckerInput;
    public static javax.swing.JLabel DilutedEPSOutput;
    private javax.swing.JPanel DilutedEPSPanel;
    private javax.swing.JCheckBox DirectWriteOff;
    public static javax.swing.JPanel DiscountOnBondsPayableTAccount;
    public static javax.swing.JTable DiscountOnBondsPayableTAccountTable;
    public static javax.swing.JPanel DiscountOnNotesReceivableTAccount;
    public static javax.swing.JTable DiscountOnNotesReceivableTAccountTable;
    private javax.swing.JTextField DollarCredit;
    private javax.swing.JTextField DollarDebit;
    public static javax.swing.JTextArea EPSProblemField;
    private javax.swing.JPanel EducationalDilutedEPSPanel;
    private javax.swing.JPanel EducationalInventory;
    private javax.swing.JToggleButton EducationalInventoryButton;
    private javax.swing.JPanel EducationalInvoicePractice;
    private javax.swing.JButton EducationalPensionButton;
    private javax.swing.JPanel EducationalPensionPanel;
    private javax.swing.JButton EducationalProblemsWASOButton;
    private javax.swing.JPanel EducationalTStockPracticeProblems;
    private javax.swing.JPanel EducationalWASO;
    public static javax.swing.JTextField EffectiveInterestRate;
    private javax.swing.JTextField EffectiveInterestRateInput;
    public static javax.swing.JLabel EndingInvOutput;
    public static javax.swing.JPanel EquipmentTAccount;
    public static javax.swing.JTable EquipmentTAccountTable;
    private javax.swing.JTextField EstUsefulLife;
    private javax.swing.JCheckBox EstimateSalesReturns;
    private javax.swing.JCheckBox EstimatedUncollectibles;
    public static javax.swing.JTable ExchangesJETable;
    public static javax.swing.JTextField ExercisePriceEPSInput;
    public static javax.swing.JTextField ExpectReturnInput;
    public static javax.swing.JCheckBox ExtinguishCheck;
    public static javax.swing.JPanel ExtinguishPanel;
    public static javax.swing.JTextField ExtinguishYears;
    public static javax.swing.JTable FIFOPerpTable;
    private javax.swing.JTextField FaceValueNoteInput;
    public static javax.swing.JTextField FactoringAmountInput;
    public static javax.swing.JTextField FairValueInput;
    public static javax.swing.JTextField FinanceChargeInput;
    public static javax.swing.JCheckBox FinanceLeaseCheck;
    public static javax.swing.JTextField FundingContributionsInput;
    private javax.swing.JTextField FutureValue;
    public static javax.swing.JTable GainOnRedemptionTAccountTable;
    public static javax.swing.JPanel GainRedemptionTAccount;
    private javax.swing.JButton GenerateEPS;
    private javax.swing.JButton GenerateEPSProblemButton;
    private javax.swing.JButton GenerateEducationalTStockProblem;
    private javax.swing.JButton GenerateJE;
    private javax.swing.JButton GenerateJEBondPayable;
    private javax.swing.JButton GenerateJEButtonTStock;
    private javax.swing.JButton GenerateJEButtonUncollectible;
    private javax.swing.JButton GenerateJEDepreciation;
    private javax.swing.JButton GenerateJEInvValuation;
    private javax.swing.JButton GenerateJEInventory;
    private javax.swing.JButton GenerateJEInvoices;
    private javax.swing.JButton GenerateJENonMonetaryExchanges;
    private javax.swing.JButton GenerateJENotesReceivable;
    private javax.swing.JButton GenerateJEPensions;
    private javax.swing.JButton GenerateJESalesReturns;
    private javax.swing.JButton GenerateProblemInventory;
    private javax.swing.JButton GenerateProblemRecourseEDU;
    private javax.swing.JButton GenerateProblemWASO;
    private javax.swing.JButton GenerateQuestionPension;
    private javax.swing.JButton GenerateTablesLeases;
    private javax.swing.JCheckBox GrantedAllowanceSalesReturns;
    private javax.swing.JCheckBox GrossMethodCheckBox;
    private javax.swing.JButton HomeButtonEPSCalc;
    private javax.swing.JButton HomeButtonLeases;
    private javax.swing.JButton HomeButtonRecourseEDU;
    private javax.swing.JButton HomeButtonWaso;
    private javax.swing.JPanel HomeJPanel;
    public static javax.swing.JTable IDTable;
    private javax.swing.JTextField ImplicitInterestRateInput;
    public static javax.swing.JTextField ImplicitRateInput;
    private javax.swing.JCheckBox InterestBearingNotes;
    private javax.swing.JTextField InterestRate;
    public static javax.swing.JPanel InterestRevenueTAccount;
    public static javax.swing.JTable InterestRevenueTAccountTable;
    public static javax.swing.JTable InvValuationTable;
    public static javax.swing.JComboBox<String> InventoryData;
    private javax.swing.JPanel InventoryIdentification;
    public static javax.swing.JTextField InventoryInput;
    private javax.swing.JPanel InventoryMainMen;
    public static javax.swing.JTable InventoryManagementJETable;
    private javax.swing.JPanel InventoryManagementPanel;
    public static javax.swing.JPanel InventoryTAccount;
    public static javax.swing.JTable InventoryTAccountTable;
    private javax.swing.JPanel InventoryValuationPanel;
    public static javax.swing.JTable InvoicesInputCheckTable;
    private javax.swing.JTable InvoicesJETable;
    private javax.swing.JPanel InvoicesPanel;
    public static javax.swing.JCheckBox IssueCheck;
    public static javax.swing.JLabel ItemCategoryOutput;
    private javax.swing.JTextField ItemDescInput;
    private javax.swing.JTextField ItemNameInput;
    public static javax.swing.JLabel ItemNameOutput;
    public static javax.swing.JTable JETableTStocks;
    public static javax.swing.JTable LeasesJETable;
    private javax.swing.JLabel LeasesMenuButton;
    private javax.swing.JPanel LeasesPanel;
    public static javax.swing.JTextField ListPriceInput;
    private javax.swing.JPanel LogTable;
    public static javax.swing.JPanel LossRedemptionTAccount;
    public static javax.swing.JTable LossRedemptionTAccountTable;
    public static javax.swing.JTextField MonthBetweenInterest;
    public static javax.swing.JComboBox<String> MonthSelected;
    public static javax.swing.JTextField NetIncomeInputDilutedEPS;
    private javax.swing.JCheckBox NetMethodCheckBox;
    private javax.swing.JTextField NetPaymentDate;
    private javax.swing.JPanel NonMonetaryExchangePanel;
    private javax.swing.JTable NoteDiscountAmortJETable;
    private javax.swing.JCheckBox NoteIssuedFaceValue;
    private javax.swing.JComboBox<String> NotesPayInput;
    private javax.swing.JTable NotesReceivableJETable;
    private javax.swing.JPanel NotesReceivablePanel;
    public static javax.swing.JPanel NotesReceivableTAccount;
    public static javax.swing.JTable NotesReceivableTAccountTable;
    public static javax.swing.JTextField NumOptionsInput;
    private javax.swing.JTextField NumPeriods;
    public static javax.swing.JTextField NumSecuritiesConvertibleDilutive;
    public static javax.swing.JCheckBox OperatingLeaseCheck;
    public static javax.swing.JTable OptionsEPSTable;
    private javax.swing.JTextField OrigCost;
    public static javax.swing.JTextArea OutputAnswer;
    public static javax.swing.JTextArea OutputAreaPension;
    private javax.swing.JTextArea OutputDilutedEPSCheckAnswer;
    public static javax.swing.JTextArea OutputReceivableExchange;
    public static javax.swing.JTextArea OutputTextAreaTStocks;
    private javax.swing.JTextField PMTInput;
    public static javax.swing.JTextField PSCAmortInput;
    public static javax.swing.JLayeredPane PaidinCapitalTAccount;
    public static javax.swing.JTable PaidinCapitalTAccountTable;
    private javax.swing.JPanel Panel;
    public static javax.swing.JTextField ParValueBond;
    public static javax.swing.JTextField ParValueInputEPS;
    private javax.swing.JCheckBox PaymentAfterDiscount;
    private javax.swing.JCheckBox PaymentInDiscount;
    public static javax.swing.JTable PensionAnswerTableEdu;
    public static javax.swing.JFormattedTextField PensionAssetCheckAnswerInput;
    public static javax.swing.JFormattedTextField PensionExpenseCheckAnswerInput;
    public static javax.swing.JTable PensionJETable;
    public static javax.swing.JFormattedTextField PensionLiabilityCheckAnswerInput;
    private javax.swing.JLabel PensionPlanningButton;
    private javax.swing.JPanel PensionPlanningPanel;
    public static javax.swing.JTable PensionPlanningTable;
    public static javax.swing.JCheckBox PeriodicCheck;
    public static javax.swing.JCheckBox PerpetualCheck;
    public static javax.swing.JPanel PremiumOnBondsPayableTAccount;
    public static javax.swing.JTable PremiumOnBondsPayableTAccountTable;
    private javax.swing.JTextField PresentValue;
    public static javax.swing.JTextField PresentValueInput;
    private javax.swing.JTextField PresentValueOfNoteInput;
    public static javax.swing.JTextField PriceOfBond;
    public static javax.swing.JTextField PriorServiceBenefitsInput;
    public static javax.swing.JTextArea ProblemArea;
    public static javax.swing.JTextArea ProblemFieldTStocks;
    public static javax.swing.JTextField ProductIDInput;
    private javax.swing.JButton PullDataJE;
    public static javax.swing.JTextField PurchasesAmountInv;
    public static javax.swing.JLayeredPane PurchasesTAccount;
    public static javax.swing.JTable PurchasesTAccountTable;
    private javax.swing.JTextField QuantityInvoices;
    public static javax.swing.JTextArea QuestionAreaPensions;
    public static javax.swing.JTextField ReacquisitionPriceInput;
    public static javax.swing.JCheckBox RecourseCheckMark;
    private javax.swing.JPanel RecourseEDU;
    public static javax.swing.JTable RecourseJETable;
    public static javax.swing.JTextField RecourseLiabilityInput;
    public static javax.swing.JTextArea RecoursesQuestionArea;
    private javax.swing.JCheckBox RecoveryOfUncollectibleAccount;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton ResetButtonBondsPayable;
    private javax.swing.JButton ResetButtonEPS;
    private javax.swing.JButton ResetButtonInvValuation;
    private javax.swing.JButton ResetButtonInventory;
    private javax.swing.JButton ResetButtonLeases;
    private javax.swing.JButton ResetButtonNonMonExchanges;
    private javax.swing.JButton ResetButtonNotesReceivable;
    private javax.swing.JButton ResetButtonSalesRecourses;
    private javax.swing.JButton ResetButtonTStock;
    private javax.swing.JButton ResetButtonWaso;
    private javax.swing.JButton ResetInvoices;
    private javax.swing.JButton ResetPensions;
    private javax.swing.JButton ResetSalesReturns;
    private javax.swing.JButton ResetUncollectibleButton;
    public static javax.swing.JTextField ResidualValueInput;
    public static javax.swing.JTextField RetainedReservesInput;
    private javax.swing.JLabel SaleOfARButtonMainMenu;
    public static javax.swing.JPanel SalesDiscountForfeitedTAccount;
    public static javax.swing.JTable SalesDiscountForfeitedTAccountTable;
    public static javax.swing.JPanel SalesDiscountTAccount;
    public static javax.swing.JTable SalesDiscountTAccountTable;
    public static javax.swing.JTextField SalesInputInv;
    public static javax.swing.JFormattedTextField SalesPrice;
    private javax.swing.JPanel SalesRecoursePanel;
    private javax.swing.JPanel SalesReturnsAndAllowancesPanel;
    public static javax.swing.JPanel SalesReturnsAndAllowancesTAccount;
    public static javax.swing.JTable SalesReturnsAndAllowancesTAccountTable;
    public static javax.swing.JTextField SalesRevenueInput;
    public static javax.swing.JPanel SalesRevenueTAccount;
    public static javax.swing.JTable SalesRevenueTAccountTable;
    public static javax.swing.JCheckBox SalesTypeLeaseCheck;
    private javax.swing.JTextField SalvValue;
    private javax.swing.JButton SaveJE;
    private javax.swing.JButton SaveJEBondPayable;
    private javax.swing.JButton SaveJEButtonUncollectible;
    private javax.swing.JButton SaveJEDepreciation;
    private javax.swing.JButton SaveJEInvValuation;
    private javax.swing.JButton SaveJEInventory;
    private javax.swing.JButton SaveJEInvoices;
    private javax.swing.JButton SaveJENonMonExchange;
    private javax.swing.JButton SaveJENotesReceivable;
    private javax.swing.JButton SaveJESalesReturns;
    private javax.swing.JButton SaveJETStock;
    private javax.swing.JButton SavePensions;
    public static javax.swing.JTextField SecuritiesEPSInput;
    public static javax.swing.JTable SecuritiesTable;
    private javax.swing.JComboBox<String> SecurityChoice;
    public static javax.swing.JTextField ServiceCostInput;
    public static javax.swing.JTextField SettlementRateInput;
    public static javax.swing.JTextField SharesIssuedInput;
    public static javax.swing.JTextField SharesReaquiredInput;
    public javax.swing.JButton ShowTAccount;
    public static javax.swing.JTextField StockDividendInput;
    private javax.swing.JPanel StockDividendPanel;
    private javax.swing.JPanel StockSplitFrame;
    public static javax.swing.JTextField StockSplitInput;
    private javax.swing.JPanel SumOfYearPanel;
    private javax.swing.JTable SumOfYearTable;
    public static javax.swing.JPanel SuppliesTAccount;
    public static javax.swing.JTable SuppliesTAccountTable;
    public static javax.swing.JTextField TAccountChoice;
    public javax.swing.JList<String> TAccountOptions;
    private javax.swing.JPanel TAccounts;
    private javax.swing.JPanel TAccountsBack;
    public static javax.swing.JTable TStockEducationalTable;
    private javax.swing.JPanel TStockPane;
    public static javax.swing.JLayeredPane TStockTAccount;
    public static javax.swing.JTable TStockTAccountTable;
    public static javax.swing.JTextField TaxRateInput;
    private javax.swing.JPanel TimeValueOfMoneyPanel;
    private javax.swing.JList<String> TimeValueOption;
    private javax.swing.JTextField TimeValueOutput;
    private javax.swing.JLabel TreasuryStockButton;
    private javax.swing.JButton TreasuryStockPracticeProblemsButton;
    private javax.swing.JTable UncollectibleJETable;
    private javax.swing.JTextField UnitPriceInvoices;
    public static javax.swing.JFormattedTextField Units;
    public static javax.swing.JTextField WASOAnswerInput;
    private javax.swing.JLabel WASOCalcButton;
    public static javax.swing.JTextField WASOInput;
    private javax.swing.JPanel WASOPanel;
    public static javax.swing.JTextArea WASOProblemField;
    public static javax.swing.JTextArea WASOProblemOutput;
    public static javax.swing.JTable WASOTable;
    public static javax.swing.JCheckBox WithoutRecourseCheckMark;
    private javax.swing.JCheckBox WriteOffAllowanceAccount;
    private javax.swing.JPanel WriteOffPanel;
    public static javax.swing.JTextField YearsLeaseInput;
    public static javax.swing.JTextField YearsUntilMaturityBondsPayable;
    private javax.swing.JTextField YearsUntilMaturityInput;
    private javax.swing.JCheckBox ZeroInterestBearingNotes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane62;
    private javax.swing.JScrollPane jScrollPane63;
    private javax.swing.JScrollPane jScrollPane64;
    private javax.swing.JScrollPane jScrollPane65;
    private javax.swing.JScrollPane jScrollPane66;
    private javax.swing.JScrollPane jScrollPane67;
    private javax.swing.JScrollPane jScrollPane68;
    private javax.swing.JScrollPane jScrollPane69;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane70;
    private javax.swing.JScrollPane jScrollPane71;
    private javax.swing.JScrollPane jScrollPane72;
    private javax.swing.JScrollPane jScrollPane73;
    private javax.swing.JScrollPane jScrollPane74;
    private javax.swing.JScrollPane jScrollPane75;
    private javax.swing.JScrollPane jScrollPane76;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextArea jTextArea2;
    public javax.swing.JPanel landingJPanel;
    // End of variables declaration//GEN-END:variables

    
}
    
