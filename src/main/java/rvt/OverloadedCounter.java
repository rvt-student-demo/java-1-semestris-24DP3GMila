package rvt;

public class OverloadedCounter {
    int value;

    public static void main(String[] args) {
        OverloadedCounter number = new OverloadedCounter();
        System.out.println("Counter number: " + number.value());

        number.increase();
        System.out.println("Number after increase: " + number.value());

        number.decrease();
        System.out.println("Number after decrease: " + number.value());

        number.increase(5);
        System.out.println("Number after increase by 5: " + number.value());

        number.decrease(3);
        System.out.println("Number after decrease by 3: " + number.value());
    }

   public OverloadedCounter(int startValue) {
        this.value = startValue;
    }

    public OverloadedCounter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }

}
