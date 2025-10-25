package AutoTestDay5.Homework;

public abstract class NhanVien {
    private String name;
    private String ID;
    private Double Salary;
    private Double SalaryThucNhan;

    public abstract void hienThongTin();

    public abstract void nhapThongTin();

    public abstract void tinhLuong();

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Double getSalaryThucNhan() {
        return SalaryThucNhan;
    }

    public void setSalaryThucNhan(Double salaryThucNhan) {
        SalaryThucNhan = salaryThucNhan;
    }
}
