package com.savi.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing");
		logger.info("Test case executing again -- 4");
		logger.info("Test case executing pipeline added -- 1");
		assertEquals(true, true);
	}

}
