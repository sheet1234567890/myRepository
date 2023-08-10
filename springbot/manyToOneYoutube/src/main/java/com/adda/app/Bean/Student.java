package com.adda.app.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="studentManyToOne")
public class Student {
	@Id
   private Integer sid;
   private String sname;
   @ManyToOne
   @JoinColumn(name="bidfk")
   private Book b;
}
