public class PayPalPayment implements PaymentStrategy{
    private double budget = 100000.0;
    private String e_mail;

    PayPalPayment(String e_mail, double budget){
        this.e_mail = e_mail;
        this.budget = budget;
    }

    public String sete_mail(String e_mail){
        return e_mail; 
    }
    public String gete_mail(){
        return e_mail;
    }

    public double getbudget(){
        return budget;
    }

    @Override

    public void Pay( double pagamento){
        if (budget > pagamento){
            budget = budget - pagamento;
        }else{
            System.out.println("Non hai abbastanza soldi!");
        }


    
    }
    public void budget_rimanente(){
        System.out.println("hai pagato : " + e_mail + "ed il credito rimanente è:" +  budget);
        }


}