package costa.desafio_santander_dio_padroes_projetos.model.repositories;

import costa.desafio_santander_dio_padroes_projetos.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
