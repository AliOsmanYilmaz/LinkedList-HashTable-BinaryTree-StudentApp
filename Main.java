import java.util.*;

class Main
{

    /*      | Ali Osman Yılmaz | 240211055 | Yazılım Mühendisliği 2.Sınıf |      */
    /*             Veri Yapıları Dersi Öğrenci Kayıt Sistemi                     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a = -1,b,length,numara,index;
        String name,surname;


        while(a != 4)
        {
            System.out.println("---Veri Yapıları Dersi Öğrenci Kayıt Sistemi---");
            System.out.println("1 - Bağıl Liste");
            System.out.println("2 - İkili Arama Ağacı");
            System.out.println("3 - Hash Tablosu");
            System.out.println("4 - Çıkış");
            System.out.println("Hangi veri yapısını kullanmak istersiniz?");
            a = input.nextInt();

            switch(a)
            {
                case 1:
                    b = -1;
                    while(b != 0)
                    {
                        System.out.println("Bağıl Liste");
                        System.out.println("0 - Çıkış");
                        System.out.println("1 - Tek Yönlü Doğrusal Liste");
                        System.out.println("2 - Çift Yönlü Doğrusal Liste");
                        System.out.print("Seçiminiz : ");
                        b = input.nextInt();

                        switch(b)
                        {
                            case 0:
                                System.out.println("Bağıl Listeden çıkıldı.");
                                break;

                            case 1:
                                TekYonluBagilListe t1 = new TekYonluBagilListe();

                                while(b != 11)
                                {
                                    System.out.println("Tek Yönlü Doğrusal Liste");
                                    System.out.println("1 - Başa Kaydet");
                                    System.out.println("2 - Araya Kaydet");
                                    System.out.println("3 - Sona Kaydet");
                                    System.out.println("4 - Baştan Sil");
                                    System.out.println("5 - Aradan Sil");
                                    System.out.println("6 - Sondan Sil");
                                    System.out.println("7 - Kayıt Sayısı");
                                    System.out.println("8 - Ortanca Düğüm");
                                    System.out.println("9 - Numaraya Göre Yazdır");
                                    System.out.println("10 - Listeyi Yazdır");
                                    System.out.println("11 - Ana Menü");
                                    System.out.print("Seçiminiz : ");

                                    b = input.nextInt();

                                    switch(b)
                                    {
                                        case 1:
                                            System.out.print("Numara giriniz : ");
                                            numara = input.nextInt();
                                            System.out.print("Ad giriniz : ");
                                            name = input.next();
                                            System.out.print("Soyad giriniz : ");
                                            surname = input.next();
                                            t1.basaEkle(name,surname,numara);
                                            System.out.println("Öğrenci başa kaydedildi.");
                                            break;

                                        case 2:
                                            System.out.print("İndex giriniz : ");
                                            index = input.nextInt();
                                            System.out.print("Numara giriniz : ");
                                            numara = input.nextInt();
                                            System.out.print("Ad giriniz : ");
                                            name = input.next();
                                            System.out.print("Soyad giriniz : ");
                                            surname = input.next();
                                            t1.arayaEkle(index,name,surname,numara);
                                            System.out.println("Öğrenci araya kaydedildi.");
                                            break;

                                        case 3:
                                            System.out.print("Numara giriniz : ");
                                            numara = input.nextInt();
                                            System.out.print("Ad giriniz : ");
                                            name = input.next();
                                            System.out.print("Soyad giriniz : ");
                                            surname = input.next();
                                            t1.sonaEkle(name,surname,numara);
                                            System.out.println("Öğrenci sona kaydedildi.");
                                            break;

                                        case 4:
                                            t1.bastanSil();
                                            break;

                                        case 5:
                                            System.out.print("Silinecek numara : ");
                                            numara = input.nextInt();
                                            t1.aradanSil(numara);
                                            break;

                                        case 6:
                                            t1.sondanSil();
                                            break;

                                        case 7:
                                            System.out.println("Kayıt Sayısı : " + t1.elemanSayisiYazdir());
                                            break;

                                        case 8:
                                            System.out.println("Ortanca Düğüm : ");
                                            t1.ortancaDugum();
                                            break;

                                        case 9:
                                            System.out.print("Numara giriniz : ");
                                            numara = input.nextInt();
                                            t1.numberPrint(numara);
                                            break;

                                        case 10:
                                            t1.print();
                                            break;

                                        case 11:
                                            System.out.println("Tek Yönlü Doğrusal Listeden Çıkıldı.");
                                            break;

                                        default:
                                            System.out.println("Yanlış seçim.Tekrar deneyin.");
                                            break;
                                    }
                                }
                                break;

                            case 2:
                                CiftYonluBagilListe c1 = new CiftYonluBagilListe();

                                while (b != 11)
                                {
                                    System.out.println("Çift Yönlü Doğrusal Liste");
                                    System.out.println("1 - Başa Kaydet");
                                    System.out.println("2 - Araya Kaydet");
                                    System.out.println("3 - Sona Kaydet");
                                    System.out.println("4 - Baştan Sil");
                                    System.out.println("5 - Aradan Sil");
                                    System.out.println("6 - Sondan Sil");
                                    System.out.println("7 - Kayıt Sayısı");
                                    System.out.println("8 - Numaraya Göre Yazdır");
                                    System.out.println("9 - Listeyi Yazdır");
                                    System.out.println("10 - Listeyi Tersten Yazdır");
                                    System.out.println("11 - Ana Menü");
                                    System.out.print("Seçiminiz : ");

                                    b = input.nextInt();

                                    switch(b)
                                    {
                                        case 1:
                                            System.out.print("Numara giriniz : ");
                                            numara = input.nextInt();
                                            System.out.print("Ad giriniz : ");
                                            name = input.next();
                                            System.out.print("Soyad giriniz : ");
                                            surname = input.next();
                                            c1.basaEkle(name,surname,numara);
                                            System.out.println("Başa Kaydedildi.");
                                            break;

                                        case 2:
                                            System.out.print("İndex giriniz : ");
                                            index = input.nextInt();
                                            System.out.print("Numara giriniz : ");
                                            numara = input.nextInt();
                                            System.out.print("Ad giriniz : ");
                                            name = input.next();
                                            System.out.print("Soyad giriniz : ");
                                            surname = input.next();
                                            c1.arayaEkle(index,name,surname,numara);
                                            System.out.println("Başa eklendi");
                                            break;

                                        case 3:
                                            System.out.print("Numara giriniz : ");
                                            numara = input.nextInt();
                                            System.out.print("Ad giriniz : ");
                                            name = input.next();
                                            System.out.print("Soyad giriniz : ");
                                            surname = input.next();
                                            c1.sonaEkle(name,surname,numara);
                                            System.out.println("Başa eklendi");
                                            break;

                                        case 4:
                                            c1.bastanSil();
                                            break;

                                        case 5:
                                            System.out.print("Numara giriniz : ");
                                            numara = input.nextInt();
                                            c1.aradanSil(numara);
                                            break;

                                        case 6:
                                            c1.sondanSil();
                                            break;

                                        case 7:
                                            System.out.println("Kayıt Sayısı : " + c1.elemanSayisiYazdir());
                                            break;

                                        case 8:
                                            System.out.print("Numara giriniz : ");
                                            numara = input.nextInt();
                                            c1.numberPrint(numara);
                                            break;

                                        case 9:
                                            c1.yazdir();
                                            break;

                                        case 10:
                                            c1.sondanYazdir();
                                            break;

                                        case 11:
                                            System.out.println("Tek Yönlü Doğrusal Listeden Çıkıldı.");
                                            break;

                                        default:
                                            System.out.println("Yanlış seçim.Tekrar deneyin.");
                                            break;
                                    }
                                }
                                break;

                            default:
                                System.out.println("Yanlış seçim.Tekrar deneyin.");
                                break;
                        }
                    }
                    break;

                case 2:
                    b = -1;
                    Tree t1 = new Tree();

                    while(b != 11)
                    {
                        System.out.println("İkili Arama Ağacı");
                        System.out.println("1 - Kayıt Ekle");
                        System.out.println("2 - Kayıt Sil");
                        System.out.println("3 - Kayıt Sayısı");
                        System.out.println("4 - En Küçük Numaralı Öğrenci");
                        System.out.println("5 - En Büyük Numaralı Öğrenci");
                        System.out.println("6 - Ortanca Düğüm");
                        System.out.println("7 - Numaraya Göre Yazdır");
                        System.out.println("8 - Preorder Yazdır");
                        System.out.println("9 - Inorder Yazdır");
                        System.out.println("10 - Postorder Yazdır");
                        System.out.println("11 - Ana Menü");
                        System.out.print("Seçiminiz : ");

                        b = input.nextInt();

                        switch(b)
                        {
                            case 1:
                                System.out.print("Numara giriniz : ");
                                numara = input.nextInt();
                                System.out.print("Ad : ");
                                name = input.next();
                                System.out.print("Soyad : ");
                                surname = input.next();
                                t1.root = t1.insert(t1.root,name,surname,numara);
                                break;

                            case 2:
                                System.out.print("Numara giriniz : ");
                                numara = input.nextInt();
                                t1.root = t1.delete(t1.root,numara);
                                break;

                            case 3:
                                System.out.println("Kayıt Sayısı : " + t1.sizeOfTree(t1.root));
                                break;

                            case 4:
                                t1.minimum(t1.root);
                                break;

                            case 5:
                                t1.maximum(t1.root);
                                break;

                            case 6:
                                t1.ortancaDugum(t1.root);
                                break;

                            case 7:
                                System.out.print("Numara giriniz : ");
                                numara = input.nextInt();
                                t1.search(t1.root,numara);
                                break;

                            case 8:
                                t1.preOrder(t1.root);
                                System.out.println();
                                break;

                            case 9:
                                t1.inOrder(t1.root);
                                System.out.println();
                                break;

                            case 10:
                                t1.postOrder(t1.root);
                                System.out.println();
                                break;

                            case 11:
                                System.out.println("İkili Arama Ağacından çıkıldı.");
                                break;

                            default:
                                System.out.println("Yanlış seçim.Tekrar deneyin.");
                                break;
                        }
                    }
                    break;

                case 3:
                    b = -1;

                    System.out.print("Hash Tablosunun boyutu : ");
                    length = input.nextInt();
                    HashTable ht = new HashTable(length);

                    while(b != 7)
                    {
                        System.out.println("Hash Tablosu");
                        System.out.println("1 - Kayıt Ekle");
                        System.out.println("2 - Kayıt Sil");
                        System.out.println("3 - Kayıt Sayısı");
                        System.out.println("4 - Numaraya Göre Yazdır");
                        System.out.println("5 - Tablo Yazdır");
                        System.out.println("6 - Numaraya Göre Sırala");
                        System.out.println("7 - Ana Menü");
                        System.out.print("Seçiminiz : ");

                        b = input.nextInt();

                        switch(b) {
                            case 1:
                                System.out.print("Numara giriniz : ");
                                numara = input.nextInt();
                                System.out.print("Ad giriniz : ");
                                name = input.next();
                                System.out.print("Soyad giriniz : ");
                                surname = input.next();
                                ht.ekle(ht.mod(numara),name,surname,numara);
                                System.out.println(numara + "numaralı öğrenci Ağaca eklendi.");
                                break;

                            case 2:
                                System.out.print("Numara giriniz : ");
                                numara = input.nextInt();
                                ht.sil(numara);
                                break;

                            case 3:
                                System.out.println("Kayıt Sayısı : " + ht.elemanSayisiYazdir());
                                break;

                            case 4:
                                System.out.print("Numara giriniz : ");
                                numara = input.nextInt();
                                ht.numberPrint(numara);
                                break;

                            case 5:
                                ht.yazdir();
                                break;

                            case 6:
                                ht.numberSortandPrint();
                                break;

                            case 7:
                                System.out.println("Hash Tablosundan çıkıldı.");
                                break;

                            default:
                                System.out.println("Yanlış seçim.Tekrar deneyin.");
                                break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Yanlış seçim.Tekrar deneyin.");
                    break;
            }
        }
    }
}


//---------------------------------


/* Tek Yönlü Doğrusal Liste */

class Node
{
    String name;
    String surname;
    int number;
    Node next;

