package com.company.baitap1.Repo;

import com.company.baitap1.Entity.PhuongTien;

import java.util.List;

// khong lien quan den bai tap 1
public interface IPhuongTienRepo {
    public List<PhuongTien> getPhuongTien();
    public void createPhuongTien();
    public void updatePhuongTien();
    public boolean deletePhuongTien();
}
