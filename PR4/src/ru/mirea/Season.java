package ru.mirea;

public enum Season {
    WINTER("Зима", -12),
    SPRING("Весна", 9),
    SUMMER("Лето", 24) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN("Осень", 7);

    private String name;
    private int temperature;

    Season(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() { return name; }
    public int getTemperature() { return temperature; }
    public String getDescription() { return "Холодное время года"; }
}
