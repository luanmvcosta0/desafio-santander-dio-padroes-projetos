package costa.desafio_santander_dio_padroes_projetos.controller;

import costa.desafio_santander_dio_padroes_projetos.model.Servico;
import costa.desafio_santander_dio_padroes_projetos.model.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoRepository servicoRepository;

    @GetMapping
    public ResponseEntity<Iterable<Servico>> listarTodos() {
        return ResponseEntity.ok(servicoRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> buscarPorId(@PathVariable Long id) {
        return servicoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Servico> criar(@RequestBody Servico servico) {
        return ResponseEntity.ok(servicoRepository.save(servico));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Servico> atualizar(@PathVariable Long id, @RequestBody Servico novoServico) {
        return servicoRepository.findById(id).map(servico -> {
            servico.setNome(novoServico.getNome());
            servico.setPreco(novoServico.getPreco());
            return ResponseEntity.ok(servicoRepository.save(servico));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        servicoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}