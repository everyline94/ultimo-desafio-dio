package domain.controller;

import domain.model.Celular;
import domain.service.CelularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/celulares")
public class CelularController {

    @Autowired
    private CelularService celularService; // Injete o serviço correspondente

    @GetMapping
    public List<Celular> getAllCelulares() {
        return celularService.getAllCelulares();
    }

    @GetMapping("/{id}")
    public Celular getCelularById(@PathVariable Long id) {
        return celularService.getCelularById(id);
    }

    @PostMapping
    public Celular createCelular(@RequestBody Celular celular) {
        return celularService.createCelular(celular);
    }

    @PutMapping("/{id}")
    public Celular updateCelular(@PathVariable Long id, @RequestBody Celular celular) {
        return celularService.updateCelular(id, celular);
    }

    @DeleteMapping("/{id}")
    public void deleteCelular(@PathVariable Long id) {
        celularService.deleteCelular(id);
    }
}
