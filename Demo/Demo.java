

package Demo;
import java.awt.Image;
import javax.swing.*;
public class Demo {
    static String WaterBill(String PresentReading, String PreviousReading){
        double ratePerCubicMeters = 47.57;
        
        int present_reading = Integer.parseInt(PresentReading);
        int previous_reading = Integer.parseInt(PreviousReading);
        
        double Consumpttion = present_reading - previous_reading;
        double monthlyBill = Consumpttion * ratePerCubicMeters;
        
        String PrintBill = String.valueOf(monthlyBill);
        JOptionPane.showMessageDialog(null, "Your Monthly Bill: " + PrintBill);
        return PrintBill;
    }

    static String POS(String User){
        JLabel label = new JLabel("<html><center>PRE ORDERING SYSTEM</center></html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JOptionPane.showMessageDialog(null, label);
        String Item[][] = {
                {"[+]EPSON PRINTER", "6560.00"},
                {"[+]DELL SYSTEM UNIT", "15560.00\n"},
                {"[+]VIEW SONIC MONITOR","5500.00"},
                {"[+]MECHANICAL KEYBOARD",""},
            };

        while(User != "s"){
            JOptionPane.showInputDialog(null, "Please Enter Your Name");
        }
        return User;
    }

    static String ParkFee(String Time){
        ImageIcon carImage = new ImageIcon("park.png");
        int ParkTime = Integer.parseInt(Time);
        int fee = 100;
        int formula = (fee * ParkTime);

        String Formula = String.valueOf(formula);
        
        if(ParkTime <= 1){
            JOptionPane.showMessageDialog(null, "Total Fee: " + formula, "PARK FEE", 0, carImage);
            return Formula;
        }else if(ParkTime >= 1 || ParkTime <= 2){
            JOptionPane.showMessageDialog(null, "Total Fee: " + formula, "PARK FEE", 0, carImage);
            return Formula;
        }else if(ParkTime >=2 || ParkTime <= 6){
            JOptionPane.showMessageDialog(null, "Total Fee: " + formula, "PARK FEE", 0, carImage);
            return Formula;
        }else if(ParkTime >= 6 || ParkTime < 24){
            JOptionPane.showMessageDialog(null, "Total Fee: " + formula, "PARK FEE", 0, carImage);
            return Formula;
        } else {
            return Formula;
        }
    }

    /*static String payRoll(String PayRoll){
        int payroll = Integer.valueOf(PayRoll);

    } */

    
    public static void main(String[] args){
        JOptionPane pane = new JOptionPane();

        //image 
        ImageIcon icon = new ImageIcon("Lagro.png");
        
        //Title
        JLabel Title = new JLabel("<html><center><h1>Lagro High School</h1></center></html>");
        Title.setHorizontalAlignment(SwingConstants.CENTER);

        //buttons
        String buttonOption[] = {"WATER BILL", "POS", "PARKING FEE", "BMI", "PAY ROLL"};
        var Selection = JOptionPane.showOptionDialog(null, Title, "Lagro High School", 0,3, icon, buttonOption, buttonOption[0]);
        switch(Selection){
        case 0:
            String PresentReading = JOptionPane.showInputDialog("Present Reading: ");
            String PreviousReading = JOptionPane.showInputDialog("Previous Reading: ");
            WaterBill(PresentReading, PreviousReading);
            break;
        case 1:
            String user = JOptionPane.showInputDialog(null, "Enter your Name: ");
            POS(user);
        case 2:
            String ParkTime = JOptionPane.showInputDialog(null,"Enter Time: ");
            ParkFee(ParkTime);
            break;
        case 3:

            break;
        case 4:

            break;
        }
        /*
        if(Selection == 0){
            String PresentReading = JOptionPane.showInputDialog("Present Reading: ");
            String PreviousReading = JOptionPane.showInputDialog("Previous Reading: ");
            WaterBill(PresentReading, PreviousReading);
        }
        if(Selection == 1){
            String user = JOptionPane.showInputDialog(null, "Enter your Name: ");
            POS(user);
        }
        if(Selection == 2){
            String ParkTime = JOptionPane.showInputDialog(null,"Enter Time: ");
            ParkFee(ParkTime);
        }
        */
    }
}
