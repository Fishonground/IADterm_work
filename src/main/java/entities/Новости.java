package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Новости {
    private String название;
    private String текст;
    private String видео;

    @Id
    @Column(name = "Название")
    public String getНазвание() {
        return название;
    }

    public void setНазвание(String название) {
        this.название = название;
    }

    @Basic
    @Column(name = "Текст")
    public String getТекст() {
        return текст;
    }

    public void setТекст(String текст) {
        this.текст = текст;
    }

    @Basic
    @Column(name = "Видео")
    public String getВидео() {
        return видео;
    }

    public void setВидео(String видео) {
        this.видео = видео;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Новости новости = (Новости) o;

        if (название != null ? !название.equals(новости.название) : новости.название != null) return false;
        if (текст != null ? !текст.equals(новости.текст) : новости.текст != null) return false;
        if (видео != null ? !видео.equals(новости.видео) : новости.видео != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = название != null ? название.hashCode() : 0;
        result = 31 * result + (текст != null ? текст.hashCode() : 0);
        result = 31 * result + (видео != null ? видео.hashCode() : 0);
        return result;
    }
}
