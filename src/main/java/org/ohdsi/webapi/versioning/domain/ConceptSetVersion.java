package org.ohdsi.webapi.versioning.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "concept_set_versions")
public class ConceptSetVersion extends Version {
}
