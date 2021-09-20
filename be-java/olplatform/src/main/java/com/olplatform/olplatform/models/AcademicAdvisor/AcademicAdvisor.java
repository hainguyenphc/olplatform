package com.olplatform.olplatform.models.AcademicAdvisor;

import com.olplatform.olplatform.models.Person;
import com.olplatform.olplatform.models.Program.Program;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("academic_advisor")
public class AcademicAdvisor extends Person {
  @OneToMany(cascade = CascadeType.ALL)
  protected Set<Program> programs;
}