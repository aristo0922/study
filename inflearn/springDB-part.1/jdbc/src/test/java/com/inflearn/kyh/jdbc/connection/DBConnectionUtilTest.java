package com.inflearn.kyh.jdbc.connection;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import org.junit.jupiter.api.Test;

class DBConnectionUtilTest {

  @Test
  void connection(){
    Connection connection = DBConnectionUtil.getConnection();
    assertNotNull(connection);
  }

}