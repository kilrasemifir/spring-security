package kira.formation.spring.secu.auth;

import kira.formation.spring.secu.SecuApplication;
import kira.formation.spring.secu.auth.dto.RegisterRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = SecuApplication.class
)
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
class AuthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void register() {
        RegisterRequest registerRequest = new RegisterRequest("kira","password");
    }

    @Test
    void login() {
    }
}