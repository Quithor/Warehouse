package top.yanquithor;

import java.util.Objects;

public class User {
    
    private String account;
    private String password;
    
    public User() {}
    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }
    
    public String getAccount() {
        return account;
    }
    
    public User setAccount(String account) {
        this.account = account;
        return this;
    }
    
    public String getPassword() {
        return password;
    }
    
    public User setPassword(String password) {
        this.password = password;
        return this;
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof User user)) return false;
        return Objects.equals(account, user.account);
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(account);
    }
    
    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
