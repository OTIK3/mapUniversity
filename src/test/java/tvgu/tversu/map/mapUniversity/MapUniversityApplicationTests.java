package tvgu.tversu.map.mapUniversity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.File;
import java.nio.file.Files;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MapUniversityApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void sendSvg_shouldReturnSvgFile() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/svg"))
				.andExpect(status().isOk());
	}

}
