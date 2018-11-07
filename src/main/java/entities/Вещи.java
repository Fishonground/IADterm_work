package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Вещи {
    private String название;
    private String описание;
    private Integer цена;
    private Integer владелец;

    @Id
    @Column(name = "Название")
    public String getНазвание() {
        return название;
    }

    public void setНазвание(String название) {
        this.название = название;
    }

    @Basic
    @Column(name = "Описание")
    public String getОписание() {
        return описание;
    }

    public void setОписание(String описание) {
        this.описание = описание;
    }

    @Basic
    @Column(name = "Цена")
    public Integer getЦена() {
        return цена;
    }

    public void setЦена(Integer цена) {
        this.цена = цена;
    }

    @Basic
    @Column(name = "Владелец")
    public Integer getВладелец() {
        return владелец;
    }

    public void setВладелец(Integer владелец) {
        this.владелец = владелец;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Вещи вещи = (Вещи) o;

        if (название != null ? !название.equals(вещи.название) : вещи.название != null) return false;
        if (описание != null ? !описание.equals(вещи.описание) : вещи.описание != null) return false;
        if (цена != null ? !цена.equals(вещи.цена) : вещи.цена != null) return false;
        if (владелец != null ? !владелец.equals(вещи.владелец) : вещи.владелец != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = название != null ? название.hashCode() : 0;
        result = 31 * result + (описание != null ? описание.hashCode() : 0);
        result = 31 * result + (цена != null ? цена.hashCode() : 0);
        result = 31 * result + (владелец != null ? владелец.hashCode() : 0);
        return result;
    }
}