    public Node(String name,String surname,int number)
    {
        this.name = name;
        this.surname = surname;
        this.number = number;
        next = null;
    }
}


class TekYonluBagilListe
{
    Node head;

    public void basaEkle(String name,String surname,int number)
    {
        Node newNode = new Node(name,surname,number);

        if(head == null)
        {
            head = newNode;
        }


        else
        {
            newNode.next = head;
            head = newNode;
        }
    }



    public void sonaEkle(String name,String surname,int number)
    {
        Node newNode = new Node(name,surname,number);

        if(head == null)
        {
            head = newNode;
        }

        else
        {
            Node current = head;

            while(current.next != null)
            {
                current = current.next;
            }

            current.next = newNode;
        }
    }




    public void arayaEkle(int index , String name,String surname,int number)
    {
        Node newNode = new Node(name,surname,number);

        if (head == null)
        {
            head = newNode;
        }

        else if(index <= 0)
        {
            newNode.next = head;
            head = newNode;
        }

        else
        {
            Node current = head;
            Node current1;
            int n = 0;

            while(current.next != null)
            {
                n++;
                current = current.next;
            }
            n++;

            if(index >= n)
            {
                current.next = newNode;
            }

            else
            {
                current = head;
                current1 = current;
                int i = 0;

                while(index != i)
                {
                    i++;
                    current1 = current;
                    current = current.next;
                }

                newNode.next = current;
                current1.next = newNode;
            }
        }
    }







