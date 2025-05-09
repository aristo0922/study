package com.inflearn.kyh.jdbc.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.inflearn.kyh.jdbc.domain.Member;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;

class MemberRepositoryVOTest {

  MemberRepositoryVO repository = new MemberRepositoryVO();

  @Test
  void save() throws SQLException {
    Member member = new Member("memberVO", 10000);
    repository.save(member);
  }
}