package br.com.emporio.pontointeligente.api.services;

import br.com.emporio.pontointeligente.api.entities.Funcionario;

import java.util.Optional;

public interface FuncionarioService {

    /**
     * Salvar um funcionario
     * @param funcionario
     * @return
     */
    Funcionario persistir(Funcionario funcionario);

    /**
     * Buscar por cpf
     * @param cpf
     * @return
     */
    Optional<Funcionario> buscarPorCpf(String cpf);

    /**
     * Buscar por email
     * @param email
     * @return
     */
    Optional<Funcionario> buscarPorEmail(String email);

    /**
     * Buscar por id
     * @param id
     * @return
     */
    Optional<Funcionario> buscarPorId(Long id);
}
