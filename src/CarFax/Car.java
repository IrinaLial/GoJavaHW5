package CarFax;

public class Car {
    private final int constrDate;
    private int engineType;

    private int maxSpeed;
    private int speed;

    private int passengers;
    private int passengersCount;

    private int accelerationTime;
    private CarDoor[] doors = new CarDoor[ 4 ];
    private CarWheel[] wheels = new CarWheel[ 4 ];

    public Car ( int constrDate ) { this.constrDate = constrDate;

    }

    public Car ( int constrDate , int engineType , int maxSpeed , int speed , int passengers , int passengersCount , int accelerationTime ) {
        this.constrDate = constrDate;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
        this.passengers = passengers;
        this.passengersCount = passengersCount;
        this.accelerationTime = accelerationTime;

        for ( int i = 0 ; i < doors.length ; i++ ) {
            doors[ i ] = new CarDoor ( );
            wheels[ i ] = new CarWheel ( );
        }
    }

    public void setSpeed ( int speed ) { this.speed = speed;
    }

    public void addOnePassenger ( ) {
        if ( passengersCount < passengers ) this.passengersCount++;
        else System.out.println ( "Car is full!" );
    }

    public void outOnePassenger ( ) {
        if ( passengersCount > 0 ) passengersCount--;
        else System.out.println ( "Car is empty!" );
    }

    public void outAllPassengers() {
        this.passengersCount = 0;

    }
    public CarDoor gerDoor ( int i ) { return doors[ i ];
    }

    public CarWheel getWheel ( int i ) { return wheels[ i ];
    }

    public void outAllWheels ( ) {
        wheels = new CarWheel[ 0 ];
    }

    public void addWheel ( int X ) {
        int s = wheels.length;
        wheels = new CarWheel[ s + X ];
        for ( int i = 0 ; i < s ; i++ ) {
            wheels[ i ] = new CarWheel ( );
        }
    }

    public void addDoor ( int X ) {
        int t = doors.length;
        doors = new CarDoor[ t + X ];
        for ( int i = 0 ; i < t ; i++ ) {
            doors[ i ] = new CarDoor ( );
        }
    }

    public float maxCurrentSpeed ( ) {
        if ( wheels.length >= 4 && passengersCount > 0 ) {
            float min = wheels[ 0 ].getTireState();
            for ( int i = 1 ; i < wheels.length ; i++ ) {
                if ( wheels[ i ].getTireState () < min ) {
                    min = wheels[ i ].getTireState();
                }
            }
            return maxSpeed * min;
        } else {
            return 0;
        }
    }

    public void showCar ( ) {
        System.out.println ( "Date od construction:\t\t\t" + constrDate );
        System.out.println ( "Engine type:\t\t\t\t\t" + engineType );
        System.out.println ( "Max speed:\t\t\t\t\t\t" + maxSpeed );
        System.out.println ( "Speed:\t\t\t\t\t\t\t" + speed );
        System.out.println ( "Max number of passengers:\t\t" + passengers );
        System.out.println ( "Number of passengers:\t\t\t" + passengersCount );
        System.out.println ( "Acceleration time to 100 km/h:\t" + accelerationTime );
        float maxCurSpeed = maxCurrentSpeed ( );
        if ( maxCurSpeed > 0 ) {
            System.out.println ( "Defined max speed:\t\t\t\t" + maxCurSpeed );
        }
    }
    public static void main(String[] args) {
        Car car = new Car(2016, 1, 220, 80, 5, 4, 5);
        car.outAllWheels();
        car.addWheel(3);
        car.getWheel(1);
        car.addOnePassenger();
        car.showCar();

    }
}
