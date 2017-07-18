package com.ipos.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-18T18:08:37")
@StaticMetamodel(Supplier.class)
public class Supplier_ { 

    public static volatile SingularAttribute<Supplier, Integer> id;
    public static volatile SingularAttribute<Supplier, Date> createdOn;
    public static volatile SingularAttribute<Supplier, String> description;
    public static volatile SingularAttribute<Supplier, String> name;
    public static volatile SingularAttribute<Supplier, String> code;
    public static volatile SingularAttribute<Supplier, Date> date;
    public static volatile SingularAttribute<Supplier, Date> updatedOn;
    public static volatile SingularAttribute<Supplier, Integer> fKcreatedByUserId;

}