package AutoTestDay5.Homework;

import java.util.Scanner;

public class BA extends NhanVien{
    private String language;

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten BA:");
        setName(sc.nextLine());
        System.out.println("Nhap ma nhan vien cua BA");
        setID(sc.nextLine());
        System.out.println("Nhap luong co ban cua BA");
        setSalary(sc.nextDouble());
        sc.nextLine();
        System.out.println("Ngon ngu BA nay su dung:");
        setLanguage(sc.nextLine());


    }
    public void tinhLuong(){
        setSalaryThucNhan(getSalary()*5);
    }

    @Override
    public void hienThongTin() {
        System.out.println("BA:"+getName()+" Id:"+getID()+" Salary:"+getSalary()+" Language:"+getLanguage());

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
