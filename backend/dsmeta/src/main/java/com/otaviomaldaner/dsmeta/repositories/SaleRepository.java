package com.otaviomaldaner.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otaviomaldaner.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
