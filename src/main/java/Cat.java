import java.io.Serializable;

public class Cat implements Serializable {
    String name;

    public Cat(String name, int age, String picture) {
        this.name = name;
        this.age = age;
        this.picture = picture;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    int age;
    String picture;

}
