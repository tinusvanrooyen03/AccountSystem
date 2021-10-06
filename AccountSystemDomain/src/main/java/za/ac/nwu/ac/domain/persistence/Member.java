package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "MEMBER", schema = "ASYS")
public class Member implements Serializable{

    private static final long serialVersionUID = -8193372714636883450L;
    @Id
    @SequenceGenerator(name = "GENERIC_SEQ", sequenceName = "ASYS.GENERICSEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENERIC_SEQ")



    private long memberID;
    private String FIRSTNAME;
    private String LASTNAME;
    private long totalMiles;

    private Set<Transaction> transactions;

    public Member(long memberID, String FIRSTNAME, String LASTNAME, long totalMiles) {
        this.memberID = memberID;
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.totalMiles = totalMiles;
    }

    public Member(String firstname, String lastname, long totalMiles) {
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

    @OneToMany(targetEntity = Transaction.class, fetch = FetchType.LAZY, mappedBy = "MemberID", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<Transaction> getTransactions(){
        return transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
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
