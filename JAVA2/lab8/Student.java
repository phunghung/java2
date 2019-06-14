package baitap.lab8;

public class Student {
private String name;
private String birth;
private String email;
private String province;

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Student(String name, String birth, String email, String province) {
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.province = province;
    }
        
}
