package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Пользователи {
    private int статус;
    private String пароль;
    private String логин;

    @Basic
    @Column(name = "Статус")
    public int getСтатус() {
        return статус;
    }

    public void setСтатус(int статус) {
        this.статус = статус;
    }

    @Basic
    @Column(name = "Пароль")
    public String getПароль() {
        return пароль;
    }

    public void setПароль(String пароль) {
        this.пароль = пароль;
    }

    @Id
    @Column(name = "Логин")
    public String getЛогин() {
        return логин;
    }

    public void setЛогин(String логин) {
        this.логин = логин;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Пользователи that = (Пользователи) o;

        if (статус != that.статус) return false;
        if (пароль != null ? !пароль.equals(that.пароль) : that.пароль != null) return false;
        if (логин != null ? !логин.equals(that.логин) : that.логин != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = статус;
        result = 31 * result + (пароль != null ? пароль.hashCode() : 0);
        result = 31 * result + (логин != null ? логин.hashCode() : 0);
        return result;
    }
}
