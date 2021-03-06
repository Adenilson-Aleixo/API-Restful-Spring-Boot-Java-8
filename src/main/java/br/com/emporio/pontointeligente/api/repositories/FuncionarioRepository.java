package br.com.emporio.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.emporio.pontointeligente.api.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	@Transactional(readOnly = true)
	Funcionario findByCpf(String cpf);
	
	@Transactional(readOnly = true)
	Funcionario findByEmail(String email);
	
	@Transactional(readOnly = true)
	Funcionario findByCpfOrEmail(String cpf, String email);
}
