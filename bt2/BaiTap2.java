import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap2 {
    public static class People{
        String cardId;
        String hoDem;
        String ten;
        LocalDate ngaySinh;
        String gioiTinh;
        String diaChi;
        String sdt;
        
        public People() {
        }
        public People(String cardId, String hoDem, String ten, LocalDate ngaySinh, String gioiTinh, String diaChi,
                String sdt) {
            this.cardId = cardId;
            this.hoDem = hoDem;
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            this.gioiTinh = gioiTinh;
            this.diaChi = diaChi;
            this.sdt = sdt;
        }
        public String getCardId() {
            return cardId;
        }
        public void setCardId(String cardId) {
            this.cardId = cardId;
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
        public String getGioiTinh() {
            return gioiTinh;
        }
        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }
        public String getDiaChi() {
            return diaChi;
        }
        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }
        public String getSdt() {
            return sdt;
        }
        public void setSdt(String sdt) {
            this.sdt = sdt;
        }
    }
    public static List<People> inputInfo(){
        List<People> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            People p = new People();
            System.out.println("Nhap So The Can Cuoc :");
            p.setCardId(input.next());
            System.out.println("Nhap Ho Dem :");
            p.setHoDem(input.next());
            System.out.println("Nhap Ten :");
            p.setTen(input.next());
            System.out.println("Nhap Ngay Sinh :");
            p.setNgaySinh(LocalDate.parse(input.next()));
            System.out.println("Nhap Gioi Tinh :");
            p.setGioiTinh(input.next());
            System.out.println("Nhap Dia Chi :");
            p.setDiaChi(input.next());
            System.out.println("Nhap SDT :");
            p.setSdt(input.next());
            list.add(p);
        }
        input.close();
        return list;
    }
    public static void display(People p){
        System.out.println("\n");
        System.out.printf("%-25s%-20s%-12s%-10s%-20s%-10s%-10s\n",p.cardId,p.hoDem,p.ten,p.ngaySinh,p.gioiTinh,p.diaChi,p.sdt);
    }
    public static void main(String[] args) {
        List<People> peoples = inputInfo();
        System.out.printf("%-25s%-20s%-12s%-10s%-20s%-10s%-10s\n","So The Can Cuoc","Ho Dem","Ten","Ngay Sinh","Gioi Tinh","Dia Chi", "SDT");
        for (People p : peoples) {
            display(p);
        }
    }
}
