package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Люди {
    private int ид;
    private String имя;
    private String фамилия;
    private String отчество;
    private Timestamp датаРождения;
    private String пол;
    private String фото;

    @Id
    @Column(name = "ИД")
    public int getИд() {
        return ид;
    }

    public void setИд(int ид) {
        this.ид = ид;
    }

    @Basic
    @Column(name = "Имя")
    public String getИмя() {
        return имя;
    }

    public void setИмя(String имя) {
        this.имя = имя;
    }

    @Basic
    @Column(name = "Фамилия")
    public String getФамилия() {
        return фамилия;
    }

    public void setФамилия(String фамилия) {
        this.фамилия = фамилия;
    }

    @Basic
    @Column(name = "Отчество")
    public String getОтчество() {
        return отчество;
    }

    public void setОтчество(String отчество) {
        this.отчество = отчество;
    }

    @Basic
    @Column(name = "Дата рождения")
    public Timestamp getДатаРождения() {
        return датаРождения;
    }

    public void setДатаРождения(Timestamp датаРождения) {
        this.датаРождения = датаРождения;
    }

    @Basic
    @Column(name = "Пол")
    public String getПол() {
        return пол;
    }

    public void setПол(String пол) {
        this.пол = пол;
    }

    @Basic
    @Column(name = "Фото")
    public String getФото() {
        return фото;
    }

    public void setФото(String фото) {
        this.фото = фото;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Люди люди = (Люди) o;

        if (ид != люди.ид) return false;
        if (имя != null ? !имя.equals(люди.имя) : люди.имя != null) return false;
        if (фамилия != null ? !фамилия.equals(люди.фамилия) : люди.фамилия != null) return false;
        if (отчество != null ? !отчество.equals(люди.отчество) : люди.отчество != null) return false;
        if (датаРождения != null ? !датаРождения.equals(люди.датаРождения) : люди.датаРождения != null) return false;
        if (пол != null ? !пол.equals(люди.пол) : люди.пол != null) return false;
        if (фото != null ? !фото.equals(люди.фото) : люди.фото != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ид;
        result = 31 * result + (имя != null ? имя.hashCode() : 0);
        result = 31 * result + (фамилия != null ? фамилия.hashCode() : 0);
        result = 31 * result + (отчество != null ? отчество.hashCode() : 0);
        result = 31 * result + (датаРождения != null ? датаРождения.hashCode() : 0);
        result = 31 * result + (пол != null ? пол.hashCode() : 0);
        result = 31 * result + (фото != null ? фото.hashCode() : 0);
        return result;
    }
}
