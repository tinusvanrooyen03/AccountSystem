package za.ac.nwu.ac.translator;
import za.ac.nwu.ac.domain.dto.MemberDto;
import java.util.List;
import za.ac.nwu.ac.repo.persistence.MemberRepository;

public interface MemberTranslator {
    List<MemberDto> getAllMembers();
}