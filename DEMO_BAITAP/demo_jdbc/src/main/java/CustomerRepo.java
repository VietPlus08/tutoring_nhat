import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepo {

    public List<Customer> getCustomers(){
        List<Customer> customers = new ArrayList<Customer>();
        try{
            Connection connection = DbConnection.createConnection();
            Statement statement = connection.createStatement();
            String sql = "select * from Customer";
            ResultSet rs = statement.executeQuery(sql);


            while (rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setAge(rs.getInt("age"));
                customer.setName(rs.getString("name"));
                customer.setAddress(rs.getString("address"));
                customer.setEmail(rs.getString("email"));
                customers.add(customer);
            }

            statement.close();
            connection.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return customers;
    }

    public void createCustomer(Customer customer){
        String sql = "insert into customer values(?,?,?,?,?)";
        try {
            Connection connection = DbConnection.createConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, customer.getId());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getAddress());
            statement.setString(4, customer.getEmail());
            statement.setInt(5, customer.getAge());
            statement.execute();

            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
