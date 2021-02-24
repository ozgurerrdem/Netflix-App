package netflix;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sqlbaglanti {

    static Connection conn = null;
    static Statement stat;

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver bulundu..");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı..");
        }
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/netflix", "root", "");
            stat = conn.createStatement();
            System.out.println("Bağlantı başarılı..");
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız..");
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Kapatıldı..");
            } catch (SQLException e) {
                System.out.println("Kapatılamadı..");
            }
        }
    }

    public static void ekle(String sql_sorgu) {
        try {
            stat.executeUpdate(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Sqlbaglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String sistemTarihiniGetir(String tarihFormati) {
        Calendar takvim = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(tarihFormati);
        return sdf.format(takvim.getTime());
    }
}
