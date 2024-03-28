import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ProductDAO {
 private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
 private static final String JDBC_USER = "your_username";
 private static final String JDBC_PASSWORD = "your_password";
 public List<Product> getAllProducts() {
 List<Product> products = new ArrayList<>();
 try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER,
JDBC_PASSWORD);
 PreparedStatement statement = connection.prepareStatement("SELECT * FROM products");
 ResultSet resultSet = statement.executeQuery()) {
 while (resultSet.next()) {
 Product product = new Product();
 product.setProductId(resultSet.getInt("product_id"));
 product.setProductName(resultSet.getString("product_name"));
 product.setPrice(resultSet.getDouble("price"));
 products.add(product);
 }
 } catch (SQLException e) {
 e.printStackTrace();
 }
 return products;
 }
}
