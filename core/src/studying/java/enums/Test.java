package studying.java.enums;

/**
 * Created by echaika on 03.07.2019
 */
enum Group {
    LDAP("__SYSTEM_LDAP__"),
    LMS("__SYSTEM_LMS__"),
    DMS("__SYSTEM_TI_DOCS__");

    private final String name;

    Group(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class User {
    private String name;
    private Group group;

    User(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    static User getInstance(String name, Group group) {
        return new User(name, group);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", group=").append(group);
        sb.append('}');
        return sb.toString();
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Group.DMS);
        System.out.println(Group.DMS);
        System.out.println(Group.LMS);
        System.out.println(Group.LDAP);
        User user = User.getInstance("admin", Group.LDAP);
        System.out.println(user.toString());
    }
}
