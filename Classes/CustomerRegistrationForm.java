package Classes;

import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;  //For border
import javax.swing.border.Border;  //For border
import java.io.*;  //Field Backgorund/ Foreground color
import static javax.swing.JOptionPane.showMessageDialog;  //Panal Message
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

import Classes.*;

public class CustomerRegistrationForm extends JFrame
{
    private Container c;
    private ImageIcon icon, homeLogo, submit, img;
    private JLabel imgLabel, cNameReg, cPhnNumReg, cEmailReg, cAddressReg, cCreatePass, cConfirmPass, createAccLabel;
    private JTextField cNameRegTf, cPhnNumRegTf, cEmailRegTf;
    private JTextArea cAddressRegTa;
    private JPasswordField cCreatePassPf, cConfirmPassPf;
    private JButton cRegExit, cRegSubmitBtn;
    private JScrollPane scroll;
    private Font font;


    public CustomerRegistrationForm()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1065, 650);
        this.setTitle("Registration From");
        this.setLayout(null);
        this.setVisible(true);


        this.setResizable(false);
        this.setLocationRelativeTo(null);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#3944BC"));


        //Icon
        icon = new ImageIcon(getClass().getResource("/images/icon.png"));
        this.setIconImage(icon.getImage());
		
		//Logo and images
		img = new ImageIcon(getClass().getResource("/images/signUp.png"));
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		c.add(imgLabel);

		font = new Font(/*Font Name*/ "Times New Roman", Font.PLAIN, /*Font Size*/ 15);

        //Home Button Logo
        homeLogo = new ImageIcon(getClass().getResource("/images/Previous.png"));
        //Admin Login Page to Home Page Button
        cRegExit = new JButton(homeLogo);
        cRegExit.setBounds(20, 20,homeLogo.getIconWidth(), homeLogo.getIconHeight());
		cRegExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cRegExit.setFocusPainted(false);
        cRegExit.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cRegExit.setContentAreaFilled(false);
        imgLabel.add(cRegExit);


        //Action Listener for previous
        cRegExit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerLoginPage();

            }
        });
