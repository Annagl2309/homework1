package lesson5;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test")
    @SequenceGenerator(name = "test",sequenceName = "test_name", initialValue = 1)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mark")
    private int mark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student(long id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
