package com.gaurav.excelreportspringboot.service;

import com.gaurav.excelreportspringboot.model.Invoice;

import java.util.List;

public interface IInvoiceService {

    public Invoice saveInvoice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoice(Long id);
    public void updateInvoice(Invoice invoice);
}