    public void bastanSil()
    {
        if(head == null)
        {
            System.out.println("liste boş");
        }

        else
        {
            head = head.next;
        }
    }



    public void sondanSil()
    {
        if(head == null)
        {
            System.out.println("liste boş");
        }


        else if(head.next == null)
        {
            head = null;
        }


        else
        {
            Node current = head;

            while (current.next.next != null)
            {
                current = current.next;
            }

            current.next = null;
        }
    }



    public void aradanSil(int number)
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }

        else if(head.next == null && number == head.number)
        {
            head = null;
        }

        else if(number == head.number)
        {
            head = head.next;
        }

        else
        {
            Node current = head;
            Node current1 = current;

            while(current != null)
            {
                if(number == current.number)
                {
                    if(current.next == null)
                    {
                        current1.next = null;
                        break;
                    }

                    else
                    {
                        current1.next = current.next;
                        break;
                    }
                }

                current1 = current;
                current = current.next;
            }
        }

    }





    public int elemanSayisiYazdir()
    {
        Node current = head;
        int a = 0;
        while(current != null)
        {
            current = current.next;
            a++;
        }

        return a;
    }



    public void numberPrint(int number)
    {
        if(head == null)
        {
            System.out.println("Liste boş.");
        }

        else
        {
            Node current = head;
            while(current != null)
            {
                if(number == current.number)
                {
                    System.out.println("Numara \t" + "Ad \t\t" + "Soyad");
                    System.out.println(current.number + "\t\t" + current.name + "\t\t" + current.surname);
                }
                current = current.next;
            }
        }
    }



    public void ortancaDugum()
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }

        else if(head.next == null)
        {
            System.out.println("Numara \t" + "Ad \t\t" + "Soyad");
            System.out.println(head.number + "\t\t" + head.name + "\t\t" + head.surname);
        }

        else
        {
            Node current = head;
            int mid = elemanSayisiYazdir()/2;
            int n = 0;

            while(mid != n)
            {
                n++;
                current = current.next;
            }

            System.out.println("Numara \t" + "Ad \t\t" + "Soyad");
            System.out.println(current.number + "\t\t" + current.name + "\t\t" + current.surname);
        }

    }



    public void print()
    {
        Node current = head;

        System.out.print("Baş --> ");
        while(current != null)
        {
            System.out.print(current.number + ":" + current.name + " " + current.surname + " --> ");
            current = current.next;
        }
        System.out.println(" Son");
    }

}


