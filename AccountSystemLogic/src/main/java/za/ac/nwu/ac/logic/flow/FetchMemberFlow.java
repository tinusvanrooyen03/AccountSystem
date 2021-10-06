package za.ac.nwu.ac.logic.flow;

import org.springframework.context.annotation.Bean;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.persistence.Member;

import java.util.List;

public interface FetchMemberFlow {

    List<MemberDto> getAllMembers();
}
