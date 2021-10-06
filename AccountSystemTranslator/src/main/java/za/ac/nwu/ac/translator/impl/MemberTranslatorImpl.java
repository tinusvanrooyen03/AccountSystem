package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.persistence.Member;
import za.ac.nwu.ac.repo.persistence.MemberRepository;
import za.ac.nwu.ac.translator.MemberTranslator;
import za.ac.nwu.ac.repo.persistence.MemberRepository;

import java.util.ArrayList;
import java.util.List;
@Component
public class MemberTranslatorImpl implements MemberTranslator{


    private final MemberRepository memberRepository;

    @Autowired
    public MemberTranslatorImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public List<MemberDto> getAllMembers() {

        List<MemberDto> memberDtos = new ArrayList<>();
        try {
            for(Member member : memberRepository.findAll()){
                memberDtos.add(new MemberDto(member));
            }
        }
        catch (Exception e){
            // TODO: Log
            throw new RuntimeException("Unable to connect to database", e);
        }
        return memberDtos;

    }

}
