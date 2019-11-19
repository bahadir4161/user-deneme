package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@MappedSuperclass

public abstract class BaseEntity implements Serializable {

    @Column(name = "name")
    private String name;



}
