package noz.parcelableobjectdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CLient-Pc on 16/10/2016.
 */

public class Murid implements Parcelable {

    String mNama, mAlamat, mMataPelajaran;
    int mUmur;

    protected Murid(Parcel in) {
        mNama = in.readString();
        mAlamat = in.readString();
        mMataPelajaran = in.readString();
        mUmur = in.readInt();
    }

    public static final Creator<Murid> CREATOR = new Creator<Murid>() {
        @Override
        public Murid createFromParcel(Parcel in) {
            return new Murid(in);
        }

        @Override
        public Murid[] newArray(int size) {
            return new Murid[size];
        }
    };

    public Murid(String mNama, String mAlamat, String mMataPelajaran, int mUmur) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mMataPelajaran = mMataPelajaran;
        this.mUmur = mUmur;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mNama);
        parcel.writeString(mAlamat);
        parcel.writeString(mMataPelajaran);
        parcel.writeInt(mUmur);
    }
}