//-----------------------------------


/* Çift Yönlü Doğrusal Liste */

class Node2
{
    String name;
    String surname;
    int number;
    Node2 next;
    Node2 prev;

    Node2(String name,String surname,int number)
    {
        this.name = name;
        this.surname = surname;
        this.number = number;
        next = null;
        prev = null;

    }

}


class CiftYonluBagilListe
{
    Node2 head;
    Node2 tail;

    public void basaEkle(String name,String surname,int number)
    {
        Node2 newNode = new Node2(name,surname,number);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }


        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            newNode.prev = null;
        }
    }





    public void sonaEkle(String name,String surname,int number)
    {
        Node2 newNode = new Node2(name,surname,number);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }


        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            newNode.next = null;
        }


    }





    public void arayaEkle(int index,String name,String surname,int number)
    {
        Node2 newNode = new Node2(name,surname,number);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }

        //Başa ekle
        else if(index <= 0 )
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            newNode.prev = null;
        }

        else
        {
            int n = 0;
            Node2 current = head;

            while(current.next != null)
            {
                current = current.next;
                n++;
            }
            n++;

            //Sona ekle
            if(index >= n)
            {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                newNode.next = null;
            }

            else
            {
                current = head;
                int i = 0;

                while(i != index)
                {
                    current = current.next;
                    i++;
                }

                newNode.prev = current.prev;
                current.prev.next = newNode;
                newNode.next = current;
                current.prev = newNode;
            }
        }
    }







    public void bastanSil()
    {
        if (head == null)
        {
            System.out.println("Liste boş");
        }

        else if (head == tail)
        {
            head = null;
            tail = null;
        }

        else
        {
            head = head.next;
            head.prev = null;
        }
    }




    public void sondanSil()
    {
        if (head == null)
        {
            System.out.println("Liste boş");
        }

        else if (head == tail)
        {
            head = null;
            tail = null;
        }

        else
        {
            tail = tail.prev;
            tail.next = null;
        }
    }




    public void aradanSil(int number)
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }

        else if(head.next == null && number == head.number)
        {
            head = null;
        }

        else if(number == head.number)
        {
            head = head.next;
        }

        else
        {
            Node2 current = head;

            while(current != null)
            {
                if(current.number == number)
                {
                    if(current == tail)
                    {
                        tail = current.prev;
                        current.prev = null;
                        tail.next = null;
                    }

                    else
                    {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                    }
                }
                current = current.next;
            }
        }




    }





    public int elemanSayisiYazdir()
    {
        Node2 current = head;
        int a = 0;

        while(current != null)
        {
            current = current.next;
            a++;
        }

        return a;
    }



    public void yazdir()
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }

        else
        {
            Node2 current = head;
            System.out.print("Baş --> ");

            while(current != null)
            {
                System.out.print(current.number + ":" + current.name + " " + current.surname + " --> ");
                current = current.next;
            }

            System.out.println(" Son");

        }

    }



    public void sondanYazdir()
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }

        else
        {
            Node2 current = tail;
            System.out.print("Son --> ");

            while(current != null)
            {
                System.out.print(current.number + ":" + current.name + " " + current.surname + " --> ");
                current = current.prev;
            }

            System.out.println(" Baş");
        }
    }



    public void numberPrint (int number)
    {
        if(head == null)
        {
            System.out.println("Liste boş.");
        }

        else
        {
            Node2 current = head;

            while(current != null)
            {
                if(number == current.number)
                {
                    System.out.println("Numara \t" + "Ad \t\t" + "Soyad");
                    System.out.println(current.number + "\t\t" + current.name + "\t\t" + current.surname);
                }
                current = current.next;
            }
        }
    }




}


