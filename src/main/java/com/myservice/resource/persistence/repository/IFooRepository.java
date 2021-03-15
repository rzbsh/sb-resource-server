package com.myservice.resource.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.myservice.resource.persistence.model.Foo;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}
