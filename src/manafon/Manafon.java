/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manafon;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Staff
 */
public class Manafon {

    JFrame frame;
    MainPanel mainPanel;
    final String GREETINGPANEL = "opening panel";
    final String FORMEDITINGPANEL = "panel to edit form and shit";

    public Manafon() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new MainPanel();
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Manafon();
    }

    public void newForm() {
        mainPanel.swap(FORMEDITINGPANEL);
    }

    public void finish() {
        mainPanel.swap(GREETINGPANEL);
    }

    public void loadForm() {

    }

    public void clearFrame() {
        frame.getContentPane().removeAll();
        frame.repaint();
    }

    protected class FormEditingPanel extends JPanel {

        JTable table;

        public FormEditingPanel() {
            setLayout(new GridBagLayout());
            setPreferredSize(new Dimension(800, 500));
            GridBagConstraints c = new GridBagConstraints();
            c.weightx = 0.2;
            c.weighty = 0.8;
            
            String Header[] = {"Name","Type","Cache","Default"};
            String Data[][] = {{null,null,null,null}};
            table = new JTable(Data, Header);
            table.setFillsViewportHeight(true);
            table.editCellAt(2, 2);
            JScrollPane tableScrollPanel = new JScrollPane(table);
            c.fill = GridBagConstraints.BOTH;
            c.gridx = 0;
            c.gridy = 0;
            c.gridwidth = 2;
            add(tableScrollPanel, c);
            //return to default
            c.gridwidth = 1;
            c.fill = GridBagConstraints.NONE;

            JButton addButton = new JButton("Add");
            c.gridx = 0;
            c.gridy = 1;
            add(addButton, c);

            JButton finishButton = new JButton("Finish");
            finishButton.addActionListener((ActionEvent e) -> {
                finish();
            });
            c.gridx = 1;
            c.gridy = 1;
            add(finishButton, c);
        }
    }

    /**
     * First panel to show up when this application runs.
     *
     */
    protected class GreetingPanel extends JPanel {

        public GreetingPanel() {
            setPreferredSize(new Dimension(800, 500));
            setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            c.weightx = 1;

            JButton newFormButton = new JButton("New Form"); //button to create a new Form
            newFormButton.addActionListener((ActionEvent e) -> {
                newForm();
            });
            newFormButton.setPreferredSize(new Dimension(300, 100));
            c.gridx = 0;
            c.gridy = 5;
            add(newFormButton, c);

            JButton loadFormButton = new JButton("Load Form"); //button to load an existing Form
            loadFormButton.addActionListener((ActionEvent e) -> {
                loadForm();
            });
            loadFormButton.setPreferredSize(new Dimension(300, 100));
            c.gridx = 1;
            c.gridy = 5;
            add(loadFormButton, c);
        }
    }

    protected class MainPanel extends JPanel {

        CardLayout layout = new CardLayout();

        public MainPanel() {
            setLayout(layout);
            setPreferredSize(new Dimension(800, 500));
            add(new FormEditingPanel(), FORMEDITINGPANEL);
            add(new GreetingPanel(), GREETINGPANEL);
            layout.show(this, GREETINGPANEL);
        }

        public void swap(String panel) {
            layout.show(this, panel);
        }
    }
}
