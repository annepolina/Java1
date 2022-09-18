
package group4_finreq_cc103;

/**
 *
 * @author Anne Paulyn Dela Cruz
 */
public class McdoTOTALS_Gr4 {
    
    public double totalAmountGr4, totalChangeGr4, amountPaidGr4;
    
    //Create constructor with parameters
        public McdoTOTALS_Gr4(double AmountGr4, double PaidGr4){
            totalAmountGr4 = AmountGr4;
            amountPaidGr4 = PaidGr4;
            
    }



   
        
    //Create the compute method or function
   public double computeChangeGr4(){
       totalChangeGr4 = amountPaidGr4 - totalAmountGr4;
       return totalChangeGr4;
        
    }
}  

