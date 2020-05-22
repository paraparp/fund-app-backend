package com.paraparp.gestorfondos.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "lots")
public class Lot implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne(fetch = FetchType.EAGER)
	private Symbol symbol;

    @Column(columnDefinition = "decimal(18,2) default 0")
	private BigDecimal volume;


    @Column(columnDefinition = "decimal(18,2) default 0")
	private BigDecimal price;

	private String broker;
	
	@Temporal(TemporalType.DATE)
	private Date date;

	@JsonIgnore
	@OneToOne
	private Portfolio portfolio;

	@Column(name = "creation_date")
	@Temporal(TemporalType.DATE)
	private Date creationDate;

}
