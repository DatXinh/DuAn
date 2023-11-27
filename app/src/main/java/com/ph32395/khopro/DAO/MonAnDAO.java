package com.ph32395.khopro.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.ph32395.khopro.Database.DbHelper;
import com.ph32395.khopro.Model.BanAn;
import com.ph32395.khopro.Model.MonAn;

import java.util.ArrayList;

public class MonAnDAO {
    DbHelper dbHelper;

    public MonAnDAO (Context context){
        dbHelper = new DbHelper(context);
    }

    public ArrayList<MonAn> getListMonAn(){
        ArrayList<MonAn> list = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from tb_MonAn", null);
        if (cursor.getCount() != 0){
            cursor.moveToFirst();
            do{
                list.add(new MonAn(cursor.getInt(0), cursor.getString(1), cursor.getInt(2)
                ,cursor.getInt(3),cursor.getInt(4)));
            }while (cursor.moveToNext());
        }
        return list;
    }

    public boolean insert(MonAn monAn){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("id_MonAn", monAn.getId_MonAn());
        values.put("ten_MonAn", monAn.getTenMonAn());
        values.put("id_DanhMuc",monAn.getId_DanhMuc());
        values.put("giaTien",monAn.getGiaTien());
        long check = db.insert("tb_MonAn", null, values);
        if(check == -1){
            return false;
        }else{
            return true;
        }
    }

    public boolean delete(int id){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        long check = db.delete("tb_MonAn","id_MonAn = ?",new String[]{String.valueOf(id)});
        if(check == -1){
            return false;
        }else{
            return true;
        }
    }

//    public boolean update(BanAn banAn){
//        SQLiteDatabase db = dbHelper.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put("soBan", banAn.getSoBan());
//        values.put("trangThai", banAn.getTrangThai());
//        long check = db.update("tb_BanAn",values,"id_BanAn = ?",new String[]{String.valueOf(banAn.getId_BanAn())});
//        if(check == -1){
//            return false;
//        }else{
//            return true;
//        }
//    }

}
