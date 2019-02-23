package it.luciferino.netflixmonitor.persistence.entity;

import it.luciferino.netflixmonitor.enumerator.RoleEnum;
import it.luciferino.netflixmonitor.persistence.entity.generic.AuditTrailEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@ToString
@Document(collection = "user")
public class User extends AuditTrailEntity implements Serializable {

    private String name;
    private String surname;
    private Date registerDate;
    private Date deletedDate;
    private String username;
    private String mail;
    private String phone;
    private String password;
    private RoleEnum role;
    private String telegramId;

}
