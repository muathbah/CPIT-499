

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.Class.forName;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.google.firebase.*;

public class Main_class {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
        
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = (Connection) DriverManager.getConnection("Jdbc:mysql://localhost:3306/traffic control system","root","");
//        Statement stat = (Statement) con.createStatement();
//        //stat.execute("create table UserAccount (User_ID char(5) primary key , FName char(15) not null  , LName char (15) not null  , Phone_number char (10) not null  , User_password char (25) not null  , Privilege char (4) not null)");
//        //stat.execute("create table Direction (direction_ID int primary key , 1st char(10) , 2nd char (10) , 3th char (10) , 4th char (10) , 5th char (10))");
//        //stat.execute("create table Roundabout (Roundabout_ID int primary key , Roundabout_Name char(30) not null unique , Number_of_entry int , Currently_green Boolean , Dir_ID int , foreign key(Dir_ID) references Direction(direction_ID))");
//        //stat.execute("create table Sensor_units (R_ID int ,foreign key (R_ID) references Roundabout(Roundabout_ID) , Sensor_ID int primary key , Direction char (20) not null unique , Length int)");
//        //stat.execute("create table UserAccount (User_ID int primary key , FName char(15) not null unique , LName char (15) not null unique , Phone_number char (10) not null unique , User_password char (25) not null unique , Privilege int not null)");
//        stat.close();
//        con.close();
    }
    
}
