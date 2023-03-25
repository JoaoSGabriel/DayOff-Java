public class HolyDayzer {
    private Holiday[] holidays;

    HolyDayzer(Holiday[] data) {
        this.holidays = data;
    }

    String isHoliday(String date) {
        for(int i = 0; i < this.holidays.length; i++) {
            if(holidays[i].getDate() == date) {
                return "Essa data é referente ao feriado de: " + holidays[i].getName();
            }
        }

        return "Essa data não corresponde a nenhum feriado";
    }
}
