package android.bignerdranch.com.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Advait on 3/1/2015.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date Date) {
        this.mDate = Date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean Solved) {
        this.mSolved = Solved;
    }

    public Crime(){
        //generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

}