//-----------------------------------

/* Hash Table */

class HashNode
{
    String name;
    String surname;
    int number;
    int key;
    HashNode next;

    public HashNode()
    {
        next = null;
    }

    public HashNode(int key,String name,String surname,int number)
    {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.key = key;
        next = null;
    }
}


class HashTable
{
    int size;
    HashNode[] dizi;

    public HashTable(int size)
    {
        dizi = new HashNode[size];
        this.size = size;

        for (int i = 0; i < size; i++)
        {
            dizi[i] = new HashNode();
        }
    }


    public int mod(int key)
    {
        return key % size;
    }


    public void ekle(int key,String name,String surname,int number)
    {
        int index = mod(key);
        HashNode eleman = new HashNode(key,name,surname,number);
        HashNode current = dizi[index];

        while (current.next != null)
        {
            current = current.next;
        }

        current.next = eleman;
    }


    public void sil(int number)
    {
        boolean sonuc = false;
        int index = mod(number);
        HashNode current = dizi[index];
        HashNode current1;

        if (current.next == null)
        {
            sonuc = true;
            System.out.println(number + " numaralı değer yok.");
        }

        else if (current.next.next == null && current.next.number == number)
        {
            sonuc = true;
            System.out.println(current.next.number + " silindi.Liste boşaltıldı.");
            current.next = null;
        }

        else
        {
            while (current.next != null)
            {
                current1 = current;
                current = current.next;

                if (current.number == number)
                {
                    sonuc = true;
                    System.out.println(number + " silindi.");
                    current1.next = current.next;
                }
            }
        }

        if (!sonuc)
        {
            System.out.println(number + " değeri bulunmuyor.");
        }
    }


