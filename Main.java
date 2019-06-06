import marytts.exceptions.MaryConfigurationException;
import marytts.exceptions.SynthesisException;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

@SuppressWarnings("unused")
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(
                            "javax.swing.plaf.metal.MetalLookAndFeel"
                    );
                } catch (Exception ex){
                    ex.printStackTrace();
                }
                //new Find().setVisible(true);
                new Frame().setVisible(true);
            }
        });

   
    }
}
