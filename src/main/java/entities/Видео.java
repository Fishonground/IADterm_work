package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Видео {
    private int ид;
    private Timestamp время;
    private int камера;
    private String содержимое;

    @Id
    @Column(name = "Ид")
    public int getИд() {
        return ид;
    }

    public void setИд(int ид) {
        this.ид = ид;
    }

    @Basic
    @Column(name = "Время")
    public Timestamp getВремя() {
        return время;
    }

    public void setВремя(Timestamp время) {
        this.время = время;
    }

    @Basic
    @Column(name = "Камера")
    public int getКамера() {
        return камера;
    }

    public void setКамера(int камера) {
        this.камера = камера;
    }

    @Basic
    @Column(name = "Содержимое")
    public String getСодержимое() {
        return содержимое;
    }

    public void setСодержимое(String содержимое) {
        this.содержимое = содержимое;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Видео видео = (Видео) o;

        if (ид != видео.ид) return false;
        if (камера != видео.камера) return false;
        if (время != null ? !время.equals(видео.время) : видео.время != null) return false;
        if (содержимое != null ? !содержимое.equals(видео.содержимое) : видео.содержимое != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ид;
        result = 31 * result + (время != null ? время.hashCode() : 0);
        result = 31 * result + камера;
        result = 31 * result + (содержимое != null ? содержимое.hashCode() : 0);
        return result;
    }
}
