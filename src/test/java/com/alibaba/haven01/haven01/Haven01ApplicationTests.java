package com.alibaba.haven01.haven01;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
@Slf4j
class Haven01ApplicationTests {


	@Test
	void contextLoads() {
	}

	@Autowired
	DataSource dataSource;
	/* 测试数据源的类型*/
	@Test
	public void dataSource() throws SQLException {
		log.info("dataSourceClass:{}",dataSource.getClass());
		Connection connection=dataSource.getConnection();
		connection.close();
	}

}
