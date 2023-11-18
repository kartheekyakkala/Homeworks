// Author : YKRISHNA SAI

public class PaymentProcessor {
 private PayPal paypal;
 private VisaCard visacard;
 private MasterCard mastercard;
 public PaymentProcessor() {
 paypal = new PayPal();
 visacard = new VisaCard();
 mastercard = new MasterCard();
 }
 public void pay(double amount, String gateway) {
//  decoder.decode(videoFile);
//  extractor.extract(videoFile);
//  encoder.encode(videoFile, format);
    if (gateway == "PayPal"){
        paypal.processPayment(amount);
    }
    else if(gateway == "VisaCard"){
        visacard.processPayment(amount);
    }
    else if(gateway == "MasterCard"){
        mastercard.processPayment(amount);
    }
    else{
        System.out.println("The provided payment gateway is not available!!");
    }
 
}
}


