package ru.aalexanov;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aalexanov.quoter.Quoter;
/**
 * Created by aalexanov on 21.09.15.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        while (true) {
            Thread.sleep(500);
            context.getBean(Quoter.class).sayQuote();
        }

    }
}
