package com.kingaspx.firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.kingaspx.firebase.util.common;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Class.forName;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.google.firebase.*;

public class Main_class {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

        initFirebase();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("useraccount");
        myRef.setValue("rami", new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError error, DatabaseReference ref) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
//        FileInputStream serviceAccount
//                = new FileInputStream("path/to/serviceAccountKey.json");
//        Firebase firebase = new Firebase("https://------.firebaseIO.com");
//
//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .setDatabaseUrl("https://cpit-499.firebaseio.com")
//                .build();
//
//        FirebaseApp.initializeApp(options);
//
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = (Connection) DriverManager.getConnection("Jdbc:mysql://localhost:3306/traffic control system", "root", "");
//        Statement stat = (Statement) con.createStatement();
        //stat.execute("create table UserAccount (User_ID char(5) primary key , FName char(15) not null  , LName char (15) not null  , Phone_number char (10) not null  , User_password char (25) not null  , Privilege char (4) not null)");
        //stat.execute("create table Direction (direction_ID int primary key , 1st char(10) , 2nd char (10) , 3th char (10) , 4th char (10) , 5th char (10))");
        //stat.execute("create table Roundabout (Roundabout_ID int primary key , Roundabout_Name char(30) not null unique , Number_of_entry int , Currently_green Boolean , Dir_ID int , foreign key(Dir_ID) references Direction(direction_ID))");
        //stat.execute("create table Sensor_units (R_ID int ,foreign key (R_ID) references Roundabout(Roundabout_ID) , Sensor_ID int primary key , Direction char (20) not null unique , Length int)");
        //stat.execute("create table UserAccount (User_ID int primary key , FName char(15) not null unique , LName char (15) not null unique , Phone_number char (10) not null unique , User_password char (25) not null unique , Privilege int not null)");
//        stat.close();
//        con.close();
    }

    public static void initFirebase() {
        FileInputStream refreshToken = null;
        try {
            refreshToken = new FileInputStream("cpit-499.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(refreshToken))
                    .setDatabaseUrl("https://cpit-499.firebaseio.com/")
                    .build();
            FirebaseApp.initializeApp(options);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(common.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(common.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                refreshToken.close();
            } catch (IOException ex) {
                Logger.getLogger(common.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
