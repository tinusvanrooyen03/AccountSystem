package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.Member;

import java.io.Serializable;
import java.util.Objects;

public class MemberDto implements Serializable {

    private static final long serialVersionUID = -3675411777951570019L;

    private String FIRSTNAME;
    private String LASTNAME;
    private long totalMiles;

    public MemberDto() {
    }

    public MemberDto(String FIRSTNAME, String LASTNAME, long totalMiles) {
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.totalMiles = totalMiles;
    }

    public MemberDto(Member member){
        member.setFIRSTNAME(member.getFIRSTNAME());
        member.setLASTNAME(member.getLASTNAME());
        member.setTotalMiles(member.getTotalMiles());
    }

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public long getTotalMiles() {
        return totalMiles;
    }

    public void setTotalMiles(long totalMiles) {
        this.totalMiles = totalMiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDto memberDto = (MemberDto) o;
        return totalMiles == memberDto.totalMiles && Objects.equals(FIRSTNAME, memberDto.FIRSTNAME) && Objects.equals(LASTNAME, memberDto.LASTNAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIRSTNAME, LASTNAME, totalMiles);
    }
}
