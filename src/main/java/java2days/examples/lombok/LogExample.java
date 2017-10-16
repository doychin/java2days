package java2days.examples.lombok;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;

@Log4j
public class LogExample {

    public static void main(String[] args) {
        BasicConfigurator.configure();

        log.info("Creating CustomTopicLogExample instance");

        new CustomTopicLogExample();
    }
}

@Log4j(topic = "custom_topic")
class CustomTopicLogExample {

    public CustomTopicLogExample() {
        log.info("Custom topic log with log4j");
    }
}
