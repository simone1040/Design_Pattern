package com.simone1040.designPattern;

import com.simone1040.designPattern.BuilderPattern.simple.model.Book;
import com.simone1040.designPattern.BuilderPattern.spring_boot.model.SpringBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class DesignPatternApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("Design Patter Buildern without use of Spring boot")
	public void BuilderPatternTestSimple(){
		Book book = new Book.Builder(10)
				.setTitle("I promessi sposi")
				.setPage(562)
				.setAuthor("Alessandro Manzoni").build();
		Assertions.assertEquals(book.getId(),10);

		//Test without specification of title

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Book book1 = new Book.Builder(10)
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
			SpringBook book1 = SpringBook.builder().id(10)
					.page(562)
					.author("Alessandro Manzoni").build();
		});

	}

}
