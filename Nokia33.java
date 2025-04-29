import java.util.Scanner;
public class Nokia33{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

boolean menuChoice = true;
while(menuChoice){
System.out.println("""
	====NOKIA 3310 MAIN MENU====
		1. Phone book
		2. Messages
		3. Chat
		4. Call register	
		5. Tones
		6. Settings
		7. Call divert	
		8. Games		
		9. Calculator	
	 	10. Reminders
		11. Clock	
		12. Profiles	
		13. SIM services	
		Enter 0 to turnoff
			""");

	int menu = scan.nextInt();
	scan.nextLine();
	switch(menu){
	case 0 -> menuChoice = false;
	case 1 -> {
		boolean case1 = true;		
		while(case1){
			System.out.println("""
					1. Search
					2. Search NOs.
					3. Add name
					4. Erase
					5. Edit
					6. Assign tone
					7. Send b'card
					8. Options	
					9. Speed dials
					10. Voice tags	
					Enter 0 to return to previous menu	
						""");
			int phone = scan.nextInt();
			scan.nextLine();
			switch(phone){
				case 0 -> case1 = false;
				case 1-> {System.out.println("Search");
						scan.nextLine();}	
				case 2-> {System.out.println("Service NOs");
						scan.nextLine();}
				case 3-> {System.out.println("Add name");
						scan.nextLine();}
				case 4-> {System.out.println("Erase");
						scan.nextLine();}
				case 5-> {System.out.println("Edit");
						scan.nextLine();}
				case 6-> {System.out.println("Assign tone");
						scan.nextLine();}
				case 7-> {System.out.println("Send b'card");
						scan.nextLine();}
				case 8 -> {
					boolean phoneCase8 = true;
					while(phoneCase8){
						System.out.print(""" 
							1. Type of view
							2. Memory status
							Enter 0 to return to the previous menu
								""");
						int case8 = scan.nextInt();
						scan.nextLine();
					
					switch(case8){
						case 1 -> {System.out.println("Type of view");
								scan.nextLine();}
						case 2 -> {System.out.println("Memory status");
								scan.nextLine();}
						case 0 -> phoneCase8 = false;
						default-> System.out.println("Invalid selection");
						}//end of phonecase8 switch
						}//end of case8 whileloop

					}//end of case8 
				case 9-> {System.out.println("Speed dials");
						scan.nextLine();}
				case 10 -> {System.out.println("Voice tags");
 						scan.nextLine();}				
				}//end of phone switch
			}//end of phone case1 whileloop
			}//end of case 1 switch(phonebook)
		
		case 2 -> {
			boolean messageCase2 = true;
			while(messageCase2){
			System.out.println(""" 
				1. Write messages 
				2. Inbox
				3. Outbox
				4. Picture messages
				5. Templates
				6. Smileys
				7. Message settings
				8. Info service
				9. Voice mailbox number
				10. Service command editor
				Enter 0 to return to previous menu
					""");
				int mCase2 = scan.nextInt();
				scan.nextLine();
				switch(mCase2){
					case 0 -> messageCase2 =false;
					case 1 -> {System.out.println("Write message");
						scan.nextLine();}
					case 2 -> {System.out.println("Inbox");
						scan.nextLine();}
					case 3 -> {System.out.println("Outbox");
						scan.nextLine();}
					case 4 -> {System.out.println("Picture message");
						scan.nextLine();}
					case 5 -> {System.out.println("Templates");
						scan.nextLine();}
					case 6 -> {System.out.println("");
						scan.nextLine();}
					case 7 -> {
						boolean messageCase7 = true;
						while(messageCase7){
							System.out.println("""
								1. Set 1^2
								2. Common^3
								Enter 0 to return
									""");
							int mCase7 = scan.nextInt();
							switch(mCase7){
								case 0 -> messageCase7 = false;
								case 1 -> {
									boolean messageCase7_1 = true;
									while(messageCase7_1){
									System.out.println("""
										1. Message Centre
										2. Message sent as
										3. Message validity
										Enter 0 to return
											""");
									int mCase7_1 = scan.nextInt();
									scan.nextLine();
									switch(mCase7_1){
										case 0 -> messageCase7_1 = false;
										case 1-> {System.out.println("Message centre");
												scan.nextLine();}
										case 2 -> {System.out.println("");
												scan.nextLine();}
										default -> System.out.println("Invalid selection");
										}//end of switch mCase7_1
										
										}//end of messageCase7_1 whileloop
									}// mCase7_1
								case 2 -> {
									boolean messageCase7_2 = true;
									while(messageCase7_2){
									System.out.println("""
										1.Delivery reports
										2.Message sent as
										3.Character support
										Enter 0 to return
											""");
									int mCase7_2 = scan.nextInt();
									scan.nextLine();
									switch(mCase7_2){
										case 0 -> messageCase7_2 = false;
										case 1 -> {System.out.println("Delivery report");
												scan.nextLine();}
										case 2 -> {System.out.println("Message sent as");
												scan.nextLine();}
										case 3 -> {System.out.println("Character support");
												scan.nextLine();}
										}//end of mCase7_2 switch
									}//end of mCase7_2 whileloop
										
									}//end of messageCase7_2
								}//end of switch mCase7
								}//end of messagecase7 whileloop
						}//end of switch case7
					case 8 -> {System.out.println("Info service");
						scan.nextLine();}
					case 9 -> {System.out.println("Voice mailbox");
							scan.nextLine();}
					case 10 -> {System.out.println("");
							scan.nextLine();}
										
					}//end of switchmCase2

					}//End of messageCase2 whileloop
			
			}//end of case 2 switch(messages)
			
		
			
	
	
	
	
	}//end of menu switch


}//menuChoice whileloop
}
}