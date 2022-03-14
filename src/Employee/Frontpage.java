/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;


import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;
public class Frontpage implements ActionListener {
    
 JFrame f; 
    JLabel id,l1;
    JButton b;

    Frontpage(){
 
        f=new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,150,1200,530);
        f.add(l1);


        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        

        b.setBounds(500,600,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(150,30,1000,100);
        lid.setFont(new Font("serif",Font.PLAIN,50));
        lid.setForeground(Color.red);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1200,750);
        f.setLocation(200,100);

        while(true){
            lid.setVisible(false); // lid =  j label
            try{
                Thread.sleep(500); //1000 = 1 second
            }catch(Exception e){} 
            lid.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
           new login();    
        }
    }

    public static void main(String[] arg){
        Frontpage f = new Frontpage();
    }
}

