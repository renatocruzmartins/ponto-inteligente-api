package com.kazale.pontointeligente.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//Adicionar um profile para teste
@ActiveProfiles("test")
public class PontointeligenteApplicationTests {

	@Test
	public void contextLoads() {
	}

}
