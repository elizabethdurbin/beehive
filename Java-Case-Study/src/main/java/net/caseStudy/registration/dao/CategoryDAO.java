package net.caseStudy.registration.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.caseStudy.registration.model.Employee.Category;
 
public class CategoryDAO {
    String databaseURL = "jdbc:mysql://localhost:3306/bookstoredb";
    String user = "root";
    String password = "pass";
     
    public List<Category> list() throws SQLException {
        List<Category> listCategory = new ArrayList<>();
         
        try (Connection connection = DriverManager.getConnection(databaseURL, user, password)) {
            String sql = "SELECT * FROM category ORDER BY name";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) {
                int id = result.getInt("category_id");
                String name = result.getString("name");
                Category category = new Category(id, name);
                     
                listCategory.add(category);
            }          
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }      
         
        return listCategory;
    }
}