package it.luciferino.netflixmonitor.persistence.entity;

import it.luciferino.netflixmonitor.persistence.entity.generic.AuditTrailEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Data
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@ToString
@Document
public class CommunicationLog extends AuditTrailEntity implements Serializable {
}
