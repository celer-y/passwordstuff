
package com.mycompany.test1;


import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import java.awt.EventQueue;
import javax.swing.UIManager;



public class Test1 {



      public static void main(String args[]) {


          try {
              UIManager.setLookAndFeel(new FlatNordIJTheme());
          } catch (Exception ex) {
              System.err.println("Failed to initialize FlatLaf.");
          }

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new GUI().setVisible(true);
                  }
            });

      }

}


