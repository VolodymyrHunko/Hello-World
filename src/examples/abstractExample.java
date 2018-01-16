package examples;

//abstract class
abstract class Animal{
    protected int legs =4;
    public String name;
    Animal(){
        name = "Irma";
        System.out.println("Parent constructor:"+name);
    }
    //abstract method
    public abstract void animalSound();

    public void setLegs(int num) {
        legs = num;
        System.out.println("Parent method involved:" );
    }
    public void getParent() {
        System.out.print("Parent name:"+name);
    }
}


public class abstractExample extends Animal{
    static String name;
    //constructor
    abstractExample(String s){
        System.out.println(s);
    }

    @Override
    public void animalSound(){
        System.out.println("Woof");
    }

    @Override
    public void getParent() {
        super.getParent();
        System.out.println(" or: "+super.name);
    }

    private static void printFoo() {
        System.out.println("foo in child");
    }

    public static void main(String args[]){
        Animal obj = new abstractExample("Child constrictor invoked FIRST.");
        System.out.println(obj.name);
        System.out.println(obj.legs);
        obj.animalSound();
        obj.setLegs(3);
        System.out.println("Way! legs = "+obj.legs);
        name = "Lucy";
        System.out.println("Child name->"+name);

        obj.getParent();

        printFoo();

    }

}