package basics;

public class Course {
    int courseid;
    String coursename;
    static int duration;

    Course(int courseid) {
        this(courseid, "unknown");
    }

    Course(int courseid, String coursename) {
        this(courseid, coursename, duration);
    }

    Course(int courseid, String coursename, int duration) {
        this.courseid = courseid;
        this.coursename = coursename;
        Course.duration = duration;
    }

    void show() {
        System.out.println("courseid :" + courseid);
        System.out.println("coursename:" + coursename);
        System.out.println("duration:" + duration);
    }

    public static void main(String[] args) {
        System.out.println("main method started:");
        Course c = new Course(1, "jfs", 6);
        Course c1 = new Course(2, "database");
        Course c2 = new Course(3);
        c.show();
        c1.show();
        c2.show();
    }
}
