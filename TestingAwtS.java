/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testingawts;

/**
 *
 * @author Compute IT
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TestingAwtS extends JFrame implements ActionListener{
     JButton button, button1;
     JTextField textA, textB, sum;
     int num1, num2, total;
     Container c=getContentPane();
     TestingAwtS taw;
    public static void main(String[] args) {
        new TestingAwtS().display();
       
        
    }
    private void display(){
        setSize(new Dimension(400,300));
        //Container c=getContentPane();
        c.setLayout(null);
        JLabel label=new JLabel("Enter two intergers to sum up");
        label.setBounds(16,18,300,13);
        textA=new JTextField();
        textA.setBounds(16, 45, 50, 25);
        textB=new JTextField();
        textB.setBounds(75, 45, 50, 25);
        button=new JButton("Calculate");
        button1=new JButton("Start All Over");
        button.setBounds(16,100,100,25);
        button1.setBounds(16,140,150,25);
        sum=new JTextField();
        sum.setBounds(122,100,50,25);
        button.addActionListener(this);
        button1.addActionListener(this);
        c.add(textA);
        c.add(textB);
        c.add(button);
        c.add(sum);
        c.add(label);
        //c.add(button1);
       // button1.hide();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent evt){
        //button.setText("Ouch!");
        //button.setBackground(Color.red);
        num1=Integer.parseInt(textA.getText());
        num2=Integer.parseInt(textB.getText());
        total=num1+num2;
        //sum.setText(total);
        button.setText("Total is:");
        button.setBackground(Color.green);
        sum.setText(""+total);
        c.add(button1);
        setVisible(true);
        if(evt.getActionCommand().equals("Start All Over")){
            textA.setText("");
            textB.setText("");
            sum.setText("");
            button.setText("Calculate");
            button.setBackground(null);
           setVisible(false);
           taw=new TestingAwtS();
           taw.display();
        }
        
    }
}
