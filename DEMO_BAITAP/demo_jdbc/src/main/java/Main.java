import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerRepo repo = new CustomerRepo();
//        List<Customer> customers = repo.getCustomers();
//        customers.forEach(System.out::println);

        Customer newCustomer = new Customer();
        newCustomer.setId(2);
        newCustomer.setName("Quang");
        newCustomer.setAddress("tpdn");
        newCustomer.setEmail("123@123.com");
        newCustomer.setAge(30);
        repo.createCustomer(newCustomer);
    }
}
