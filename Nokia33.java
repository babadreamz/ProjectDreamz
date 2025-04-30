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
		
		case 3 -> {System.out.println("Chat");
				scan.nextLine();
				}//end of case3 (chat)
		case 4 -> {
			boolean caseCR = true;
			while (caseCR){
				System.out.print("""
					1. Missed calls
					2. Recieved calls
					3. Dialled numbers
					4. Erase recent call lists
					5. Show call duration
					6. Show call costs
					7. Call cost settings
					8. Prepaid credit
					Enter 0 to return 	
					""");
				int case4CR = scan.nextInt();
				scan.nextLine();
				switch(case4CR){
					case 0 -> caseCR =false;
					case 1 -> {System.out.println("Missed calls");
							scan.nextLine();}
					case 2 -> {System.out.println("Recieved calls");
							scan.nextLine();}
					case 3 -> {System.out.println("Dialled");
							scan.nextLine();}
					case 4 -> {System.out.println("Erase recent call lists");
							scan.nextLine();}
					case 5 -> {
						boolean caseCR5 = true;
						while(caseCR5){
							System.out.println("""
								1. Last call duration
								2. All calls duration
								3. Recieved calls duration
								4. Dialled calls duration
								5. Clear timers
								Enter 0 to return
									""");
							int case5CR = scan.nextInt();
							scan.nextLine();
						switch(case5CR){
							case 0 -> caseCR5 = false;
							case 1 -> {System.out.println("Last call duration");
									scan.nextLine();}
							case 2 -> {System.out.println("All calls duration");
									scan.nextLine();}
							case 3 -> {System.out.println("Recieved calls duration");
									scan.nextLine();}
							case 4 -> {System.out.println(" Dialled calls");
									scan.nextLine();}
							case 5 -> {System.out.println("Clear timers");
									scan.nextLine();}
							default -> System.out.println("Invalid selection");
							}//end of case5CR switch
							}//end of caseCR5 while loop
						}//end of case5 (CR)
					case 6 -> {
						boolean case6CR = true;
						while(case6CR){
						System.out.println("""
							1. Last call cost
							2. All call costs
							3. Clear counters
							Enter 0 to return
								""");
						int caseCR6 = scan.nextInt();
						scan.nextLine();
					switch(caseCR6){
						case 0 -> case6CR = false;
						case 1 -> {System.out.println("Last call cost");
								scan.nextLine();}
						case 2 -> {System.out.println("All call costs");
								scan.nextLine();}
						case 3 -> {System.out.println("Clear counters");
								scan.nextLine();}
						default -> System.out.println("Invalid selection");
						}//end of switch CR6
					}//end of case6CR whileloop
					}//end of case6 CR
				case 7 -> {
					boolean caseCR7 = true;
					while(caseCR7){
						System.out.println("""
						1. Call cost limit
						2. Show costs in
						Enter 0 to return
							""");
					int case7CR = scan.nextInt();
						scan.nextLine();
					switch(case7CR){
						case 0 -> caseCR7 = false;
						case 1 -> {System.out.println("Call cost limit");
								scan.nextLine();}
						case 2 -> {System.out.println("Show costs in");
								scan.nextLine();}
						default -> System.out.println("");
						}//end of caseCR7 switch
						}//end of caseCR7 whileloop
					}//end of caseCR7
			case 8 -> {System.out.println("Prepaid credit");
					scan.nextLine();}
			default -> System.out.println("Invalid selection");
					}//end of case4CR switch
				}//end of case4 (CR) whileloop
			}//end of case4 (call register)	
			//beginning of case 5 of main menu
		case 5 -> {
			boolean case5 = true;
			//begining of menu case5 whileloop
			while(case5){
			System.out.println(""" 
				1. Ringing tone
				2. Ringing volume
				3. Incoming call alert
				4. Composer
				5. Message alert tone
				6. Keypad tones
				7. Warning and game tones
				8. Vibrating alert
				9. Screen saver	
				Enter 0 to return
					""");
			int menuCase5 = scan.nextInt();
				scan.nextLine();
			switch(menuCase5){
				case 0 -> case5 =false;
				case 1 -> {System.out.println("Ringing tone");
						scan.nextLine();}
				case 2 -> {System.out.println("Ringing volume");
						scan.nextLine();}
				case 3 -> {System.out.println("Incoming call alert");
						scan.nextLine();}
				case 4 -> {System.out.println("Composer");
						scan.nextLine();}
				case 5 -> {System.out.println("Message alert tone");
						scan.nextLine();}
				case 6 -> {System.out.println("Keypad tones");
						scan.nextLine();}
				case 7 -> {System.out.println("Warning and game tones");
						scan.nextLine();}
				case 8-> {System.out.println("Vibrating alert");
						scan.nextLine();}
				case 9 -> {System.out.println("Screen saver");
						scan.nextLine();}
				default -> System.out.println("Invalid selection");
				}//end of menucase5 switch
				}// end of menu case 5 whileloop
			}//end of case 5 of main menu	
		//beginning of menu case6
		case 6 -> {
			boolean Mcase6 = true;
			//beginning of menu case6 whileloop
			while(Mcase6){
			System.out.println("""
				1. Call settings
				2. Phone settings
				3. Security settings
				4. Restore factory settings
				Enter 0 to return	
					""");
				int menuCase6 = scan.nextInt();
					scan.nextLine();
				switch(menuCase6){
					//begining of menu case6 subcase1
				case 0 -> Mcase6 = false;
				case 1 -> {
					boolean case6Case1 = true;
					while(case6Case1){
					System.out.println(""" 
					1. Automatic redial
					2. Speed dialling
					3. Call waiting options
					4. Own number sending
					5. Phone line in use
					6. Automatic answer
					Enter 0 to return	
						""");
				int c6c1 = scan.nextInt();
					scan.nextLine();
				switch(c6c1){
					case 0 -> case6Case1 = false;
					case 1 -> {System.out.println("Automatic redial");
							scan.nextLine();}
					case 2 -> {System.out.println("Speed dialling");
							scan.nextLine();}
					case 3 -> {System.out.println("Call waiting options");
							scan.nextLine();}
					case 4 -> {System.out.println("Own number sending");
							scan.nextLine();}
					case 5 -> {System.out.println("Phone line in use");
						scan.nextLine();}
					case 6 -> {System.out.println("Automatic answer");
						scan.nextLine();}
					default -> System.out.println("Invalid selection");
							
						}//end of case6case1 switch
						}//end of case6case1 whileloop	
					}//end of menu case6 subcase1
				case 2 -> {
					boolean case6case2 = true;
					while(case6case2){
						System.out.println("""
						1. Language 
						2. Cell info display
						3. Welcome note
						4. Network selection
						5. Lights
						6. Confirm SIM service actions
						Enter 0 to return
								""");
					int c6c2 = scan.nextInt();
						scan.nextLine();
					switch(c6c2){
						case 0 -> case6case2 = false;
						case 1 -> {System.out.println("Language");
								scan.nextLine();}
						case 2 -> {System.out.println("Cell info display");
							scan.nextLine();}
						case 3 -> {System.out.println("Welcome note");
							scan.nextLine();}
						case 4 -> {System.out.println("Network selection");
							scan.nextLine();}
						case 5 -> {System.out.println("Phone line in use");
							scan.nextLine();}
						case 6 -> {System.out.println("Confirm SIM service actions");
							scan.nextLine();}
						default -> System.out.println("Invalid selection");
						}//end of c6c2 switch 
						}//end of c6c1 whileloop
					}//end of case6case2
				case 3 -> {
					boolean case6case3 = true;
					while(case6case3){
						System.out.println(""" 
						1. Pin code request
						2. Call info display
						3. Welcome note
						4. Closed user group
						5. Phone security
						6. Change access codes
						Enter 0 to return
								""");
					int c6c3 = scan.nextInt();
						scan.nextLine();
					switch(c6c3){
						case 0 -> case6case3 = false;
						case 1 -> {System.out.println("PIN code request");
							scan.nextLine();}
						case 2 -> {System.out.println("Call barring service");
								scan.nextLine();}
						case 3 -> {System.out.println("Fixed dialling");
								scan.nextLine();}
						case 4 -> {System.out.println("Closed user group");
							scan.nextLine();}
						case 5 -> {System.out.println("Phone security");
							scan.nextLine();}
						case 6 -> {System.out.println("Change access codes");
							scan.nextLine();}
						default -> System.out.println("Invalid selection");
						}//end of switch c6c3
						}//end of c6c3 whileloop
					}// end of case6case3 
			case 4 -> {System.out.println("Restore factory settings");
					scan.nextLine();}
			default -> System.out.println("Invalid selection");
					
					}//end of menu case6 switch
				}//end of menu case6 whileloop
			}//end of menu case 6

		case 7 -> {System.out.println("Call divert");
				scan.nextLine();}
		case 8 -> {System.out.println("Games");
					scan.nextLine();}
		case 9 -> {System.out.println("Calculator");
					scan.nextLine();}
		case 10 -> {System.out.println("Reminders");
				scan.nextLine();}
		case 11 -> {
			boolean case11 = true;
			while(case11){
				System.out.println(""" 
				1. Alarm clock
				2. Clock settings 
				3. Date setting
				4. Stopwatch
				5. Countdown timer
				6. Auto update of date and time
				Enter 0 to return
					""");
			int Mcase11 = scan.nextInt();
				scan.nextLine();
			switch(Mcase11){
			case 0 -> case11 = false;
			case 1 -> {System.out.println("Alarm clock");
						scan.nextLine();}
			case 2 -> {System.out.println("Clock settings");
						scan.nextLine();}	
			case 3 -> {System.out.println("Date setting");
					scan.nextLine();}
			case 4 -> {System.out.println("Stopwatch");
					scan.nextLine();}
			case 5 -> {System.out.println("Countdown timer");
					scan.nextLine();}
			case 6 -> {System.out.println("Auto update of date and time");
						scan.nextLine();}
			default -> System.out.println("Invalid selection");
				
				}//end of case11 switch
				}//end of case 11 whileloop
			}// end of menu case 11 
	
	case 12 -> {System.out.println("Profiles");
				scan.nextLine();}
	case 13 -> {System.out.println("SIM services");
				scan.nextLine();}
	default -> System.out.println("Invalid selection");
	
	}//end of menu switch


}//menuChoice whileloop
}
}
