public class Dog extends Animal {

    int runLimit = 500;
    int swimLimit = 10;


    @Override
    int Run() {
        return 0;
    }

    @Override
    int Run(int distanceRun) {
        if(distanceRun <= this.runLimit) {
            System.out.println("Бобик пробежал " + distanceRun + " м.");
        }
        return distanceRun;
    }

    @Override
    int Swim() {
        return 0;
    }

    @Override
    int Swim(int distanceSwim) {
        if(distanceSwim <= this.swimLimit) {
            System.out.println("Бобик проплыл " + distanceSwim + " м.");
        }
        return distanceSwim;
    }
}
