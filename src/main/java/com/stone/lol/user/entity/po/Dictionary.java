package com.stone.lol.user.entity.po;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 数据字典
 */
@Entity
@Table(name = "tb_dictionary")
public class Dictionary implements java.io.Serializable {

    private static final long serialVersionUID = -2607273758413076301L;

    @Id
    @Column(name = "id", length = 32)
    @GenericGenerator(name = "systemUUID", strategy = "uuid")
    @GeneratedValue(generator = "systemUUID")
    private String id;

    @JoinColumn(name = "parent", referencedColumnName = "id")
    @ManyToOne(targetEntity = Dictionary.class)
    private Dictionary parent;

    @Column(length = 32, nullable = false)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Dictionary getParent() {
        return parent;
    }

    public void setParent(Dictionary parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "id='" + id + '\'' +
                ", parent='" + parent + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
