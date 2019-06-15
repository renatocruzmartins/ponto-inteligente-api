package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

	/** Retorna uma empresa dado um CNPJ.
	 * @param cnpj
	 * @param Optional<Empresa>
	 */
	Optional<Empresa> buscaPorCnpj(String cnpj);
	
	/** Cadastra uma nova empresa na base de dados.
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);
}
