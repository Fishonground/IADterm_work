package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Зеки {
    private int идЧеловека;
    private Date срок;
    private int комната;
    private int тренер;
    private int рейтинг;
    private String группировка;

    @Id
    @Column(name = "ИД_Человека")
    public int getИдЧеловека() {
        return идЧеловека;
    }

    public void setИдЧеловека(int идЧеловека) {
        this.идЧеловека = идЧеловека;
    }

    @Basic
    @Column(name = "Срок")
    public Date getСрок() {
        return срок;
    }

    public void setСрок(Date срок) {
        this.срок = срок;
    }

    @Basic
    @Column(name = "Комната")
    public int getКомната() {
        return комната;
    }

    public void setКомната(int комната) {
        this.комната = комната;
    }

    @Basic
    @Column(name = "Тренер")
    public int getТренер() {
        return тренер;
    }

    public void setТренер(int тренер) {
        this.тренер = тренер;
    }

    @Basic
    @Column(name = "Рейтинг")
    public int getРейтинг() {
        return рейтинг;
    }

    public void setРейтинг(int рейтинг) {
        this.рейтинг = рейтинг;
    }

    @Basic
    @Column(name = "Группировка")
    public String getГруппировка() {
        return группировка;
    }

    public void setГруппировка(String группировка) {
        this.группировка = группировка;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Зеки зеки = (Зеки) o;

        if (идЧеловека != зеки.идЧеловека) return false;
        if (комната != зеки.комната) return false;
        if (тренер != зеки.тренер) return false;
        if (рейтинг != зеки.рейтинг) return false;
        if (срок != null ? !срок.equals(зеки.срок) : зеки.срок != null) return false;
        if (группировка != null ? !группировка.equals(зеки.группировка) : зеки.группировка != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = идЧеловека;
        result = 31 * result + (срок != null ? срок.hashCode() : 0);
        result = 31 * result + комната;
        result = 31 * result + тренер;
        result = 31 * result + рейтинг;
        result = 31 * result + (группировка != null ? группировка.hashCode() : 0);
        return result;
    }
}
