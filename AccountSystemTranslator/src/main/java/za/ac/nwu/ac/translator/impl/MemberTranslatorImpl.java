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

    @Override
    public MemberDto create(MemberDto memberDto) {

        try{
            Member member = memberRepository.save(memberDto.getMember());
            return new MemberDto(member);
        }catch (Exception e){
            throw new RuntimeException("Unable to save to db");
        }
    }

    @Override
    public MemberDto getMemberByNativeQuery(Long memberID) {
        return null;
    }

    @Override
    public MemberDto getMemberByIDNativeQuery(Long memberID){
        try {
            Member member = memberRepository.getMemberByIDNativeQuery(memberID);
            return new MemberDto(member);
        }catch (Exception e){
            throw new RuntimeException("Unable to read from DB", e);
        }
    }

    @Override
    public MemberDto getMemberByID(Long memberID){
        try{
            Member member = memberRepository.getMemberByID(memberID);
            return new MemberDto(member);
        }
        catch(Exception e){
            throw new RuntimeException("Unable to read from DB", e);
        }
    }

    @Override
    public MemberDto updateMemberMilesById(Long memberID){
        try {
            Member member = memberRepository.updateMemberMilesById(memberID);
            return new MemberDto(member);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Unable tot read from DB", e);
        }
    }

}
