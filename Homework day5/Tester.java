package AutoTestDay5.Homework;

import java.util.Scanner;

public class Tester extends NhanVien{
    private boolean isAutomationtest;

    @Override
    public void hienThongTin() {

        System.out.println("Test:"+getName()+" Id:"+getID()+" Salary:"+getSalary()+" Autotest?"+isAutomationtest());

    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten Test:");
        setName(sc.nextLine());
        System.out.println("Nhap ma nhan vien cua Test");
        setID(sc.nextLine());
        System.out.println("Nhap luong co ban cua Test");
        setSalary(sc.nextDouble());

        System.out.println("Tester nay co auto khong:(true/false)");
        setAutomationtest(sc.nextBoolean());


    }
    public void tinhLuong(){
        setSalaryThucNhan(getSalary()*4);
    }



    public boolean isAutomationtest() {
        return isAutomationtest;
    }

    public void setAutomationtest(boolean automationtest) {
        isAutomationtest = automationtest;
    }
}
