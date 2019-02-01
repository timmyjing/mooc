
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        MyDate earlierDate = comparedDate;
        MyDate laterDate = this;
        
        if (earlier(comparedDate)) {
            earlierDate = this;
            laterDate = comparedDate;
        }
        
        int yearDiff = laterDate.year - earlierDate.year;
        
        if (yearDiff == 0) {
            return yearDiff;
        }
        
        if (laterDate.month < earlierDate.month) {
            yearDiff--;
        }
        
        if (laterDate.month == earlierDate.month && laterDate.day < earlierDate.day) {
            yearDiff--;
        }
        
        return yearDiff;
    }

  
}
