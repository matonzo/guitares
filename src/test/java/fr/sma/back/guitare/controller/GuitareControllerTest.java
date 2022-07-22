package fr.sma.back.guitare.controller;

import fr.sma.back.guitare.domain.Guitare;
import fr.sma.back.guitare.repository.GuitareRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class GuitareControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GuitareRepository guitareRepository;

    @Test
    public void getHello() throws Exception {
        Guitare guitare = new Guitare();
        guitare.setId(1L);
        given(this.guitareRepository.findById(any())).willReturn(java.util.Optional.of(guitare));
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/guitare/1", 1)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1));

    }

}
