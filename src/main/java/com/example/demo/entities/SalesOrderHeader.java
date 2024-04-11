package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="salesorderheader", schema = "Sales")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SalesOrderHeader {

    @Id
    private Integer salesorderid;
    @Column
    private Integer revisionnumber;
    @Column
    private LocalDateTime orderdate;
    @Column
    private LocalDateTime duedate;
    @Column
    private LocalDateTime shipdate;
    @Column
    private Integer status;
    @Column
    private Integer onlineorderflag;
    @Column
    private String salesordernumber;
    @Column
    private String purchaseordernumber;
    @Column
    private String accountnumber;
    @Column
    private Integer customerid;
    @Column
    private Integer salespersonid;
    @Column
    private Integer territoryid;
    @Column
    private Integer billtoaddressid;
    @Column
    private Integer shiptoaddressid;
    @Column
    private Integer shipmethodid;
    @Column
    private Integer creditcardid;
    @Column
    private String creditcardapprovalcode;
    @Column
    private Integer currencyrateid;
    @Column
    private BigDecimal subtotal;
    @Column
    private BigDecimal taxamt;
    @Column
    private BigDecimal freight;
    @Column
    private BigDecimal totaldue;
    @Column
    private String comment;
    @Column
    private LocalDateTime modifieddate;
}
