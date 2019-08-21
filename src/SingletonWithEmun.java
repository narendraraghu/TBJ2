class DoubleCheckedLockingSingleton{
    private volatile DoubleCheckedLockingSingleton INSTANCE;

    private DoubleCheckedLockingSingleton(){}

    public DoubleCheckedLockingSingleton getInstance(){
        if(INSTANCE == null){
            synchronized(DoubleCheckedLockingSingleton.class){
                //double checking Singleton instance
                if(INSTANCE == null){
                    INSTANCE = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}

public class SingletonWithEmun
        {

            public static void main(String[] args) {
              DoubleCheckedLockingSingleton doubleCheckedLockingSingleton; //= new DoubleCheckedLockingSingleton();
            //    DoubleCheckedLockingSingleton.class.getClassLoader().getResource();

            }
        }
