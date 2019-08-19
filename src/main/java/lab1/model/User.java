package lab1.model;

import java.util.List;
import java.util.Objects;

public class User {

    String name;
    String nickName;
    String email;
    String password;
    List<Board> boards;

    public User() {
    }

    public User(String name, String nickName, String email, String password) {
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.password = password;
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(nickName, user.nickName) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nickName, email, password);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getname() + "'" +
            ", nickName='" + getNickName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }

   
    

	


}