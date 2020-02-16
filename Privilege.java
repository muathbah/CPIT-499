/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAU
 */
public class Privilege {

    public String get_total_name(boolean selected, boolean selected0, boolean selected1, boolean selected2) {
    String final_priv="";
        if(selected){
            final_priv=final_priv+"1";
        }else {
            final_priv=final_priv+"0";
        }
        if(selected0){
            final_priv=final_priv+"1";
        }else {
            final_priv=final_priv+"0";
        }
        if(selected1){
            final_priv=final_priv+"1";
        }else {
            final_priv=final_priv+"0";
        }
        if(selected2){
            final_priv=final_priv+"1";
        }else {
            final_priv=final_priv+"0";
        }
    return final_priv;
    }
    
}
