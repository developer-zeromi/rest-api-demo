package me.youngmi.restapiwithspring.events;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)//@RunWith(SpringRunner.class) junit 4 version
@WebMvcTest // Web과 관련 된 빈 등록, MocMvc 주입 받아 사용 가능
public class EventControllerTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void createEvent() throws Exception {
        mockMvc.perform(post("/api/events/") // 요청
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaTypes.HAL_JSON))
                .andExpect(status().isCreated()); // 201 CREATED
    }

    /*
    스프
     */
}