    public int elemanSayisiYazdir()
    {
        int toplam = 0;

        for(int i = 0; i < size; i++)
        {
            HashNode current = dizi[i];

            while(current.next != null)
            {
                toplam += 1;
                current = current.next;
            }

        }

        return toplam;
    }




    public void numberPrint(int number)
    {
        int index = mod(number);
        HashNode current = dizi[index];

        while(current != null)
        {
            if(number == current.number)
            {
                System.out.println("Numara \t" + "Ad \t\t" + "Soyad");
                System.out.println(current.number + "\t\t" + current.name + "\t\t" + current.surname);
                break;
            }

            current = current.next;
        }
    }



    public void yazdir() {
        for (int i = 0; i < size; i++) {
            HashNode current = dizi[i];

            System.out.print("Dizi[" + i + "] -> ");

            if (current.next != null) {
                while (current.next != null) {
                    System.out.print(current.next.number + ":" + current.next.name + " " + current.next.surname + " --> ");
                    current = current.next;
                }

                System.out.println();
            } else {
                System.out.println();
            }
        }
    }





    public void numberSortandPrint()
    {
        List<HashNode> tumDugumler = new ArrayList<>();

        for (int a = 0; a < size; a++)
        {
            HashNode current = dizi[a];
            while (current != null) {
                tumDugumler.add(current);
                current = current.next;
            }
        }

        tumDugumler.sort(Comparator.comparingInt(node -> node.number));

        System.out.println("Küçükten Büyüğe Sıralı Liste:");
        for (HashNode node : tumDugumler)
        {
            if(node.name != null)
            {
                System.out.println(node.number + " - " + node.name + " " + node.surname);
            }
        }
    }


}


//-----------------------------------

/* Binary Tree */

class TreeNode
{
    String name;
    String surname;
    int number;
    TreeNode left,right;

    public TreeNode(String name, String surname, int number)
    {
        this.name = name;
        this.surname = surname;
        this.number = number;
        left=right=null;
    }
}


class Tree
{
    TreeNode root;

    //Ekleme
    public TreeNode newNode(String name, String surname, int number)
    {
        root = new TreeNode(name,surname,number);
        System.out.println(root.number + " numaralı öğrenci ağaca eklendi.");
        return root;
    }


