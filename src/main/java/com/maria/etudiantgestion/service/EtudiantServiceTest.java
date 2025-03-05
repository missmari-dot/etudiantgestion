import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EtudiantServiceTest {

    @Mock
    private EtudiantRepository etudiantRepository;

    @InjectMocks
    private EtudiantService etudiantService;

    @BeforeEach
    void setUp() {
        // Initialisation avant chaque test
    }

    @Test
    void testFindAllEtudiants() {
        // Votre test ici
        when(etudiantRepository.findAll()).thenReturn(new ArrayList<>());
        List<Etudiant> etudiants = etudiantService.findAllEtudiants();
        assertNotNull(etudiants);
    }
}
