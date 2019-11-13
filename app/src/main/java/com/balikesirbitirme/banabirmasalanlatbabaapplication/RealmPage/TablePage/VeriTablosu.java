package com.balikesirbitirme.banabirmasalanlatbabaapplication.RealmPage.TablePage;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

@RealmClass
public class VeriTablosu extends RealmObject {
    int veriId;
    String veriStr;
    String veriInf;

    public int getVeriId() {
        return veriId;
    }

    public void setVeriId(int veriId) {
        this.veriId = veriId;
    }

    public String getVeriStr() {
        return veriStr;
    }

    public void setVeriStr(String veriStr) {
        this.veriStr = veriStr;
    }

    public String getVeriInf() {
        return veriInf;
    }

    public void setVeriInf(String veriInf) {
        this.veriInf = veriInf;
    }

    @Override
    public String toString() {
        return "VeriTablosu{" +
                "veriId=" + veriId +
                ", veriStr='" + veriStr + '\'' +
                ", veriInf='" + veriInf + '\'' +
                '}';
    }
}
