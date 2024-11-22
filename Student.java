public class Student {
   private String name;
   private double Currentscholarship;
   private double newScholarship;

    public Student(String name,double CurrentScholarship,double newScholarship) {
         this.name=name;
         this.Currentscholarship=CurrentScholarship;
         this.newScholarship=newScholarship;
    }
    public String getName() {
        return name;
    }
    public double getCurrentScholarship() {
        return Currentscholarship;
    }

    public double getNewScholarship() {
        return newScholarship;
    }

    public double getScholarshipIncrease() {
        return newScholarship - Currentscholarship;
    }
    public String toString(){
        return "Student:'" + name + '\'' + ", currentScholarship=" + Currentscholarship +
                ", newScholarship=" + newScholarship + ", increase=" + getScholarshipIncrease() ;
    }
    }
