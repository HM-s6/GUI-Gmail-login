package myproj;
import javax.swing.*;
import java.awt.*;
public class My {
	
  public static void main(String[] args) {
    
    // frame
    JFrame f = new JFrame("Login page");
    
    //f.setSize(600,400);
    //f.setLocation(450,175);
    f.setBounds(450,175,600,400);
    // icon for the frame
    f.setIconImage(new ImageIcon(My.class.getResource("/gmail/gmail.png")).getImage());
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    // panel 
    JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 600, 400);
        mainPanel.setLayout(null); 
        mainPanel.setBackground(Color.WHITE); 
       
    // gmail icon in the middle
    ImageIcon i = new ImageIcon(My.class.getResource("/gmail/gmail.png"));
    JLabel label = new JLabel(i);
    label.setBounds(250, 17, 100, 100);
    mainPanel.add(label);
    
    // user name label
    JLabel user=new JLabel ("Usernsme: ");
    user.setBounds(100,140,100,27);
    mainPanel.add(user);
    // Enter name 
    JTextField name=new JTextField();
    name.setBounds(200,140,250,27);
    mainPanel.add(name);
    
    // password label
    JLabel password =new JLabel("Password: ");
    password.setBounds(100,180,100,27);
    mainPanel.add(password);
    // Enter password 
    JPasswordField pass =new JPasswordField();
    pass.setBounds(200,180,250,27);
    mainPanel.add(pass);
    
    // check saving pass
    JCheckBox c=new JCheckBox("Save password",false);  
    c.setBounds(200, 280,200, 27);
    c.setBackground(Color.WHITE);
    mainPanel.add(c);
    
    // gender 
    JLabel x=new JLabel("language: ");
    x.setBounds(100,230,100,27);
    mainPanel.add(x);
    // choose gender
    String[] lan = {"Arabic","English"};
    JComboBox g= new JComboBox(lan);
    g.setBounds(200,230,200,27);
    g.setBackground(Color.WHITE);
    mainPanel.add(g);
    
    // login button
    JButton b=new JButton("login");
    b.setBounds(250,320,100,25);
    mainPanel.add(b);
    
    
    //last but not least
    f.add(mainPanel);
    f.setVisible(true);
  }

}