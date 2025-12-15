package co.istad.generictype;
// generic class
public class Box <T, U>{

    private T data;
    private U secondaryData;

    public T getData(){
        return data;

    }
    public void setData(T data){
        this.data = data;
    }

    public U getSecondaryData() {
        return secondaryData;
    }

    public void setSecondaryData(U secondaryData) {
        this.secondaryData = secondaryData;
    }
}
