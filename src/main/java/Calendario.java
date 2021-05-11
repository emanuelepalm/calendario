public class Calendario {
    private static Calendario calendario = null;
    private int year;
    private final String[] seasons = {"Inverno","Primavera","Estate","Autunno"};
    private int day;
    public Months months;

    private Calendario() {
    };
    public static Calendario getInstance() {
        if(calendario == null) {
            calendario = new Calendario();
        }
        return calendario;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String[] getSeasons() {
        return seasons;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int[] daysInMonths() {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isBisextile()) {
            days[2] += 1;
        }
        return days;
    }

    public String monthOfDay() {
        String month = "";
        int[] daysInMonths = this.daysInMonths();
        for(int i = 1; i <= 12; i++) {
            if(this.day <= daysInMonths[i-1]) {
                month = Months.getKeyFromValue(i);
            } else {
                this.setDay(day - daysInMonths[i-1]);
            }
        }
        return month;
    }

    public int maxDays() {
        int max = 365;
        if(this.isBisextile())
            max += 1;
        return max;
    }

    public boolean isBisextile() {
        if((this.year%4) == 0) {
            return true;
        } else {
            return false;
        }
    }


}
