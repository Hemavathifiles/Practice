package demo;

class PaymentMethod {
    void makePayment() {
        System.out.println("Processing payment...");
    }
}

class CreditCard extends PaymentMethod {
    void swipeCard() {
        System.out.println("Swiping Credit Card...");
    }
}

class PayPal extends PaymentMethod {
    void loginToPayPal() {
        System.out.println("Logging into PayPal...");
    }
}

public class Instanceof2 {
    public static void main(String[] args) {
        PaymentMethod payment = new  PaymentMethod(); // Payment can be of any type
        payment = new CreditCard();

        if (payment instanceof CreditCard) {
            CreditCard cc = (CreditCard) payment;
            cc.swipeCard(); // Now you can safely call methods specific to CreditCard
        } else if (payment instanceof PayPal) {
            PayPal pp = (PayPal) payment;
            pp.loginToPayPal(); // Now you can safely call methods specific to PayPal
        }

        // Output: Swiping Credit Card...
    }
}
