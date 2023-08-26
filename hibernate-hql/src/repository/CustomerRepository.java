package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.CustomerEntity;
import util.SessionFactoryConfiguration;

public class CustomerRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public CustomerEntity getCustomer(String id) {
        CustomerEntity customerEntity = session.get(CustomerEntity.class, id);
        return customerEntity;
    }

    public List<CustomerEntity> getAllCustomers(){
        String sql = "FROM CustomerEntity";
        Query query = session.createQuery(sql);
        List<CustomerEntity> customerEntities = query.list();
        return customerEntities;
    }


     public List<Object[]> getAllCustomersSQl(){
        String sql = "select * from customer";
        Query query = session.createSQLQuery(sql);
        List<Object[]> data = query.list();
        return data;
    }


}
