package com.ipos.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-18T18:31:49")
@StaticMetamodel(Unit.class)
public class Unit_ { 

    public static volatile SingularAttribute<Unit, Integer> id;
    public static volatile SingularAttribute<Unit, Date> createdOn;
    public static volatile SingularAttribute<Unit, String> description;
    public static volatile SingularAttribute<Unit, String> code;
    public static volatile SingularAttribute<Unit, Date> date;
    public static volatile SingularAttribute<Unit, Date> updatedOn;
    public static volatile SingularAttribute<Unit, Integer> fKcreatedByUserId;

}