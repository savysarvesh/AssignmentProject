package com.product.report.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.product.report.enumeration.Status;

/**
 * The Class Product.
 */
@Entity
@Table(name = "product")
public class Product {

	/** The id. */
	private long id;

	/** The city. */
	private String city;

	/** The start date. */
	private Date startDate;

	/** The end date. */
	private Date endDate;

	/** The price. */
	private BigDecimal price;

	/** The status. */
	private Status status;

	/** The color. */
	private String color;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("id")
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	@JsonProperty("city")
	@Column(name = "city", nullable = false)
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	@Column(name = "start_date", nullable = false)
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "MM/dd/yyyy")
	@JsonProperty("start_date")
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	@Column(name = "end_date", nullable = false)
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "MM/dd/yyyy")
	@JsonProperty("end_date")
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate the new end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	@JsonProperty("price")
	@Column(name = "price", nullable = false)
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	@JsonProperty("status")
	@Enumerated(EnumType.STRING)
	public Status getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	@JsonProperty("color")
	@Column(name = "color", nullable = false)
	public String getColor() {
		return color;
	}

	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", city=" + city + ", startDate=" + startDate + ", endDate=" + endDate + ", price="
				+ price + ", status=" + status + ", color=" + color + "]";
	}

}