package collectiondemo;

import java.time.Duration;
import java.time.Instant;

/**
 * @author 田赛
 * @version 1.0
 */
public class TimeStop {
    private Instant startTime;
    private Instant stopTime;
    private boolean running;

    public void start() {
        if (!running) {
            startTime = Instant.now();
            running = true;
        }
    }

    public void stop() {
        if (running) {
            stopTime = Instant.now();
            running = false;
        }
    }

    public Duration elapsedTime() {
        if (running) {
            return Duration.between(startTime, Instant.now());
        } else {
            return Duration.between(startTime, stopTime);
        }
    }
}
