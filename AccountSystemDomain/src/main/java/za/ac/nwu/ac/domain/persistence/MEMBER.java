package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "MEMBER", schema = "ASYS")
public class MEMBER implements Serializable {


    @Id
    @SequenceGenerator(name = "GENERIC_SEQ", sequenceName = "ASYS.GENERICSEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENERIC_SEQ")

    private long memberID;
    private String FIRSTNAME;
    private String LASTNAME;
    private long totalMiles;

    public MEMBER(long memberID, String FIRSTNAME, String LASTNAME, long totalMiles) {
        this.memberID = memberID;
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.totalMiles = totalMiles;
    }

    public MEMBER() {
    }

    @Column(name = "MEMBERID")
    public long getMemberID() {
        return memberID;
    }

    public void setMemberID(long memberID) {
        this.memberID = memberID;
    }

    @Column(name = "FISRTNAME")
    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }
    @Column(name = "LASTNAME")
    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    @Column(name = "TOTALMILES")
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
        MEMBER member = (MEMBER) o;
        return memberID == member.memberID && totalMiles == member.totalMiles && Objects.equals(FIRSTNAME, member.FIRSTNAME) && Objects.equals(LASTNAME, member.LASTNAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberID, FIRSTNAME, LASTNAME, totalMiles);
    }

    @Override
    public String toString() {
        return "MEMBER{" +
                "memberID=" + memberID +
                ", FIRSTNAME='" + FIRSTNAME + '\'' +
                ", LASTNAME='" + LASTNAME + '\'' +
                ", totalMiles=" + totalMiles +
                '}';
    }
}