package nccu.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "catid")
    private String categoryId;

    @Column
    private String name;

    @Column(name = "descn")
    private String description;

}
