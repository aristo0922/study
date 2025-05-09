package com.inflearn.kyh.jdbc.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.inflearn.kyh.jdbc.domain.Member;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class MemberRepositoryVOTest {

  MemberRepositoryVO repository = new MemberRepositoryVO();

  @Test
  void save() throws SQLException {
    Member member = new Member("memberVO10", 10000);
    repository.save(member);

    Member findMember = repository.findById(member.getMemberId());
    log.info("findMember={}", findMember);
    Assertions.assertThat(findMember).isEqualTo(member);

    repository.update(member.getMemberId(), 20000);
    Member updateMember = repository.findById(member.getMemberId());
    Assertions.assertThat(updateMember.getMoney()).isEqualTo(20000);

    repository.delete(member.getMemberId());
    Assertions.assertThatThrownBy( () -> repository.findById(member.getMemberId()))
        .isInstanceOf(NoSuchElementException.class);
  }
}