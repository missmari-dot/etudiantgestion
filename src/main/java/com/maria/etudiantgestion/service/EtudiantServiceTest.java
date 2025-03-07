/*package com.maria.etudiantgestion.service;

import com.maria.etudiantgestion.model.Etudiant;
import com.maria.etudiantgestion.repository.EtudiantRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class EtudiantServiceTest {

    @Mock
    private EtudiantRepository etudiantRepository;

    @InjectMocks
    private EtudiantService etudiantService;

    @BeforeEach
    void setUp() {
        // Initialisation avant chaque test (if needed)
    }

    @Test
    void testFindAllEtudiants() {
        // Votre test ici
        when(etudiantRepository.findAll()).thenReturn(new ArrayList<>());
        List<Etudiant> etudiants = etudiantService.findAllEtudiants();
        assertNotNull(etudiants);
    }
}
*/