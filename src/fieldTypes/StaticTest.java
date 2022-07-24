package fieldTypes;

public class StaticTest {



    public static void main(String[] args) {

        StaticMethods.displayMessage("Hello from static function");
        StaticMethods object = new StaticMethods();
        object.displayMessage("We are using object to call this method");

        System.out.println("StaticMethods.count = " + StaticMethods.count);

        System.out.println("object num = " + object.num);

        System.out.println(new StaticMethods().num);
       // StaticMethods.instanceMethod();

    }
}
