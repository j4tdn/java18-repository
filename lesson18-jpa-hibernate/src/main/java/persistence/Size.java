package persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "size")
public class Size {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "GENDER")
	private Integer gender;
	
	@Column(name = "DESC")
	private String desc;

	public Size(Integer id, Integer gender, String desc) {
		this.id = id;
		this.gender = gender;
		this.desc = desc;
	}

	public Size() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Size [id=" + id + ", gender=" + gender + ", desc=" + desc + "]";
	}
	
	
}
