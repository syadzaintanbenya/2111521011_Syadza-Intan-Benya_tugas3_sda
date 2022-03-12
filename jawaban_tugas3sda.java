
import java.util.LinkedList;

public class jawaban_tugas3sda {
        
    public static void main(String[] args) {
      
//create data baru
    LinkedList<String> project1 = new LinkedList<>();
    LinkedList<String> project2  = new LinkedList<>();
    LinkedList<String> project3  = new LinkedList<>();

    project1.add("Syadza");
    project1.add("2111521011");
    project1.add("Padang");

    project2.add("Dea");
    project2.add("2199999999");
    project2.add("Palembang");

    project3.add("Putri");
    project3.add("2111324567");
    project3.add("Bandung");
    
    System.out.println("Tugas 2 LinkedList (tambahan)");
    System.out.println("---------------------------------------");
    System.out.println("Mahasiswa :"+project1);
    System.out.println("Mahasiswa :"+project2);
    System.out.println("Mahasiswa :"+project3);
    
//fungsi set
    project1.set(1, "2134567898");
    project2.set(0, "ani");
    project3.set(2, "Surabaya");

    System.out.println("");
    System.out.println("Data Saat di Sisipkan");
    System.out.println("Mahasiswa :"+project1);
    System.out.println("Mahasiswa :"+project2);
    System.out.println("Mahasiswa :"+project3);
    
//fungsi get
   System.out.println("");
   System.out.println("Data akan dimunculkan");
   System.out.println(project1.getFirst());

//fungsi push
   project1.push("Zee");
   project2.push("Futari");
   project3.push("Maya");

   System.out.println("");
   System.out.println("Data akan di Update");
   System.out.println("Mahasiswa :"+project1);
   System.out.println("Mahasiswa :"+project2);
   System.out.println("Mahasiswa :"+project3);

//fungsi pop
   project1.pop();
   project2.pop();

   System.out.println("");
   System.out.println("Data akan dihapus pada elemen pertama");
   System.out.println("Mahasiswa:"+project1);
   System.out.println("Mahasiswa:"+project2);

//fungsi remove
   project1.remove(1);
   project1.remove(1);
   project2.remove(1);
   project2.remove(1);
   project3.remove(0);
   project3.remove(1);
   project3.remove(1);

   System.out.println("");
   System.out.println("Updatean data sesudah dihapus");
   System.out.println("Mahasiswa:"+project1);
   System.out.println("Mahasiswa:"+project2);
   System.out.println("Mahasiswa:"+project3);

//fungsi add
    project1.add("IMK");
    project2.add("ITI");
    project3.add("English");

   System.out.println("");
   System.out.println("Data akan ditambahkan");
   System.out.println("Mahasiswa:"+project1);
   System.out.println("Mahasiswa:"+project2);
   System.out.println("Mahasiswa:"+project3);

//fungsi size
   project3.size();

   System.out.println("");
   System.out.println("Mahasiswa:"+project3.size());
    }
    
}