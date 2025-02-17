 public class CreditCardPayment implements PaymentStrategy{
    private double budget = 100000.0;
    private String numero_carta;

    CreditCardPayment(String numero_carta){
        this.numero_carta = numero_carta;
    }

    public String setnumero_carta(String n_carta){
        return n_carta;
    }
    public String getnumero_carta(){
        return numero_carta;
    }


    public double getbudget(){
        return budget;
    }

    @Override
    public void Pay(double pagamento){
        if (budget > pagamento){
            budget = budget - pagamento;
        }else{
            System.out.println("Non hai abbastanza soldi!");
        }
    }

    
    public void budget_rimanente(){
        System.out.println("hai pagato con la carta: " + numero_carta + "ed il credito rimanente è:" +  budget);
        }
    }

    
    



 