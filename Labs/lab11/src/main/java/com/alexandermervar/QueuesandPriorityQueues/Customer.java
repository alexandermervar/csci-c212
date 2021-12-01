package com.alexandermervar.QueuesandPriorityQueues;

public class Customer implements Comparable<Customer> {
    
    // A customer class that consists of a name and a boolean stating whether or not
    // they have a fastpass
    private String name;
    private boolean fastPass;

    public Customer(String name, boolean fastPass) {
        this.name = name;
        this.fastPass = fastPass;
    }

    // setters and getters
    public String getName() {
        return name;
    }
    public boolean isFastPass() {
        return fastPass;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFastPass(boolean fastPass) {
        this.fastPass = fastPass;
    }

    @Override
    public int compareTo(Customer o) {
        // Compares if either customer has a fastpass or not
        // give priority to the customer with a fastpass
        if (this.fastPass && !o.fastPass) {
            return -1;
        } else if (!this.fastPass && o.fastPass) {
            return 1;
        } else {
            return 0;
        }
    }

}
