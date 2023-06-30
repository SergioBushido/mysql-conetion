import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos
 {

    public static void main(String[] args) {
      

      

        try {
           
        
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pildoras", "root", "");
            System.out.println("Conexión realizada con éxito.");

            Statement miSt=con.createStatement();
            ResultSet miRs=miSt.executeQuery("SELECT * FROM PRODUCTOS");
            while(miRs.next()){
                System.out.println(miRs.getString(1) +" " + miRs.getString(3));
              }
            miRs.close();
           
            con.close();
            
            //System.out.println("Conexión cerrada.");
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido algún error.");
        }
    }
}
