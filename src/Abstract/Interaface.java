package Abstract;

interface Payment {
    void pay(double amount);
}

public class Interaface {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new Bitcoin();

        processPayment(p1,140);
        processPayment(p2,80);
        processPayment(p3,590);
    }
    public static void processPayment(Payment payment, double amount){
        payment.pay(amount);

    }
}

class CreditCard  implements Payment {

    Double amount;



    @Override public void pay(double amount){
        System.out.println("Paid " + amount + " using CreditCard");
    }
}

class PayPal implements Payment { Double amount;


    @Override public void pay(double amount){
        System.out.println("Paid " + amount + " using PayPal");
    }}
class Bitcoin implements Payment { Double amount;
    
    @Override public void pay(double amount){
        System.out.println("Paid " + amount + " using Bitcoin");
    }}
