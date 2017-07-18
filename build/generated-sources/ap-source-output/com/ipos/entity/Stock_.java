package com.ipos.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-10T16:55:09")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile SingularAttribute<Stock, Boolean> isExpirable;
    public static volatile SingularAttribute<Stock, Date> expiryDate;
    public static volatile SingularAttribute<Stock, BigDecimal> unitPrice;
    public static volatile SingularAttribute<Stock, String> code;
    public static volatile SingularAttribute<Stock, Date> date;
    public static volatile SingularAttribute<Stock, Integer> fKsupplierId;
    public static volatile SingularAttribute<Stock, Integer> id;
    public static volatile SingularAttribute<Stock, Date> createdOn;
    public static volatile SingularAttribute<Stock, Integer> fKitemId;
    public static volatile SingularAttribute<Stock, String> stockCardNumber;
    public static volatile SingularAttribute<Stock, BigDecimal> quantity;
    public static volatile SingularAttribute<Stock, Date> updatedOn;
    public static volatile SingularAttribute<Stock, Integer> fKcreatedByUserId;

}