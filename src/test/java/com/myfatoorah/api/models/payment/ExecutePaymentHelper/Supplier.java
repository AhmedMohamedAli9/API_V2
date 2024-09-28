package com.myfatoorah.api.models.payment.ExecutePaymentHelper;

public class Supplier {
    private int SupplierCode;
    private double ProposedShare;
    private double InvoiceShare;

    public Supplier(int supplierCode, double proposedShare, double invoiceShare) {
        SupplierCode = supplierCode;
        ProposedShare = proposedShare;
        InvoiceShare = invoiceShare;
    }

    public int getSupplierCode() {
        return SupplierCode;
    }

    public void setSupplierCode(int supplierCode) {
        SupplierCode = supplierCode;
    }

    public double getProposedShare() {
        return ProposedShare;
    }

    public void setProposedShare(double proposedShare) {
        ProposedShare = proposedShare;
    }

    public double getInvoiceShare() {
        return InvoiceShare;
    }

    public void setInvoiceShare(double invoiceShare) {
        InvoiceShare = invoiceShare;
    }
}
