package HumanResource;

import SalesDepartment.Invoice;

public class JobPortal extends Invoice {

	public void getInvoiceForMaintaingJobPortal() {
		Invoice invoice = new Invoice();
		this.getInvoice(); // protected
		invoice.printInvoice();
	}
}
