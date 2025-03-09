package com.maria.etudiantgestion.controller;

import com.maria.etudiantgestion.model.Etudiant;
import com.maria.etudiantgestion.service.EtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {

    private final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/{id}")
    public Optional<Etudiant> getEtudiantById(@PathVariable Long id) {
        return etudiantService.getEtudiantById(id);
    }

    @PostMapping
    public Etudiant ajouterEtudiant(@RequestBody Etudiant etudiant) {

        return etudiantService.ajouterEtudiant(etudiant);
    }

    @DeleteMapping("/{id}")
    public void supprimerEtudiant(@PathVariable Long id) {
        etudiantService.supprimerEtudiant(id);
    }
}
