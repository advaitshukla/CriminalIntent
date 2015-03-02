package android.bignerdranch.com.criminalintent;

import java.util.UUID;

/**
 * Created by Advait on 3/1/2015.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Crime(){
        //generate unique identifier
        mId = UUID.randomUUID();
    }

}
