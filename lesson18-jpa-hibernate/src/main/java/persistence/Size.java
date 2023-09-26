package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "size")
public class Size {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "gender")
	private Integer gender;
	
	@Column(name = "desc")
	private String desc;
	
	public Size() {
	}

	public Size(Integer id, Integer gender, String desc) {
		this.id = id;
		this.gender = gender;
		this.desc = desc;
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