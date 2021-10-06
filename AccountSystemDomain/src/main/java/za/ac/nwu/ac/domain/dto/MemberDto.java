package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.ac.domain.persistence.Member;

import java.io.Serializable;
import java.util.Objects;

@ApiModel(value = "Member", description = "A Dto which describes the member")

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

    @ApiModelProperty(position = 1,
        value = "Member First Name",
        name = "First Name",
        notes = "Identifies the Member's Name",
        dataType = "java.lang.String",
        example = "Johan",
        required = true)


    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }

    @ApiModelProperty(position = 2,
            value = "Member Last Name",
            name = "Last Name",
            notes = "Identifies the Member's Last Name",
            dataType = "java.lang.String",
            example = "Lategan",
            required = true)
    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    @ApiModelProperty(position = 3,
            value = "Member Total Miles",
            name = "Total Miles",
            notes = "Identifies the Member's Miles",
            dataType = "java.lang.Int",
            example = "10",
            required = true)
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

    @JsonIgnore
    public Member getMember(){
        return new Member(getFIRSTNAME(), getLASTNAME(), getTotalMiles());
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIRSTNAME, LASTNAME, totalMiles);
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "FIRSTNAME='" + FIRSTNAME + '\'' +
                ", LASTNAME='" + LASTNAME + '\'' +
                ", totalMiles=" + totalMiles +
                '}';
    }
}
