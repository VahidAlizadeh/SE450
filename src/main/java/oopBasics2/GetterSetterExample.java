package oopBasics2;

public class GetterSetterExample {
    // Private field

    private int privateInt;

    //Getter
    public int getPrivateInt() {
        return privateInt; }
    //Setter
    public void setPrivateInt(int privateInt) {
        this.privateInt = privateInt;
    }
}

class DemoGetterSetter {
    public static void main(String[] args) {
        System.out.println("***Introducing to Getter and Setter methods.***\n");
        GetterSetterExample sampleOb=new GetterSetterExample();
//Setting the value for the private field
        sampleOb.setPrivateInt(2);
        //Getting the value from the private field.
        System.out.println("The priInt="+ sampleOb.getPrivateInt());
    }
}