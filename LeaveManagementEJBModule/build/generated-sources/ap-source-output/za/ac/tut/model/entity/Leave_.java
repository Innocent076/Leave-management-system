package za.ac.tut.model.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.model.entity.Status;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-12T10:45:55")
@StaticMetamodel(Leave.class)
public class Leave_ { 

    public static volatile SingularAttribute<Leave, String> reason;
    public static volatile SingularAttribute<Leave, String> endDate;
    public static volatile SingularAttribute<Leave, Long> id;
    public static volatile SingularAttribute<Leave, String> startDate;
    public static volatile SingularAttribute<Leave, Status> status;

}