package za.ac.nwu.ac.translator;
import org.springframework.context.annotation.Bean;
import za.ac.nwu.ac.domain.dto.MemberDto;
import java.util.List;
import za.ac.nwu.ac.repo.persistence.MemberRepository;

public interface MemberTranslator {

    List<MemberDto> getAllMembers();

    MemberDto create(MemberDto member);

    MemberDto getMemberByNativeQuery(Long memberID);

    MemberDto getMemberByIDNativeQuery(Long memberID);

    MemberDto getMemberByID(Long memberID);

    MemberDto updateMemberMilesById(Long memberID);
}