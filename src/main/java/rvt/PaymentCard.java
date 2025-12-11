package rvt;

public class PaymentCard {
    private double atlikums;

    public PaymentCard(double openingBalance) {
        this.atlikums = openingBalance;
    }

    public void to_string() {
        System.out.println("The card has a balance of " + String.format("%.2f", atlikums) + " euros");
    }

    public void eat_affordably() {
        atlikums -= 2.60;
    }

    public void eat_heartily() {
        atlikums -= 4.60;
    }

    public void add_money(double amount) {
        atlikums += amount;
    }

    public static void main(String[] args) {
        PaymentCard karte = new PaymentCard(50);
        System.out.println(karte);

        karte.eat_affordably();
        karte.to_string();

        karte.eat_heartily();
        karte.to_string();

        karte.add_money(15);
        karte.to_string();

        karte.add_money(10);
        karte.to_string();

        karte.add_money(200);
        karte.to_string();

        karte.eat_affordably();
        karte.eat_heartily();
        karte.to_string();
    }
}