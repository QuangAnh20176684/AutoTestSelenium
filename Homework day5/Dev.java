package AutoTestDay5.Homework;
import  java.util.Scanner;


public class Dev extends NhanVien{
    private String techStack;
    private String type;

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten Dev:");
        setName(sc.nextLine());
        System.out.println("Nhap ma nhan vien cua dev");
        setID(sc.nextLine());
        System.out.println("Nhap luong co ban cua dev");
        setSalary(sc.nextDouble());

        sc.nextLine();
        System.out.println("Nhap techStack cua dev");
        setTechStack(sc.nextLine());
        System.out.println("Nhap type cua dev");
        setType(sc.nextLine());


    }

    @Override
    public void hienThongTin() {

        System.out.println("Dev:"+getName()+" Id:"+getID()+" Salary:"+getSalary()+" TechStack:"+getTechStack()+" Type:"+getType());

    }
    public void tinhLuong(){
        setSalaryThucNhan(getSalary()*3);
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getTechStack() {
        return techStack;
    }
}
