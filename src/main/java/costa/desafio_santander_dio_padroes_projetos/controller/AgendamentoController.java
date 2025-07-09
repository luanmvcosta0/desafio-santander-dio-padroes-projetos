package costa.desafio_santander_dio_padroes_projetos.controller;

import costa.desafio_santander_dio_padroes_projetos.model.Agendamento;
import costa.desafio_santander_dio_padroes_projetos.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<Agendamento> agendar(@RequestBody Agendamento agendamento) {
        agendamentoService.agendar(agendamento);

        return ResponseEntity.ok(agendamento);
    }

}
