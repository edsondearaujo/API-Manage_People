package br.com.attornatus.api.resources;

import br.com.attornatus.api.domain.Person;
import br.com.attornatus.api.domain.dto.PersonDTO;
import br.com.attornatus.api.services.exceptions.ObjectNotFoundException;
import br.com.attornatus.api.services.impl.PersonServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringBootTest
class PersonResourceTest {


    public static final long ID                = 1L;
    public static final String NOME            = "Mar";
    public static final String DATA_NASCIMENTO = "21/04/1996";
    public static final int INDEX = 0;

    @InjectMocks
    private PersonResource resource;

    @Mock
    private PersonServiceImpl service;

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
    void QuandoChamarFindByIdRetorneSucesso() throws ObjectNotFoundException {
        when(service.findById(anyLong())).thenReturn(pessoa);
        when(mapper.map(any(), any())).thenReturn(pessoaDTO);

        ResponseEntity<PersonDTO> response = resource.findById(ID);

        assertNotNull(response);
        assertNotNull(response.getBody());
        assertEquals(ResponseEntity.class, response.getClass());
        assertEquals(PersonDTO.class, response.getBody().getClass());

        assertEquals(ID, response.getBody().getId());
        assertEquals(NOME, response.getBody().getNome());
        assertEquals(DATA_NASCIMENTO, response.getBody().getDataNascimento());
    }

    @Test
    void QuandoBuscarTodosRetorneUmaListaDePessoasDTO() {
        when(service.findAll()).thenReturn(List.of(pessoa));
        when(mapper.map(any(), any())).thenReturn(pessoaDTO);

        ResponseEntity<List<PersonDTO>> response = resource.findByAll();

        assertNotNull(response);
        assertNotNull(response.getBody());
        assertEquals(HttpStatus.OK, response.getStatusCode());

        assertEquals(ResponseEntity.class, response.getClass());
        assertEquals(ArrayList.class, response.getBody().getClass());
        assertEquals(PersonDTO.class, response.getBody().get(INDEX).getClass());

        assertEquals(ID, response.getBody().get(INDEX).getId());
        assertEquals(NOME, response.getBody().get(INDEX).getNome());
        assertEquals(DATA_NASCIMENTO, response.getBody().get(INDEX).getDataNascimento());
    }

    private void startPerson() {

        pessoa = new Person(ID, NOME, DATA_NASCIMENTO);
        pessoaDTO = new PersonDTO(ID, NOME, DATA_NASCIMENTO);
        optionalPerson = Optional.of(new Person(ID, NOME, DATA_NASCIMENTO));

    }
}