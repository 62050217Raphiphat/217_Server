import facade.myfacade;

public class Server {
    public static void main(String[] args) {
        myfacade obj = myfacade.getMyFacadeObject();
        obj.scheduleStart();
        System.out.println();
        obj.scheduleStop();


        /*ScheduleServer scheduleServer = new ScheduleServer();
        
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
        System.out.println("After work done.........");
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown(); */
    }
    
}
