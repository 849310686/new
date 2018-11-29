package com.model;
/**
 * 商品查询条件封装类
 * @author Administrator
 *
 */
public class GoodsQuery {
	private String name;//名称
	private Double minPrice;//起始价格
	private Double maxPrice;//终止价格
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public GoodsQuery(String name, Double minPrice, Double maxPrice) {
		super();
		this.name = name;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
	}
	public GoodsQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
