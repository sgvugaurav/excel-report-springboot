package com.gaurav.excelreportspringboot.repo;

import com.gaurav.excelreportspringboot.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{
    
}