/*
        //Image
        //Background Image
        img = new ImageIcon(getClass().getResource("/images/Customer.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);
        */

        //Name
        cNameReg = new JLabel("Name");
        cNameReg.setFont(font);
        cNameReg.setForeground(Color.WHITE);
        cNameRegTf = new JTextField();
        cNameRegTf.setBounds(570, 110, 200, 40);
		cNameReg.setBounds(570, 80, 160, 40);
		cNameRegTf.setForeground(Color.BLACK);
		cNameRegTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cNameRegTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cNameRegTf.setCaretColor(Color.BLACK);
        c.add(cNameReg);
        c.add(cNameRegTf);



        //Phone Number
        cPhnNumReg = new JLabel("Phone Number");
        cPhnNumReg.setFont(font);
        cPhnNumReg.setForeground(Color.WHITE);
        cPhnNumRegTf = new JTextField();
        cPhnNumRegTf.setBounds(570, 180, 200, 40);
		cPhnNumReg.setBounds(570, 150, 160, 40);
		setForeground(Color.BLACK);
		cPhnNumRegTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cPhnNumRegTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cPhnNumRegTf.setCaretColor(Color.BLACK);
        c.add(cPhnNumReg);
        c.add(cPhnNumRegTf);



        //Email
        cEmailReg = new JLabel("Email");
        cEmailReg.setFont(font);
        cEmailReg.setForeground(Color.WHITE);
        cEmailRegTf = new JTextField();
        cEmailRegTf.setBounds(800, 180, 200, 40);
		cEmailReg.setBounds(800, 150, 160, 40);
		cEmailRegTf.setForeground(Color.BLACK);
		cEmailRegTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cEmailRegTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cEmailRegTf.setCaretColor(Color.BLACK);
        c.add(cEmailReg);
        c.add(cEmailRegTf);



        //Adress
       /* cAddressReg = new JLabel("Address: ");
        cAddressRegTa = new JTextArea();
        scroll = new JScrollPane(cAddressRegTa);
        cAddressReg.setBounds(250, 280, 90, 50);
        scroll.setBounds(350, 280, 250, 70);
        cAddressRegTa.setLineWrap(true);    //For this when line is complete then next line start
        cAddressRegTa.setWrapStyleWord(true);   //When line is complete then word is strat form next line
        cAddressRegTa.setBackground(new Color(219, 226, 233));
        Border cAddressRegTaBLACKBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 0, 0));
        cAddressRegTa.setBorder(cAddressRegTaBLACKBorder);
        c.add(cAddressReg);
        c.add(scroll); */
		
		cAddressReg = new JLabel("Address");
		cAddressRegTa = new JTextArea();
        cAddressReg.setFont(font);
        cAddressReg.setForeground(Color.WHITE);
        scroll = new JScrollPane(cAddressRegTa);
        scroll.setBounds(570, 250, 400, 70);
		cAddressReg.setBounds(570, 220, 160, 40);
		cAddressRegTa.setLineWrap(true);    //For this when line is complete then next line start
        cAddressRegTa.setWrapStyleWord(true);   //When line is complete then word is strat form next line
		cAddressRegTa.setForeground(Color.BLACK);
		cAddressRegTa.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cAddressRegTa.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cAddressRegTa.setCaretColor(Color.BLACK);
        c.add(cAddressReg);
        c.add(scroll);



        //Password Create
        cCreatePass = new JLabel("Password");
        cCreatePass.setFont(font);
        cCreatePass.setForeground(Color.WHITE);
        cCreatePassPf = new JPasswordField();
        cCreatePassPf.setBounds(570, 350, 200, 40);
		cCreatePass.setBounds(570, 320, 160, 40);
		cCreatePassPf.setForeground(Color.BLACK);
		cCreatePassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cCreatePassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cCreatePassPf.setCaretColor(Color.BLACK);
        c.add(cCreatePass);
        c.add(cCreatePassPf);



        //Confirm Password
    
		
		cConfirmPass = new JLabel("Confirm Password");
        cConfirmPass.setFont(font);
        cConfirmPass.setForeground(Color.WHITE);
        cConfirmPassPf = new JPasswordField();
        cConfirmPassPf.setBounds(800, 350, 200, 40);
		cConfirmPass.setBounds(800, 320, 160, 40);
		cConfirmPassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cConfirmPassPf.setForeground(Color.BLACK);
		cConfirmPassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cConfirmPassPf.setCaretColor(Color.BLACK);
        c.add(cConfirmPass);
        c.add(cConfirmPassPf);



        //Submit Button
        //submit = new ImageIcon(getClass().getResource("/images/Submit2.png"));
        cRegSubmitBtn = new JButton("Submit");
        cRegSubmitBtn.setBounds(570, 430, 140,35);		
        cRegSubmitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));		
        cRegSubmitBtn.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        cRegSubmitBtn.setBackground(Color.decode("#4CBB17"));
		
        //cRegSubmitBtn.setBackground(Color.decode("#F2F2F2"));
        c.add(cRegSubmitBtn);
		
		//extra
		
		createAccLabel = new JLabel("Create Account");
		createAccLabel.setBounds(650, 7, 250, 47);
		createAccLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
		createAccLabel.setForeground(Color.WHITE);
		c.add(createAccLabel);




        //Action Listener for submit button (Registation Page to customer login page)
        cRegSubmitBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String cNameStore = cNameRegTf.getText();  //Name
                String cPhoneNumberStore = cPhnNumRegTf.getText();   //Phone Number
                String cEmailStore = cEmailRegTf.getText();   //Email
                String cAddressStore = cAddressRegTa.getText();   //address
                String cCreatePassStore = cCreatePassPf.getText();   //Create password
                String cConfirmPassStore = cConfirmPassPf.getText();   //Confim Password

              if(cCreatePassStore.equals(cConfirmPassStore))
                {
                    if(cNameStore.isEmpty() || cEmailStore.isEmpty() ||  cAddressStore.isEmpty() || cCreatePassStore.isEmpty() || cConfirmPassStore.isEmpty())
                    {
                        showMessageDialog(null, "Please fill all of the fields.", "WARNING", JOptionPane.WARNING_MESSAGE);
                    }

                    else
                    {
                        try
                        {
                            File file = new File(".\\Data\\customer_data.txt");
                            if(!file.exists())
                            {
                                file.createNewFile();
                            }

                            FileWriter fileWriter = new FileWriter(file, true);
                            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                            PrintWriter printWriter = new PrintWriter(bufferedWriter);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);
                           
                            printWriter.println("Customer Name: "+cNameStore);
                            printWriter.println("Email: " +cEmailStore);
                            printWriter.println("Phone Number: "+cPhoneNumberStore);
                            printWriter.println("Address: "+cAddressStore);
                            printWriter.println("Password: "+cCreatePassStore);
                            printWriter.println("Time & Date: "+timeAndDate);
                            printWriter.println("===============================================");
                            printWriter.println("===============================================");
                            printWriter.close();

                        }

                        catch (Exception ex)
                        {
                            System.out.print(ex);
                        }

                        //showMessageDialog(null, cNameStore, "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        showMessageDialog(null, "Registration Successful", "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        new CustomerLoginPage();
                    }

                }

               else
               {
                   showMessageDialog(null, "Password not same", "WARNING", JOptionPane.WARNING_MESSAGE);
                }
            }

        });



    }

        public static void main(String[] args)
        {
            //setVisible(false);
            CustomerRegistrationForm frame = new CustomerRegistrationForm();
            frame.setVisible(true);
        }



}
