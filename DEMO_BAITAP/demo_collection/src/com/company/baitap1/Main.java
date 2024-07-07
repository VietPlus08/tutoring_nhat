package com.company.baitap1;

import com.company.baitap1.Entity.Oto;
import com.company.baitap1.Entity.PhuongTien;
import com.company.baitap1.Entity.XeMay;
import com.company.baitap1.Repo.PhuongTienRepo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ep kieu 2 loai: tuong minh vs ngam dinh
        // ngam dinh
        PhuongTien phuongTien = new Oto();
        PhuongTien phuongTien1 = new XeMay();
        Oto oto = new Oto();
        System.out.println(phuongTien.toString());
        System.out.println(oto.toString());
        System.out.println(phuongTien1.toString());

        // tuong minh
        // ep kieu tuong minh
        System.out.println("---------------");
        PhuongTien pt = getPhuongTien();
        System.out.println(pt);
        Oto oto1 = (Oto) pt;

//        String c = "a";
//        String d = "b";
//        String e = "c";
//        System.out.println(d.compareTo(c));
    }

    public static PhuongTien getPhuongTien(){
        PhuongTien phuongTien1 = new Oto();
        phuongTien1.setTenHSX("ketami.edu.vn");
        return phuongTien1;
    }
}
