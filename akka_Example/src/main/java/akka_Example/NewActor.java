package akka_Example;
import akka.actor.AbstractActor;
import java.time.Duration;

public class NewActor extends AbstractActor {
    @Override
    public void preStart(){
        System.out.println("NewActor starting...");
    }
    @Override
    public Receive createReceive() {
        return receiveBuilder().match(String.class, msg -> {
            System.out.println(msg+ sender());
        }).build();
    }
}