package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Iterable<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    @Override
    public Endereco buscarPorId(String cep) {
        Optional<Endereco> endereco = enderecoRepository.findById(cep);
        return endereco.get();
    }
}
