import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ProductInfo
{
    int imei;

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public ProductInfo(int imei) {
        this.imei = imei;
    }
}

class ProductInMarkert {
    int id;
    String name;
    float price;
    ProductInfo productInfo;

    public ProductInMarkert(int id, String name, float price, ProductInfo productInfo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productInfo = productInfo;
    }
}
public class LambdaForCompositeClass {

    public static void main(String[] args) {
        ProductInfo productInfo = new ProductInfo(123);
        List<ProductInMarkert> list=new ArrayList<ProductInMarkert>();
        list.add(new ProductInMarkert(1,"Samsung A5",17000f,productInfo));
        list.add(new ProductInMarkert(3,"Iphone 6S",65000f,productInfo));
        list.add(new ProductInMarkert(2,"Sony Xperia",25000f,productInfo));
        list.add(new ProductInMarkert(4,"Nokia Lumia",15000f,productInfo));
        list.add(new ProductInMarkert(5,"Redmi4 ",26000f,productInfo));
        list.add(new ProductInMarkert(6,"Lenevo Vibe",19000f,productInfo));

        // using lambda to filter data
        Stream<ProductInMarkert> filtered_data = list.stream().filter(p -> p.price > 20000);

        //narendra method
        list.stream().filter(p -> p.price > 10000).forEach(p -> System.out.println(p.name+": "+p.price+"  : "+productInfo.imei));;


// using lambda to iterate through collection
//        filtered_data.forEach(
//                product -> System.out.println(product.name+": "+product.price)
//        );
    }
}