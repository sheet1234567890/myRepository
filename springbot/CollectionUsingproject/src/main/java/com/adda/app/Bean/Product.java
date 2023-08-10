package com.adda.app.Bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="protab")
public class Product {
    @Id
    @Column(name="pid")
	private Integer prodId;
    @Column(name="pcode")
	private String prodCode;
    @ElementCollection
    @CollectionTable(name="product_colours",joinColumns= @JoinColumn(name="pidfk"))
    @OrderColumn(name="pos")
    @Column(name="colour")
	private List<String>colour;
    @ElementCollection
    @CollectionTable(name="product_modules",joinColumns= @JoinColumn(name="pidfk"))
    @Column(name="module")
	private Set<String>modules;
    @ElementCollection
    @CollectionTable(name="product_details",joinColumns= @JoinColumn(name="pidfk"))
    @MapKeyColumn(name="code")
    @Column(name="detail")
	private Map<String,String>details;
}
