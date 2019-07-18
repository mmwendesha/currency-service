package com.examples.microserv.currency.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.examples.microserv.currency.model.Currency;
@RepositoryRestResource(path="currecies", collectionResourceRel="currecies")
public interface CurrencyRepository extends PagingAndSortingRepository<Currency, Integer> {

}
