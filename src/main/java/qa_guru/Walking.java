package qa_guru;

// состав класса: инициация класса и поля (параметры, которые описывают класс), конструктор (отвечает за то,
// как сконструируется объект, его начальное состояние), методы

public class Walking {
    // эти переменные более правильно называть "поле"
    int temperature;
    boolean is_raining;

//конструктор. название констуктора с большой буквы, все остальные методы и переменные с маленькоц
    public Walking(int temperature, boolean is_raining) {
        this.temperature = temperature;
        this.is_raining = is_raining;
}
    void walkingoutside() {
        if (temperature > 20 && !is_raining) {
            System.out.println("You need to take sunglasses and a hat");
        } else if (temperature > 20 && is_raining) {
            System.out.println("You need to take an umbrella");
        } else if (temperature <= 20 && !is_raining) {
            System.out.println("It might be a little bit cold outside, you'd better take a jacket");
        } else {
            System.out.println("You need to take a windbreaker");
        }

    }

}
