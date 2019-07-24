package ro.itschool.mvnbase.curs7;

public class Door {
    private boolean open;
    private  boolean locked;

    Door(){
        open=true;
    }

    Door(boolean open){
        this.open=open;
    }

    Door(boolean open,boolean locked){
        this.open=open;
        this.locked=locked;
    }


    void  openDoor(){
        locked=false;
        open=true;
    }

    void closeDoor(){
        locked=false;
        open=false;
    }

    void lockDoor(){
        locked=true;
    }

    void unlockDoor(){
        locked=false;
    }

    boolean isLocked(){
        return locked;
    }

    boolean isOpen(){
        return open;
    }

    public String toString(){
        if (isOpen()){
            return "Door is open and locked";
        } else if(isLocked()) {
            return  "Door is closed and locked";
        }
        return "Door is open? "+ open+ " and is locked "+ locked;
    }
}
