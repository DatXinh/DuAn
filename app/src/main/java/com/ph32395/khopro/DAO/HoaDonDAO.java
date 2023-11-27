package com.ph32395.khopro.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.ph32395.khopro.Database.DbHelper;
import com.ph32395.khopro.Model.DanhMucMonAn;
import com.ph32395.khopro.Model.HoaDon;

import java.util.ArrayList;

public class HoaDonDAO {

    DbHelper dbHelper;

    public HoaDonDAO (Context context){
        dbHelper = new DbHelper(context);
    }

    public ArrayList<HoaDon> getListHoaDon(){
        ArrayList<HoaDon> list = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from tb_HoaDon",null);
        if (cursor.getCount() != 0 ){
            cursor.moveToFirst();
            do{
                list.add(new HoaDon(cursor.getInt(0), cursor.getInt(1)
                , cursor.getInt(2),cursor.getInt(3),cursor.getString(4)
                ,cursor.getInt(5),cursor.getString(6),cursor.getString(7)
                ,cursor.getInt(8),cursor.getInt(9)));
            }while (cursor.moveToNext());
        }
        return list;
    }
    public boolean insert(HoaDon hoaDon){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("id_HoaDon", hoaDon.getId_HoaDon());
        values.put("id_MonAn", hoaDon.getId_MonAn());
        values.put("soLuong",hoaDon.getSoLuong());
        values.put("id_NhanVien",hoaDon.getId_NhanVien());
        values.put("id_BanAn",hoaDon.getId_BanAn());
        values.put("id_GiamGia",hoaDon.getId_GiamGia());
        values.put("ngayTao",hoaDon.getNgayTao());
        values.put("giaTien",hoaDon.getGiaTien());
        values.put("kieuThanhToan",hoaDon.getKieuThanhToan());
        values.put("trangThai",hoaDon.getTrangThai());
        long check = db.insert("tb_HoaDon", null, values);
        if(check == -1){
            return false;
        }else{
            return true;
        }
    }
    public boolean delete(int id){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        long check = db.delete("tb_HoaDon","id_HoaDon = ?",new String[]{String.valueOf(id)});
        if(check == -1){
            return false;
        }else{
            return true;
        }
    }
//    public boolean update(DanhMucMonAn danhMucMonAn){
//        SQLiteDatabase db = dbHelper.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put("id_DAnhMuc", danhMucMonAn.getId_DanhMuc());
//        values.put("ten_DanhMuc", danhMucMonAn.getTenDanhMuc());
//        long check = db.update("tb_DanhMuc",values,"id_DanhMuc = ?",new String[]{String.valueOf(danhMucMonAn.getId_DanhMuc())});
//        if(check == -1){
//            return false;
//        }else{
//            return true;
//        }
//    }
}
