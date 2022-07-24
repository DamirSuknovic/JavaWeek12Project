package fieldTypes;

public class LocalvsInstance {
    public int a = 10; // instance variable -> belongs to the object created from this class

    public void showDifference(){
        int a = 5; // local variable
        System.out.println(a);
    }

    public void showDifference(int number){
        int a = number; // another local variable
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalvsInstance object = new LocalvsInstance(); // default constructor even if we don't create one

        System.out.println("--------coming from the method: local--------");
        object.showDifference();

        System.out.println("--------coming from instance variable--------");
        System.out.println(object.a);

        object.a = 1;
        System.out.println(object.a);

        object.showDifference(8);

    }
}
