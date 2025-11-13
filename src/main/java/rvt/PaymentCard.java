package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void to_string() {
        System.out.println("The card has a balance of " + balance + " euros");
    }

    public void eat_affordably() {
        balance -= 2.60;
    }

    public void eat_heartily() {
        balance -= 4.60;
    }

    public void add_money(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eat_affordably();
        card.toString();

        card.eat_heartily();
        card.toString();

        card.add_money(15);
        card.toString();

        card.add_money(10);
        card.toString();

        card.add_money(200);
        card.toString();

        card.eat_affordably();
        card.eat_heartily();
        card.toString();
    }
}