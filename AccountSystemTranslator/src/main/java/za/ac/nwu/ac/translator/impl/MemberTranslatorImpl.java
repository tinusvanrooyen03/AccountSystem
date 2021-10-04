package za.ac.nwu.ac.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.nwu.ac.repo.persistence.MemberRepository;
import za.ac.nwu.ac.translator.MemberTranslator;

public class MemberTranslatorImpl implements MemberTranslator {

    private final MemberRepository memberRepository;


    @Autowired
    public MemberTranslatorImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override


}
