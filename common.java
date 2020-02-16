
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingaspx.firebase.util;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAU
 */
public class common {
    public static void initFirebase(){
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