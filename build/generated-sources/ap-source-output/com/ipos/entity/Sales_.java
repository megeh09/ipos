package com.ipos.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-26T23:31:15")
@StaticMetamodel(Sales.class)
public class Sales_ { 

    public static volatile SingularAttribute<Sales, Integer> id;
    public static volatile SingularAttribute<Sales, BigDecimal> changeAmount;
    public static volatile SingularAttribute<Sales, Date> createdOn;
    public static volatile SingularAttribute<Sales, BigDecimal> totalAmount;
    public static volatile SingularAttribute<Sales, BigDecimal> quantity;
    public static volatile SingularAttribute<Sales, BigDecimal> unitPrice;
    public static volatile SingularAttribute<Sales, Integer> fKstockId;
    public static volatile SingularAttribute<Sales, Date> date;
    public static volatile SingularAttribute<Sales, Date> updatedOn;
    public static volatile SingularAttribute<Sales, Integer> fKcreatedByUserId;
    public static volatile SingularAttribute<Sales, BigDecimal> cashAmount;

}