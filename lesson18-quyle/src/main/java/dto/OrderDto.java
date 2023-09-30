package dto;

import java.util.Date;

public class OrderDto {
	public static final String idd = "id";
	public static final String nameee = "namee";
	public static final String created_att = "created_at";
	
	private Integer id;
	private String namee;
	private Date created_at;
	
	public OrderDto() {
		// TODO Auto-generated constructor stub
	}

	public OrderDto(Integer id, String namee, Date created_at) {
		this.id = id;
		this.namee = namee;
		this.created_at = created_at;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNamee() {
		return namee;
	}

	public void setNamee(String namee) {
		this.namee = namee;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "OrderDto [id=" + id + ", namee=" + namee + ", created_at=" + created_at + "]";
	}
	
	
	
}
