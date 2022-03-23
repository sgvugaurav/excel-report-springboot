package com.gaurav.excelreportspringboot.impl;

import java.util.List;
import java.util.Optional;

import com.gaurav.excelreportspringboot.exception.InvoiceNotFoundException;
import com.gaurav.excelreportspringboot.model.Invoice;
import com.gaurav.excelreportspringboot.repo.InvoiceRepository;
import com.gaurav.excelreportspringboot.service.IInvoiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImplementation implements IInvoiceService{

    @Autowired
    private InvoiceRepository repository;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return repository.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return repository.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        Optional<Invoice> opt = repository.findById(id);

        if(opt.isPresent()) {
            return opt.get();
        } else {
            throw new InvoiceNotFoundException("Invoice with id " + id + " not found");
        }
    }

    @Override
    public void deleteInvoice(Long id) {
        repository.delete(getInvoiceById(id));
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        repository.save(invoice);
    }
    
}
