package com.ph32395.khopro.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.ph32395.khopro.Database.DbHelper;

import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {
    DbHelper dbHelper;
    private SQLiteDatabase db;

    public ThongKeDAO(Context context){
        db = dbHelper.getWritableDatabase();
        dbHelper = new DbHelper(context);
    }

    public  int getDoanhThu(String tuNgay , String denNgay){
        String sqlDoanhThu = "SELECT SUM(giaTien) FROM tb_HoaDon where Ngay BETWEEN ? AND ?";
        List<Integer> list = new ArrayList<>();
        Cursor c = db.rawQuery(sqlDoanhThu, new String[]{tuNgay,denNgay});
        while (c.moveToNext()){
            try {
                list.add(c.getInt(0));
            }catch (Exception e){
                list.add(0);
            }
        }
        return list.get(0);
    }


}
