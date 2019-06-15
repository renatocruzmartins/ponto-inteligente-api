package com.kazale.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.kazale.pontointeligente.api.entities.Empresa;

@Transactional(readOnly = true) //Apenas consulta sem bloqueio ao banco de dados
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	@Transactional(readOnly = true) //Apenas consulta sem bloqueio ao banco de dados
	Empresa findByCnpj(String cnpj);
}
