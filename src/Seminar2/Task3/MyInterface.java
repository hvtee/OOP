package Seminar2.Task3;

/*** adgdsg*/
public interface MyInterface {

    /**
     * @return ddhhdf
     */
    int getUserId();
    default int getAdminId(){
        return 1;
    }
    static int getUser(){
        return 5;
    }
}
