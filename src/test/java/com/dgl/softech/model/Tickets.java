package com.dgl.softech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Tickets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tickets {
	@Id
	@GeneratedValue
	private int id;
	private double amount;
	private String category;	
}
