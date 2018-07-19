package Main.Java.com;

public class People {
    private String name;
    private Integer age;
    private Long id;
    private Role role;

    public People(String name, Integer age, Long id, Role role) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }
}
