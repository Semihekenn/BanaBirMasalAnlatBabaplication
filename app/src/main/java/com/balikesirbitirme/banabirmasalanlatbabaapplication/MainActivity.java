package com.balikesirbitirme.banabirmasalanlatbabaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.balikesirbitirme.banabirmasalanlatbabaapplication.RealmPage.TablePage.VeriTablosu;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }
    private void Init(){
        makeRealm();
        makeInsertInTable();
        showTable();
    }

    private void makeRealm(){
        realm=Realm.getDefaultInstance();
    }
    private void makeInsertInTable(){
        realm.beginTransaction();
        VeriTablosu veriTablosu=realm.createObject(VeriTablosu.class);
        veriTablosu.setVeriId(0);
        veriTablosu.setVeriInf("deneme yapıyoruz");
        veriTablosu.setVeriStr("bir değer yada daha fazlası");
        realm.commitTransaction();
    }
    private void showTable(){
        String TAG="dsd";
        realm.beginTransaction();
        RealmResults<VeriTablosu> sonuc=realm.where(VeriTablosu.class).findAll();
        for(VeriTablosu v : sonuc){
            Log.i(TAG, v.toString());
        }
        realm.commitTransaction();
    }
}
