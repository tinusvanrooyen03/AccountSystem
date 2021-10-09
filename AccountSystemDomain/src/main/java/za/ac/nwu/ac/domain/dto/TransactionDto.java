package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import za.ac.nwu.ac.domain.persistence.Transaction;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@ApiModel(value = "Transaction", description = "A Dto which describes a tansaction")
public class TransactionDto implements Serializable {

    private static final long serialVersionUID = 3766497939333573388L;

    private String MilesType;
    private int MilesAdded;
    private int MilesSubtracted;
    private Date Dateof;

    public TransactionDto(){};

    public TransactionDto(String milesType, int milesAdded, int milesSubtracted, Date dateof) {
        MilesType = milesType;
        MilesAdded = milesAdded;
        MilesSubtracted = milesSubtracted;
        Dateof = dateof;
    }

    public TransactionDto(Transaction transaction){
        transaction.setMilesType(transaction.getMilesType());
        transaction.setMilesAdded(transaction.getMilesAdded());
        transaction.setMilesSubtracted(transaction.getMilesSubtracted());
        transaction.setDateOf(transaction.getDateOf());
    }

    public String getMilesType() {
        return MilesType;
    }

    public void setMilesType(String milesType) {
        MilesType = milesType;
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

    public Date getDateof() {
        return Dateof;
    }

    public void setDateof(Date dateof) {
        Dateof = dateof;
    }

    @JsonIgnore
    public Transaction getTransaction(){
        return new Transaction(getMilesType(), getMilesAdded(), getMilesSubtracted(), getDateof());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionDto that = (TransactionDto) o;
        return MilesAdded == that.MilesAdded && MilesSubtracted == that.MilesSubtracted && Objects.equals(MilesType, that.MilesType) && Objects.equals(Dateof, that.Dateof);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MilesType, MilesAdded, MilesSubtracted, Dateof);
    }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "MilesType='" + MilesType + '\'' +
                ", MilesAdded=" + MilesAdded +
                ", MilesSubtracted=" + MilesSubtracted +
                ", Dateof=" + Dateof +
                '}';
    }
}
