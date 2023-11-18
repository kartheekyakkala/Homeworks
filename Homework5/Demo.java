// Author : YKRISHNA SAI

public class Demo {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PaymentProcessor();
        p1.pay(34.56,"PayPal");

       PaymentProcessor p2 = new PaymentProcessor();
        p2.pay(42.00,"MasterCard");

        PaymentProcessor p3 = new PaymentProcessor();
        p3.pay(88.22,"VisaCard");

        PaymentProcessor p4 = new PaymentProcessor();
        p4.pay(100.2,"RuPay");

    }
}

