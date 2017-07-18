package com.ipos.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-10T16:55:09")
@StaticMetamodel(Personnel.class)
public class Personnel_ { 

    public static volatile SingularAttribute<Personnel, Integer> id;
    public static volatile SingularAttribute<Personnel, Date> createdOn;
    public static volatile SingularAttribute<Personnel, Date> date;
    public static volatile SingularAttribute<Personnel, Date> updatedOn;
    public static volatile SingularAttribute<Personnel, Integer> fKcreatedByUserId;
    public static volatile SingularAttribute<Personnel, String> fullname;

}