package function;




public class change_Value {
    public static void main(String[] args) {
        String name= "Avi rai";
        change(name);
        System.out.println(name);
    }

    private static void change(String name) { // here we are creating the new object
        name="Sanjeev";
    }
}
