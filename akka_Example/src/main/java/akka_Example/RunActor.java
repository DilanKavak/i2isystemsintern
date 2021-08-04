package akka_Example;
import akka.actor.Actor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class RunActor {
	 public static void main( String[] args )
	    {
	        ActorSystem system = ActorSystem.create("actor-system");


	        ActorRef mainact = system.actorOf(Props.create(MainActor.class));
	        ActorRef newact = system.actorOf(Props.create(NewActor.class));

	        mainact.tell("MainActor message ", Actor.noSender());
	        newact.tell("Main to NewActor message ", mainact );
	        newact.tell("NewActor message ",  Actor.noSender() );

	        system.terminate();
	    }
}
