package conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
public class MySQL {
    public Connection conecta(){
        String host = "jdbc:mysql://localhost:3306/agenda?zeroDateTimeBehavior=convertToNull";
        String usuario = "root";
        String senha = "dfm123123";
        Connection conexao = null;
        
        try{
            DriverManager.registerDriver(new Driver());
            conexao = DriverManager.getConnection(host,usuario,senha);
        }catch (SQLException e) {
            System.out.println("Ferrou! o bagulho deu errado!!!");
        }
    return conexao;
    }
    
    
}
