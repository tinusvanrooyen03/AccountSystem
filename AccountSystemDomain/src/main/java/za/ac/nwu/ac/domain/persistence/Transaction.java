package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
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
    private long MemberID;

    @Column(name = "MILESADDED")
    private int MilesAdded;

    @Column(name = "MILESSUBTRACTED")
    private int MilesSubtracted;

    @Column(name = "DATEOF")
    private int DateOf;

    public Transaction(long transactionID, long memberID, int milesAdded, int milesSubtracted, int dateOf) {
        TransactionID = transactionID;
        MemberID = memberID;
        MilesAdded = milesAdded;
        MilesSubtracted = milesSubtracted;
        DateOf = dateOf;
    }

    public Transaction(){

    }

    public long getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(long transactionID) {
        TransactionID = transactionID;
    }

    public long getMemberID() {
        return MemberID;
    }

    public void setMemberID(long memberID) {
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

    public int getDateOf() {
        return DateOf;
    }

    public void setDateOf(int dateOf) {
        DateOf = dateOf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return TransactionID == that.TransactionID && MemberID == that.MemberID && MilesAdded == that.MilesAdded && MilesSubtracted == that.MilesSubtracted && DateOf == that.DateOf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TransactionID, MemberID, MilesAdded, MilesSubtracted, DateOf);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "TransactionID=" + TransactionID +
                ", MemberID=" + MemberID +
                ", MilesAdded=" + MilesAdded +
                ", MilesSubtracted=" + MilesSubtracted +
                ", DateOf=" + DateOf +
                '}';
    }
}
