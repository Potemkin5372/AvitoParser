/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package avitoparser;

import static avitoparser.MainJFrame.settings;
import java.io.IOException;

/**
 *
 * @author Potemkin
 */
public class AvitoParser {

    /**
     * @param args the command line arguments
     */
    static public MainJFrame frame2;
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settings.jpg"))); // NOI18N
        //ImageIcon icon=new ImageIcon("N:\\ОЗУ.png");
        //MainJFrame.jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settings.jpg")));
        //MainJFrame.txtMainPane.insertIcon(icon);          
        frame2=new MainJFrame();        
        settings=new Settings();
        frame2.setVisible(true);        
        
    }
    
}
