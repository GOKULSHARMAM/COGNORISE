package cognorise_project;
import java.util.Random;
import java.util.Scanner;
public class Numbergame 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Hello Friends, Hope you all fine... Let us play the guessing game!");
		int round = 1;
		int win = 0;
		while(true)
		{
//			System.out.println("Let us Enter into the Round "+round+" : ");
			int count = 10;
			System.out.println("We will give you 10 chances to guess the number. You should guess the number from 1 to 100 ");
			System.out.println("If you guess the random number correctly you will win the round!");
			System.out.println("All The Best!!!");
			int min = 1;
			int max = 100;
			int target = rand.nextInt(max-min+1)+min;
			int i = 1;
			for(i=1;i<=10;i++)
			{
				System.out.println();
				System.out.println("Chance "+i+" Enter the number you guess: ");
				int n = sc.nextInt();
				System.out.println();
				if(n>target) System.out.println("The number you entered is too high!");
				else if(n<target) System.out.println("The number you entered is too low");
				else
				{
					System.out.println("Congratulatios! you guessed the number correctly and won the round "+round+" just by "+i+" chances...");
					win++;
					break;
				}
				count--;
				if(count>0) System.out.println("You still have "+count+" chances!! Try it!");
			}
			System.out.println();
			if(count == 0) 
			{
				System.out.println("Oops! You have lost this round :( but don't give up try another round..");
				System.out.println("Better Luck Next Time!");
				System.out.println();
			}
			System.out.println("Overall rounds played : "+round);
			System.out.println("Overall rounds won : "+win);
			System.out.println();
			System.out.println("Don't leave your hope!!!");
			System.out.println("Do you want to play again: Yes or No");
			sc.nextLine();
			String s = sc.nextLine().toLowerCase();
			if(s.equals("no")) 
			{
				System.out.println();
				System.out.println("Thanks for making your brain thinking more.. See you later!!");
				System.out.println();
				System.out.println("Have a Nice Day :) ");
				break;
			}
			round++;
		}
	}
}