
import java.util.Scanner;

public class LittleAdvanture {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		String upstairOrKitchen, rightOrLeft, topOrButtom, greenOrRed;
		String frigeOrCabinet, yesOrNo;

		System.out.println("Welcome to Mitchell's Tiny Adventure");
		System.out.println("Your are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"? ");
		
		upstairOrKitchen = keyboard.next();	
		
		if(upstairOrKitchen.equalsIgnoreCase("upstairs")){
			System.out.println("Two dark bedrooms upstairs, one on the right and one on the left");
			System.out.println("Going to the \"left\" or \"right\"?");
			rightOrLeft = keyboard.next();
			
			if(rightOrLeft.equalsIgnoreCase("right")) {
				System.out.println("This room has a dressor with two big drawers");
				System.out.println("\"top\" drawer or \"buttom\" drawer? ");
				topOrButtom = keyboard.next();
				if(topOrButtom.equalsIgnoreCase("top"))
					System.out.println("A hole opens up on the floor and you fall into the darkness");
				else
					System.out.println("You get suck out of window and die.");
			}
			else {
				System.out.println("This room is dark, only two flashing light switch on the wall. One flashing red, the other flashing green");
				System.out.println("\"Green\" or \"Red\" ?");
				greenOrRed = keyboard.next();
				if (greenOrRed.equalsIgnoreCase("Red"))
					System.out.println("You will shock to death");
				else
					System.out.println("A big green monster came out of dark and swollow your whole");
			}
		}
		else /* user enters kitchen */
		{
			System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side, there is a refrigerator.");
			System.out.println("You may open the \"refrigerator\" or look into a \"cabinet\"? ");
			frigeOrCabinet = keyboard.next();
			if(frigeOrCabinet.equalsIgnoreCase("refrigerator")) {
				System.out.println("Inside the refrigerator, you see food and stuff. It looks pretty nasty.");
				System.out.println("Would you like to eat some of the food? (\"yes\" or \"no\")");
				yesOrNo = keyboard.next();
				if (yesOrNo.equalsIgnoreCase("no"))
					System.out.println("You die of starvation...eventually");
				else
					System.out.println("You die of food poisining...eventually");
			}
			else {
				System.out.println("Cockroches scramble out of the cabinet, and green beady eyes glow in the dark");
				System.out.println("Do you want to run from the kitchen? (\"run\" or \"not\"");
				String runOrNot = keyboard.next();
				if (runOrNot.equalsIgnoreCase("run"))
					System.out.println("You may fall and break you legs");
				else
					System.out.println("You can freeze here and die of starvation");
			}
		}
		
		keyboard.close();
		
	}

}

