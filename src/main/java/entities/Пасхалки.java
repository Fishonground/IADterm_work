package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Пасхалки {
    private String непотребства;

    @Basic
    @Column(name = "Непотребства")
    public String getНепотребства() {
        return непотребства;
    }

    public void setНепотребства(String непотребства) {
        this.непотребства = непотребства;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Пасхалки пасхалки = (Пасхалки) o;

        if (непотребства != null ? !непотребства.equals(пасхалки.непотребства) : пасхалки.непотребства != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return непотребства != null ? непотребства.hashCode() : 0;
    }
}
