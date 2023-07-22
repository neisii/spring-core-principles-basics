package hello.core.member;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberServiceTest {

  MemberService memberService = new MemberServiceImpl();

  @DisplayName("")
  @Test
  void join() {

    // given
    Member member = new Member(1L, "memberA", Grade.VIP);

    // when
    memberService.join(member);
    Member findMember = memberService.findMember(member.getId());

    // then
    assertThat(member).isEqualTo(findMember);
  }

}