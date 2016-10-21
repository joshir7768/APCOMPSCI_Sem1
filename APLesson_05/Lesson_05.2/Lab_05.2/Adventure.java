import java.util.Scanner;
public class Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("you are a spy who is in a bad guy's mansion and you need to get some information from a computer ina room on the thrid floor before you are caught. You enter through the basement and are now on the first floor.");
		System.out.println("The information you need is on the top floor but men with guns are gaurding the exits. What do you do? ");
		System.out.println("Would you" +  
		                    "\n 1. Just go for it and kick their butts. Or " + 
							"\n 2. Better do the stealth way and go through the vents. ");
	    int choice = kb.nextInt();
		if (choice == 1)
		{
			System.out.println("You (obviously) beat them up but you were making to much noise so now you are capture and soon will be killed.");
			String choice1 = kb.next();
			System.out.println("You are taken to a cell where you just wait for someone to come. You notice that the cell had a skylight. What do you do with that information?");
			String choice1 = kb.next();
			System.out.println("Would you" +  
		                    "\n 1. Try to jump. Or " + 
							"\n 2. Wait it out. Your time will come. ");
			int choice = kb.nextInt();				
			if(choice ==1)
			{
				System.out.println("You try to jump to get out. The gaurds outside hear you making some noise and enter and see what you are trying to do. they then take you to another cell which has nothing there. So you have no choice but to wait.");
				String choice1 = kb.next();
				System.out.println("You wait for what seems like an hour then sudenly a woman comes in with a stool ans sits in front of you. You wait for her to say something but she doesn't do anything. You see the chair again and see that the woman is not doing anything. Do you wait or use the chair against her?");
				String choice1 = kb.next();
				System.out.println("Would you" +  
		                    "\n 1. wait it out Or " + 
							"\n 2. Go on the offensive. Show her what you got! ");
				int choice = kb.nextInt();
				if(choice ==1)
				{
					System.out.println("You wait and wait but neither of you say or do anything. Then two men come in and take you away. You realize that woman was jut there to make sure you don't do anything or try to escape again. You were never seen since. Mission failed! "); 
					String choice1 = kb.next();
				}
				else
				{
					System.out.println("You wait till she is distracted then get up quickly kick her in the stomach, use the stool and her on the head, break the stool,and go ninja on the gaurds outside. You go to the room that has the information and escape. Mission Accomplished! ");
					String choice1 = kb.next();
				}
			}
			else
			{
				System.out.println("You do not do anything and wait."); 
				String choice1 = kb.next();
				System.out.println("You wait for maybe an hour and sudenly a woman comes in with a stool. While she is distracted you grab the stool, hit the woman with it and use the stool to get out through the sky light.");
				if(choice ==1)
				{
					System.out.println("You are on the roof. You have a few minutes before they realie you escaped. Do you escape or complete the mission? ");
					String choice1 = kb.next();
					System.out.println("What do you do? " +  
		                    "\n 1. Complete the mission Or " + 
							"\n 2. Escape! ");
							int choice = kb.nextInt();
							if (choice ==1)
							{
								System.out.println("You sprint to the room with the information, retrieve it and escape just in time to hear sirens going off in the mansion. Mission Accomplished!");
								String choice1 = kb.next();
							}
							else
							{
								System.out.println("You just leave knowing that would not be able to make it an would just be capture again. Mission failed!");
								String choice1 = kb.next();
				
							}
				 
				}
			}
			
		}
		
		
		else
		{
			System.out.println("You go through the vents and you find yourself on the thrid floor.");
			String choice2 = kb.next();
			
			
			if(choice ==2)
			{
				System.out.println("You find the room with the information but you notie someone behind.There is a gaurd that looks ready to call someone on his walkie-talkie and charge at you. He is much bigger than you and has a ton of tattoos on his face and arms and looks very intimidated. What do you do?  ");
				System.out.println("Would you" +  
		                    "\n 1. get the walkie walkie-talkie before he takls to anyone.  Or " + 
							"\n 2. sprint to the room and get the information.");
				int choice = kb.nextInt(); 
				if(choice ==2)
				{
					System.out.println("You charge at him and just before he pushes the button to talk. You grab it and stomp on it which caues it to break. Sudenly, you are grabbed from behind and can't get out of his grip. He drags you to who knows where and you were never seen again. Mission failed!");
				}
				else
				{
					System.out.println("You sprint into the room and you an hear loud steps speeding up from behind you. Youu make it into the room and slam the door in the gaurd's face. You move every heavy object you can find to block the door. You take the information quickly and leave through the window an sprint away from the mansion. Mission Accomplished! ");
				}
			}
			else
			{
				if(choice ==)
				{
					
				}
				else
				{
					
				}
				
			}
		}
		
	    
		
	

	}
}