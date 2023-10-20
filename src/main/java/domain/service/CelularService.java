package domain.service;

import domain.model.Celular;
import domain.repository.CelularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelularService {

    @Autowired
    private CelularRepository celularRepository; // Injete o repositório JPA correspondente

    public List<Celular> getAllCelulares() {
        return celularRepository.findAll();
    }

    public Celular getCelularById(Long id) {
        return celularRepository.findById(id).orElse(null);
    }

    public Celular createCelular(Celular celular) {
        return celularRepository.save(celular);
    }

    public Celular updateCelular(Long id, Celular celular) {
        if (celularRepository.existsById(id)) {
            celular.setId(id);
            return celularRepository.save(celular);
        }
        return null;
    }

    public void deleteCelular(Long id) {
        celularRepository.deleteById(id);
    }
}
