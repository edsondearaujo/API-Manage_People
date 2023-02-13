package br.com.attornatus.api.services.impl;

import br.com.attornatus.api.domain.Person;
import br.com.attornatus.api.domain.dto.PersonDTO;
import br.com.attornatus.api.respositories.PersonRepository;
import br.com.attornatus.api.services.exceptions.ObjectNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;

import static net.bytebuddy.matcher.ElementMatchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

class PersonServiceImplTest {


    public static final long ID                = 1L;
    public static final String NOME            = "Mar";
    public static final String DATA_NASCIMENTO = "21/04/1996";
    public static final int INDEX = 0;


    @InjectMocks
    private PersonServiceImpl service;

    @Mock
    private PersonRepository repository;

    @Mock
    private ModelMapper mapper;

    private Person pessoa;
    private PersonDTO pessoaDTO;
    private Optional<Person> optionalPerson;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startPerson();
    }

    @Test
    void QuandoBuscarPorIdRetorneUmaPessoa() throws ObjectNotFoundException {
        when(repository.findById(anyLong())).thenReturn(optionalPerson);

        Person response = service.findById(ID);

        assertNotNull(response);
        assertEquals(Person.class, response.getClass());
        assertEquals(ID, response.getId());
        assertEquals(NOME, response.getNome());
        assertEquals(DATA_NASCIMENTO, response.getDataNascimento());

    }


    /*@Test
    void QuandoBuscarPorIdRetorneObjectoNaoEncontrado() {
        when(repository.findById(anyLong())).thenThrow(new ObjectNotFoundException("Objeto não encontrado"));

        try{
            service.findById(ID);
        }catch (Exception ex) {
            assertEquals(ObjectNotFoundException.class, ex.getClass());
            assertEquals("Objeto não encontrado", ex.getMessage());
        }
    }*/

    @Test
    void QuandoBuscarTodosRetorneUmaListaDePessoas() {
        when(repository.findAll()).thenReturn(List.of(pessoa));

        List<Person> response = service.findAll();

        assertNotNull(response);
        assertEquals(1, response.size());
        assertEquals(Person.class, response.get(INDEX).getClass());

        assertEquals(ID, response.get(INDEX).getId());
        assertEquals(NOME, response.get(INDEX).getNome());
        assertEquals(DATA_NASCIMENTO, response.get(INDEX).getDataNascimento());

    }

    @Test
    void update() {
    }

    private void startPerson() {

        pessoa = new Person(ID, NOME, DATA_NASCIMENTO);
        pessoaDTO = new PersonDTO(ID, NOME, DATA_NASCIMENTO);
        optionalPerson = Optional.of(new Person(ID, NOME, DATA_NASCIMENTO));

    }
}