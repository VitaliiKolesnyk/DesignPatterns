package patterns.behavioral.state.states;


import patterns.behavioral.state.FlightControlSystem;
import patterns.behavioral.state.FlightPhase;
import patterns.behavioral.state.states.interfaces.State;

public class OnTheGroundState extends State {

    public OnTheGroundState() {
        super.setLandingGearsExtended(true);
        this.setFlapsExtended(false);
        this.setDroneOnTheGround(true);
        this.setAltitude(0);
        this.setFlightPhase(FlightPhase.ON_THE_GROUND);
        System.out.println("Drone is on the ground");
    }

    @Override
    public void takeOff(FlightControlSystem flightControlSystem) {
        this.getStatusOfFlight();
        this.setFlapsExtended(true);
        this.setLandingGearsExtended(false);
        this.setDroneOnTheGround(false);
        this.setFlightPhase(FlightPhase.TAKE_OFF_PATH);

        for(int i = 0; i < 8; i++) {
            this.timeout(1000);
            System.out.print(".");
        }

        System.out.println();
        System.out.println("AirBorn");
        System.out.println();
        flightControlSystem.setState(new TakeOffState());
        this.getStatusOfFlight();
    }

    @Override
    public void climb(FlightControlSystem flightControlSystem, int altitude) {
        System.out.println();
        System.out.println("The Drone is on the ground");
    }

    @Override
    public void descent(FlightControlSystem flightControlSystem, int altitude) {
        System.out.println();
        System.out.println("The Drone is on the ground");
    }

    @Override
    public void landing(FlightControlSystem flightControlSystem) {
        System.out.println();
        System.out.println("The Drone is on the ground");
    }
}
