package co.istad.generictype;

public class BoxMain {
    public static void main(String[] args) {
        Box<String, Boolean> box = new Box<>();
        box.setData("Nana");
        box.setSecondaryData(true);
        System.out.println(box.getSecondaryData());
        System.out.println(box.getData());

    }
}
