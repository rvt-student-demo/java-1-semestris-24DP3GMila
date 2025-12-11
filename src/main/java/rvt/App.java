package rvt;

public class App {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);
        System.out.println("Area: " + box.area() + " Volume: " + box.volume());

        Box bigger = box.biggerBox(box);
        System.out.println("Bigger box: ");
        System.out.println("Width: " + bigger.width() + " Height: " + bigger.height() + " Length: " + bigger.length());

        Box smaller = box.smallerBox(box);
        System.out.println("Smaller box");
        System.out.println("Width: " + smaller.width() + " Height: " + smaller.height() + " Length: " + smaller.length());

        System.out.println("Does small box nest inside big box? " + smaller.nests(bigger));
        System.out.println("Does big box nest inside small box? " + bigger.nests(smaller));
    }
}
