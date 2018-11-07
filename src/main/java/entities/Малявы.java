package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Малявы {
    private int ид;
    private Integer отправитель;
    private int получатель;
    private Integer вложение;
    private String текст;

    @Id
    @Column(name = "Ид")
    public int getИд() {
        return ид;
    }

    public void setИд(int ид) {
        this.ид = ид;
    }

    @Basic
    @Column(name = "Отправитель")
    public Integer getОтправитель() {
        return отправитель;
    }

    public void setОтправитель(Integer отправитель) {
        this.отправитель = отправитель;
    }

    @Basic
    @Column(name = "Получатель")
    public int getПолучатель() {
        return получатель;
    }

    public void setПолучатель(int получатель) {
        this.получатель = получатель;
    }

    @Basic
    @Column(name = "Вложение")
    public Integer getВложение() {
        return вложение;
    }

    public void setВложение(Integer вложение) {
        this.вложение = вложение;
    }

    @Basic
    @Column(name = "Текст")
    public String getТекст() {
        return текст;
    }

    public void setТекст(String текст) {
        this.текст = текст;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Малявы малявы = (Малявы) o;

        if (ид != малявы.ид) return false;
        if (получатель != малявы.получатель) return false;
        if (отправитель != null ? !отправитель.equals(малявы.отправитель) : малявы.отправитель != null) return false;
        if (вложение != null ? !вложение.equals(малявы.вложение) : малявы.вложение != null) return false;
        if (текст != null ? !текст.equals(малявы.текст) : малявы.текст != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ид;
        result = 31 * result + (отправитель != null ? отправитель.hashCode() : 0);
        result = 31 * result + получатель;
        result = 31 * result + (вложение != null ? вложение.hashCode() : 0);
        result = 31 * result + (текст != null ? текст.hashCode() : 0);
        return result;
    }
}
