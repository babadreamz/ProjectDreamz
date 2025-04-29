import java.util.Scanner;
public class Nokia1 {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
	int menuChoice = 0;
	while(menuChoice<1 || menuChoice>8){
		System.out.println("Select an item: ");
        	System.out.println("1. Phone book ");
        	System.out.println("2. Messages");
        	System.out.println("3. Chat ");
        	System.out.println("4. Call register");
        	System.out.println("5. Show call duration");
        	System.out.println("6. Show call costs");
        	System.out.println("7. Call cost settings");
        	System.out.println("8. Prepaid credit");
		menuChoice = scan.nextInt();
			if(menuChoice< 1 || menuChoice>8){
				System.out.println("Invalid menu choice");
							}
					}
				switch(menuChoice){
					case 1: {
						int phoneChoice = 0;
						while(phoneChoice<1 || phoneChoice>10){
						System.out.println("PHONEBOOK: Select an option");
                				System.out.println("1. Search");
                				System.out.println("2. Service Nos");
                				System.out.println("3. Add name");
                				System.out.println("4. Erase");
                				System.out.println("5. Edit");
                				System.out.println("6. Assign tone");
                				System.out.println("7. Send b'card");
                				System.out.println("8. Options");
                				System.out.println("9. Speed dials");
                				System.out.println("10. Voice tags");
							phoneChoice = scan.nextInt();
							if(phoneChoice< 1 || phoneChoice>10){
								System.out.println("Enter a valid phone selection");			
									}
								}
							switch(phoneChoice){
									case 1 -> {
									boolean searching = true;
									while(searching){
											
											
									 System.out.println(""" 
											Search your contacts here
											press 1 to go back to previous menu
											""");
											int input = scan.nextInt();
											switch(input){
											case 1 -> searching = false;		
											default ->System.out.println("Please enter a valid selection");	

										}//end of switch searching
										}//end of while searching
										
										}// case search end 

								/*	case 2: System.out.println("Search Nos");break;
									case 3: System.out.println("Add name");break;
									case 4: System.out.println("Erase");break;
									case 5: System.out.println("Edit");break;
									case 6: System.out.println("Assign tone");break;
									case 7: System.out.println("Send b'card");break;
									case 8: {
										int case8 = 0;
										while(case8<1 || case8>2){
											System.out.println("OPTIONS: Select an option below");
											System.out.println("	1. Type of view");
											System.out.println("	2. Memory status");
											case8 = scan.nextInt();
											if(case8<1 || case8>2){
													System.out.print("Invalid Options selection");	
														}
													}
												switch(case8){
													case 1:System.out.println("Type of view");break;
													case 2: System.out.println("Memory status");break;
													}
											}break;
									case 9: System.out.println("Speed dials");break;
									case 10: System.out.println("Voice tags");break;       */ 
						}
						}break;
					case 2:{
						int message = 0;
						while(message<1 || message>10){
							System.out.println("MESSAGES: Select an option");
              						System.out.println("1. Write messages");
                					System.out.println("2. Inbox");
                					System.out.println("3. Outbox");
                					System.out.println("4. Picture messages");
                					System.out.println("5. Templates");
                					System.out.println("6. Smileys");
                					System.out.println("7. Message settings");
                					System.out.println("8. Info service");
                					System.out.println("9. Voice mailbox number");
                					System.out.println("10. Service command editor");
								message = scan.nextInt();
								if(message<1 || message>10){
									System.out.println("Invalid selection, select a valid option");	
											}
										}
							switch(message){
								case 1: System.out.println("Write messages"); break;
                    						case 2: System.out.println("Inbox"); break;
                    						case 3: System.out.println("Outbox"); break;
                    						case 4: System.out.println("Picture messages"); break;
                    						case 5: System.out.println("Templates"); break;
                    						case 6: System.out.println("Smileys"); break;
								case 7: {
									int caseM7 = 0;
									while(caseM7<1 || caseM7>2){
											System.out.println("MESSAGE SETTINGS: Select an option below");
                        								System.out.println("1. Set 1^2");
                        								System.out.println("2. Common^3");

											caseM7 = scan.nextInt();
											if(caseM7<1 || caseM7>2){
												System.out.println("Invalid selection");
														}
											}
											switch(caseM7){
												case 1:{
													int caseM7_1 = 0;
													 while(caseM7_1 <1 || caseM7_1 >3){
														System.out.println("Set1^2: Select an option below");
														System.out.println("1. Message centre number");
                                										System.out.println("2. Message sent as");
                                										System.out.println("3. Message validity");

														caseM7_1 = scan.nextInt();
														if(caseM7_1< 1 || caseM7_1> 3){
															System.out.println("Invalid selection");
																}
															}
														switch(caseM7_1){
														case 1: System.out.println("Message centre number"); break;
                                    										case 2: System.out.println("Message sent as"); break;
                                    										case 3: System.out.println("Message validity"); break;
																}break;
													}
												case 2:{
													int caseM7_2 = 0;
													while(caseM7_2 <1 ||caseM7_2 > 3){
														System.out.println("Common^3: Select an option below");
														System.out.println("1. Delivery report");
                                										System.out.println("2. Reply via same centre");
                                										System.out.println("3. Character support");
														caseM7_2 = scan.nextInt();
														if(caseM7_2<1 || caseM7_2>3){
															System.out.println("Invalid selection");
																}
															}
														switch(caseM7_2){
															case 1: System.out.println("Delivery report"); break;
															case 2: System.out.println("Reply via same centre"); break;	
															case 3: System.out.println("Character support"); break;										}
																}break;
													}break;
									}
							
								case 8: System.out.println("Info service"); break;
                   						case 9: System.out.println("Voice mailbox number"); break;
                    						case 10: System.out.println("Service command editor"); break;
                    }
						}break;
					case 3:{
						System.out.println("Chat");	
						}break;
					case 4:{
						int callReg = 0;
						while(callReg <1 || callReg>8){
								System.out.println("CALL REGISTER: Selection and option below");
								System.out.println("1. Missed calls");
								System.out.println("2. Recieved calls");
								System.out.println("3. Dialled numbers");
								System.out.println("4. Erase recent call list");
								System.out.println("5. Show call duration");
								System.out.println("6. Show call costs");
								System.out.println("7. call cost settings");
								System.out.println("8. prepaid credit");
								callReg = scan.nextInt();
								if(callReg<1 || callReg>8){
									System.out.println("Invalid selection");	
									}
									
									switch(callReg){
										case 1-> System.out.println("Missed call");	
										case 2-> System.out.println("Recieved calls");
										case 3-> System.out.println("Dialled numbers");
										case 4-> System.out.println("Erase recent call list");
										case 5-> {
											int caseCR5 = 0;
											while(caseCR5<1 || caseCR5>5){
													System.out.println("SHOW CALL DURATION: Select options below");
													System.out.println("1. Last call duration");
													System.out.println("2. All calls duration");
													System.out.println("3. Recieved calls duration");
													System.out.println("4. Dialled calls duration");
													System.out.println("5. Clear timers");
														caseCR5 = scan.nextInt();
														if(caseCR5<1 || caseCR5>5){
															System.out.println("Invalid selection");
																	}
														}
												switch(caseCR5){
													case 1-> System.out.println("Last call duration");
													case 2-> System.out.println("All calls duration");
													case 3-> System.out.println("Recieved calls duration");
													case 4-> System.out.println("Dialled calls duration");
													case 5-> System.out.println("Clear timers");
														}
											}
										case 6->{
											int caseCR6 = 0;
											while(caseCR6<1 || caseCR6>3){
													System.out.println("SHOW CALL COSTS: Select an option below");
													System.out.println("1. Last call cost");
													System.out.println("2. All calls' cost");
													System.out.println("3. Clear counters");
													caseCR6 = scan.nextInt();
														if(caseCR6<1 || caseCR6>3){
															System.out.println("Invalid selection");
																	}
														}
														switch(caseCR6){
															case 1-> System.out.println("Last calls' cost");
															case 2-> System.out.println("All calls' cost");
															case 3-> System.out.println("Clear counters");
																}
											}
										case 7->{
											int caseCR7 = 0;
											while(caseCR7<1 || caseCR7>2){
												System.out.println("CALL COST SETTINGS: Select an option below");			
												System.out.println("1. Call cost limit");
												System.out.println("2. Show costs in");
												caseCR7 = scan.nextInt();
													if(caseCR7<1 || caseCR7>2){
														System.out.println("Invalid selection");
																}
															}
												switch(caseCR7){
													case 1-> System.out.println("Call cost limit");
													case 2-> System.out.println("Show costs in");
														}
											}
										case 8-> System.out.println("Prepaid credit");
												
											}
										}
						}break;
					case 5:{
						
						
						}break;
					case 6:{}break;
					case 7:{}break;
					case 8:{}break;
					
						}

    }
}
