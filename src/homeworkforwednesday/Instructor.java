package homeworkforwednesday;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void Teach(Learner learner, double numberOfHours) {
        learner.learn(25.0);

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;

    }
}
