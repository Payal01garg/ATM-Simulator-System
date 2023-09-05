package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignupTwo extends JFrame implements ActionListener {


    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;

    JComboBox religionCombo, categoryCombo, educationCombo, incomeCombo, occupationCombo;
    String formno;
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 300, 30);
        add(additionalDetails);

        JLabel religion = new JLabel("Religion : ");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String[] valReligion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionCombo = new JComboBox<>(valReligion);
        religionCombo.setBounds(300, 140, 400, 30);
        religionCombo.setBackground(Color.WHITE);
        add(religionCombo);

        JLabel category = new JLabel("Category : ");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String[] valCategory = {"General", "OBC", "SC", "ST", "Other"};
        categoryCombo = new JComboBox<>(valCategory);
        categoryCombo.setBounds(300, 190, 400, 30);
        categoryCombo.setBackground(Color.WHITE);
        add(categoryCombo);

        JLabel income = new JLabel("Income : ");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String[] incomeCategory = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        incomeCombo = new JComboBox<>(incomeCategory);
        incomeCombo.setBounds(300, 240, 400, 30);
        incomeCombo.setBackground(Color.WHITE);
        add(incomeCombo);


        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);


        JLabel qual = new JLabel("Qualification : ");
        qual.setFont(new Font("Raleway", Font.BOLD, 20));
        qual.setBounds(100, 315, 200, 30);
        add(qual);

        String[] eduvals = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        educationCombo = new JComboBox<>(eduvals);
        educationCombo.setBounds(300, 315, 400, 30);
        educationCombo.setBackground(Color.WHITE);
        add(educationCombo);


        JLabel occupation = new JLabel("Occupation : ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);

        String[] occuvals = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationCombo = new JComboBox<>(occuvals);
        occupationCombo.setBounds(300, 390, 400, 30);
        occupationCombo.setBackground(Color.WHITE);
        add(occupationCombo);

        JLabel panno = new JLabel("PAN number : ");
        panno.setFont(new Font("Raleway", Font.BOLD, 20));
        panno.setBounds(100, 440, 200, 30);
        add(panno);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar number : ");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        JLabel seniorcitizen = new JLabel("Senior Citizen : ");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorcitizen.setBounds(100, 540, 200, 30);
        add(seniorcitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540,100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);


        JLabel existaccount = new JLabel("Existing Account : ");
        existaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existaccount.setBounds(100, 590, 200, 30);
        add(existaccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup accgroup = new ButtonGroup();
        accgroup.add(eyes);
        accgroup.add(eno);


        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        String religion = (String) religionCombo.getSelectedItem();
        String category = (String) categoryCombo.getSelectedItem();
        String income =  (String) incomeCombo.getSelectedItem();
        String education =  (String) educationCombo.getSelectedItem();
        String occupation =  (String) occupationCombo.getSelectedItem();
        String seniorcitizen = null; //senior citizen
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }


        String existaccount = null;
        if(eyes.isSelected()){
            existaccount = "Yes";
        } else if (eno.isSelected()) {
            existaccount = "No";
        }

        String panno = panTextField.getText();
        String aadhar = aadharTextField.getText();

        try{

            Conn c = new Conn();
            String query = "insert into signuptwo values ('"+formno+"', '"+religion+"', '"+category+"','"+income+"', '"+education+"', '"+occupation+"', '"+panno+"', '"+aadhar+"', '"+existaccount+"', '"+seniorcitizen+"')";
            c.s.executeUpdate(query);

            //signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){

        new SignupTwo("");
    }
}



