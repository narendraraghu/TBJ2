
@FunctionalInterface
interface DefaultInteface
{
    default void showMyName()
    {
        System.out.println("Narendra Raghuwanshi");
    }

    void abstractMethod();
}

class DefaultImpl implements DefaultInteface
{

    @Override
    public void abstractMethod() {
        System.out.println("Ths is  abstract method");
    }
}

public class DefaultMethod {

    public static void main(String[] args) {
        new DefaultImpl().abstractMethod();
        new DefaultImpl().showMyName();

    }
}


//    default methods are introduced to add extra features to current interfaces without disrupting their existing implementations.
//    For example, stream() is a default method which is added to Collection interface in Java 8.
//    If stream() would have been added as abstract method, then all classes implementing Collection interface must have implemented stream()
//    method which may have irritated existing users.