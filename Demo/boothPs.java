import javax.swing.JOptionPane;
  public class boothPs{
    public static void main(String[]args){
	//Collecting costumer name
    	String user = ""; 
		  while(user.isBlank()){ 
		    user = JOptionPane.showInputDialog(null, "Enter your name:", "Pre Ordering System" ,JOptionPane.INFORMATION_MESSAGE);   		      
		} 
		// Collecting costumer item choice
		String strNum = "";
		 while(strNum.isBlank()){	
			 strNum = JOptionPane.showInputDialog(null, "Item choice \n 1 = Epson Pinter \n 2 = Dell System" + 
			"\n 3 = View Sonic Monitor \n 4 = Mechanical Keyboard \nItem number:", "Pre Ordering System" ,JOptionPane.INFORMATION_MESSAGE);
		 } 
		   // Item code
		     int num = Integer.parseInt(strNum); 
				String item = "";
				double price = 0.00;  
					if(num == 1){
						item = "Epson Printer (6560.00)";
						price = 6560.00;
					}else if(num == 2){
						item = "Dell System Unit (15560.00)";
						price = 15560.00;
					}else if(num == 3){
						price = 5500.00;
						item = "View Sonic Monitor | (5500.00)";
					}else if(num == 4){
						item = "Mechanical Keyboard | (3658.00)";
						price = 3658.00;
					}else{
						JOptionPane.showMessageDialog(null, "Invalid: " + num, "Pre Ordering System" ,JOptionPane.INFORMATION_MESSAGE);
					}
					//Quantity of item
			        String strqty = JOptionPane.showInputDialog(null, "Epson Printer | 6560.00\n" 
					                                            +"Dell System Unit | 15560.00\n"
																+"View Sonic Monitor | 5500.00\n"
																+"Mechanical Keyboard | 3658.00\n"
																+"Enter Quantity:","Pre Ordering System" ,JOptionPane.INFORMATION_MESSAGE);	
                     int qty = Integer.parseInt(strqty); 
                        JOptionPane.showMessageDialog(null, "You purchase " + qty + " " + item, "Pre Ordering System" ,JOptionPane.INFORMATION_MESSAGE);
						// Payment Method	
						String strpm = JOptionPane.showInputDialog(null, "choose a Payment Method\n1 = cash | 2 = check", "Pre Ordering System" ,JOptionPane.INFORMATION_MESSAGE);  
						    int pm = Integer.parseInt(strpm);
 							double  pctChange = 0.00;	
                              String method = "";							 
							 if(pm == 1){
								    method = "cash";
								     pctChange = 0;
                             }else if(pm == 2){
								    method = "check";
								    pctChange = 10;	
							 }else{
								    JOptionPane.showMessageDialog(null, " Invalid", "Pre Ordering System" ,JOptionPane.INFORMATION_MESSAGE); 
							 }  	
							    JOptionPane.showMessageDialog(null, "You picked " + method + " as payment method" , "Pre Ordering System" ,JOptionPane.INFORMATION_MESSAGE);		
                                  double grossbill = qty * price, 
											addedChange = grossbill * pctChange/100,
											netbill = grossbill + addedChange;									
											JOptionPane.showMessageDialog(null, "\nCostumer Name: " + user + 
																"\nItem Type: " + item + 
																"\nPayment Type : " + method +
																"\nNet Bill: " + netbill, "Receipt" ,JOptionPane.INFORMATION_MESSAGE);	
																
		
	}
 }