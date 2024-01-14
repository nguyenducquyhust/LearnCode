public class Ex3 {
    public static void main(String[] args) {
        String cau = "Ah Hoa! Ah Dao. Hien ah, Thao My";
        String replacestring = cau.replaceAll("(?i)ah","Anh");
        System.out.println(replacestring);
    }
}
