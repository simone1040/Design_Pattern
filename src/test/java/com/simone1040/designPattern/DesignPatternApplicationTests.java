package com.simone1040.designPattern;

import com.simone1040.designPattern.BuilderPattern.simple.BuilderSimpleBook;
import com.simone1040.designPattern.BuilderPattern.spring_boot.SpringBook;
import com.simone1040.designPattern.Singleton.SingletonLogger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class DesignPatternApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("Design Patter Buildern without use of Spring boot")
	public void BuilderPatternTestSimple(){
		BuilderSimpleBook book = new BuilderSimpleBook.Builder(10)
				.setTitle("I promessi sposi")
				.setPage(562)
				.setAuthor("Alessandro Manzoni").build();
		Assertions.assertEquals(book.getId(),10);

		//Test without specification of title
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new BuilderSimpleBook.Builder(10)
					.setPage(562)
					.setAuthor("Alessandro Manzoni").build();
		});
	}

	@Test
	@DisplayName("Design Patter Buildern with use of Spring boot")
	public void BuilderPatternTestSpringBoot(){
		SpringBook book = SpringBook.builder().id(10)
				.page(562)
				.title("I promessi sposi")
				.author("Alessandro Manzoni").build();
		Assertions.assertEquals(book.getId(),10);

		Assertions.assertThrows(NullPointerException.class, () -> {
			SpringBook.builder().id(10)
					.page(562)
					.author("Alessandro Manzoni").build();
		});
	}

	@Test
	@DisplayName("Design Patter Buildern without use of Spring boot")
	public void SingletonPattern(){
		SingletonLogger.getInstance()
				.addRecord("uno");
		SingletonLogger.getInstance()
				.addRecord("due");
		Assertions.assertEquals(SingletonLogger.getInstance().dumpLast(),"due");
		Assertions.assertEquals(SingletonLogger.getInstance().dumpAll(), new ArrayList<String>(
				Arrays.asList("uno", "due")
		));
	}
}
