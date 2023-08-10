package com.adda.app.Bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Author {
	@Id
private Integer aid;
private String aname;
@OneToMany
@JoinColumn(name="bidfk")
private List<Book> b;
}
