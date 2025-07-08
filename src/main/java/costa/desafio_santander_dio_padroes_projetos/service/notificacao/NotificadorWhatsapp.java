package costa.desafio_santander_dio_padroes_projetos.service.notificacao;

import costa.desafio_santander_dio_padroes_projetos.model.Cliente;
import costa.desafio_santander_dio_padroes_projetos.util.LoggerSingleton;

public class NotificadorWhatsapp implements Notificador{

    @Override
    public void notificar(String menssagem, Cliente cliente) {
        LoggerSingleton.getInstancia().log("WhatsApp enviado para " + cliente.getTelefone() + ": " + menssagem);
    }

}
