package com.stone.lol.core.entity.po;

import com.stone.lol.user.entity.po.Dictionary;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 帐号
 * User: 孙皓亮
 * Date: 2017/6/10
 * Time: 22:36
 */
@Entity
@Table(name = "tb_account")
public class Account implements java.io.Serializable {

    private static final long serialVersionUID = -8052232399345882329L;

    @Id
    @Column(name = "id", length = 32)
    @GenericGenerator(name = "systemUUID", strategy = "uuid")
    @GeneratedValue(generator = "systemUUID")
    private String id;
    /**
     * 帐号
     */
    @Column(length = 11)
    private String username;
    /**
     * 密码
     */
    @Column(length = 16)
    private String password;
    /**
     * 大区
     */
    @JoinColumn(name = "region", referencedColumnName = "id")
    @ManyToOne(targetEntity = Dictionary.class)
    private Dictionary region;
    /**
     * 角色名
     */
    @Column(length = 16)
    private String name;
}
