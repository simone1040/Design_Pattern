package com.simone1040.designPattern;

import com.simone1040.designPattern.BuilderPattern.simple.BuilderSimpleBook;
import com.simone1040.designPattern.BuilderPattern.spring_boot.SpringBook;
import com.simone1040.designPattern.FactoryMethod.model.BookFactory;
import com.simone1040.designPattern.Singleton.LoggerThreadSafe;
import com.simone1040.designPattern.Singleton.SingletonLogger;
import com.simone1040.model.Book;
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
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class DesignPatternApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("Design Patter Builder without use of Spring boot")
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
	@DisplayName("Design Patter Builder with use of Spring boot")
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
	@DisplayName("Design Patter Singleton without use of Spring boot")
	public void SingletonPattern(){
		SingletonLogger.getInstance()
				.addRecord("uno");
		SingletonLogger.getInstance()
				.addRecord("due");
		Assertions.assertEquals(SingletonLogger.getInstance().dumpLast(),"due");
		Assertions.assertEquals(SingletonLogger.getInstance().dumpAll(), new ArrayList<>(
				Arrays.asList("uno", "due")
		));


		LoggerThreadSafe.getInstance()
				.addRecord("uno");
		LoggerThreadSafe.getInstance()
				.addRecord("due");
		Assertions.assertEquals(LoggerThreadSafe.getInstance().dumpLast(),"due");
		Assertions.assertEquals(LoggerThreadSafe.getInstance().dumpAll(), new ArrayList<>(
				Arrays.asList("uno", "due")
		));
	}

	@Test
	@DisplayName("Design Patter Factory method without use of Spring boot")
	public void FactoryMethodPattern(){
		Optional<Book> book = BookFactory.getBook(Book.BookType.StoryBook);
		book.ifPresent(value -> Assertions.assertEquals(value.getGenre(), Book.BookType.StoryBook));

		Optional<Book> book1 = BookFactory.getBook(Book.BookType.YellowBook);
		book1.ifPresent(value -> Assertions.assertEquals(value.getGenre(), Book.BookType.YellowBook));
	}
}