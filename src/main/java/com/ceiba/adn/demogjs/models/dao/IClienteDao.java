package com.ceiba.adn.demogjs.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ceiba.adn.demogjs.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{
	
}
