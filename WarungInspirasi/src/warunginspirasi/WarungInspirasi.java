/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warunginspirasi;

import javax.swing.UIManager;

/**
 *
 * @author seno
 */
public class WarungInspirasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        }catch(Exception ee){
            System.out.println(ee);
        }
        
        new WarungSolo().setVisible(true);
    }
    
}
