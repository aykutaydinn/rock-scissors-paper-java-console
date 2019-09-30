import java.util.Scanner;
import java.util.Random;
public class Rock
{
 public static void main(String[] args)
 {
 boolean rePlay = true;
 boolean unvalidValue= false;
 
 while (rePlay == true){
 String personPlay; //User's play -- "R", "P", or "S"
String computerPlay="";//Computer's play --"R","P",or "S"
String comPlayFull="";
int computerInt; //Randomly generated number used to
//determine computer's play
Scanner scan = new Scanner(System.in);
Random generator = new Random();
//Get player's play -- note that this is stored as a string
System.out.println("Enter your play: R for Rock, S for Scissors, or P for Paper");
personPlay = scan.nextLine();
while (!"R".equalsIgnoreCase(personPlay) && !"S".equalsIgnoreCase(personPlay) && !"P".equalsIgnoreCase(personPlay) ){
System.out.println("Apparently you entered a invalid character.");
System.out.println("Enter your play: R for Rock, S for Scissors, or P for Paper");
personPlay = scan.nextLine();
}
//Generate computer's play (0,1,2)
computerInt = generator.nextInt(3);
//Translate computer's randomly generated play to string
switch (computerInt)
{
case 0:
computerPlay += "R";
comPlayFull += "Rock";
break;

case 1:
computerPlay += "S";
comPlayFull += "Scissors";
break;

case 2:
computerPlay += "P";
comPlayFull += "Paper";
break;
}
//Print computer's play
System.out.println("Compurer throws " + comPlayFull);
//See who won. Use nested ifs instead of &&.
if (personPlay.equalsIgnoreCase(computerPlay)){
 System.out.println("It's a tie!");
 }
else if (personPlay.equalsIgnoreCase("R")){
 if (computerPlay.equals("S")){
System.out.println("Rock crushes scissors.\nYou win!!");
}
else if(computerPlay.equals("P")){
System.out.println("Paper covers rock.\nYou lost...");
}


}

else if (personPlay.equalsIgnoreCase("S")){
 if (computerPlay.equals("R")){
System.out.println("Rock crushes scissors.\nYou lost...");
}
else if(computerPlay.equals("P")){
System.out.println("Scissors cut paper.\nYou win!!!");
}


}

else if (personPlay.equalsIgnoreCase("P")){
 if (computerPlay.equals("S")){
System.out.println("Scissors cut paper.\nYou lost...");
}
else if(computerPlay.equals("R")){
System.out.println("Paper covers rock.\nYou win!!!");
}




}
Scanner scn1 = new Scanner(System.in);
System.out.print("Please press \"Y\" to play again. Press any button else to exit.  ");
String playAgain = scn1.nextLine();
if (playAgain.equalsIgnoreCase("Y"))
rePlay=true;
else
rePlay=false;

}


}//main
}//class Rock.java