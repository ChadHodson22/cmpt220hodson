import java.util.Scanner;
import java.util.Random; 
public class Combat {
	Scanner input = new Scanner(System.in);
	int health = 100;
	int snakeHealth = 100; 
	int fastAttackDamage = 25;
	int strongAttackDamage = 50;
	int snakeFastAttack = 20;
	int snakeStrongAttack = 25;
	String playerDec = input.next();
	
	
	Random rand = new Random();
	
	public void playersMove() {
		String playerDec = input.next();
		if (playerDec.equals("fast attack")) {
			System.out.println("You dealt" + fastAttackDamage + "to the snake!");
			snakeHealth = snakeHealth - fastAttackDamage;
		}
		else if (playerDec.equals("strong attack")) {
			System.out.println("You dealt" + strongAttackDamage + "to the snake!");
			snakeHealth = snakeHealth - strongAttackDamage;
		}
		else if (playerDec.equals("dodge")) {
			System.out.println("You dodged  the snakes attack!");
			snakeHealth = snakeHealth - fastAttackDamage;
		}
	}
	public void getEnemyAttack( )  {
		int choose = rand.nextInt(50) + 1;
		if (choose > 25) {
			enemyStrongAttackPrompt();
		}
		else if (choose < 25) {
			enemyFastAttackPrompt();
		}
	}
	public void enemyStrongHit() {
		System.out.print("The snake hit you with it's stong attack! you now have" );
		System.out.print(health - snakeStrongAttack);
		System.out.println("health!");
		health = snakeStrongAttack - health;
	}
	public void enemyStrongMiss() {
		System.out.print("The snake missed you with it's stong attack!");
	}
	public void enemyFastHit() {
		System.out.print("The snake hit you with it's fast attack! you now have" );
		System.out.print(health - snakeFastAttack);
		System.out.println("health!");
		health = snakeFastAttack - health;
	}
	
	public void enemyStrongAttackPrompt() {
			System.out.println("The snake is preparing to charge with a heavy attack! It has a 35% chance of hitting you!");
			System.out.println("What do you want to do? ");
			System.out.print("Fast attack");
			System.out.print("Strong attack");
			System.out.print("Dodge");
	}
	public void enemyFastAttackPrompt() {
		System.out.println("The snake is preparing to charge with a fast attack! It has a 100% chance of hitting you if you don't dodge!");
		System.out.println("What do you want to do? ");
		System.out.print("Fast attack");
		System.out.print("Strong attack");
		System.out.print("Dodge");
		playersMove();
	}
	
	public void enemyHitOrMissHeavy() {
		int choose = rand.nextInt(100) + 1;
		if (choose > 35) {
			enemyStrongMiss();
		}
		else if (choose < 35) {
			enemyStrongHit();
		}
	}
	public static void main() {
		System.out.print("A giant snake slithers toward you as you wait for the helicopter to pick you up!");
	}
}
