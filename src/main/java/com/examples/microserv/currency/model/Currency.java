package com.examples.microserv.currency.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Currency {
@Id
@GeneratedValue
private Integer id;	
@NotNull
 private String name;
@NotNull
 private String code;
@NotNull
 private String symbol;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
 
}
