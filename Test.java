package Encapsulation;

public class Test {
    public static void main(String[] args) {

        City city = new City();

        System.out.println(city.getName()); // null because we did not set the name yet

        city.setName("Chicago");

        System.out.println(city.getName());

        city.setState("IL");
        city.setPopulation(3_000_000);

        System.out.println(city.getState());
        System.out.println(city.getPopulation());

        City city1 = new City();
        System.out.println(city1.getName());

        System.out.println(city.language); // null

        city.language = "Chinese";
        System.out.println(city.language);
        System.out.println(city1.language);

        // city1.name = ""; since it's private you can't access it

        city1.zipCode = 111;
        System.out.println(city1.zipCode);// 111 for both cities because it's static
        System.out.println(city.zipCode);//111

        System.out.println(city.getName());
        System.out.println(city1.getName());

        City.setZipCode(222);

        City.getZipCode();












    }
}
