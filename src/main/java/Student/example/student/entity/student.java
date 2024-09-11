package Student.example.student.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  rollNo;
    @Column(name="name")
    private String name;
    @Column(name="percentage")
    private float percentage;
    @Column(name="branch")
    private String branch;
   public student(){

   }

    public student(String name, float percentage, String branch) {
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", branch='" + branch + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }




    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
