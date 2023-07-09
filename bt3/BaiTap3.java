import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class BaiTap3 {
    public static class Student{
        String maSV;
        String hoDem;
        String ten;
        LocalDate ngaySinh;

        
        public Student() {
        }
        public Student(String maSV, String hoDem, String ten, LocalDate ngaySinh) {
            this.maSV = maSV;
            this.hoDem = hoDem;
            this.ten = ten;
            this.ngaySinh = ngaySinh;
        }
        public String getMaSV() {
            return maSV;
        }
        public void setMaSV(String maSV) {
            this.maSV = maSV;
        }
        public String getHoDem() {
            return hoDem;
        }
        public void setHoDem(String hoDem) {
            this.hoDem = hoDem;
        }
        public String getTen() {
            return ten;
        }
        public void setTen(String ten) {
            this.ten = ten;
        }
        public LocalDate getNgaySinh() {
            return ngaySinh;
        }
        public void setNgaySinh(LocalDate ngaySinh) {
            this.ngaySinh = ngaySinh;
        }
        
        
    }
    public static class Subject{
        String maMH;
        String tenMH;
        int heSMH;
        float diem;
        
        public Subject() {
        }
        public Subject(String maMH, String tenMH, int heSMH, float diem) {
            this.maMH = maMH;
            this.tenMH = tenMH;
            this.heSMH = heSMH;
            this.diem = diem;
        }
        public String getMaMH() {
            return maMH;
        }
        public void setMaMH(String maMH) {
            this.maMH = maMH;
        }
        public String getTenMH() {
            return tenMH;
        }
        public void setTenMH(String tenMH) {
            this.tenMH = tenMH;
        }
        public int getHeSMH() {
            return heSMH;
        }
        public void setHeSMH(int heSMH) {
            this.heSMH = heSMH;
        }
        public float getDiem() {
            return diem;
        }
        public void setDiem(float diem) {
            this.diem = diem;
        }
    }

    public static Subject inputInfoSubject(Scanner input){
        Subject subject = new Subject();
        System.out.println("Nhap Ma Mon Hoc :");
        subject.setMaMH(input.next());
        System.out.println("Nhap Ten Mon Hoc :");
        subject.setTenMH(input.next());
        System.out.println("Nhap He So Mon :");
        subject.setHeSMH(input.nextInt());
        System.out.println("Nhap Diem :");
        subject.setDiem(input.nextFloat());
        return subject;
    }

    public static void display(Subject sj){
        System.out.printf("%-20s%-20s%-20d%-20.2f\n",sj.maMH,sj.tenMH,sj.heSMH,sj.diem);
    }

    public static Map<Student,List<Subject>> inputInfoStudent(Scanner input){
        Student student = new Student();
        System.out.println("------------------Nhap Thong Tin Sinh Vien----------------");
        System.out.println("Nhap Ma So Sinh Vien :");
        student.setMaSV(input.next());
        System.out.println("Nhap Ho Dem :");
        student.setHoDem(input.next());
        System.out.println("Nhap Ten :");
        student.setTen(input.next());
        System.out.println("Nhap Ngay Sinh :");
        student.setNgaySinh(LocalDate.parse(input.next()));
        List<Subject> list = new ArrayList<>();
        for(int i =1;i<=5;i++){
            System.out.println("------------------Nhap Thong Tin Mon Hoc"+i+"----------------");
            Subject subject = inputInfoSubject(input);
            list.add(subject);
        }
        Map<Student,List<Subject>> map = new HashMap<>(); 
        map.put(student, list);
        return map; 
    }

    public static float diemTB(List<Subject> list){
        int count = 0;
        float dtb = 0;
        for (Subject subject : list) {
            count = count + subject.getHeSMH();
            dtb = dtb + (subject.getDiem()*subject.heSMH);
        }
        return dtb/count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Student,List<Subject>> map = inputInfoStudent(input);
        System.out.println("\n");
        System.out.printf("%-20s%-15s%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma So SV","HoDem","Ten","Ngay Sinh","Ma So Mon Hoc","Ten Mon Hoc","He So Mon","Diem");
        for (Student s : map.keySet()) {
            List<Subject> list = map.get(s);
            for (Subject subject : list) {
                System.out.printf("%-20s%-15s%-20s%-20s",s.maSV,s.hoDem,s.ten,s.ngaySinh);
                display(subject);
            }
            System.out.printf("Diem Trung Binh Cua Hoc Sinh %.2f :",diemTB(list));
        }
        input.close();
    }
}
