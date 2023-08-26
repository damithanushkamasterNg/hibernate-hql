import java.util.Arrays;
import java.util.List;
import repository.CustomerRepository;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepository = new CustomerRepository();

        List<Object[]> customerEntitys = customerRepository.getAllCustomersSQl();
          for (Object[] row : customerEntitys) {
            System.out.println(Arrays.toString(row));
        }
    }
}
