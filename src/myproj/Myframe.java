package myproj;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Myframe extends JFrame implements ActionListener, ItemListener, KeyListener {
    JPanel panel;
    JTextField text;
    JLabel label, red, green, r, g;
    JTextArea box;
    JButton copy, save;
    JCheckBox bold,plain,italic,underlined;
    JRadioButton enable, disable;
    int x=450, y=30;
    public Myframe() {

        setBounds(450, 100, 700, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // text field
        text = new JTextField();
        text.setBounds(50, 30, 200, 100);

        // label
        label = new JLabel("");
        label.setBounds(x, y, 200, 100);
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // copy
        copy = new JButton("Copy");
        copy.setBounds(310, 90, 65, 30);
        copy.addActionListener(this);

        // enable
        enable = new JRadioButton("Enable");
        enable.setBounds(50, 160, 100, 50);
        enable.setBackground(Color.WHITE);
        enable.addActionListener(this);

        // disable
        disable = new JRadioButton("Disable");
        disable.setBounds(160, 160, 100, 50);
        disable.setBackground(Color.WHITE);
        disable.addActionListener(this);
        
        ButtonGroup group=new ButtonGroup();
        group.add(enable);
        group.add(disable);
        

        // bold button
        bold = new JCheckBox("Bold");
        bold.setBounds(50, 200, 100, 50);
        bold.setBackground(Color.WHITE);
        bold.addItemListener(this);
        
        // italic button
        italic = new JCheckBox("Italic");
        italic.setBounds(160, 200, 100, 50);
        italic.setBackground(Color.WHITE);
        italic.addItemListener(this);
        
        // plain button
        plain = new JCheckBox("Plain");
        plain.setBounds(270, 200, 100, 50);
        plain.setBackground(Color.WHITE);
        plain.addItemListener(this);
        
        // underlined button
        underlined = new JCheckBox("Underlined");
        underlined.setBounds(380, 200, 100, 50);
        underlined.setBackground(Color.WHITE);
        underlined.addItemListener(this);
       

        // red
        red = new JLabel(new ImageIcon(getClass().getResource("/image/red circle.png")));
        red.setBounds(50, 290, 50, 50);

        r = new JLabel("Red");
        r.setBounds(60, 340, 50, 30);
        r.setForeground(Color.RED);
        

        // green
        green = new JLabel(new ImageIcon(getClass().getResource("/image/green circle.png")));
        green.setBounds(160, 290, 50, 50);

        g = new JLabel("Green");
        g.setBounds(167, 340, 50, 30);
        g.setForeground(Color.GREEN);

        // save
        save = new JButton("Save");
        save.setBounds(310, 400, 70, 35);
        save.addActionListener(this);

        // panel
        panel = new JPanel(null);
        panel.setBounds(0, 0, 700, 575);
        panel.setBackground(Color.WHITE);

        panel.add(text);
        panel.add(label);
        panel.add(copy);
        panel.add(enable);
        panel.add(disable);
        panel.add(bold);
        panel.add(italic);
        panel.add(plain);
        panel.add(underlined);
        panel.add(red);
        panel.add(green);
        panel.add(r);
        panel.add(g);
        panel.add(save);

        add(panel);
        
        // color click
        red.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setForeground(Color.RED);
                panel.requestFocus();
            }
        });
        r.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setForeground(Color.RED);
                panel.requestFocus();
            }
        });

        green.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setForeground(Color.GREEN);
                panel.requestFocus();
            }
        });
        g.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setForeground(Color.GREEN);
                panel.requestFocus();
            }
        });

        // key listener  
        panel.setFocusable(true);
        panel.addKeyListener(this);

        setVisible(true);
        panel.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	 // Copy
        if (e.getSource() == copy) {
            label.setText(text.getText());
        }

        if (e.getSource() == enable) {
            
            text.setEnabled(true);
            disable.setSelected(false); 
            
        }

        if (e.getSource() == disable) {
            
                text.setEnabled(false);
                enable.setSelected(false);  
           
        }

        // Save
        if (e.getSource() == save) {
            label.setText(text.getText());
        }
        if (e.getSource() == save) {
            JOptionPane.showMessageDialog(this, "Saved successfully");
        }
        
        panel.requestFocus(); 

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    	int t =Font.PLAIN;
    	String s =text.getText();
    	if(bold.isSelected()) {
    		t+=Font.BOLD;
    	}
    	if(italic.isSelected()) {
    		t+=Font.ITALIC;
    	}
    	if(plain.isSelected()) {
    		t=Font.PLAIN;
    	}
    	 label.setFont(new Font ("Arial",t,16));
    	 
    	if(underlined.isSelected()) {
    		label.setText("<html><u>"+s+"</u><html>");
    	}else {
    
    	label.setText(s);
    	}
        
       
        panel.requestFocus();
    }

    @Override
    public void keyPressed(KeyEvent e) {
    	// up
        if (e.getKeyCode() == KeyEvent.VK_UP) {
        	y-=5;
            label.setLocation(x, y);
        }
        //down
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        	y+=5;
            label.setLocation(x,y );
        }
        //left
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        	x-=5;
            label.setLocation(x,y);
        }
        // right 
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        	x+=5;
            label.setLocation(x,y);
        }
        panel.requestFocus();
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}