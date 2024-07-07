package com.company.baitap1.Repo;

import com.company.baitap1.Entity.Oto;
import com.company.baitap1.Entity.PhuongTien;
import com.company.baitap1.Entity.XeMay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// khong lien quan den bai tap 1
public class PhuongTienRepo{
    private static List<Oto> otoList = new ArrayList<>();
    private static List<XeMay> xeMayList = new ArrayList<>();

    static {
        otoList.add(new Oto("BX001", "Mazda", 2024, "Teo", 1, "4 cho"));
        otoList.add(new Oto("BX004", "BMW", 2023, "Ti", 2, "4 cho"));
        otoList.add(new Oto("BX003", "Honda", 2023, "Ngan", 3, "4 cho"));
        otoList.add(new Oto("BX002", "BMW", 2023, "Ha", 4, "4 cho"));

        xeMayList.add(new XeMay("BX005", "AirBlade", 2023, "Nhat", "125cc"));
        xeMayList.add(new XeMay("BX006", "Sirius", 2023, "Tuna", "75cc"));
    }

//    @Override
//    public List<PhuongTien> getPhuongTien() {
//        return null;
//    }
//
//    @Override
//    public void createPhuongTien() {
//
//    }
//
//    @Override
//    public void updatePhuongTien() {
//
//    }
//
//    @Override
//    public boolean deletePhuongTien() {
//        return false;
//    }

    // ep kieu 2 loai:
    // tuong minh vs ngam dinh

    // comparable va comparator
    public List<Oto> getOtoListWithComparator() {
        Collections.sort(otoList, new Comparator<Oto>() {
            @Override
            public int compare(Oto o1, Oto o2) {
                if (o1.getTenHSX().compareTo(o2.getTenHSX()) == 0) {
                    if(o1.getSoChoNgoi() > o2.getSoChoNgoi()){
                        return 1;
                    }
                    return -1;
                }
                return o1.getTenHSX().compareTo(o2.getTenHSX());
            }
        });
        return otoList;
    }

    public List<Oto> getOtoListWithComparable() {
        Collections.sort(otoList);
        return otoList;
    }

    public List<XeMay> getXeMayList() {
        return xeMayList;
    }
}
