package com.adda.app.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="booktab")
public class Book {
	@Id
private Integer bookid;
private String bookname;
private String bookauthor;
private Double bookCost;
private String booktype;
}
