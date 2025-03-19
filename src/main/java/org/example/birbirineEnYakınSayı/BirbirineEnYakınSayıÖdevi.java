package org.example.birbirineEnYakınSayı;

import java.util.ArrayList;
import java.util.List;

public class BirbirineEnYakınSayıÖdevi
{
    public static void main(String[] args)
    {
        //Integer veri tipinde bir ArrayList oluşturunuz ve içerisine 10 adet benzersiz ve
        // pozitif eleman ekleyiniz.
        // Bu listteki elemanlardan birbirine en yakın iki elamanı veren kodu yazınız

        List<Integer> arrayListem = new ArrayList<>();
        arrayListem.add(6);
        arrayListem.add(50);
        arrayListem.add(64);
        arrayListem.add(25);
        arrayListem.add(18);
        arrayListem.add(3);
        arrayListem.add(9);
        arrayListem.add(36);
        arrayListem.add(46);
        arrayListem.add(200);
        for(int sayı : arrayListem)
        {
            System.out.println(sayı);


        }


    }
}
