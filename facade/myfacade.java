package facade;
public class myfacade {
    private static myfacade myfacadeobj = null;

    private myfacade() {
    }
    /*7.33*/
    public static myfacade getMyFacadeObject() {
        if (myfacadeobj == null) {
            myfacadeobj = new myfacade();
        }
        return myfacadeobj;
    }

    public void scheduleStart() {
        ScheduleServer obj1 = new ScheduleServer();
        obj1.startBooting();
        obj1.readSystemConfigFile();
        obj1.init();
        obj1.initializeContext();
        obj1.initializeListeners();
        obj1.createSystemObjects();
        System.out.println("Start working......");
    }

    public void scheduleStop() {
        ScheduleServer obj2 = new ScheduleServer();
        System.out.println("After work done.........");
        obj2.releaseProcesses();
        obj2.destory();
        obj2.destroySystemObjects();
        obj2.destoryListeners();
        obj2.destoryContext();
        obj2.shutdown();
    }
}
