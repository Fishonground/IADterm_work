package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Группировки {
    private String название;
    private int глава;
    private int рейтинг;

    @Id
    @Column(name = "Название")
    public String getНазвание() {
        return название;
    }

    public void setНазвание(String название) {
        this.название = название;
    }

    @Basic
    @Column(name = "Глава")
    public int getГлава() {
        return глава;
    }

    public void setГлава(int глава) {
        this.глава = глава;
    }

    @Basic
    @Column(name = "Рейтинг")
    public int getРейтинг() {
        return рейтинг;
    }

    public void setРейтинг(int рейтинг) {
        this.рейтинг = рейтинг;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Группировки that = (Группировки) o;

        if (глава != that.глава) return false;
        if (рейтинг != that.рейтинг) return false;
        if (название != null ? !название.equals(that.название) : that.название != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = название != null ? название.hashCode() : 0;
        result = 31 * result + глава;
        result = 31 * result + рейтинг;
        return result;
    }
}
