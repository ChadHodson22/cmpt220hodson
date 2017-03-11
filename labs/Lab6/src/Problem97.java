import java.util.Date;
// JA: Always add comments to your code
// JA : There is no class to test this
// JA: This code looks exactly the same as another student
	class Account {
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated;

		Account () {
			id = 0;
			balance = 0;
			annualInterestRate = 0;
			dateCreated = new Date();
		}
		Account(int ID, double BALANCE) {
			id = ID;
			balance = BALANCE;
			dateCreated = new Date();
		}
		public int getID() {
			return id;
		}
		public double getBalance() {
			return balance;
		}
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}
		public Date getDateCreated() {
			return dateCreated;
		}
		public double getMonthlyInterestRate() {
			return annualInterestRate/12.0;
		}
		public void withdraw(double amount) {
			balance = balance - amount;
		}
		public void deposit(int i) { // JA: ??
		}
	}
