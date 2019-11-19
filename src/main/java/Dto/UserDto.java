package Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor
@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class UserDto {

    private String username;

    private String name;

    private String surname;

    private Date createdAt;

    private Date updatedAt;

    private Date updatedBy;

    private Date createdBy;

}
