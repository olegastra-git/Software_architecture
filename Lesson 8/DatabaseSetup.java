
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseSetup {
    public static void main(String[] args) {
        try {
            // Устанавливаем соединение с базой данных
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_name", "user", "password");

            // Создаем таблицу User
            Statement stmt = conn.createStatement();
            String createUserTableSQL = "CREATE TABLE User (" +
                    "ID INT PRIMARY KEY AUTO_INCREMENT," +
                    "Name VARCHAR(255)," +
                    "Phone VARCHAR(255)" +
                    ")";
            stmt.executeUpdate(createUserTableSQL);

            // Создаем таблицу Table
            String createTableTableSQL = "CREATE TABLE Table (" +
                    "ID INT PRIMARY KEY AUTO_INCREMENT," +
                    "Number INT," +
                    "Status VARCHAR(255)" +
                    ")";
            stmt.executeUpdate(createTableTableSQL);

            // Создаем таблицу Reservation
            String createReservationTableSQL = "CREATE TABLE Reservation (" +
                    "ID INT PRIMARY KEY AUTO_INCREMENT," +
                    "TableID INT," +
                    "UserID INT," +
                    "Time VARCHAR(255)," +
                    "GuestCount INT," +
                    "FOREIGN KEY (TableID) REFERENCES Table(ID)," +
                    "FOREIGN KEY (UserID) REFERENCES User(ID)" +
                    ")";
            stmt.executeUpdate(createReservationTableSQL);

            // Добавляем данные в таблицы
            String insertUserSQL = "INSERT INTO User (Name, Phone) VALUES ('John', '1234567890')";
            stmt.executeUpdate(insertUserSQL);

            String insertTableSQL = "INSERT INTO Table (Number, Status) VALUES (1, 'Free')";
            stmt.executeUpdate(insertTableSQL);

            String insertReservationSQL = "INSERT INTO Reservation (TableID, UserID, Time, GuestCount) VALUES (1, 1, '2022-01-01 18:00:00', 4)";
            stmt.executeUpdate(insertReservationSQL);

            // Закрываем соединение с базой данных
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}