package entities;

import javax.persistence.*;

@Entity
public class Заказы {
    private int ид;
    private String товар;
    private int заказчик;
    private int получатель;
    private int статус;
    private Товары товарыByТовар;

    @Id
    @Column(name = "ИД")
    public int getИд() {
        return ид;
    }

    public void setИд(int ид) {
        this.ид = ид;
    }

    @Basic
    @Column(name = "Товар")
    public String getТовар() {
        return товар;
    }

    public void setТовар(String товар) {
        this.товар = товар;
    }

    @Basic
    @Column(name = "Заказчик")
    public int getЗаказчик() {
        return заказчик;
    }

    public void setЗаказчик(int заказчик) {
        this.заказчик = заказчик;
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
    @Column(name = "Статус")
    public int getСтатус() {
        return статус;
    }

    public void setСтатус(int статус) {
        this.статус = статус;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Заказы заказы = (Заказы) o;

        if (ид != заказы.ид) return false;
        if (заказчик != заказы.заказчик) return false;
        if (получатель != заказы.получатель) return false;
        if (статус != заказы.статус) return false;
        if (товар != null ? !товар.equals(заказы.товар) : заказы.товар != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ид;
        result = 31 * result + (товар != null ? товар.hashCode() : 0);
        result = 31 * result + заказчик;
        result = 31 * result + получатель;
        result = 31 * result + статус;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Товар", referencedColumnName = "Название", nullable = false)
    public Товары getТоварыByТовар() {
        return товарыByТовар;
    }

    public void setТоварыByТовар(Товары товарыByТовар) {
        this.товарыByТовар = товарыByТовар;
    }
}
