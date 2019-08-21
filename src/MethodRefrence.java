interface Greetable
{
    public void greet();
}

public class MethodRefrence{


    public  static void sayHello() {
        System.out.println("Hellooooo");
    }


    public static void main(String[] args) {
        Greetable say = MethodRefrence::sayHello;
        say.greet();
    }
}
