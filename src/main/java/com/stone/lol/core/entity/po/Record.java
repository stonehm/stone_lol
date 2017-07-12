package com.stone.lol.core.entity.po;

import com.stone.lol.user.entity.po.Dictionary;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "tb_record")
public class Record implements java.io.Serializable {

    private static final long serialVersionUID = 8433485336427742543L;

    @Id
    @Column(name = "id", length = 32)
    @GenericGenerator(name = "systemUUID", strategy = "uuid")
    @GeneratedValue(generator = "systemUUID")
    private String id;
    /**
     * 帐号
     */
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    @ManyToOne(targetEntity = Account.class)
    private Account account;

    /**
     * 名称
     */
    @Column(length = 16)
    private String name;

    /**
     * 胜场
     */
    @Column()
    private Integer wins;

    /**
     * 负场
     */
    @Column()
    private Integer losts;

    /**
     * 段位
     */
    @JoinColumn(name = "level", referencedColumnName = "id")
    @ManyToOne(targetEntity = Dictionary.class)
    private Dictionary level;

    /**
     * 胜点
     */
    @Column()
    private Integer points;
}
