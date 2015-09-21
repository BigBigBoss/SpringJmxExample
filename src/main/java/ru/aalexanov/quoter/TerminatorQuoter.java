package ru.aalexanov.quoter;

import ru.aalexanov.profiling.Profiling;

import javax.annotation.PostConstruct;

/**
 * Created by aalexanov on 21.09.15.
 */
@Profiling
public class TerminatorQuoter implements Quoter {
    private String message;
    @InjectRandomInt(min=2,max=7)
    private int repeat;

    public TerminatorQuoter() {
        System.out.println("Phase 1");
        System.out.println("repeat::"+repeat);
    }

    @PostConstruct
    public void init(){
        System.out.println("Phase 2");
        System.out.println("repeat::"+repeat);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Message:"+getMessage());
        }
    }
}
