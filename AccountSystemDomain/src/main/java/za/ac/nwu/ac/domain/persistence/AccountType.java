package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name = "Member", schema = "ASYS")
public class AccountType implements Serializable {

    @Id
    @SequenceGenerator(name = "Demo", sequenceName = "Demo", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Demeo")
    @Column(name = "Demo")
    private long memberID;



}
