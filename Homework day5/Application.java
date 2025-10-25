package AutoTestDay5.Homework;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int choice=0;
        BA[] baList = new BA[5];
        Dev[] devList = new Dev[1000];
        Tester[] testerList = new Tester[1000];
        do{
            System.out.println("===============================");
            System.out.println("Welcome to CodeStar application");
            System.out.println("1: Input new BA");
            System.out.println("2: Input new Tester");
            System.out.println("3: Input new Dev");
            System.out.println("4: See BA list");
            System.out.println("5: See Tester list");
            System.out.println("6: See Dev list");
            System.out.println("8: Tinh Luong");
            System.out.println("9: Tim nhan vien Luong cao");
            System.out.println("10: Tinh Tong Chi");
            System.out.println("7: Exit");
            System.out.print("Your choice:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    inputBa(baList);
                    continue;
                }
                case 2: {
                    inputTester(testerList);
                    continue;
                }
                case 3: {
                    inputDev(devList);
                    continue;
                }
                case 4: {
                    show(baList);
                    continue;


                }
                case 5: {
                    show(testerList);
                    continue;
                }
                case 6: {
                    show(devList);
                    continue;
                }
                case 8: {
                    System.out.println("**BA**");
                    showLuong(baList);
                    System.out.println("**Dev**");
                    showLuong(devList);
                    System.out.println("**Tester**");
                    showLuong(testerList);
                    continue;
                }
                case 9: {
                    System.out.println("**BA**");
                    showNhanVienLuongCao(baList);
                    System.out.println("**Dev**");
                    showNhanVienLuongCao(devList);
                    System.out.println("**Tester**");
                    showNhanVienLuongCao(testerList);
                }
                case 10: {
                    System.out.println("**BA**");
                    tongChiLuongTheoBoPhan(baList);
                    System.out.println("**Tester**");
                    tongChiLuongTheoBoPhan(testerList);
                    System.out.println("**Dev**");
                    tongChiLuongTheoBoPhan(devList);
                }

                default: {break;}
            }

        }while(choice!=7);
    }
    public static void inputBa(BA[] baList){
        BA newBA = new BA();
        newBA.nhapThongTin();
        for(int i=0;i<baList.length;i++){
            if(baList[i]==null){
                baList[i] = newBA;
                break;
            }
        }
        System.out.println("*DA GHI NHAN THONG TIN*");
    }
    public static void inputTester(Tester[] testerList){
        Tester newTester = new Tester();
        newTester.nhapThongTin();
        for(int i=0;i<testerList.length;i++){
            if(testerList[i]==null){
                testerList[i] = newTester;
                break;
            }
        }
        System.out.println("*DA GHI NHAN THONG TIN*");
    }
    public static void inputDev(Dev[] devList){
        Dev newDev = new Dev();
        newDev.nhapThongTin();
        for(int i=0;i<devList.length;i++){
            if(devList[i]==null){
                devList[i] = newDev;
                break;
            }
        }
        System.out.println("*DA GHI NHAN THONG TIN*");
    }

    public static void show(NhanVien[] List){
        if(List[0]==null){
            System.out.println("*HIEN TAI CHUA CO NHAN VIEN NAO*");

        }else{
            System.out.println("*DAY LA DANH SACH NHAN VIEN HIEN CO*");
            for(int i=0;i<List.length;i++){
                if(List[i]!=null){
                    List[i].hienThongTin();
                }else{break;}
            }
        }
    }


    public static void showLuong(NhanVien[] List){

        if(List[0]==null){
            System.out.println("*BO PHAN NAY CHUA CO NHAN VIEN NAO*");

        }else{
            System.out.println("*DAY LA BANG LUONG NHAN VIEN HIEN CO*");
            for(int i=0;i<List.length;i++){
                if(List[i]!=null){
                    List[i].tinhLuong();
                    System.out.println("Name: "+List[i].getName()+" || "+ List[i].getSalaryThucNhan());
                }else{break;}
            }
        }

    }
    public static void showNhanVienLuongCao(NhanVien[] List){

        if(List[0]==null){
            System.out.println("*BO PHAN NAY CHUA CO NHAN VIEN NAO*");

        }else{
            System.out.println("*DAY LA DANH SACH NHAN VIEN CO LUONG CAO HON MAT BANG TRUNG*");
            int count=0;
            double sum=0;
            for(int i=0;i<List.length;i++){
                if(List[i]!=null){
                    List[i].tinhLuong();
                    count++;
                    sum+=List[i].getSalaryThucNhan();

                }else{break;}
            }
            for(int i=0;i< List.length;i++){
                if(List[i]!=null){
                    if(List[i].getSalaryThucNhan()>sum/count){
                        System.out.println("Nhan Vien: "+List[i].getName()+" || "+List[i].getSalaryThucNhan()+" > "+sum/count);
                    }else{continue;}

                }else{break;}
            }
        }

    }
    public static void tongChiLuongTheoBoPhan(NhanVien[] List){
        double sum=0;
        for(int i=0;i< List.length;i++){
            if(List[i]!=null){
                List[i].tinhLuong();
                sum+=List[i].getSalaryThucNhan()+List[i].getSalaryThucNhan()*10/100;


            }else{break;}
        }
        System.out.println("Tong chi: "+sum);
    }

}
