import java.time.LocalDate;
import java.util.Scanner;

public class BaiTap1{
    public static class Student{
        String maHS;
        String ho;
        String ten;
        LocalDate ngaySinh;
        String gioiTinh;
        float dtb, t,v, l, h, s, d, si, ta, gdcd;
        
        public Student() {
        }
        public Student(String maHS, String ho, String ten, LocalDate ngaySinh, String gioiTinh, float dtb, float t,
                float v, float l, float h, float s, float d, float si, float ta, float gdcd) {
            this.maHS = maHS;
            this.ho = ho;
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            this.gioiTinh = gioiTinh;
            this.dtb = dtb;
            this.t = t;
            this.v = v;
            this.l = l;
            this.h = h;
            this.s = s;
            this.d = d;
            this.si = si;
            this.ta = ta;
            this.gdcd = gdcd;
        }
        public String getMaHS() {
            return maHS;
        }
        public void setMaHS(String maHS) {
            this.maHS = maHS;
        }
        public String getHo() {
            return ho;
        }
        public void setHo(String ho) {
            this.ho = ho;
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
        public String getGioiTinh() {
            return gioiTinh;
        }
        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }
        public float getDtb() {
            return dtb;
        }
        public void setDtb(float dtb) {
            this.dtb = dtb;
        }
        public float getT() {
            return t;
        }
        public void setT(float t) {
            this.t = t;
        }
        public float getV() {
            return v;
        }
        public void setV(float v) {
            this.v = v;
        }
        public float getL() {
            return l;
        }
        public void setL(float l) {
            this.l = l;
        }
        public float getH() {
            return h;
        }
        public void setH(float h) {
            this.h = h;
        }
        public float getS() {
            return s;
        }
        public void setS(float s) {
            this.s = s;
        }
        public float getD() {
            return d;
        }
        public void setD(float d) {
            this.d = d;
        }
        public float getSi() {
            return si;
        }
        public void setSi(float si) {
            this.si = si;
        }
        public float getTa() {
            return ta;
        }
        public void setTa(float ta) {
            this.ta = ta;
        }
        public float getGdcd() {
            return gdcd;
        }
        public void setGdcd(float gdcd) {
            this.gdcd = gdcd;
        }
        
    }

    public static Student  inputInfo(){
        Student st = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Ma Hoc Sinh");
        st.setMaHS(input.next());
        System.out.println("Nhap Ho");
        st.setHo(input.next());
        System.out.println("Nhap Ten");
        st.setTen(input.next());
        System.out.println("Nhap Ngay Sinh");
        st.setNgaySinh(LocalDate.parse(input.next()));
        System.out.println("Nhap Gioi Tinh");
        st.setGioiTinh(input.next());
        System.out.println("Nhap Diem T ");
        st.setT(input.nextFloat());
        System.out.println("Nhap Diem V");
        st.setV(input.nextFloat());
        System.out.println("Nhap Diem L");
        st.setL(input.nextFloat());
        System.out.println("Nhap Diem H ");
        st.setH(input.nextFloat());
        System.out.println("Nhap Diem S");
        st.setS(input.nextFloat());
        System.out.println("Nhap Diem D");
        st.setD(input.nextFloat());
        System.out.println("Nhap Diem Sinh ");
        st.setSi(input.nextFloat());
        System.out.println("Nhap Diem Tieng Anh");
        st.setTa(input.nextFloat());
        System.out.println("Nhap Diem Giao Duc Cong Dan");
        st.setGdcd(input.nextFloat());
        input.close();
        return st;
    }
    public static void tinhDiemTB(Student st){
        float dtb = (st.t*2+st.v*2+st.l+st.h+st.s+st.d+st.si+st.ta+st.gdcd)/11;
        System.out.printf("%.2f",dtb);
    }

    public static void display(Student st){
        // System.out.printf("%-8s%-20s%-10s%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s\n",
        // "Ma HS","Ho Dem","Ten","Ngay Sinh","Gioi Tinh","Diem Toan", "Diem Van", "Diem Ly","Diem Hoa", "Diem Su", "Diem Dia", "Diem Sinh","Diem TA", "Diem GDCD");

        // System.out.printf("%-8s%-20s%-10s%-12s%-12s%-12.1f%-12.1f%-12.1f%-12.1f%-12.1f%-12.1f%-12.1f%-12.1f%-12.1f\n",st.maHS,st.ho,st.ten,
        // st.ngaySinh,st.gioiTinh,st.t,st.v,st.l,st.h,st.s,st.d,st.si,st.ta,st.gdcd);

        System.out.println("Ma HS :" + st.maHS);
        System.out.println("Ho :" + st.ho);
        System.out.println("Ten :" + st.ten);
        System.out.println("Ngay sinh :" + st.ngaySinh);
        System.out.println("Gioi Tinh :" + st.gioiTinh);
        System.out.println("Diem Toan: " + st.t);
        System.out.println("Diem Van :" + st.v);
        System.out.println("Diem Ly :" + st.l);
        System.out.println("Diem Hoa :" + st.h);
        System.out.println("Diem Su :" + st.s);
        System.out.println("Diem Dia :" + st.d);
        System.out.println("Diem Sinh :" + st.si);
        System.out.println("Diem Tieng Anh :" + st.ta);
        System.out.println("Diem GDCD :" + st.gdcd);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s = inputInfo();
        display(s);
        tinhDiemTB(s);
    }
}