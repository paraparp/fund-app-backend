package com.paraparp.gestorfondos.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "symbols")
public class Symbol implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	private String isin;

	private String bloomberg;

	private String url;

	@Column(name = "last_date")
	private String lastDate;

    @Column(name = "last_price",columnDefinition = "decimal(18,2) default 0")
	private BigDecimal lastPrice = BigDecimal.ZERO;

	private LocalDate updated;

	private String category;

	private String location;

	private String type;

	@Column(name = "daily_change",columnDefinition = "decimal(18,2) default 0")
	private BigDecimal dailyChange = BigDecimal.ZERO;

	@Column(name = "daily_change_percent",columnDefinition = "decimal(18,4) default 0")
	private BigDecimal dailyChangePercent ;
	
	@Column(name = "one_year",columnDefinition = "decimal(18,4) default 0")
	private BigDecimal oneYear;
	
	@Column(name = "five_years",columnDefinition = "decimal(18,4) default 0")
	private BigDecimal fiveYears;

//	@Column(name = "creation_date")
//	@Temporal(TemporalType.DATE)
//	private Date creationDate;

}