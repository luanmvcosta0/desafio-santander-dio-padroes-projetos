package costa.desafio_santander_dio_padroes_projetos.model.repositories;

import costa.desafio_santander_dio_padroes_projetos.model.Agendamento;
import org.springframework.data.repository.CrudRepository;

public interface AgendamentoRepository extends CrudRepository<Agendamento, Long> {
}
