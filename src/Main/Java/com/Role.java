package Main.Java.com;

public enum Role {
    TESTER("Тестировщик"),
    DEVELOPER("Разработчик");
    String ruName;

    Role(String ruName) {
        this.ruName = ruName;
    }

    public String getRuName() {
        return ruName;
    }
}
