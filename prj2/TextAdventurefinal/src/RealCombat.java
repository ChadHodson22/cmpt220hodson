import java.util.Scanner;
import java.util.Random; 
	public class RealCombat {
		
		
		Scanner input = new Scanner(System.in);
		int health = 100;
		int snakeHealth = 100; 
		int fastAttackDamage = 25;
		int strongAttackDamage = 50;
		int snakeFastAttack = 15;
		int snakeStrongAttack = 25;
		int currentHealth = 0;
		String playerDec;
		boolean strongOrFast;
		//String playerDec = input.next();
		
		
		Random rand = new Random();
		
		public void playersMove() {
			if (playerDec.equals("fast attack")) {
				snakeHealth = snakeHealth - fastAttackDamage;
				System.out.println("You dealt " + fastAttackDamage + " to the snake!\nSnake health: "+snakeHealth);
				chooseEnemyAtack();
			}
			else if (playerDec.equals("strong attack")) {
				snakeHealth = snakeHealth - strongAttackDamage;
				System.out.println("You dealt " + strongAttackDamage + " to the snake!\nSnake health: "+snakeHealth);
				
				chooseEnemyAtack();
			}
			else if (playerDec.equals("dodge")) {
				System.out.println("You dodged  the snake's attack!");
				//getEnemyAttack();
			}
		}
		public void getEnemyAttack()  {
			int choose = rand.nextInt(50) + 1;
			if (choose > 25) {
				strongOrFast = true;
				System.out.println("The snake is preparing to charge with a heavy attack! It has a 35% chance of hitting you!");
				
			}
			else if (choose < 24) {
				strongOrFast = false;
				System.out.println("The snake is preparing to charge with a fast attack! It has a 100% chance of hitting you if you don't dodge!");
				
				
			}
		}
		
		public void chooseEnemyAtack() {
			if (strongOrFast) {
				enemyStrongAttackPrompt();
			} else {
				enemyFastAttackPrompt();
			}
		}
		public void enemyStrongHit() {
			System.out.print("The snake hit you with it's stong attack! you now have " );
			System.out.print(health - snakeStrongAttack);
			System.out.println(" health!");
			health = snakeStrongAttack - health;
		}
		public void enemyStrongMiss() {
			System.out.println("The snake missed you with it's stong attack!");
		}
		private void enemyFastHit() {
				System.out.print("The snake hit you with it's fast attack! you now have " );
				System.out.print(health - snakeFastAttack);
				System.out.println(" health!");
			}
			

		
		public void enemyStrongAttackPrompt() {
				
				enemyHitOrMissHeavy();
		}
		public void enemyFastAttackPrompt() {
			

			enemyFastHit();
		}
		
		public void enemyHitOrMissHeavy() {
			int choose = rand.nextInt(100) + 1;
			if (choose > 30) {
				enemyStrongMiss();
			}
			else if (choose < 35) {
				enemyStrongHit();
			}
		}
		
		public void promptUser() {
			System.out.println("What do you want to do? Fast attack, Strong attack, Dodge");
			playerDec = input.nextLine();

			
		}

		public void main() {
			System.out.println("A giant snake slithers toward you as you wait for the helicopter to pick you up!");
			while (health > 0) {
				//System.out.println("loopiteration");
				getEnemyAttack();
				promptUser();
				playersMove();
				if (snakeHealth == 0) {
					System.out.println("You killed the snake");
					break;
				}
				
				
			}
			
			
		}
		
	}
