public class Main {
    public static void main(String[] args) {
        ClockHand hours = new ClockHand(24);
        ClockHand minutes = new ClockHand(60);
        ClockHand seconds = new ClockHand(60);

        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
        while (true) {
            // 1. Printing the time
            System.out.println(hours + ":" + minutes + ":" + seconds);

            // 2. Advancing the second hand
            seconds.advance();

            // 3. Advancing the other hands when required
            if (seconds.value() == 0) {
                minutes.advance();

                if (minutes.value() == 0) {
                    hours.advance();
                }
            }
        }


    }
}
