package com.company.baitap1.Repo;

import com.company.baitap1.Entity.Oto;

import java.util.List;

public interface IOtoRepo {
    public List<Oto> getOto();
    public void createOto();
    public void updateOto();
    public boolean deleteOto();
}
