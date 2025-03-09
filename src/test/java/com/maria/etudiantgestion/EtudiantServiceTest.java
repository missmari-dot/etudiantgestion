package com.maria.etudiantgestion;

import com.maria.etudiantgestion.model.Etudiant;
import com.maria.etudiantgestion.repository.EtudiantRepository;
import com.maria.etudiantgestion.service.EtudiantService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EtudiantServiceTest {

    @Mock
    private EtudiantRepository etudiantRepository;

    @InjectMocks
    private EtudiantService etudiantService;

    @BeforeEach
    void setUp() {
        // Initialisation avant chaque test (optionnel)
    }

    @Test
    void testGetAllEtudiants() {
        // Simuler un retour vide de la base de données
        when(etudiantRepository.findAll()).thenReturn(new ArrayList<>());

        // Appeler le service
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();

        // Vérifications
        assertNotNull(etudiants); // Vérifie que la liste retournée n'est pas nulle
        assertEquals(0, etudiants.size()); // Vérifie que la liste est bien vide
    }
}
