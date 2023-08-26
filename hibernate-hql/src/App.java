import java.util.List;

import entity.CustomerEntity;
import repository.CustomerRepository;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepository = new CustomerRepository();

        List<CustomerEntity> customerEntitys = customerRepository.getAllCustomers();
        customerEntitys.forEach(System.out::println);
    }
}
