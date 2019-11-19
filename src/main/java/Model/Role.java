package Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name ="roless" )
public class Role extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleId;

    @JoinColumn(name = "user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User user;


}
