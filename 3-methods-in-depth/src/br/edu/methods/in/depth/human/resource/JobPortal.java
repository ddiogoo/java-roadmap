package br.edu.methods.in.depth.human.resource;

import br.edu.methods.in.depth.sales.department.Invoice;

public class JobPortal extends Invoice {

	public void getInvoiceForMaintaingJobPortal() {
		Invoice invoice = new Invoice();
		this.getInvoice(); // protected
		invoice.printInvoice();
	}
}
