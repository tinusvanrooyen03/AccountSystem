package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.logic.flow.FetchMemberFlow;

import java.util.ArrayList;
import java.util.List;

@Component
public class FetchMemberImpl implements FetchMemberFlow {
    @Override
    public List<MemberDto> getAllMembers() {
        List<MemberDto> memberDtos = new ArrayList<>();
        memberDtos.add(new MemberDto("Firstname", "Lastname", 0));
        return null;
    }
}
