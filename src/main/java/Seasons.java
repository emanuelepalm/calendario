public enum Seasons {
    INVERNO("Inverno", 1),
    PRIMAVERA("Primavera", 2),
    ESTATE("Estate", 3),
    AUTUNNO("Autunno", 4);


    private final String key;
    private final int value;

    Seasons(String key, int value) {
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
                return INVERNO.getKey();
            case 2:
                return PRIMAVERA.getKey();
            case 3:
                return ESTATE.getKey();
            case 4:
                return AUTUNNO.getKey();

        }
        return "ERRORE";
    }
}
