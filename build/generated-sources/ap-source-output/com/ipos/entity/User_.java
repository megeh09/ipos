package com.ipos.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:29:40")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, Date> createdOn;
    public static volatile SingularAttribute<User, String> username;
    public static volatile SingularAttribute<User, Date> date;
    public static volatile SingularAttribute<User, Date> updatedOn;
    public static volatile SingularAttribute<User, Integer> fKcreatedByUserId;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> fullname;

}