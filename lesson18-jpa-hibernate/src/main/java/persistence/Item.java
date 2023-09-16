package persistence;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item")
public class Item {
	@Id
	@Column(name = "ID")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "MATERIAL")
	private String meterial;

	@Column(name = "IMAGE_01")
	private String image1;

	@Column(name = "IMAGE_02")
	private String image2;

	@Column(name = "LAST_UPDATED_AT")
	private LocalDateTime lastUpdatedAt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID")
	private ItemGroup itemGroup;

}
