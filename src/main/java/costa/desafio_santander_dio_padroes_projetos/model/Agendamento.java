package costa.desafio_santander_dio_padroes_projetos.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Agendamento {

    private Long id;
    private Cliente cliente;
    private Servico servico;
    private String dataHora;

}
