package hellojpa;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "sequence_generator",
sequenceName = "member_id_sequence",
initialValue = 1,
allocationSize = 40)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
