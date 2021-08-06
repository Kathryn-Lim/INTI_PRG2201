/**
 * Name: Kathryn Lim
 * Lab Test 2
 * PRG2201 JAN2021 INTI International University
 */

package labtest2;


class Admission extends Patient{
    private double insurance_amount;
    private double treatment_cost;
    private double total_cost;
    
    public Admission(String n, int age, String addr, String ill,double tc){
        super(n,age,addr,ill);
        setTC(tc);
    }
    
    //mutators
    private void setIA(double ia){
        insurance_amount = ia;
    }
    
    private void setTC(double tc){
        treatment_cost = tc;
    }
    
    private void setTotC(double tc){
        total_cost = tc;
    }
    
    //accesors
    public double getInsuranceAmount(){
        return insurance_amount;
    }
    
    public double getTreatmentCost(){
        return treatment_cost;
    }

    
    //this method will assing the insurance amount based on the type of illness
    public void setInsurance_Coverage(){
        
        if(super.getIlltype() == 'C') //if critical illness
            setIA(500000.0);    //set insurance amount as 500,000
        else
            setIA(100000.0);    //set insurance amount as 100,000
        
    }
    
    //returns total cost by deducting the treatent cost from the insurance amount.
    public double getTotalCost(){
        
        if(treatment_cost < insurance_amount)
            setTotC(0.0);
        else{
            setTotC(treatment_cost - insurance_amount);
        }
        
        return total_cost;
    }
    
    public String toString(){
        return super.toString() + "\tInsurance Coverage: " + getInsuranceAmount() + "\tTreatment Cost: " + getTreatmentCost() + "\tPayment: " +getTotalCost();
    }
    
}//Admission Class
