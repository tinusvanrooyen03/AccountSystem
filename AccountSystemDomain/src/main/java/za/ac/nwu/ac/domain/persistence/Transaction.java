package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Transaction", schema = "ASYS")
public class Transaction implements Serializable {
    private static final long serialVersionUID = 6481165536778180936L;
    @Id
    @SequenceGenerator(name = "GENERIC_SEQ", sequenceName = "ASYS.GENERICSEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENERIC_SEQ")
    @Column(name = "TRANSACTIONID")
    private long TransactionID;

    @Column(name = "MEMBERID")
    private Member MemberID;

    @Column(name = "MILESADDED")
    private int MilesAdded;

    @Column(name = "MILESSUBTRACTED")
    private int MilesSubtracted;

    @Column(name = "DATEOF")
    private Date DateOf;

    @Column(name = "MeilesType")
    private String MilesType;


    public Transaction(long transactionID, Member memberID, int milesAdded, int milesSubtracted, Date dateOf, String MilesType) {
        TransactionID = transactionID;
        MemberID = memberID;
        MilesAdded = milesAdded;
        MilesSubtracted = milesSubtracted;
        DateOf = dateOf;
        MilesType = MilesType;
    }

    public Transaction(String milesType, int milesAdded, int milesSubtracted, Date dateof){

    }

    public long getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(long transactionID) {
        TransactionID = transactionID;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBERID")
    public Member getMemberID() {
        return MemberID;
    }

    public void setMemberID(Member memberID) {
        MemberID = memberID;
    }

    public int getMilesAdded() {
        return MilesAdded;
    }

    public void setMilesAdded(int milesAdded) {
        MilesAdded = milesAdded;
    }

    public int getMilesSubtracted() {
        return MilesSubtracted;
    }

    public void setMilesSubtracted(int milesSubtracted) {
        MilesSubtracted = milesSubtracted;
    }

    public Date getDateOf() {
        return DateOf;
    }

    public void setDateOf(Date dateOf) {
        DateOf = dateOf;
    }

    public String getMilesType() {
        return MilesType;
    }

    public void setMilesType(String milesType) {
        MilesType = milesType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return TransactionID == that.TransactionID && MilesAdded == that.MilesAdded && MilesSubtracted == that.MilesSubtracted && Objects.equals(MemberID, that.MemberID) && Objects.equals(DateOf, that.DateOf) && Objects.equals(MilesType, that.MilesType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TransactionID, MemberID, MilesAdded, MilesSubtracted, DateOf, MilesType);
    }


}
