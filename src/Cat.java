public class Cat extends Animal {
    int runLimit = 200;
    int swimLimit = 0;

    @Override
    int Run() {
        return 0;
    }

    @Override
    int Run(int distanceRun) {
        if(distanceRun <= this.runLimit) {
            System.out.println("Мурзик пробежал " + distanceRun + " м.");
        }
        return distanceRun;
    }

    @Override
    int Swim() {
        return 0;
    }

    @Override
    int Swim(int distanceSwim) {
            System.out.println("Мурзик не плавает");
        return distanceSwim;
    }
}
