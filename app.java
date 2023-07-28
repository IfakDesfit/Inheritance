//Class Abstract
//Inheritance
//Encapsulation
//Overriding
//Over Loading

abstract class Peminjaman{
    void denda(){}
    void pengembalian(){}
}

class PBO extends Peminjaman{
    @Override
    void denda(){

    }

}

class Parent{
    public int x;

    void print(String tipeAnggota, int bayar) {
        System.out.println("buku");
    }

    void print(String tipeAnggota) {
        System.out.println("buku");
    }

    void print() {
        System.out.println("buku 2");
    }
}

class pohon extends Parent{
    @Override
    void print(){
    System.out.println("Print pohon");
    }

    void test(){
        print();
        x = 5;
    }
}

class Buah extends pohon{
    void test2(){
        print();
    }
}

public class app extends Parent{
    void print(){
        System.out.println(x);
    }
    public static void main(String[] args) throws Exception{
        Parent parent = new Parent();
        parent.print();
        parent.print("Mahasiswa");

        pohon a = new pohon();
        a.print();

}

}