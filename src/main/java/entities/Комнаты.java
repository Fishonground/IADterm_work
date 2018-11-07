package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Комнаты {
    private int номер;
    private Integer колВоСидельцев;
    private String комментарий;

    @Id
    @Column(name = "Номер")
    public int getНомер() {
        return номер;
    }

    public void setНомер(int номер) {
        this.номер = номер;
    }

    @Basic
    @Column(name = "Кол-во сидельцев")
    public Integer getКолВоСидельцев() {
        return колВоСидельцев;
    }

    public void setКолВоСидельцев(Integer колВоСидельцев) {
        this.колВоСидельцев = колВоСидельцев;
    }

    @Basic
    @Column(name = "Комментарий")
    public String getКомментарий() {
        return комментарий;
    }

    public void setКомментарий(String комментарий) {
        this.комментарий = комментарий;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Комнаты комнаты = (Комнаты) o;

        if (номер != комнаты.номер) return false;
        if (колВоСидельцев != null ? !колВоСидельцев.equals(комнаты.колВоСидельцев) : комнаты.колВоСидельцев != null)
            return false;
        if (комментарий != null ? !комментарий.equals(комнаты.комментарий) : комнаты.комментарий != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = номер;
        result = 31 * result + (колВоСидельцев != null ? колВоСидельцев.hashCode() : 0);
        result = 31 * result + (комментарий != null ? комментарий.hashCode() : 0);
        return result;
    }
}
