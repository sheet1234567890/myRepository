package com.adda.app.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Studentonetoone {
	@Id
 private Integer sid;
 private String sname;
 @OneToOne
 @JoinColumn(name="bidfk")
 private  BookoneToone b;
}
