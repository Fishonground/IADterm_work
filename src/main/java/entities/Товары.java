package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Товары {
    private String название;
    private int цена;
    private int наличие;
    private int авторитет;
    private Collection<Заказы> заказыsByНазвание;

    @Id
    @Column(name = "Название")
    public String getНазвание() {
        return название;
    }

    public void setНазвание(String название) {
        this.название = название;
    }

    @Basic
    @Column(name = "Цена")
    public int getЦена() {
        return цена;
    }

    public void setЦена(int цена) {
        this.цена = цена;
    }

    @Basic
    @Column(name = "Наличие")
    public int getНаличие() {
        return наличие;
    }

    public void setНаличие(int наличие) {
        this.наличие = наличие;
    }

    @Basic
    @Column(name = "Авторитет")
    public int getАвторитет() {
        return авторитет;
    }

    public void setАвторитет(int авторитет) {
        this.авторитет = авторитет;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Товары товары = (Товары) o;

        if (цена != товары.цена) return false;
        if (наличие != товары.наличие) return false;
        if (авторитет != товары.авторитет) return false;
        if (название != null ? !название.equals(товары.название) : товары.название != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = название != null ? название.hashCode() : 0;
        result = 31 * result + цена;
        result = 31 * result + наличие;
        result = 31 * result + авторитет;
        return result;
    }

    @OneToMany(mappedBy = "товарыByТовар")
    public Collection<Заказы> getЗаказыsByНазвание() {
        return заказыsByНазвание;
    }

    public void setЗаказыsByНазвание(Collection<Заказы> заказыsByНазвание) {
        this.заказыsByНазвание = заказыsByНазвание;
    }
}
