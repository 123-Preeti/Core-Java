public class Stats<T extends Number>{

    T[] nums;

    Stats(T[] o) { //parametrized in constructors
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for(int i =0; i < nums.length; i++)
            sum += nums[i].doubleValue(); // doublevalue will covert every number to double
        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) { //? this will match current context avg to arguments avg
        if(average() == ob.average())
            return true;
        return false;
    }

}

