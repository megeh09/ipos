package com.ipos.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-26T23:31:15")
@StaticMetamodel(StockWithdrawal.class)
public class StockWithdrawal_ { 

    public static volatile SingularAttribute<StockWithdrawal, Integer> id;
    public static volatile SingularAttribute<StockWithdrawal, Date> createdOn;
    public static volatile SingularAttribute<StockWithdrawal, BigDecimal> quantity;
    public static volatile SingularAttribute<StockWithdrawal, Integer> fKstockId;
    public static volatile SingularAttribute<StockWithdrawal, String> purpose;
    public static volatile SingularAttribute<StockWithdrawal, Date> date;
    public static volatile SingularAttribute<StockWithdrawal, Date> updatedOn;
    public static volatile SingularAttribute<StockWithdrawal, Integer> fKcreatedByUserId;
    public static volatile SingularAttribute<StockWithdrawal, Integer> fKpersonnelId;

}