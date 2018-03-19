/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg1_kamus;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ACER
 */
public class DataKamus {

    private String titleId="KAMUS INDONESIA-INGGRIS";
    private String titleEn="ENGLISH-INDONESIA DICTIONARY";
    private String lbl1Id="Masukkan Kata Indonesia ";
    private String lbl1En="Entry English Word";
    private String lbl2Id="Kata Inggrisnya ";
    private String lbl2En="Indonesian Word ";
    private String txtBt1Id="Cari"; 
    private String txtBt1En="Search";
    private String txtBt2Id="Hapus"; 
    private String txtBt2En="Clear";
    private String txtBt3Id="Keluar"; 
    private String txtBt3En="Exit";
    private String txtBt4Id="Simpan";
    private String txtBt4En="Save";
    private String txtBt5Id="Lihat Daftar";
    private String txtBt5En="See Dictionary";
    
    private Map<String, String> dataIdEn;
    private Map<String, String> dataEnId;
    
    DataKamus(){
        dataIdEn = new HashMap<>();
        dataEnId = new HashMap<>();
        
        dataIdEn.put("MERAH","RED");
        dataIdEn.put("SAPI","COW");
        dataIdEn.put("KUCING","CAT");
        dataIdEn.put("CINTA","LOVE");
        dataIdEn.put("BURUNG","BIRD");
        
        for(Map.Entry<String, String> data : dataIdEn.entrySet()){
            dataEnId.put(data.getValue(), data.getKey());
        }
        
       
  
    }

    public void inputDataIdEn(String id, String en) {
        dataIdEn.put(id,en);
        dataEnId.put(en,id);
    }

    public void inputDataEnId(String en, String id) {
        dataIdEn.put(id,en);
        dataEnId.put(en,id);
    }

    public String getTitleId() {
        return titleId;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public String getLbl1Id() {
        return lbl1Id;
    }

    public String getLbl1En() {
        return lbl1En;
    }

    public String getLbl2Id() {
        return lbl2Id;
    }

    public String getLbl2En() {
        return lbl2En;
    }

    public String getTxtBt1Id() {
        return txtBt1Id;
    }

    public String getTxtBt1En() {
        return txtBt1En;
    }

    public String getTxtBt2Id() {
        return txtBt2Id;
    }

    public String getTxtBt2En() {
        return txtBt2En;
    }

    public String getTxtBt3Id() {
        return txtBt3Id;
    }

    public String getTxtBt3En() {
        return txtBt3En;
    }

    public String getTxtBt4Id() {
        return txtBt4Id;
    }

    public String getTxtBt4En() {
        return txtBt4En;
    }

    public String getTxtBt5Id() {
        return txtBt5Id;
    }

    public String getTxtBt5En() {
        return txtBt5En;
    }

    public Map<String, String> getDataIdEn() {
        return dataIdEn;
    }

    public Map<String, String> getDataEnId() {
        return dataEnId;
    }
    
    
    

    
}
