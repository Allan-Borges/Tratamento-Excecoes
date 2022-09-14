package entities;

import exceptionss.ExceptionBusiness;

public class Account {
	private String holder;
	private Double Balance;
	private int numero;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(String holder, Double banlance, int numero, Double withdrawLimit) {
		super();
		this.holder = holder;
		Balance = banlance;
		this.numero = numero;
		this.withdrawLimit = withdrawLimit;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBanlance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		Balance = balance;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw(double amount) {
		validate(amount);
		this.Balance -= amount;
	}

	public void deposit(double amount) {
		this.Balance += amount;
	}

	private void validate(double amount) {
		if(amount > withdrawLimit) {
			throw new ExceptionBusiness("Erro de saque.Valor maior que o limite de saque.");
		}
		
		if(amount > Balance) {
			throw new ExceptionBusiness("Erro de saque.saldo insuficiente.");
		}
	}
}
