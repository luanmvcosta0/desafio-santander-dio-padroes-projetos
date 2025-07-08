package costa.desafio_santander_dio_padroes_projetos.service.notificacao;

import costa.desafio_santander_dio_padroes_projetos.model.Cliente;

public interface Notificador {

    void notificar(String menssagem, Cliente cliente);

}
