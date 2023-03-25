public class Holiday {
    private String date;
    private String name;

    Holiday() {
        
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getHoliday(String date) {
        if (date) {
            return "Este é o ferio de: ";
        }

        return "Não existe feriado na data indicada";
    }
}