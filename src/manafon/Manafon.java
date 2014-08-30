/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manafon;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Staff
 */
public class Manafon {
    
    JFrame frame;
    
    public Manafon() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Manafon().go();
    }
    
    public void go() {
        greeting();
    }
    
    public void greeting() {
        clearFrame();
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(800,500));
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        
        JButton newFormButton = new JButton("New Form");
        newFormButton.addActionListener((ActionEvent e) -> {
            newForm();
        });
        newFormButton.setPreferredSize(new Dimension(300,100));
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(newFormButton,c);
        
        JButton loadFormButton = new JButton("Load Form");
        loadFormButton.addActionListener((ActionEvent e) -> {
            loadForm();
        });
        loadFormButton.setPreferredSize(new Dimension(300,100));
        c.gridx = 1;
        c.gridy = 5;
        mainPanel.add(loadFormButton,c);
        
        frame.add(mainPanel);
        frame.pack();
    }
    
    public void newForm() {
        clearFrame();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setPreferredSize(new Dimension(800,500));
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0.2;
        c.weighty = 0.8;
        
        JTable table = new JTable(2,1);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        mainPanel.add(table, c);
        c.gridwidth = 1;
        
        JButton addButton = new JButton("Add");
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(addButton, c);
        
        JButton finishButton = new JButton("Finish");
        c.gridx = 1;
        c.gridy = 1;
        mainPanel.add(finishButton, c);
        
        frame.add(mainPanel);
    }
    
    public void loadForm() {
        
    }
    
    public void clearFrame() {
        frame.getContentPane().removeAll();
        frame.repaint();
    }
}
