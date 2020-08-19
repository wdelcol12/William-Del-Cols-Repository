/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountingSoftware;

/**
 *
 * @author wdelc
 */
public class CheckAnswerWASO {
    public CheckAnswerWASO(){
       String WASOInputString = "";
       int WASOInput = 0;
        
        try {
           WASOInputString = FrameforPanel.WASOAnswerInput.getText();
            WASOInput = Integer.parseInt(WASOInputString);
       }catch (NumberFormatException e){
          
       }
     WasoCalculation was = new WasoCalculation();
     if (was.getWASO() == WASOInput || was.getWASO() == WASOInput+1 || was.getWASO() == WASOInput -1 ||was.getWASO() == WASOInput -2 || was.getWASO() == WASOInput +2 ){
         FrameforPanel.WASOProblemOutput.setText("Correct Answer!");
     }else{
          FrameforPanel.WASOProblemOutput.setText("Incorrect Answer");
     }
    }
}