    public TreeNode insert(TreeNode root, String name, String surname, int number)
    {
        if (root == null)
        {
            root = new TreeNode(name,surname,number);
            return root;
        }

        if (number < root.number)
        {
            root.left = insert(root.left,name,surname,number);
        }

        else if (number > root.number)
        {
            root.right = insert(root.right,name,surname,number);
        }

        return root;
    }




    //Sıralama
    public void preOrder(TreeNode root)
    {
        if (root != null)
        {
            System.out.print(root.number + ":" + root.name + " " +  root.surname + " --> ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }



    public void inOrder(TreeNode root)
    {
        if (root != null)
        {
            inOrder(root.left);
            System.out.print(root.number + ":" + root.name + " " +  root.surname + " --> ");
            inOrder(root.right);
        }
    }


    public void postOrder(TreeNode root)
    {
        if (root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.number + ":" + root.name + " " +  root.surname + " --> ");
        }
    }



    public int sizeOfTree(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        else
        {
            return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
        }
    }



    public boolean search(TreeNode root, int number)
    {
        if(root == null)
        {
            return false;
        }

        if (number == root.number)
        {
            System.out.println("Numara\t" + "Ad\t\t" + "Soyad");
            System.out.println(root.number + "\t\t" + root.name + "\t\t" + root.surname);
            return true;
        }

        else if (number < root.number)
        {
            return search(root.left, number);
        }

        else
        {
            return search(root.right, number);
        }
    }





    public TreeNode delete(TreeNode root, int number)
    {
        TreeNode t1,t2;

        if(root == null)
        {
            System.out.println("Ağaç boş.");
            return null;
        }

        if(root.number == number)
        {
            System.out.println(root.number + " numaralı öğrenci ağaçtan silindi.");
            if(root.left == root.right)
            {
                return null;
            }

            else if (root.left == null)
            {
                t1 = root.right;
                return t1;
            }

            else if (root.right == null)
            {
                t1 = root.left;
                return t1;
            }

            else
            {
                t1 = root.right;
                t2 = root.right;

                while (t1.left != null)
                {
                    t1 = t1.left;
                }

                t1.left = root.left;

                return t2;
            }
        }

        else
        {
            System.out.println(root.number + " numaralı öğrenci ağaçtan silindi.");
            if(number < root.number)
            {
                root.left = delete(root.left, number);
            }


            else
            {
                root.right = delete(root.right, number);
            }
        }

        return root;
    }




    public TreeNode minimum(TreeNode root)
    {
        if(root == null)
        {
            System.out.println("Ağaç boş.");
            return null;
        }

        else if(root.left == null)
        {
            System.out.println("En küçük numaralı öğrenci : " + root.number + ":" + root.name + " " + root.surname);
            return root;
        }

        else
        {
            return root.left = minimum(root.left);
        }

    }



    public TreeNode maximum(TreeNode root)
    {
        if(root == null)
        {
            System.out.println("Ağaç boş.");
            return null;
        }

        else if(root.right == null)
        {
            System.out.println("En büyük numaralı öğrenci : " + root.number + ":" + root.name + " " + root.surname);
            return root;
        }

        else
        {
            return root.right = maximum(root.right);
        }
    }


    public void ortancaDugum(TreeNode root)
    {
        int size = sizeOfTree(root);
        if (size == 0)
        {
            System.out.println("Ağaç boş.");
            return;
        }

        String[] dizi = new String[size];
        int[] sayac = {0};  //Diziyi sayıyor.

        inorder(root, dizi, sayac);

        int ortaIndex = size / 2;
        System.out.println("Ortanca Bilgileri --> " + dizi[ortaIndex]);
    }


    public void inorder(TreeNode node, String[] dizi, int[] sayac)
    {
        if (node == null) return;

        inorder(node.left, dizi, sayac);

        dizi[sayac[0]] = node.number + " : " + node.name + " " + node.surname;
        sayac[0]++;

        inorder(node.right, dizi, sayac);
    }


}
