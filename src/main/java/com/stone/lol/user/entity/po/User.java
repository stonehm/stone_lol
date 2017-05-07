package com.stone.lol.user.entity.po;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户
 */
@Entity
@Table(name = "tb_user", uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
public class User implements Serializable {
    @Id
    @Column(name = "user_id", length = 32)
    @GenericGenerator(name = "systemUUID", strategy = "uuid")
    @GeneratedValue(generator = "systemUUID")
    private String id;

    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String username;

    @Column(length = 20)
    private String password;

    @JoinColumn(name = "authority_id", referencedColumnName = "id")
    @ManyToOne(targetEntity = Authority.class)
    private Authority authority;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }
}
