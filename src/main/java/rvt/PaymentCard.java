package rvt;

public class PaymentCard {
private double balance;

public PaymentCard(double openingBalance) {
this.balance = openingBalance;
}

public void ToString() {
System.out.println("The card has a balance of " + balance + " euros");
}

public void EatAffordably() {
balance -= 2.60;
}

public void EatHeartily() {
balance -= 4.60;
}

public void AddMoney(double amount) {
balance += amount;
}
public static void main(String[] args) {
PaymentCard card = new PaymentCard(50);
System.out.println(card);

card.EatAffordably();
card.ToString();

card.EatHeartily();
card.ToString();

card.AddMoney(15);
card.ToString();

card.AddMoney(10);
card.ToString();

card.AddMoney(200);
card.ToString();

card.EatAffordably();
card.EatHeartily();
card.ToString();
}
}