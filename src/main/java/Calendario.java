public class Calendario {
    private static Calendario calendario = null;
    private int year;
    private int day;

    public static Calendario getCalendario() {
        return calendario;
    }

    public static void setCalendario(Calendario calendario) {
        Calendario.calendario = calendario;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    private int month;


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
    public String seasonOfDay() {
        int i = -1;
        this.monthOfDay();
        if((this.getMonth() < 3 || (this.getMonth() == 3 && this.getDay() < 21)) || (this.getMonth() == 12 && this.day >= 21)) {
            i = 1;
        }
        if((this.getMonth() < 6 || (this.getMonth() == 6 && this.getDay() < 21)) || (this.getMonth() == 3 && this.day >= 21)) {
            i = 2;
        }
        if((this.getMonth() < 9 || (this.getMonth() == 9 && this.getDay() < 21)) || (this.getMonth() == 6 && this.day >= 21)) {
            i = 3;
        }
        if((this.getMonth() < 12 || (this.getMonth() == 12 && this.getDay() < 21)) || (this.getMonth() == 12 && this.day >= 21)) {
            i = 4;
        }
        return Seasons.getKeyFromValue(i);
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
            days[1] += 1;
        }
        return days;
    }

    public String monthOfDay() {
        String month = "";
        int[] daysInMonths = this.daysInMonths();
        for(int i = 1; i <= 12; i++) {
            if(this.day <= daysInMonths[i-1]) {
                month = Months.getKeyFromValue(i);
                this.setMonth(i);
                break;
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
