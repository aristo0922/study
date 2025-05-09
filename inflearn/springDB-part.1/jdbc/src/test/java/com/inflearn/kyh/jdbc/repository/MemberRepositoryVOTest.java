package com.inflearn.kyh.jdbc.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.inflearn.kyh.jdbc.domain.Member;
import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class MemberRepositoryVOTest {

  MemberRepositoryVO repository = new MemberRepositoryVO();

  @Test
  void save() throws SQLException {
    Member member = new Member("memberVO1", 10000);
    repository.save(member);

    Member findMember = repository.findById(member.getMemberId());
    log.info("findMember={}", findMember);
    Assertions.assertThat(findMember).isEqualTo(member);
  }
}