public enum Months {
    GENNAIO("Gennaio", 1),
    FEBBRAIO("Febbraio", 2),
    MARZO("Marzo", 3),
    APRILE("Aprile", 4),
    MAGGIO("Maggio", 5),
    GIUGNO("Giugno", 6),
    LUGLIO("Luglio", 7),
    AGOSTO("Agosto", 8),
    SETTEMBRE("Settembre", 9),
    OTTOBRE("Ottobre", 10),
    NOVEMBRE("Novembre", 11),
    DICEMBRE("Dicembre", 12);

    private final String key;
    private final int value;

    Months(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public int getValue() {
        return value;
    }

    public static String getKeyFromValue(int num) {

        switch (num) {
            case 1:
                return GENNAIO.getKey();
            case 2:
                return FEBBRAIO.getKey();
            case 3:
                return MARZO.getKey();
            case 4:
                return APRILE.getKey();
            case 5:
                return MAGGIO.getKey();
            case 6:
                return GIUGNO.getKey();
            case 7:
                return LUGLIO.getKey();
            case 8:
                return AGOSTO.getKey();
            case 9:
                return SETTEMBRE.getKey();
            case 10:
                return OTTOBRE.getKey();
            case 11:
                return NOVEMBRE.getKey();
            case 12:
                return DICEMBRE.getKey();
        }
        return "ERRORE";

    }

}
