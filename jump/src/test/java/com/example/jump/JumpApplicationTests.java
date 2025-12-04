package com.example.jump;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
@TestPropertySource(properties = { "skip.bean=true" })
class JumpApplicationTests {

	@Test
	void contextLoads() {
        assertEquals(1, 1);
	}

}
