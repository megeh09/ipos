package com.ipos.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-26T23:31:15")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Integer> id;
    public static volatile SingularAttribute<Item, Date> createdOn;
    public static volatile SingularAttribute<Item, String> description;
    public static volatile SingularAttribute<Item, String> name;
    public static volatile SingularAttribute<Item, String> stockCardNumber;
    public static volatile SingularAttribute<Item, Integer> fKunitId;
    public static volatile SingularAttribute<Item, String> code;
    public static volatile SingularAttribute<Item, Date> date;
    public static volatile SingularAttribute<Item, Date> updatedOn;
    public static volatile SingularAttribute<Item, Integer> fKcreatedByUserId;

}