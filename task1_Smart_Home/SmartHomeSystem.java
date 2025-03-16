package task1_Smart_Home;

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartHomeFactory factory = new BasicSmartHomeFactory();
        SmartHomeController controller = new SmartHomeController();

        Light livingRoomLight = factory.createLight("Living Room Light");
        Thermostat homeThermostat = factory.createThermostat("Main Thermostat", 22);

        SmartDevise loggedLight = new LoggingDecorator(livingRoomLight);

        Room livingRoom = new Room("Living Room");
        livingRoom.addDevice(loggedLight);
        livingRoom.addDevice(homeThermostat);

        controller.addDevice(livingRoom);


        System.out.println( "перед включением ");
        controller.getStatusReport();


        System.out.println("Включение всех устройств ");
        controller.turnAllOn();
        controller.getStatusReport();


        System.out.println(" Выключение всех устройств ");
        controller.turnAllOff();
        controller.getStatusReport();

        System.out.println("Тестирование замка");
        OldLockSystem oldLock = new OldLockSystem();
        LegacyLockSystem adaptedLock = new LockAdapter(oldLock);

        adaptedLock.lock();
        adaptedLock.unlock();
    }
}