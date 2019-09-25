interface A2{
    void msg();
}
interface B2{
    void msg();
}

abstract class D
{
    abstract void msg();
}

abstract class E
{
    abstract void msg();
}
class C extends D implements A2,B2
{//suppose if it were

    Object ibj;
    public void msg()
    {
        System.out.println("Insid c");
    }
    public static void main(String args[]){
        C obj=new C();
        obj.msg();//Now which msg() method would be invoked?
    }
}