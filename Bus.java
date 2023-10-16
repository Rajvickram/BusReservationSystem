import java.util.*;

class Bus {
    private int busNo;

    private boolean ac;

    private int capacity;

    Bus(int busNo,boolean ac,int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setAC(boolean ac) {
        this.ac = ac;
    }

    public boolean getAC() {
        return ac;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void displayBusInfo() {
        System.out.println("Bus No : " + busNo + ", Ac Seats : " + ac + ", Capacity Seats Available : " + capacity);
    }
}
