package com.cognizant.authenticationservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	@Column
	private String username;
	@Column
	private String password;
	private String token;
	private String role;
}
