import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfListOfStringUsingStreams {

    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );


        List<StaffPublic> result = staff.stream().map(temp -> {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("mkyong".equals(temp.getName())) {
                obj.setExtra("this field is for mkyong only!");
            }
            return obj;
        }).collect(Collectors.toList());

        System.out.println(result);

    }
}

 class Staff {

    private String name;
    private int age;
    private BigDecimal salary;

     public Staff(String name, int age, BigDecimal salary) {
         this.name = name;
         this.age = age;
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Staff{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", salary=" + salary +
                 '}';
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public BigDecimal getSalary() {
         return salary;
     }

     public void setSalary(BigDecimal salary) {
         this.salary = salary;
     }
 }

 class StaffPublic {

     private String name;
     private int age;
     private String extra;



     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getExtra() {
         return extra;
     }

     public void setExtra(String extra) {
         this.extra = extra;
     }
 }