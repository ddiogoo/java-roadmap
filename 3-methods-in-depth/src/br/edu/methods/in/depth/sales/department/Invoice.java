package br.edu.methods.in.depth.sales.department;

public class Invoice {

	protected void getInvoice() {
		System.out.println("inside invoice method.");
	}
	
	public void printInvoice() {
		this.getInvoice();
	}
}
