package br.com.emporio.pontointeligente.api.services;

import br.com.emporio.pontointeligente.api.entities.Empresa;

import java.util.Optional;

public interface EmpresaService {
    /**
     * Busca por cnpj
     *
     * @param cnpj
     * @return
     */
    Optional<Empresa> buscaPorCnpj(String cnpj);

    /**
     * Salvar empresa
     *
     * @param empresa
     * @return
     */
    Empresa persistir(Empresa empresa);

}
