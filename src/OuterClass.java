// Part 2
public class OuterClass {
    private final int privateInt = 1; // Creating a private int to later show it getting printed in all kinds of class methods

    public class InnerClass { // Creating public inner class
        public void displayPrivateInt() {
            System.out.println("Value of privateInt(Inner Class) is " + privateInt);
        } // Creating an inner class method for displaying privateInt
    }

    public void outerMethod() { // Creating an outerMethod inside outerClass
        class LocalClass { // Creating a LocalClass inside outerMethod
            public void displayPrivateInt() {
                System.out.println("Value of privateInt(Local Class) is " + privateInt);
            }
        }
        LocalClass object = new LocalClass(); // Creating a new LocalClass object inside OuterMethod
        object.displayPrivateInt(); // Calling displayPrivateInt method(the one from LocalClass)

        new Runnable() {
            public void run(){
                System.out.println("Value of privateInt(Anonymous) is " + privateInt);
            } // Creating an anonymous class with its method for displaying privateInt
        } .run();
    }

    public static void main(String[] args) {
        OuterClass outerClassObject = new OuterClass(); // Creating an outerClassObject
        OuterClass.InnerClass innerClassObject = outerClassObject.new InnerClass(); // Creating an innerClassObject inside OuterClass
        innerClassObject.displayPrivateInt(); // Calling innerClassObject method
        outerClassObject.outerMethod(); // Calling outerClassObject method
    }
}
