package com.stone.lol.user.entity.po;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 用户操作权限
 */
@Entity
@Table(name = "tb_authority")
public class Authority {
    @Id
    @Column(name = "id", length = 32)
    @GenericGenerator(name = "systemUUID", strategy = "uuid")
    @GeneratedValue(generator = "systemUUID")
    private String id;
    @Column(length = 10)
    private String name;
    @Column()
    private Integer level;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
