public class University {
    private String name;
    private String location;

    University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    class Department {
        private String depName;
        private int noOfCourses;

        Department(String depName, int noOfCourses) {
            this.depName = depName;
            this.noOfCourses = noOfCourses;
        }

        public String getDepName() {
            return depName;
        }

        public void setDepName(String depName) {
            this.depName = depName;
        }

        public int getNoOfCourses() {
            return noOfCourses;
        }

        public void setNoOfCourses(int noOfCourses) {
            this.noOfCourses = noOfCourses;
        }

        public void displayDepInfo() {
            System.out.println("Department name: " + depName);
            System.out.println("Number of courses: " + noOfCourses);
        }
    }

    public void displayUniversityInfo() {
        System.out.println("Name of university: " + name);
        System.out.println("Location: " + location);
    }
}

class NestedClassDemo {
    public static void main(String args[]) {
        University u = new University("aditya", "surampalem");
        University.Department dep = u.new Department("cse", 0); // Assuming 0 courses for now
        u.displayUniversityInfo();
        System.out.println("----------");
        dep.displayDepInfo();
        dep.setDepName("aiml");
        System.out.println("after updating");
        dep.displayDepInfo();
    }
}
