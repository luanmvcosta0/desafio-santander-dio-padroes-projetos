package costa.desafio_santander_dio_padroes_projetos.service.impl;

import costa.desafio_santander_dio_padroes_projetos.model.Agendamento;
import costa.desafio_santander_dio_padroes_projetos.model.repositories.AgendamentoRepository;
import costa.desafio_santander_dio_padroes_projetos.service.AgendamentoService;
import costa.desafio_santander_dio_padroes_projetos.service.notificacao.Notificador;
import costa.desafio_santander_dio_padroes_projetos.service.notificacao.NotificadorWhatsapp;
import costa.desafio_santander_dio_padroes_projetos.util.LoggerSingleton;
import org.springframework.beans.factory.annotation.Autowired;

public class AgendamentoServiceImpl implements AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    private Notificador notificador = new NotificadorWhatsapp();

    @Override
    public void agendar(Agendamento agendamento) {
        agendamentoRepository.save(agendamento);

        notificador.notificar("Seu agendamento foi confirmado!" , agendamento.getCliente());

        LoggerSingleton.getInstancia().log("Novo agendamento feito para: " + agendamento.getCliente().getNome());
    }

}
