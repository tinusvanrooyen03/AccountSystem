package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.dto.MemberDto;

import java.util.List;

public interface CreateMemberFlow {
    MemberDto create(MemberDto memberDto);
}
