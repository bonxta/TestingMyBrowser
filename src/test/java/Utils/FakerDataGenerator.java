package Utils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FakerDataGenerator {

  static  Faker faker = new Faker();
    public static String firstname=faker.name().firstName();
    public static String address=faker.address().city();

    @Test
    public void test(){
      System.out.println(address);
        System.out.println(firstname);
    }





}
