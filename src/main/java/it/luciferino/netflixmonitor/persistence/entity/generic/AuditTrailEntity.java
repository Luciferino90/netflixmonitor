package it.luciferino.netflixmonitor.persistence.entity.generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@EnableMongoAuditing
public class AuditTrailEntity extends GenericEntity implements Serializable {

    private String createdById;
    private String createdByUsername;
    private Date creationDate;
    private String modifiedById;
    private String modifiedByUsername;
    private Date modifiedDate;

}
