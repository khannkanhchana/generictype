package co.istad.generictype;
// generic method
public class GenericMethodDemo {

    public <T> void print(T data){
        System.out.println("Data is " + data);
    }
}
